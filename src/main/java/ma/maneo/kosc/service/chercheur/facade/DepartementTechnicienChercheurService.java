package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.DepartementTechnicien;
import ma.maneo.kosc.ws.rest.provided.vo.DepartementTechnicienVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface DepartementTechnicienChercheurService extends AbstractService<DepartementTechnicien, Long, DepartementTechnicienVo> {


    /**
     * delete DepartementTechnicien from database
     *
     * @param id - id of DepartementTechnicien to be deleted
     */
    int deleteById(Long id);


    List<DepartementTechnicien> findByTechnicienIdentifiant(String identifiant);

    int deleteByTechnicienIdentifiant(String identifiant);

    List<DepartementTechnicien> findByTechnicienId(Long id);

    int deleteByTechnicienId(Long id);

    List<DepartementTechnicien> findByDepartementCode(String code);

    int deleteByDepartementCode(String code);

    List<DepartementTechnicien> findByDepartementId(Long id);

    int deleteByDepartementId(Long id);


}
