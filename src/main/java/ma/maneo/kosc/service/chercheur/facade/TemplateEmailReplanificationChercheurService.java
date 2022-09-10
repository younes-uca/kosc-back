package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.TemplateEmailReplanification;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailReplanificationVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface TemplateEmailReplanificationChercheurService extends AbstractService<TemplateEmailReplanification, Long, TemplateEmailReplanificationVo> {


    /**
     * find TemplateEmailReplanification from database by code (reference)
     *
     * @param code - reference of TemplateEmailReplanification
     * @return the founded TemplateEmailReplanification , If no TemplateEmailReplanification were
     * found in database return  null.
     */
    TemplateEmailReplanification findByCode(String code);

    /**
     * find TemplateEmailReplanification from database by id (PK) or code (reference)
     *
     * @param id   - id of TemplateEmailReplanification
     * @param code - reference of TemplateEmailReplanification
     * @return the founded TemplateEmailReplanification , If no TemplateEmailReplanification were
     * found in database return  null.
     */
    TemplateEmailReplanification findByIdOrCode(TemplateEmailReplanification templateEmailReplanification);


    /**
     * delete TemplateEmailReplanification from database
     *
     * @param id - id of TemplateEmailReplanification to be deleted
     */
    int deleteById(Long id);


    /**
     * delete TemplateEmailReplanification from database by code (reference)
     *
     * @param code - reference of TemplateEmailReplanification to be deleted
     * @return 1 if TemplateEmailReplanification deleted successfully
     */
    int deleteByCode(String code);


}
