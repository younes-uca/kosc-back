package ma.maneo.kosc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ma.maneo.kosc.bean.Operator;


@Repository
public interface OperatorDao extends JpaRepository<Operator, Long> {


    @Query("SELECT item FROM Operator item ")
    List<Operator> findAll();


    Operator findByReference(String reference);

    int deleteByReference(String reference);


}
