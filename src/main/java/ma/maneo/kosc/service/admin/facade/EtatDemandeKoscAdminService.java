package ma.maneo.kosc.service.admin.facade;

import java.util.List;

import ma.maneo.kosc.bean.EtatDemandeKosc;
import ma.maneo.kosc.ws.rest.provided.vo.EtatDemandeKoscVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface EtatDemandeKoscAdminService extends AbstractService<EtatDemandeKosc, Long, EtatDemandeKoscVo> {


    /**
     * find EtatDemandeKosc from database by code (reference)
     *
     * @param code - reference of EtatDemandeKosc
     * @return the founded EtatDemandeKosc , If no EtatDemandeKosc were
     * found in database return  null.
     */
    EtatDemandeKosc findByCode(String code);

    /**
     * find EtatDemandeKosc from database by id (PK) or code (reference)
     *
     * @param id   - id of EtatDemandeKosc
     * @param code - reference of EtatDemandeKosc
     * @return the founded EtatDemandeKosc , If no EtatDemandeKosc were
     * found in database return  null.
     */
    EtatDemandeKosc findByIdOrCode(EtatDemandeKosc etatDemandeKosc);


    /**
     * delete EtatDemandeKosc from database
     *
     * @param id - id of EtatDemandeKosc to be deleted
     */
    int deleteById(Long id);


    /**
     * delete EtatDemandeKosc from database by code (reference)
     *
     * @param code - reference of EtatDemandeKosc to be deleted
     * @return 1 if EtatDemandeKosc deleted successfully
     */
    int deleteByCode(String code);


}
