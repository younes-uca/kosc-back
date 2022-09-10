package ma.maneo.kosc.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.TemplateEmailReplanification;
import ma.maneo.kosc.dao.TemplateEmailReplanificationDao;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailReplanificationChercheurService;

import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailReplanificationVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateEmailReplanificationChercheurServiceImpl extends AbstractServiceImpl<TemplateEmailReplanification> implements TemplateEmailReplanificationChercheurService {

    @Autowired
    private TemplateEmailReplanificationDao templateEmailReplanificationDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<TemplateEmailReplanification> findAll() {
        return templateEmailReplanificationDao.findAll();
    }

    @Override
    public TemplateEmailReplanification findByCode(String code) {
        if (code == null) return null;
        return templateEmailReplanificationDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return templateEmailReplanificationDao.deleteByCode(code);
    }

    @Override
    public TemplateEmailReplanification findByIdOrCode(TemplateEmailReplanification templateEmailReplanification) {
        TemplateEmailReplanification resultat = null;
        if (templateEmailReplanification != null) {
            if (StringUtil.isNotEmpty(templateEmailReplanification.getId())) {
                resultat = templateEmailReplanificationDao.getOne(templateEmailReplanification.getId());
            } else if (StringUtil.isNotEmpty(templateEmailReplanification.getCode())) {
                resultat = templateEmailReplanificationDao.findByCode(templateEmailReplanification.getCode());
            }
        }
        return resultat;
    }

    @Override
    public TemplateEmailReplanification findById(Long id) {
        if (id == null) return null;
        return templateEmailReplanificationDao.getOne(id);
    }

    @Override
    public TemplateEmailReplanification findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (templateEmailReplanificationDao.findById(id).isPresent()) {
            templateEmailReplanificationDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public TemplateEmailReplanification update(TemplateEmailReplanification templateEmailReplanification) {
        TemplateEmailReplanification foundedTemplateEmailReplanification = findById(templateEmailReplanification.getId());
        if (foundedTemplateEmailReplanification == null) return null;
        else {
            return templateEmailReplanificationDao.save(templateEmailReplanification);
        }
    }

    @Override
    public TemplateEmailReplanification save(TemplateEmailReplanification templateEmailReplanification) {

        TemplateEmailReplanification result = null;
        TemplateEmailReplanification foundedTemplateEmailReplanification = findByCode(templateEmailReplanification.getCode());
        if (foundedTemplateEmailReplanification == null) {


            TemplateEmailReplanification savedTemplateEmailReplanification = templateEmailReplanificationDao.save(templateEmailReplanification);

            result = savedTemplateEmailReplanification;
        }

        return result;
    }

    @Override
    public List<TemplateEmailReplanification> save(List<TemplateEmailReplanification> templateEmailReplanifications) {
        List<TemplateEmailReplanification> list = new ArrayList<>();
        for (TemplateEmailReplanification templateEmailReplanification : templateEmailReplanifications) {
            list.add(save(templateEmailReplanification));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(TemplateEmailReplanification templateEmailReplanification) {
        if (templateEmailReplanification.getCode() == null) return -1;

        TemplateEmailReplanification foundedTemplateEmailReplanification = findByCode(templateEmailReplanification.getCode());
        if (foundedTemplateEmailReplanification == null) return -1;
        templateEmailReplanificationDao.delete(foundedTemplateEmailReplanification);
        return 1;
    }


    public List<TemplateEmailReplanification> findByCriteria(TemplateEmailReplanificationVo templateEmailReplanificationVo) {

        String query = "SELECT o FROM TemplateEmailReplanification o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", templateEmailReplanificationVo.getId());
        query += SearchUtil.addConstraint("o", "code", "LIKE", templateEmailReplanificationVo.getCode());
        query += SearchUtil.addConstraint("o", "libelle", "LIKE", templateEmailReplanificationVo.getLibelle());
        query += SearchUtil.addConstraint("o", "objet", "LIKE", templateEmailReplanificationVo.getObjet());
        query += SearchUtil.addConstraint("o", "corps", "LIKE", templateEmailReplanificationVo.getCorps());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    @Transactional
    public void delete(List<TemplateEmailReplanification> templateEmailReplanifications) {
        if (ListUtil.isNotEmpty(templateEmailReplanifications)) {
            templateEmailReplanifications.forEach(e -> templateEmailReplanificationDao.delete(e));
        }
    }

    @Override
    public void update(List<TemplateEmailReplanification> templateEmailReplanifications) {
        if (ListUtil.isNotEmpty(templateEmailReplanifications)) {
            templateEmailReplanifications.forEach(e -> templateEmailReplanificationDao.save(e));
        }
    }


}
