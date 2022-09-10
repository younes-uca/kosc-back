package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.KoscEmployee;


@Repository
public interface KoscEmployeeDao extends JpaRepository<KoscEmployee, Long> {


    @Query("SELECT item FROM KoscEmployee item ")
    List<KoscEmployee> findAll();


}
