package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.OrdreKosc;
import ma.maneo.kosc.ws.rest.provided.vo.OrdreKoscVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface OrdreKoscChercheurService extends AbstractService<OrdreKosc, Long, OrdreKoscVo> {


    /**
     * find OrdreKosc from database by referenceWorkOrder (reference)
     *
     * @param referenceWorkOrder - reference of OrdreKosc
     * @return the founded OrdreKosc , If no OrdreKosc were
     * found in database return  null.
     */
    OrdreKosc findByReferenceWorkOrder(String referenceWorkOrder);

    /**
     * find OrdreKosc from database by id (PK) or referenceWorkOrder (reference)
     *
     * @param id                 - id of OrdreKosc
     * @param referenceWorkOrder - reference of OrdreKosc
     * @return the founded OrdreKosc , If no OrdreKosc were
     * found in database return  null.
     */
    OrdreKosc findByIdOrReferenceWorkOrder(OrdreKosc ordreKosc);


    /**
     * delete OrdreKosc from database
     *
     * @param id - id of OrdreKosc to be deleted
     */
    int deleteById(Long id);


    List<OrdreKosc> findByOperatorReference(String reference);

    int deleteByOperatorReference(String reference);

    List<OrdreKosc> findByOperatorId(Long id);

    int deleteByOperatorId(Long id);

    List<OrdreKosc> findByDepartementCode(String code);

    int deleteByDepartementCode(String code);

    List<OrdreKosc> findByDepartementId(Long id);

    int deleteByDepartementId(Long id);

    List<OrdreKosc> findByTechnicienIdentifiant(String identifiant);

    int deleteByTechnicienIdentifiant(String identifiant);

    List<OrdreKosc> findByTechnicienId(Long id);

    int deleteByTechnicienId(Long id);

    List<OrdreKosc> findByClientId(Long id);

    int deleteByClientId(Long id);

    List<OrdreKosc> findByTemplateEmailClientInjoinableCode(String code);

    int deleteByTemplateEmailClientInjoinableCode(String code);

    List<OrdreKosc> findByTemplateEmailClientInjoinableId(Long id);

    int deleteByTemplateEmailClientInjoinableId(Long id);

    List<OrdreKosc> findByTemplateEmailKoscCode(String code);

    int deleteByTemplateEmailKoscCode(String code);

    List<OrdreKosc> findByTemplateEmailKoscId(Long id);

    int deleteByTemplateEmailKoscId(Long id);

    List<OrdreKosc> findByTemplateEmailPlanificationCode(String code);

    int deleteByTemplateEmailPlanificationCode(String code);

    List<OrdreKosc> findByTemplateEmailPlanificationId(Long id);

    int deleteByTemplateEmailPlanificationId(Long id);

    List<OrdreKosc> findByTemplateEmailReplanificationCode(String code);

    int deleteByTemplateEmailReplanificationCode(String code);

    List<OrdreKosc> findByTemplateEmailReplanificationId(Long id);

    int deleteByTemplateEmailReplanificationId(Long id);

    List<OrdreKosc> findByTemplateEmailReportCode(String code);

    int deleteByTemplateEmailReportCode(String code);

    List<OrdreKosc> findByTemplateEmailReportId(Long id);

    int deleteByTemplateEmailReportId(Long id);

    List<OrdreKosc> findByEtatDemandeKoscCode(String code);

    int deleteByEtatDemandeKoscCode(String code);

    List<OrdreKosc> findByEtatDemandeKoscId(Long id);

    int deleteByEtatDemandeKoscId(Long id);

    List<OrdreKosc> findByTemplateEmailClotureCode(String code);

    int deleteByTemplateEmailClotureCode(String code);

    List<OrdreKosc> findByTemplateEmailClotureId(Long id);

    int deleteByTemplateEmailClotureId(Long id);

    List<OrdreKosc> findByTemplateSuiviCode(String code);

    int deleteByTemplateSuiviCode(String code);

    List<OrdreKosc> findByTemplateSuiviId(Long id);

    int deleteByTemplateSuiviId(Long id);


    /**
     * delete OrdreKosc from database by referenceWorkOrder (reference)
     *
     * @param referenceWorkOrder - reference of OrdreKosc to be deleted
     * @return 1 if OrdreKosc deleted successfully
     */
    int deleteByReferenceWorkOrder(String referenceWorkOrder);


}
