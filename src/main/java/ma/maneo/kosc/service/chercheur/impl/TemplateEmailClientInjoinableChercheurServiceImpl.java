package ma.maneo.kosc.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.TemplateEmailClientInjoinable;
import ma.maneo.kosc.dao.TemplateEmailClientInjoinableDao;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailClientInjoinableChercheurService;

import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailClientInjoinableVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateEmailClientInjoinableChercheurServiceImpl extends AbstractServiceImpl<TemplateEmailClientInjoinable> implements TemplateEmailClientInjoinableChercheurService {

    @Autowired
    private TemplateEmailClientInjoinableDao templateEmailClientInjoinableDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<TemplateEmailClientInjoinable> findAll() {
        return templateEmailClientInjoinableDao.findAll();
    }

    @Override
    public TemplateEmailClientInjoinable findByCode(String code) {
        if (code == null) return null;
        return templateEmailClientInjoinableDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return templateEmailClientInjoinableDao.deleteByCode(code);
    }

    @Override
    public TemplateEmailClientInjoinable findByIdOrCode(TemplateEmailClientInjoinable templateEmailClientInjoinable) {
        TemplateEmailClientInjoinable resultat = null;
        if (templateEmailClientInjoinable != null) {
            if (StringUtil.isNotEmpty(templateEmailClientInjoinable.getId())) {
                resultat = templateEmailClientInjoinableDao.getOne(templateEmailClientInjoinable.getId());
            } else if (StringUtil.isNotEmpty(templateEmailClientInjoinable.getCode())) {
                resultat = templateEmailClientInjoinableDao.findByCode(templateEmailClientInjoinable.getCode());
            }
        }
        return resultat;
    }

    @Override
    public TemplateEmailClientInjoinable findById(Long id) {
        if (id == null) return null;
        return templateEmailClientInjoinableDao.getOne(id);
    }

    @Override
    public TemplateEmailClientInjoinable findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (templateEmailClientInjoinableDao.findById(id).isPresent()) {
            templateEmailClientInjoinableDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public TemplateEmailClientInjoinable update(TemplateEmailClientInjoinable templateEmailClientInjoinable) {
        TemplateEmailClientInjoinable foundedTemplateEmailClientInjoinable = findById(templateEmailClientInjoinable.getId());
        if (foundedTemplateEmailClientInjoinable == null) return null;
        else {
            return templateEmailClientInjoinableDao.save(templateEmailClientInjoinable);
        }
    }

    @Override
    public TemplateEmailClientInjoinable save(TemplateEmailClientInjoinable templateEmailClientInjoinable) {

        TemplateEmailClientInjoinable result = null;
        TemplateEmailClientInjoinable foundedTemplateEmailClientInjoinable = findByCode(templateEmailClientInjoinable.getCode());
        if (foundedTemplateEmailClientInjoinable == null) {


            TemplateEmailClientInjoinable savedTemplateEmailClientInjoinable = templateEmailClientInjoinableDao.save(templateEmailClientInjoinable);

            result = savedTemplateEmailClientInjoinable;
        }

        return result;
    }

    @Override
    public List<TemplateEmailClientInjoinable> save(List<TemplateEmailClientInjoinable> templateEmailClientInjoinables) {
        List<TemplateEmailClientInjoinable> list = new ArrayList<>();
        for (TemplateEmailClientInjoinable templateEmailClientInjoinable : templateEmailClientInjoinables) {
            list.add(save(templateEmailClientInjoinable));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(TemplateEmailClientInjoinable templateEmailClientInjoinable) {
        if (templateEmailClientInjoinable.getCode() == null) return -1;

        TemplateEmailClientInjoinable foundedTemplateEmailClientInjoinable = findByCode(templateEmailClientInjoinable.getCode());
        if (foundedTemplateEmailClientInjoinable == null) return -1;
        templateEmailClientInjoinableDao.delete(foundedTemplateEmailClientInjoinable);
        return 1;
    }


    public List<TemplateEmailClientInjoinable> findByCriteria(TemplateEmailClientInjoinableVo templateEmailClientInjoinableVo) {

        String query = "SELECT o FROM TemplateEmailClientInjoinable o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", templateEmailClientInjoinableVo.getId());
        query += SearchUtil.addConstraint("o", "code", "LIKE", templateEmailClientInjoinableVo.getCode());
        query += SearchUtil.addConstraint("o", "libelle", "LIKE", templateEmailClientInjoinableVo.getLibelle());
        query += SearchUtil.addConstraint("o", "objet", "LIKE", templateEmailClientInjoinableVo.getObjet());
        query += SearchUtil.addConstraint("o", "corps", "LIKE", templateEmailClientInjoinableVo.getCorps());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    @Transactional
    public void delete(List<TemplateEmailClientInjoinable> templateEmailClientInjoinables) {
        if (ListUtil.isNotEmpty(templateEmailClientInjoinables)) {
            templateEmailClientInjoinables.forEach(e -> templateEmailClientInjoinableDao.delete(e));
        }
    }

    @Override
    public void update(List<TemplateEmailClientInjoinable> templateEmailClientInjoinables) {
        if (ListUtil.isNotEmpty(templateEmailClientInjoinables)) {
            templateEmailClientInjoinables.forEach(e -> templateEmailClientInjoinableDao.save(e));
        }
    }


}
