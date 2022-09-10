package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.DepartementTechnicien;


@Repository
public interface DepartementTechnicienDao extends JpaRepository<DepartementTechnicien, Long> {


    @Query("SELECT item FROM DepartementTechnicien item ")
    List<DepartementTechnicien> findAll();


    List<DepartementTechnicien> findByTechnicienIdentifiant(String identifiant);

    int deleteByTechnicienIdentifiant(String identifiant);

    List<DepartementTechnicien> findByTechnicienId(Long id);

    int deleteByTechnicienId(Long id);

    List<DepartementTechnicien> findByDepartementCode(String code);

    int deleteByDepartementCode(String code);

    List<DepartementTechnicien> findByDepartementId(Long id);

    int deleteByDepartementId(Long id);


}
