package ma.maneo.kosc.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.Technicien;
import ma.maneo.kosc.bean.Entreprise;
import ma.maneo.kosc.dao.TechnicienDao;
import ma.maneo.kosc.service.admin.facade.TechnicienAdminService;
import ma.maneo.kosc.service.admin.facade.EntrepriseAdminService;

import ma.maneo.kosc.ws.rest.provided.vo.TechnicienVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class TechnicienAdminServiceImpl extends AbstractServiceImpl<Technicien> implements TechnicienAdminService {

    @Autowired
    private TechnicienDao technicienDao;

    @Autowired
    private EntrepriseAdminService entrepriseService;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<Technicien> findAll() {
        return technicienDao.findAll();
    }

    @Override
    public List<Technicien> findByEntrepriseCode(String code) {
        return technicienDao.findByEntrepriseCode(code);
    }

    @Override
    @Transactional
    public int deleteByEntrepriseCode(String code) {
        return technicienDao.deleteByEntrepriseCode(code);
    }

    @Override
    public List<Technicien> findByEntrepriseId(Long id) {
        return technicienDao.findByEntrepriseId(id);
    }

    @Override
    @Transactional
    public int deleteByEntrepriseId(Long id) {
        return technicienDao.deleteByEntrepriseId(id);
    }

    @Override
    public Technicien findByIdentifiant(String identifiant) {
        if (identifiant == null) return null;
        return technicienDao.findByIdentifiant(identifiant);
    }

    @Override
    @Transactional
    public int deleteByIdentifiant(String identifiant) {
        return technicienDao.deleteByIdentifiant(identifiant);
    }

    @Override
    public Technicien findByIdOrIdentifiant(Technicien technicien) {
        Technicien resultat = null;
        if (technicien != null) {
            if (StringUtil.isNotEmpty(technicien.getId())) {
                resultat = technicienDao.getOne(technicien.getId());
            } else if (StringUtil.isNotEmpty(technicien.getIdentifiant())) {
                resultat = technicienDao.findByIdentifiant(technicien.getIdentifiant());
            }
        }
        return resultat;
    }

    @Override
    public Technicien findById(Long id) {
        if (id == null) return null;
        return technicienDao.getOne(id);
    }

    @Override
    public Technicien findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (technicienDao.findById(id).isPresent()) {
            technicienDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public Technicien update(Technicien technicien) {
        Technicien foundedTechnicien = findById(technicien.getId());
        if (foundedTechnicien == null) return null;
        else {
            return technicienDao.save(technicien);
        }
    }

    @Override
    public Technicien save(Technicien technicien) {

        Technicien result = null;
        Technicien foundedTechnicien = findByIdentifiant(technicien.getIdentifiant());
        if (foundedTechnicien == null) {


            findEntreprise(technicien);

            Technicien savedTechnicien = technicienDao.save(technicien);

            result = savedTechnicien;
        }

        return result;
    }

    @Override
    public List<Technicien> save(List<Technicien> techniciens) {
        List<Technicien> list = new ArrayList<>();
        for (Technicien technicien : techniciens) {
            list.add(save(technicien));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(Technicien technicien) {
        if (technicien.getIdentifiant() == null) return -1;

        Technicien foundedTechnicien = findByIdentifiant(technicien.getIdentifiant());
        if (foundedTechnicien == null) return -1;
        technicienDao.delete(foundedTechnicien);
        return 1;
    }


    public List<Technicien> findByCriteria(TechnicienVo technicienVo) {

        String query = "SELECT o FROM Technicien o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", technicienVo.getId());
        query += SearchUtil.addConstraint("o", "nom", "LIKE", technicienVo.getNom());
        query += SearchUtil.addConstraint("o", "prenom", "LIKE", technicienVo.getPrenom());
        query += SearchUtil.addConstraint("o", "cellPhone", "LIKE", technicienVo.getCellPhone());
        query += SearchUtil.addConstraint("o", "email", "LIKE", technicienVo.getEmail());
        query += SearchUtil.addConstraint("o", "emailAttachement", "LIKE", technicienVo.getEmailAttachement());
        query += SearchUtil.addConstraint("o", "identifiant", "LIKE", technicienVo.getIdentifiant());
        query += SearchUtil.addConstraint("o", "motPasse", "LIKE", technicienVo.getMotPasse());
        query += SearchUtil.addConstraint("o", "adresseOnt", "LIKE", technicienVo.getAdresseOnt());
        if (technicienVo.getEntrepriseVo() != null) {
            query += SearchUtil.addConstraint("o", "entreprise.id", "=", technicienVo.getEntrepriseVo().getId());
            query += SearchUtil.addConstraint("o", "entreprise.code", "LIKE", technicienVo.getEntrepriseVo().getCode());
        }

        return entityManager.createQuery(query).getResultList();
    }

    private void findEntreprise(Technicien technicien) {
        Entreprise loadedEntreprise = entrepriseService.findByIdOrCode(technicien.getEntreprise());

        if (loadedEntreprise == null) {
            return;
        }
        technicien.setEntreprise(loadedEntreprise);
    }

    @Override
    @Transactional
    public void delete(List<Technicien> techniciens) {
        if (ListUtil.isNotEmpty(techniciens)) {
            techniciens.forEach(e -> technicienDao.delete(e));
        }
    }

    @Override
    public void update(List<Technicien> techniciens) {
        if (ListUtil.isNotEmpty(techniciens)) {
            techniciens.forEach(e -> technicienDao.save(e));
        }
    }


}
