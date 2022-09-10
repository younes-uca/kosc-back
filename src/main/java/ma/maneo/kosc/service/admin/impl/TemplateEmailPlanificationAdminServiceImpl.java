package ma.maneo.kosc.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.TemplateEmailPlanification;
import ma.maneo.kosc.dao.TemplateEmailPlanificationDao;
import ma.maneo.kosc.service.admin.facade.TemplateEmailPlanificationAdminService;

import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailPlanificationVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateEmailPlanificationAdminServiceImpl extends AbstractServiceImpl<TemplateEmailPlanification> implements TemplateEmailPlanificationAdminService {

    @Autowired
    private TemplateEmailPlanificationDao templateEmailPlanificationDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<TemplateEmailPlanification> findAll() {
        return templateEmailPlanificationDao.findAll();
    }

    @Override
    public TemplateEmailPlanification findByCode(String code) {
        if (code == null) return null;
        return templateEmailPlanificationDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return templateEmailPlanificationDao.deleteByCode(code);
    }

    @Override
    public TemplateEmailPlanification findByIdOrCode(TemplateEmailPlanification templateEmailPlanification) {
        TemplateEmailPlanification resultat = null;
        if (templateEmailPlanification != null) {
            if (StringUtil.isNotEmpty(templateEmailPlanification.getId())) {
                resultat = templateEmailPlanificationDao.getOne(templateEmailPlanification.getId());
            } else if (StringUtil.isNotEmpty(templateEmailPlanification.getCode())) {
                resultat = templateEmailPlanificationDao.findByCode(templateEmailPlanification.getCode());
            }
        }
        return resultat;
    }

    @Override
    public TemplateEmailPlanification findById(Long id) {
        if (id == null) return null;
        return templateEmailPlanificationDao.getOne(id);
    }

    @Override
    public TemplateEmailPlanification findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (templateEmailPlanificationDao.findById(id).isPresent()) {
            templateEmailPlanificationDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public TemplateEmailPlanification update(TemplateEmailPlanification templateEmailPlanification) {
        TemplateEmailPlanification foundedTemplateEmailPlanification = findById(templateEmailPlanification.getId());
        if (foundedTemplateEmailPlanification == null) return null;
        else {
            return templateEmailPlanificationDao.save(templateEmailPlanification);
        }
    }

    @Override
    public TemplateEmailPlanification save(TemplateEmailPlanification templateEmailPlanification) {

        TemplateEmailPlanification result = null;
        TemplateEmailPlanification foundedTemplateEmailPlanification = findByCode(templateEmailPlanification.getCode());
        if (foundedTemplateEmailPlanification == null) {


            TemplateEmailPlanification savedTemplateEmailPlanification = templateEmailPlanificationDao.save(templateEmailPlanification);

            result = savedTemplateEmailPlanification;
        }

        return result;
    }

    @Override
    public List<TemplateEmailPlanification> save(List<TemplateEmailPlanification> templateEmailPlanifications) {
        List<TemplateEmailPlanification> list = new ArrayList<>();
        for (TemplateEmailPlanification templateEmailPlanification : templateEmailPlanifications) {
            list.add(save(templateEmailPlanification));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(TemplateEmailPlanification templateEmailPlanification) {
        if (templateEmailPlanification.getCode() == null) return -1;

        TemplateEmailPlanification foundedTemplateEmailPlanification = findByCode(templateEmailPlanification.getCode());
        if (foundedTemplateEmailPlanification == null) return -1;
        templateEmailPlanificationDao.delete(foundedTemplateEmailPlanification);
        return 1;
    }


    public List<TemplateEmailPlanification> findByCriteria(TemplateEmailPlanificationVo templateEmailPlanificationVo) {

        String query = "SELECT o FROM TemplateEmailPlanification o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", templateEmailPlanificationVo.getId());
        query += SearchUtil.addConstraint("o", "code", "LIKE", templateEmailPlanificationVo.getCode());
        query += SearchUtil.addConstraint("o", "libelle", "LIKE", templateEmailPlanificationVo.getLibelle());
        query += SearchUtil.addConstraint("o", "objet", "LIKE", templateEmailPlanificationVo.getObjet());
        query += SearchUtil.addConstraint("o", "corps", "LIKE", templateEmailPlanificationVo.getCorps());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    @Transactional
    public void delete(List<TemplateEmailPlanification> templateEmailPlanifications) {
        if (ListUtil.isNotEmpty(templateEmailPlanifications)) {
            templateEmailPlanifications.forEach(e -> templateEmailPlanificationDao.delete(e));
        }
    }

    @Override
    public void update(List<TemplateEmailPlanification> templateEmailPlanifications) {
        if (ListUtil.isNotEmpty(templateEmailPlanifications)) {
            templateEmailPlanifications.forEach(e -> templateEmailPlanificationDao.save(e));
        }
    }


}
