package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.TemplateEmailClientInjoinable;


@Repository
public interface TemplateEmailClientInjoinableDao extends JpaRepository<TemplateEmailClientInjoinable, Long> {


    @Query("SELECT item FROM TemplateEmailClientInjoinable item ")
    List<TemplateEmailClientInjoinable> findAll();


    TemplateEmailClientInjoinable findByCode(String code);

    int deleteByCode(String code);


}
