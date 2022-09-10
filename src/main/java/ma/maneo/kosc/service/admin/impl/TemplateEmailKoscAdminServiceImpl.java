package ma.maneo.kosc.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.TemplateEmailKosc;
import ma.maneo.kosc.dao.TemplateEmailKoscDao;
import ma.maneo.kosc.service.admin.facade.TemplateEmailKoscAdminService;

import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailKoscVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateEmailKoscAdminServiceImpl extends AbstractServiceImpl<TemplateEmailKosc> implements TemplateEmailKoscAdminService {

    @Autowired
    private TemplateEmailKoscDao templateEmailKoscDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<TemplateEmailKosc> findAll() {
        return templateEmailKoscDao.findAll();
    }

    @Override
    public TemplateEmailKosc findByCode(String code) {
        if (code == null) return null;
        return templateEmailKoscDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return templateEmailKoscDao.deleteByCode(code);
    }

    @Override
    public TemplateEmailKosc findByIdOrCode(TemplateEmailKosc templateEmailKosc) {
        TemplateEmailKosc resultat = null;
        if (templateEmailKosc != null) {
            if (StringUtil.isNotEmpty(templateEmailKosc.getId())) {
                resultat = templateEmailKoscDao.getOne(templateEmailKosc.getId());
            } else if (StringUtil.isNotEmpty(templateEmailKosc.getCode())) {
                resultat = templateEmailKoscDao.findByCode(templateEmailKosc.getCode());
            }
        }
        return resultat;
    }

    @Override
    public TemplateEmailKosc findById(Long id) {
        if (id == null) return null;
        return templateEmailKoscDao.getOne(id);
    }

    @Override
    public TemplateEmailKosc findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (templateEmailKoscDao.findById(id).isPresent()) {
            templateEmailKoscDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public TemplateEmailKosc update(TemplateEmailKosc templateEmailKosc) {
        TemplateEmailKosc foundedTemplateEmailKosc = findById(templateEmailKosc.getId());
        if (foundedTemplateEmailKosc == null) return null;
        else {
            return templateEmailKoscDao.save(templateEmailKosc);
        }
    }

    @Override
    public TemplateEmailKosc save(TemplateEmailKosc templateEmailKosc) {

        TemplateEmailKosc result = null;
        TemplateEmailKosc foundedTemplateEmailKosc = findByCode(templateEmailKosc.getCode());
        if (foundedTemplateEmailKosc == null) {


            TemplateEmailKosc savedTemplateEmailKosc = templateEmailKoscDao.save(templateEmailKosc);

            result = savedTemplateEmailKosc;
        }

        return result;
    }

    @Override
    public List<TemplateEmailKosc> save(List<TemplateEmailKosc> templateEmailKoscs) {
        List<TemplateEmailKosc> list = new ArrayList<>();
        for (TemplateEmailKosc templateEmailKosc : templateEmailKoscs) {
            list.add(save(templateEmailKosc));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(TemplateEmailKosc templateEmailKosc) {
        if (templateEmailKosc.getCode() == null) return -1;

        TemplateEmailKosc foundedTemplateEmailKosc = findByCode(templateEmailKosc.getCode());
        if (foundedTemplateEmailKosc == null) return -1;
        templateEmailKoscDao.delete(foundedTemplateEmailKosc);
        return 1;
    }


    public List<TemplateEmailKosc> findByCriteria(TemplateEmailKoscVo templateEmailKoscVo) {

        String query = "SELECT o FROM TemplateEmailKosc o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", templateEmailKoscVo.getId());
        query += SearchUtil.addConstraint("o", "code", "LIKE", templateEmailKoscVo.getCode());
        query += SearchUtil.addConstraint("o", "libelle", "LIKE", templateEmailKoscVo.getLibelle());
        query += SearchUtil.addConstraint("o", "objet", "LIKE", templateEmailKoscVo.getObjet());
        query += SearchUtil.addConstraint("o", "corps", "LIKE", templateEmailKoscVo.getCorps());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    @Transactional
    public void delete(List<TemplateEmailKosc> templateEmailKoscs) {
        if (ListUtil.isNotEmpty(templateEmailKoscs)) {
            templateEmailKoscs.forEach(e -> templateEmailKoscDao.delete(e));
        }
    }

    @Override
    public void update(List<TemplateEmailKosc> templateEmailKoscs) {
        if (ListUtil.isNotEmpty(templateEmailKoscs)) {
            templateEmailKoscs.forEach(e -> templateEmailKoscDao.save(e));
        }
    }


}
