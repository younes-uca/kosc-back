package ma.maneo.kosc.service.admin.facade;

import java.util.List;

import ma.maneo.kosc.bean.TemplateSuivi;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateSuiviVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface TemplateSuiviAdminService extends AbstractService<TemplateSuivi, Long, TemplateSuiviVo> {


    /**
     * find TemplateSuivi from database by code (reference)
     *
     * @param code - reference of TemplateSuivi
     * @return the founded TemplateSuivi , If no TemplateSuivi were
     * found in database return  null.
     */
    TemplateSuivi findByCode(String code);

    /**
     * find TemplateSuivi from database by id (PK) or code (reference)
     *
     * @param id   - id of TemplateSuivi
     * @param code - reference of TemplateSuivi
     * @return the founded TemplateSuivi , If no TemplateSuivi were
     * found in database return  null.
     */
    TemplateSuivi findByIdOrCode(TemplateSuivi templateSuivi);


    /**
     * delete TemplateSuivi from database
     *
     * @param id - id of TemplateSuivi to be deleted
     */
    int deleteById(Long id);


    /**
     * delete TemplateSuivi from database by code (reference)
     *
     * @param code - reference of TemplateSuivi to be deleted
     * @return 1 if TemplateSuivi deleted successfully
     */
    int deleteByCode(String code);


}
