package ma.maneo.kosc.service.admin.facade;

import java.util.List;

import ma.maneo.kosc.bean.TemplateEmailPlanification;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailPlanificationVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface TemplateEmailPlanificationAdminService extends AbstractService<TemplateEmailPlanification, Long, TemplateEmailPlanificationVo> {


    /**
     * find TemplateEmailPlanification from database by code (reference)
     *
     * @param code - reference of TemplateEmailPlanification
     * @return the founded TemplateEmailPlanification , If no TemplateEmailPlanification were
     * found in database return  null.
     */
    TemplateEmailPlanification findByCode(String code);

    /**
     * find TemplateEmailPlanification from database by id (PK) or code (reference)
     *
     * @param id   - id of TemplateEmailPlanification
     * @param code - reference of TemplateEmailPlanification
     * @return the founded TemplateEmailPlanification , If no TemplateEmailPlanification were
     * found in database return  null.
     */
    TemplateEmailPlanification findByIdOrCode(TemplateEmailPlanification templateEmailPlanification);


    /**
     * delete TemplateEmailPlanification from database
     *
     * @param id - id of TemplateEmailPlanification to be deleted
     */
    int deleteById(Long id);


    /**
     * delete TemplateEmailPlanification from database by code (reference)
     *
     * @param code - reference of TemplateEmailPlanification to be deleted
     * @return 1 if TemplateEmailPlanification deleted successfully
     */
    int deleteByCode(String code);


}
