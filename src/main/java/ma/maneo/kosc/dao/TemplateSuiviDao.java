package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.TemplateSuivi;


@Repository
public interface TemplateSuiviDao extends JpaRepository<TemplateSuivi, Long> {


    @Query("SELECT item FROM TemplateSuivi item ")
    List<TemplateSuivi> findAll();


    TemplateSuivi findByCode(String code);

    int deleteByCode(String code);


}
