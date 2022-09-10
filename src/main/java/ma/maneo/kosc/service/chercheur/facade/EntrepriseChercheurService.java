package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.Entreprise;
import ma.maneo.kosc.ws.rest.provided.vo.EntrepriseVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface EntrepriseChercheurService extends AbstractService<Entreprise, Long, EntrepriseVo> {


    /**
     * find Entreprise from database by code (reference)
     *
     * @param code - reference of Entreprise
     * @return the founded Entreprise , If no Entreprise were
     * found in database return  null.
     */
    Entreprise findByCode(String code);

    /**
     * find Entreprise from database by id (PK) or code (reference)
     *
     * @param id   - id of Entreprise
     * @param code - reference of Entreprise
     * @return the founded Entreprise , If no Entreprise were
     * found in database return  null.
     */
    Entreprise findByIdOrCode(Entreprise entreprise);


    /**
     * delete Entreprise from database
     *
     * @param id - id of Entreprise to be deleted
     */
    int deleteById(Long id);


    /**
     * delete Entreprise from database by code (reference)
     *
     * @param code - reference of Entreprise to be deleted
     * @return 1 if Entreprise deleted successfully
     */
    int deleteByCode(String code);


}
