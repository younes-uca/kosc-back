package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.TemplateEmailKosc;


@Repository
public interface TemplateEmailKoscDao extends JpaRepository<TemplateEmailKosc, Long> {


    @Query("SELECT item FROM TemplateEmailKosc item ")
    List<TemplateEmailKosc> findAll();


    TemplateEmailKosc findByCode(String code);

    int deleteByCode(String code);


}
