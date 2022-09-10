package ma.maneo.kosc.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.KoscEmployee;
import ma.maneo.kosc.dao.KoscEmployeeDao;
import ma.maneo.kosc.service.chercheur.facade.KoscEmployeeChercheurService;

import ma.maneo.kosc.ws.rest.provided.vo.KoscEmployeeVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class KoscEmployeeChercheurServiceImpl extends AbstractServiceImpl<KoscEmployee> implements KoscEmployeeChercheurService {

    @Autowired
    private KoscEmployeeDao koscEmployeeDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<KoscEmployee> findAll() {
        return koscEmployeeDao.findAll();
    }

    @Override
    public KoscEmployee findById(Long id) {
        if (id == null) return null;
        return koscEmployeeDao.getOne(id);
    }

    @Override
    public KoscEmployee findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (koscEmployeeDao.findById(id).isPresent()) {
            koscEmployeeDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public KoscEmployee update(KoscEmployee koscEmployee) {
        KoscEmployee foundedKoscEmployee = findById(koscEmployee.getId());
        if (foundedKoscEmployee == null) return null;
        else {
            return koscEmployeeDao.save(koscEmployee);
        }
    }

    @Override
    public KoscEmployee save(KoscEmployee koscEmployee) {


        return koscEmployeeDao.save(koscEmployee);


    }

    @Override
    public List<KoscEmployee> save(List<KoscEmployee> koscEmployees) {
        List<KoscEmployee> list = new ArrayList<>();
        for (KoscEmployee koscEmployee : koscEmployees) {
            list.add(save(koscEmployee));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(KoscEmployee koscEmployee) {
        if (koscEmployee.getId() == null) return -1;
        KoscEmployee foundedKoscEmployee = findById(koscEmployee.getId());
        if (foundedKoscEmployee == null) return -1;
        koscEmployeeDao.delete(foundedKoscEmployee);
        return 1;
    }


    public List<KoscEmployee> findByCriteria(KoscEmployeeVo koscEmployeeVo) {

        String query = "SELECT o FROM KoscEmployee o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", koscEmployeeVo.getId());
        query += SearchUtil.addConstraint("o", "firstName", "LIKE", koscEmployeeVo.getFirstName());
        query += SearchUtil.addConstraint("o", "lastName", "LIKE", koscEmployeeVo.getLastName());
        query += SearchUtil.addConstraint("o", "phone", "LIKE", koscEmployeeVo.getPhone());
        query += SearchUtil.addConstraint("o", "cellPhone", "LIKE", koscEmployeeVo.getCellPhone());
        query += SearchUtil.addConstraint("o", "email1", "LIKE", koscEmployeeVo.getEmail1());
        query += SearchUtil.addConstraint("o", "email2", "LIKE", koscEmployeeVo.getEmail2());
        query += SearchUtil.addConstraint("o", "email3", "LIKE", koscEmployeeVo.getEmail3());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    @Transactional
    public void delete(List<KoscEmployee> koscEmployees) {
        if (ListUtil.isNotEmpty(koscEmployees)) {
            koscEmployees.forEach(e -> koscEmployeeDao.delete(e));
        }
    }

    @Override
    public void update(List<KoscEmployee> koscEmployees) {
        if (ListUtil.isNotEmpty(koscEmployees)) {
            koscEmployees.forEach(e -> koscEmployeeDao.save(e));
        }
    }


}
