package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.Technicien;


@Repository
public interface TechnicienDao extends JpaRepository<Technicien, Long> {


    @Query("SELECT item FROM Technicien item ")
    List<Technicien> findAll();


    Technicien findByIdentifiant(String identifiant);

    int deleteByIdentifiant(String identifiant);

    List<Technicien> findByEntrepriseCode(String code);

    int deleteByEntrepriseCode(String code);

    List<Technicien> findByEntrepriseId(Long id);

    int deleteByEntrepriseId(Long id);


}
