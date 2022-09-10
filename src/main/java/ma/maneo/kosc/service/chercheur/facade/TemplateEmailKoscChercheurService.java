package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.TemplateEmailKosc;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailKoscVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface TemplateEmailKoscChercheurService extends AbstractService<TemplateEmailKosc, Long, TemplateEmailKoscVo> {


    /**
     * find TemplateEmailKosc from database by code (reference)
     *
     * @param code - reference of TemplateEmailKosc
     * @return the founded TemplateEmailKosc , If no TemplateEmailKosc were
     * found in database return  null.
     */
    TemplateEmailKosc findByCode(String code);

    /**
     * find TemplateEmailKosc from database by id (PK) or code (reference)
     *
     * @param id   - id of TemplateEmailKosc
     * @param code - reference of TemplateEmailKosc
     * @return the founded TemplateEmailKosc , If no TemplateEmailKosc were
     * found in database return  null.
     */
    TemplateEmailKosc findByIdOrCode(TemplateEmailKosc templateEmailKosc);


    /**
     * delete TemplateEmailKosc from database
     *
     * @param id - id of TemplateEmailKosc to be deleted
     */
    int deleteById(Long id);


    /**
     * delete TemplateEmailKosc from database by code (reference)
     *
     * @param code - reference of TemplateEmailKosc to be deleted
     * @return 1 if TemplateEmailKosc deleted successfully
     */
    int deleteByCode(String code);


}
