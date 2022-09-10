package ma.maneo.kosc.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.TemplateEmailCloture;
import ma.maneo.kosc.dao.TemplateEmailClotureDao;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailClotureChercheurService;

import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailClotureVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateEmailClotureChercheurServiceImpl extends AbstractServiceImpl<TemplateEmailCloture> implements TemplateEmailClotureChercheurService {

    @Autowired
    private TemplateEmailClotureDao templateEmailClotureDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<TemplateEmailCloture> findAll() {
        return templateEmailClotureDao.findAll();
    }

    @Override
    public TemplateEmailCloture findByCode(String code) {
        if (code == null) return null;
        return templateEmailClotureDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return templateEmailClotureDao.deleteByCode(code);
    }

    @Override
    public TemplateEmailCloture findByIdOrCode(TemplateEmailCloture templateEmailCloture) {
        TemplateEmailCloture resultat = null;
        if (templateEmailCloture != null) {
            if (StringUtil.isNotEmpty(templateEmailCloture.getId())) {
                resultat = templateEmailClotureDao.getOne(templateEmailCloture.getId());
            } else if (StringUtil.isNotEmpty(templateEmailCloture.getCode())) {
                resultat = templateEmailClotureDao.findByCode(templateEmailCloture.getCode());
            }
        }
        return resultat;
    }

    @Override
    public TemplateEmailCloture findById(Long id) {
        if (id == null) return null;
        return templateEmailClotureDao.getOne(id);
    }

    @Override
    public TemplateEmailCloture findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (templateEmailClotureDao.findById(id).isPresent()) {
            templateEmailClotureDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public TemplateEmailCloture update(TemplateEmailCloture templateEmailCloture) {
        TemplateEmailCloture foundedTemplateEmailCloture = findById(templateEmailCloture.getId());
        if (foundedTemplateEmailCloture == null) return null;
        else {
            return templateEmailClotureDao.save(templateEmailCloture);
        }
    }

    @Override
    public TemplateEmailCloture save(TemplateEmailCloture templateEmailCloture) {

        TemplateEmailCloture result = null;
        TemplateEmailCloture foundedTemplateEmailCloture = findByCode(templateEmailCloture.getCode());
        if (foundedTemplateEmailCloture == null) {


            TemplateEmailCloture savedTemplateEmailCloture = templateEmailClotureDao.save(templateEmailCloture);

            result = savedTemplateEmailCloture;
        }

        return result;
    }

    @Override
    public List<TemplateEmailCloture> save(List<TemplateEmailCloture> templateEmailClotures) {
        List<TemplateEmailCloture> list = new ArrayList<>();
        for (TemplateEmailCloture templateEmailCloture : templateEmailClotures) {
            list.add(save(templateEmailCloture));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(TemplateEmailCloture templateEmailCloture) {
        if (templateEmailCloture.getCode() == null) return -1;

        TemplateEmailCloture foundedTemplateEmailCloture = findByCode(templateEmailCloture.getCode());
        if (foundedTemplateEmailCloture == null) return -1;
        templateEmailClotureDao.delete(foundedTemplateEmailCloture);
        return 1;
    }


    public List<TemplateEmailCloture> findByCriteria(TemplateEmailClotureVo templateEmailClotureVo) {

        String query = "SELECT o FROM TemplateEmailCloture o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", templateEmailClotureVo.getId());
        query += SearchUtil.addConstraint("o", "code", "LIKE", templateEmailClotureVo.getCode());
        query += SearchUtil.addConstraint("o", "libelle", "LIKE", templateEmailClotureVo.getLibelle());
        query += SearchUtil.addConstraint("o", "objet", "LIKE", templateEmailClotureVo.getObjet());
        query += SearchUtil.addConstraint("o", "corps", "LIKE", templateEmailClotureVo.getCorps());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    @Transactional
    public void delete(List<TemplateEmailCloture> templateEmailClotures) {
        if (ListUtil.isNotEmpty(templateEmailClotures)) {
            templateEmailClotures.forEach(e -> templateEmailClotureDao.delete(e));
        }
    }

    @Override
    public void update(List<TemplateEmailCloture> templateEmailClotures) {
        if (ListUtil.isNotEmpty(templateEmailClotures)) {
            templateEmailClotures.forEach(e -> templateEmailClotureDao.save(e));
        }
    }


}
