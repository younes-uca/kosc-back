package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.Client;


@Repository
public interface ClientDao extends JpaRepository<Client, Long> {


    @Query("SELECT item FROM Client item ")
    List<Client> findAll();


}
