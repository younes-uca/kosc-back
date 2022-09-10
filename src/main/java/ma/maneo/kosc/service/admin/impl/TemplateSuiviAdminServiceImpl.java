package ma.maneo.kosc.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.TemplateSuivi;
import ma.maneo.kosc.dao.TemplateSuiviDao;
import ma.maneo.kosc.service.admin.facade.TemplateSuiviAdminService;

import ma.maneo.kosc.ws.rest.provided.vo.TemplateSuiviVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateSuiviAdminServiceImpl extends AbstractServiceImpl<TemplateSuivi> implements TemplateSuiviAdminService {

    @Autowired
    private TemplateSuiviDao templateSuiviDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<TemplateSuivi> findAll() {
        return templateSuiviDao.findAll();
    }

    @Override
    public TemplateSuivi findByCode(String code) {
        if (code == null) return null;
        return templateSuiviDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return templateSuiviDao.deleteByCode(code);
    }

    @Override
    public TemplateSuivi findByIdOrCode(TemplateSuivi templateSuivi) {
        TemplateSuivi resultat = null;
        if (templateSuivi != null) {
            if (StringUtil.isNotEmpty(templateSuivi.getId())) {
                resultat = templateSuiviDao.getOne(templateSuivi.getId());
            } else if (StringUtil.isNotEmpty(templateSuivi.getCode())) {
                resultat = templateSuiviDao.findByCode(templateSuivi.getCode());
            }
        }
        return resultat;
    }

    @Override
    public TemplateSuivi findById(Long id) {
        if (id == null) return null;
        return templateSuiviDao.getOne(id);
    }

    @Override
    public TemplateSuivi findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (templateSuiviDao.findById(id).isPresent()) {
            templateSuiviDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public TemplateSuivi update(TemplateSuivi templateSuivi) {
        TemplateSuivi foundedTemplateSuivi = findById(templateSuivi.getId());
        if (foundedTemplateSuivi == null) return null;
        else {
            return templateSuiviDao.save(templateSuivi);
        }
    }

    @Override
    public TemplateSuivi save(TemplateSuivi templateSuivi) {

        TemplateSuivi result = null;
        TemplateSuivi foundedTemplateSuivi = findByCode(templateSuivi.getCode());
        if (foundedTemplateSuivi == null) {


            TemplateSuivi savedTemplateSuivi = templateSuiviDao.save(templateSuivi);

            result = savedTemplateSuivi;
        }

        return result;
    }

    @Override
    public List<TemplateSuivi> save(List<TemplateSuivi> templateSuivis) {
        List<TemplateSuivi> list = new ArrayList<>();
        for (TemplateSuivi templateSuivi : templateSuivis) {
            list.add(save(templateSuivi));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(TemplateSuivi templateSuivi) {
        if (templateSuivi.getCode() == null) return -1;

        TemplateSuivi foundedTemplateSuivi = findByCode(templateSuivi.getCode());
        if (foundedTemplateSuivi == null) return -1;
        templateSuiviDao.delete(foundedTemplateSuivi);
        return 1;
    }


    public List<TemplateSuivi> findByCriteria(TemplateSuiviVo templateSuiviVo) {

        String query = "SELECT o FROM TemplateSuivi o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", templateSuiviVo.getId());
        query += SearchUtil.addConstraint("o", "code", "LIKE", templateSuiviVo.getCode());
        query += SearchUtil.addConstraint("o", "libelle", "LIKE", templateSuiviVo.getLibelle());
        query += SearchUtil.addConstraint("o", "objet", "LIKE", templateSuiviVo.getObjet());
        query += SearchUtil.addConstraint("o", "corps", "LIKE", templateSuiviVo.getCorps());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    @Transactional
    public void delete(List<TemplateSuivi> templateSuivis) {
        if (ListUtil.isNotEmpty(templateSuivis)) {
            templateSuivis.forEach(e -> templateSuiviDao.delete(e));
        }
    }

    @Override
    public void update(List<TemplateSuivi> templateSuivis) {
        if (ListUtil.isNotEmpty(templateSuivis)) {
            templateSuivis.forEach(e -> templateSuiviDao.save(e));
        }
    }


}
