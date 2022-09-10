package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.ArretTravail;
import ma.maneo.kosc.ws.rest.provided.vo.ArretTravailVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface ArretTravailChercheurService extends AbstractService<ArretTravail, Long, ArretTravailVo> {


    /**
     * delete ArretTravail from database
     *
     * @param id - id of ArretTravail to be deleted
     */
    int deleteById(Long id);


    List<ArretTravail> findByTechnicienIdentifiant(String identifiant);

    int deleteByTechnicienIdentifiant(String identifiant);

    List<ArretTravail> findByTechnicienId(Long id);

    int deleteByTechnicienId(Long id);

    List<ArretTravail> findByRaisonArretTravailCode(String code);

    int deleteByRaisonArretTravailCode(String code);

    List<ArretTravail> findByRaisonArretTravailId(Long id);

    int deleteByRaisonArretTravailId(Long id);


}
