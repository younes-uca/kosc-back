package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.TemplateEmailCloture;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailClotureVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface TemplateEmailClotureChercheurService extends AbstractService<TemplateEmailCloture, Long, TemplateEmailClotureVo> {


    /**
     * find TemplateEmailCloture from database by code (reference)
     *
     * @param code - reference of TemplateEmailCloture
     * @return the founded TemplateEmailCloture , If no TemplateEmailCloture were
     * found in database return  null.
     */
    TemplateEmailCloture findByCode(String code);

    /**
     * find TemplateEmailCloture from database by id (PK) or code (reference)
     *
     * @param id   - id of TemplateEmailCloture
     * @param code - reference of TemplateEmailCloture
     * @return the founded TemplateEmailCloture , If no TemplateEmailCloture were
     * found in database return  null.
     */
    TemplateEmailCloture findByIdOrCode(TemplateEmailCloture templateEmailCloture);


    /**
     * delete TemplateEmailCloture from database
     *
     * @param id - id of TemplateEmailCloture to be deleted
     */
    int deleteById(Long id);


    /**
     * delete TemplateEmailCloture from database by code (reference)
     *
     * @param code - reference of TemplateEmailCloture to be deleted
     * @return 1 if TemplateEmailCloture deleted successfully
     */
    int deleteByCode(String code);


}
