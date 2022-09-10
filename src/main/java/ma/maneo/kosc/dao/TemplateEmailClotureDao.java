package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.TemplateEmailCloture;


@Repository
public interface TemplateEmailClotureDao extends JpaRepository<TemplateEmailCloture, Long> {


    @Query("SELECT item FROM TemplateEmailCloture item ")
    List<TemplateEmailCloture> findAll();


    TemplateEmailCloture findByCode(String code);

    int deleteByCode(String code);


}
