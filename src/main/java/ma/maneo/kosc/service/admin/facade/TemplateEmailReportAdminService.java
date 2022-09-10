package ma.maneo.kosc.service.admin.facade;

import java.util.List;

import ma.maneo.kosc.bean.TemplateEmailReport;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailReportVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface TemplateEmailReportAdminService extends AbstractService<TemplateEmailReport, Long, TemplateEmailReportVo> {


    /**
     * find TemplateEmailReport from database by code (reference)
     *
     * @param code - reference of TemplateEmailReport
     * @return the founded TemplateEmailReport , If no TemplateEmailReport were
     * found in database return  null.
     */
    TemplateEmailReport findByCode(String code);

    /**
     * find TemplateEmailReport from database by id (PK) or code (reference)
     *
     * @param id   - id of TemplateEmailReport
     * @param code - reference of TemplateEmailReport
     * @return the founded TemplateEmailReport , If no TemplateEmailReport were
     * found in database return  null.
     */
    TemplateEmailReport findByIdOrCode(TemplateEmailReport templateEmailReport);


    /**
     * delete TemplateEmailReport from database
     *
     * @param id - id of TemplateEmailReport to be deleted
     */
    int deleteById(Long id);


    /**
     * delete TemplateEmailReport from database by code (reference)
     *
     * @param code - reference of TemplateEmailReport to be deleted
     * @return 1 if TemplateEmailReport deleted successfully
     */
    int deleteByCode(String code);


}
