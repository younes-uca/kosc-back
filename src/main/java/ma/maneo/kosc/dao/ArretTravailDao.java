package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.ArretTravail;


@Repository
public interface ArretTravailDao extends JpaRepository<ArretTravail, Long> {


    @Query("SELECT item FROM ArretTravail item ")
    List<ArretTravail> findAll();


    List<ArretTravail> findByTechnicienIdentifiant(String identifiant);

    int deleteByTechnicienIdentifiant(String identifiant);

    List<ArretTravail> findByTechnicienId(Long id);

    int deleteByTechnicienId(Long id);

    List<ArretTravail> findByRaisonArretTravailCode(String code);

    int deleteByRaisonArretTravailCode(String code);

    List<ArretTravail> findByRaisonArretTravailId(Long id);

    int deleteByRaisonArretTravailId(Long id);


}
