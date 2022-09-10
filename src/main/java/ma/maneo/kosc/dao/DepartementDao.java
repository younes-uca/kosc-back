package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.Departement;


@Repository
public interface DepartementDao extends JpaRepository<Departement, Long> {


    @Query("SELECT item FROM Departement item ")
    List<Departement> findAll();


    Departement findByCode(String code);

    int deleteByCode(String code);

    List<Departement> findByRegionCode(String code);

    int deleteByRegionCode(String code);

    List<Departement> findByRegionId(Long id);

    int deleteByRegionId(Long id);


}
