package ma.maneo.kosc.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.TemplateEmailReport;
import ma.maneo.kosc.dao.TemplateEmailReportDao;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailReportChercheurService;

import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailReportVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class TemplateEmailReportChercheurServiceImpl extends AbstractServiceImpl<TemplateEmailReport> implements TemplateEmailReportChercheurService {

    @Autowired
    private TemplateEmailReportDao templateEmailReportDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<TemplateEmailReport> findAll() {
        return templateEmailReportDao.findAll();
    }

    @Override
    public TemplateEmailReport findByCode(String code) {
        if (code == null) return null;
        return templateEmailReportDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return templateEmailReportDao.deleteByCode(code);
    }

    @Override
    public TemplateEmailReport findByIdOrCode(TemplateEmailReport templateEmailReport) {
        TemplateEmailReport resultat = null;
        if (templateEmailReport != null) {
            if (StringUtil.isNotEmpty(templateEmailReport.getId())) {
                resultat = templateEmailReportDao.getOne(templateEmailReport.getId());
            } else if (StringUtil.isNotEmpty(templateEmailReport.getCode())) {
                resultat = templateEmailReportDao.findByCode(templateEmailReport.getCode());
            }
        }
        return resultat;
    }

    @Override
    public TemplateEmailReport findById(Long id) {
        if (id == null) return null;
        return templateEmailReportDao.getOne(id);
    }

    @Override
    public TemplateEmailReport findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (templateEmailReportDao.findById(id).isPresent()) {
            templateEmailReportDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public TemplateEmailReport update(TemplateEmailReport templateEmailReport) {
        TemplateEmailReport foundedTemplateEmailReport = findById(templateEmailReport.getId());
        if (foundedTemplateEmailReport == null) return null;
        else {
            return templateEmailReportDao.save(templateEmailReport);
        }
    }

    @Override
    public TemplateEmailReport save(TemplateEmailReport templateEmailReport) {

        TemplateEmailReport result = null;
        TemplateEmailReport foundedTemplateEmailReport = findByCode(templateEmailReport.getCode());
        if (foundedTemplateEmailReport == null) {


            TemplateEmailReport savedTemplateEmailReport = templateEmailReportDao.save(templateEmailReport);

            result = savedTemplateEmailReport;
        }

        return result;
    }

    @Override
    public List<TemplateEmailReport> save(List<TemplateEmailReport> templateEmailReports) {
        List<TemplateEmailReport> list = new ArrayList<>();
        for (TemplateEmailReport templateEmailReport : templateEmailReports) {
            list.add(save(templateEmailReport));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(TemplateEmailReport templateEmailReport) {
        if (templateEmailReport.getCode() == null) return -1;

        TemplateEmailReport foundedTemplateEmailReport = findByCode(templateEmailReport.getCode());
        if (foundedTemplateEmailReport == null) return -1;
        templateEmailReportDao.delete(foundedTemplateEmailReport);
        return 1;
    }


    public List<TemplateEmailReport> findByCriteria(TemplateEmailReportVo templateEmailReportVo) {

        String query = "SELECT o FROM TemplateEmailReport o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", templateEmailReportVo.getId());
        query += SearchUtil.addConstraint("o", "code", "LIKE", templateEmailReportVo.getCode());
        query += SearchUtil.addConstraint("o", "libelle", "LIKE", templateEmailReportVo.getLibelle());
        query += SearchUtil.addConstraint("o", "objet", "LIKE", templateEmailReportVo.getObjet());
        query += SearchUtil.addConstraint("o", "corps", "LIKE", templateEmailReportVo.getCorps());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    @Transactional
    public void delete(List<TemplateEmailReport> templateEmailReports) {
        if (ListUtil.isNotEmpty(templateEmailReports)) {
            templateEmailReports.forEach(e -> templateEmailReportDao.delete(e));
        }
    }

    @Override
    public void update(List<TemplateEmailReport> templateEmailReports) {
        if (ListUtil.isNotEmpty(templateEmailReports)) {
            templateEmailReports.forEach(e -> templateEmailReportDao.save(e));
        }
    }


}
