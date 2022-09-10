package ma.maneo.kosc.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.Client;
import ma.maneo.kosc.dao.ClientDao;
import ma.maneo.kosc.service.admin.facade.ClientAdminService;

import ma.maneo.kosc.ws.rest.provided.vo.ClientVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class ClientAdminServiceImpl extends AbstractServiceImpl<Client> implements ClientAdminService {

    @Autowired
    private ClientDao clientDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public Client findById(Long id) {
        if (id == null) return null;
        return clientDao.getOne(id);
    }

    @Override
    public Client findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (clientDao.findById(id).isPresent()) {
            clientDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public Client update(Client client) {
        Client foundedClient = findById(client.getId());
        if (foundedClient == null) return null;
        else {
            return clientDao.save(client);
        }
    }

    @Override
    public Client save(Client client) {


        return clientDao.save(client);


    }

    @Override
    public List<Client> save(List<Client> clients) {
        List<Client> list = new ArrayList<>();
        for (Client client : clients) {
            list.add(save(client));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(Client client) {
        if (client.getId() == null) return -1;
        Client foundedClient = findById(client.getId());
        if (foundedClient == null) return -1;
        clientDao.delete(foundedClient);
        return 1;
    }


    public List<Client> findByCriteria(ClientVo clientVo) {

        String query = "SELECT o FROM Client o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", clientVo.getId());
        query += SearchUtil.addConstraint("o", "email", "LIKE", clientVo.getEmail());
        query += SearchUtil.addConstraint("o", "nom", "LIKE", clientVo.getNom());
        query += SearchUtil.addConstraint("o", "prenom", "LIKE", clientVo.getPrenom());
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    @Transactional
    public void delete(List<Client> clients) {
        if (ListUtil.isNotEmpty(clients)) {
            clients.forEach(e -> clientDao.delete(e));
        }
    }

    @Override
    public void update(List<Client> clients) {
        if (ListUtil.isNotEmpty(clients)) {
            clients.forEach(e -> clientDao.save(e));
        }
    }


}
