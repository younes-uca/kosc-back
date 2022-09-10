package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.TemplateEmailClientInjoinable;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailClientInjoinableVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface TemplateEmailClientInjoinableChercheurService extends AbstractService<TemplateEmailClientInjoinable, Long, TemplateEmailClientInjoinableVo> {


    /**
     * find TemplateEmailClientInjoinable from database by code (reference)
     *
     * @param code - reference of TemplateEmailClientInjoinable
     * @return the founded TemplateEmailClientInjoinable , If no TemplateEmailClientInjoinable were
     * found in database return  null.
     */
    TemplateEmailClientInjoinable findByCode(String code);

    /**
     * find TemplateEmailClientInjoinable from database by id (PK) or code (reference)
     *
     * @param id   - id of TemplateEmailClientInjoinable
     * @param code - reference of TemplateEmailClientInjoinable
     * @return the founded TemplateEmailClientInjoinable , If no TemplateEmailClientInjoinable were
     * found in database return  null.
     */
    TemplateEmailClientInjoinable findByIdOrCode(TemplateEmailClientInjoinable templateEmailClientInjoinable);


    /**
     * delete TemplateEmailClientInjoinable from database
     *
     * @param id - id of TemplateEmailClientInjoinable to be deleted
     */
    int deleteById(Long id);


    /**
     * delete TemplateEmailClientInjoinable from database by code (reference)
     *
     * @param code - reference of TemplateEmailClientInjoinable to be deleted
     * @return 1 if TemplateEmailClientInjoinable deleted successfully
     */
    int deleteByCode(String code);


}
