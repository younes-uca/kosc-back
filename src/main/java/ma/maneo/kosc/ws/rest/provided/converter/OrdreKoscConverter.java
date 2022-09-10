package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.OrdreKosc;
import ma.maneo.kosc.ws.rest.provided.vo.OrdreKoscVo;

@Component
public class OrdreKoscConverter extends AbstractConverter<OrdreKosc, OrdreKoscVo> {

    @Autowired
    private TemplateEmailReplanificationConverter templateEmailReplanificationConverter;
    @Autowired
    private EtatDemandeKoscConverter etatDemandeKoscConverter;
    @Autowired
    private TemplateEmailPlanificationConverter templateEmailPlanificationConverter;
    @Autowired
    private TemplateEmailClotureConverter templateEmailClotureConverter;
    @Autowired
    private TemplateSuiviConverter templateSuiviConverter;
    @Autowired
    private OperatorConverter operatorConverter;
    @Autowired
    private DepartementConverter departementConverter;
    @Autowired
    private TemplateEmailKoscConverter templateEmailKoscConverter;
    @Autowired
    private TemplateEmailReportConverter templateEmailReportConverter;
    @Autowired
    private ClientConverter clientConverter;
    @Autowired
    private TechnicienConverter technicienConverter;
    @Autowired
    private TemplateEmailClientInjoinableConverter templateEmailClientInjoinableConverter;
    private Boolean operator;
    private Boolean departement;
    private Boolean technicien;
    private Boolean client;
    private Boolean templateEmailClientInjoinable;
    private Boolean templateEmailKosc;
    private Boolean templateEmailPlanification;
    private Boolean templateEmailReplanification;
    private Boolean templateEmailReport;
    private Boolean etatDemandeKosc;
    private Boolean templateEmailCloture;
    private Boolean templateSuivi;

    public OrdreKoscConverter() {
        init(true);
    }

    @Override
    public OrdreKosc toItem(OrdreKoscVo vo) {
        if (vo == null) {
            return null;
        } else {
            OrdreKosc item = new OrdreKosc();
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getReference()))
                item.setReference(vo.getReference());
            if (StringUtil.isNotEmpty(vo.getReferenceWorkOrder()))
                item.setReferenceWorkOrder(vo.getReferenceWorkOrder());
            if (StringUtil.isNotEmpty(vo.getCodeDecharge()))
                item.setCodeDecharge(vo.getCodeDecharge());
            if (StringUtil.isNotEmpty(vo.getSupplierService()))
                item.setSupplierService(vo.getSupplierService());
            if (StringUtil.isNotEmpty(vo.getDateDebutTraitement()))
                item.setDateDebutTraitement(DateUtil.parse(vo.getDateDebutTraitement()));
            if (StringUtil.isNotEmpty(vo.getEndCustumorName()))
                item.setEndCustumorName(vo.getEndCustumorName());
            if (StringUtil.isNotEmpty(vo.getEndCustumorSiret()))
                item.setEndCustumorSiret(vo.getEndCustumorSiret());
            if (StringUtil.isNotEmpty(vo.getEndCustumorFirstName()))
                item.setEndCustumorFirstName(vo.getEndCustumorFirstName());
            if (StringUtil.isNotEmpty(vo.getEndCustumorLastName()))
                item.setEndCustumorLastName(vo.getEndCustumorLastName());
            if (StringUtil.isNotEmpty(vo.getEndCustumorZipcode()))
                item.setEndCustumorZipcode(vo.getEndCustumorZipcode());
            if (StringUtil.isNotEmpty(vo.getEndCustumorStreetName()))
                item.setEndCustumorStreetName(vo.getEndCustumorStreetName());
            if (StringUtil.isNotEmpty(vo.getEndCustumorStreetNumber()))
                item.setEndCustumorStreetNumber(vo.getEndCustumorStreetNumber());
            if (StringUtil.isNotEmpty(vo.getEndCustumorCity()))
                item.setEndCustumorCity(vo.getEndCustumorCity());
            if (StringUtil.isNotEmpty(vo.getEndCustumorBuilding()))
                item.setEndCustumorBuilding(vo.getEndCustumorBuilding());
            if (StringUtil.isNotEmpty(vo.getEndCustumorStairs()))
                item.setEndCustumorStairs(vo.getEndCustumorStairs());
            if (StringUtil.isNotEmpty(vo.getEndCustumorFloor()))
                item.setEndCustumorFloor(vo.getEndCustumorFloor());
            if (StringUtil.isNotEmpty(vo.getEndCustumorContactFirstName()))
                item.setEndCustumorContactFirstName(vo.getEndCustumorContactFirstName());
            if (StringUtil.isNotEmpty(vo.getEndCustumorContactLastName()))
                item.setEndCustumorContactLastName(vo.getEndCustumorContactLastName());
            if (StringUtil.isNotEmpty(vo.getEndCustumorContactPhone()))
                item.setEndCustumorContactPhone(vo.getEndCustumorContactPhone());
            if (StringUtil.isNotEmpty(vo.getEndCustumorContactCellPhone()))
                item.setEndCustumorContactCellPhone(vo.getEndCustumorContactCellPhone());
            if (StringUtil.isNotEmpty(vo.getEndCustumorContactEmail()))
                item.setEndCustumorContactEmail(vo.getEndCustumorContactEmail());
            if (StringUtil.isNotEmpty(vo.getCompany()))
                item.setCompany(vo.getCompany());
            if (StringUtil.isNotEmpty(vo.getReferenDossier()))
                item.setReferenDossier(vo.getReferenDossier());
            if (StringUtil.isNotEmpty(vo.getSubmissionDate()))
                item.setSubmissionDate(DateUtil.parse(vo.getSubmissionDate()));
            if (StringUtil.isNotEmpty(vo.getDatePremierAppel()))
                item.setDatePremierAppel(DateUtil.parse(vo.getDatePremierAppel()));
            if (StringUtil.isNotEmpty(vo.getDateDeuxiemeAppel()))
                item.setDateDeuxiemeAppel(DateUtil.parse(vo.getDateDeuxiemeAppel()));
            if (StringUtil.isNotEmpty(vo.getDateTroisiemeAppel()))
                item.setDateTroisiemeAppel(DateUtil.parse(vo.getDateTroisiemeAppel()));
            if (StringUtil.isNotEmpty(vo.getDatePriseRdv()))
                item.setDatePriseRdv(DateUtil.parse(vo.getDatePriseRdv()));
            if (StringUtil.isNotEmpty(vo.getDateRdv()))
                item.setDateRdv(DateUtil.parse(vo.getDateRdv()));
            if (StringUtil.isNotEmpty(vo.getDateAppelReplanification()))
                item.setDateAppelReplanification(DateUtil.parse(vo.getDateAppelReplanification()));
            if (StringUtil.isNotEmpty(vo.getDateInterventionTechnique()))
                item.setDateInterventionTechnique(DateUtil.parse(vo.getDateInterventionTechnique()));
            if (StringUtil.isNotEmpty(vo.getDateOuverture()))
                item.setDateOuverture(DateUtil.parse(vo.getDateOuverture()));
            if (vo.getEnvoiMailClient() != null)
                item.setEnvoiMailClient(vo.getEnvoiMailClient());
            if (vo.getEnvoiMailKosc() != null)
                item.setEnvoiMailKosc(vo.getEnvoiMailKosc());
            if (StringUtil.isNotEmpty(vo.getCoordonnePboY()))
                item.setCoordonnePboY(vo.getCoordonnePboY());
            if (StringUtil.isNotEmpty(vo.getHauteurPbo()))
                item.setHauteurPbo(vo.getHauteurPbo());
            if (StringUtil.isNotEmpty(vo.getTypeMaterielPbo()))
                item.setTypeMaterielPbo(vo.getTypeMaterielPbo());
            if (StringUtil.isNotEmpty(vo.getTypePbo()))
                item.setTypePbo(vo.getTypePbo());
            if (StringUtil.isNotEmpty(vo.getConditionSyndics()))
                item.setConditionSyndics(vo.getConditionSyndics());
            if (StringUtil.isNotEmpty(vo.getTypeRacordementPboPto()))
                item.setTypeRacordementPboPto(vo.getTypeRacordementPboPto());
            if (StringUtil.isNotEmpty(vo.getAutreInfosPboPto()))
                item.setAutreInfosPboPto(vo.getAutreInfosPboPto());
            if (StringUtil.isNotEmpty(vo.getCodeAccesImmeuble()))
                item.setCodeAccesImmeuble(vo.getCodeAccesImmeuble());
            if (StringUtil.isNotEmpty(vo.getContacteImmeuble()))
                item.setContacteImmeuble(vo.getContacteImmeuble());
            if (StringUtil.isNotEmpty(vo.getPmaAccessible()))
                item.setPmaAccessible(vo.getPmaAccessible());
            if (StringUtil.isNotEmpty(vo.getInfoObtentionCle()))
                item.setInfoObtentionCle(vo.getInfoObtentionCle());
            if (StringUtil.isNotEmpty(vo.getLocaleIpm()))
                item.setLocaleIpm(vo.getLocaleIpm());
            if (StringUtil.isNotEmpty(vo.getContactsSyndic()))
                item.setContactsSyndic(vo.getContactsSyndic());
            if (vo.getRacordementLong() != null)
                item.setRacordementLong(vo.getRacordementLong());
            if (StringUtil.isNotEmpty(vo.getOc1()))
                item.setOc1(vo.getOc1());
            if (StringUtil.isNotEmpty(vo.getNomModulePm1()))
                item.setNomModulePm1(vo.getNomModulePm1());
            if (StringUtil.isNotEmpty(vo.getPositionModulePm1()))
                item.setPositionModulePm1(vo.getPositionModulePm1());
            if (StringUtil.isNotEmpty(vo.getReferenceCableModulePm1()))
                item.setReferenceCableModulePm1(vo.getReferenceCableModulePm1());
            if (StringUtil.isNotEmpty(vo.getReferenceTubeModulePm1()))
                item.setReferenceTubeModulePm1(vo.getReferenceTubeModulePm1());
            if (StringUtil.isNotEmpty(vo.getInformationFibreModulePm1()))
                item.setInformationFibreModulePm1(vo.getInformationFibreModulePm1());
            if (StringUtil.isNotEmpty(vo.getReferenceCablePbo1()))
                item.setReferenceCablePbo1(vo.getReferenceCablePbo1());
            if (StringUtil.isNotEmpty(vo.getInformationTubePbo1()))
                item.setInformationTubePbo1(vo.getInformationTubePbo1());
            if (StringUtil.isNotEmpty(vo.getInformationFibrePbo1()))
                item.setInformationFibrePbo1(vo.getInformationFibrePbo1());
            if (StringUtil.isNotEmpty(vo.getConnecteurPriseNumero1()))
                item.setConnecteurPriseNumero1(vo.getConnecteurPriseNumero1());
            if (StringUtil.isNotEmpty(vo.getConnecteurPriseCouleur1()))
                item.setConnecteurPriseCouleur1(vo.getConnecteurPriseCouleur1());
            if (StringUtil.isNotEmpty(vo.getReserve1()))
                item.setReserve1(vo.getReserve1());
            if (StringUtil.isNotEmpty(vo.getOc2()))
                item.setOc2(vo.getOc2());
            if (StringUtil.isNotEmpty(vo.getNomModulePm2()))
                item.setNomModulePm2(vo.getNomModulePm2());
            if (StringUtil.isNotEmpty(vo.getPositionModulePm2()))
                item.setPositionModulePm2(vo.getPositionModulePm2());
            if (StringUtil.isNotEmpty(vo.getReferenceCableModulePm2()))
                item.setReferenceCableModulePm2(vo.getReferenceCableModulePm2());
            if (StringUtil.isNotEmpty(vo.getReferenceTubeModulePm2()))
                item.setReferenceTubeModulePm2(vo.getReferenceTubeModulePm2());
            if (StringUtil.isNotEmpty(vo.getInformationFibreModulePm2()))
                item.setInformationFibreModulePm2(vo.getInformationFibreModulePm2());
            if (StringUtil.isNotEmpty(vo.getReferenceCablePbo2()))
                item.setReferenceCablePbo2(vo.getReferenceCablePbo2());
            if (StringUtil.isNotEmpty(vo.getInformationTubePbo2()))
                item.setInformationTubePbo2(vo.getInformationTubePbo2());
            if (StringUtil.isNotEmpty(vo.getInformationFibrePbo2()))
                item.setInformationFibrePbo2(vo.getInformationFibrePbo2());
            if (StringUtil.isNotEmpty(vo.getConnecteurPriseNumero2()))
                item.setConnecteurPriseNumero2(vo.getConnecteurPriseNumero2());
            if (StringUtil.isNotEmpty(vo.getConnecteurPriseCouleur2()))
                item.setConnecteurPriseCouleur2(vo.getConnecteurPriseCouleur2());
            if (StringUtil.isNotEmpty(vo.getReserve2()))
                item.setReserve2(vo.getReserve2());
            if (StringUtil.isNotEmpty(vo.getOc3()))
                item.setOc3(vo.getOc3());
            if (StringUtil.isNotEmpty(vo.getNomModulePm3()))
                item.setNomModulePm3(vo.getNomModulePm3());
            if (StringUtil.isNotEmpty(vo.getPositionModulePm3()))
                item.setPositionModulePm3(vo.getPositionModulePm3());
            if (StringUtil.isNotEmpty(vo.getReferenceCableModulePm3()))
                item.setReferenceCableModulePm3(vo.getReferenceCableModulePm3());
            if (StringUtil.isNotEmpty(vo.getReferenceTubeModulePm3()))
                item.setReferenceTubeModulePm3(vo.getReferenceTubeModulePm3());
            if (StringUtil.isNotEmpty(vo.getInformationFibreModulePm3()))
                item.setInformationFibreModulePm3(vo.getInformationFibreModulePm3());
            if (StringUtil.isNotEmpty(vo.getReferenceCablePbo3()))
                item.setReferenceCablePbo3(vo.getReferenceCablePbo3());
            if (StringUtil.isNotEmpty(vo.getInformationTubePbo3()))
                item.setInformationTubePbo3(vo.getInformationTubePbo3());
            if (StringUtil.isNotEmpty(vo.getInformationFibrePbo3()))
                item.setInformationFibrePbo3(vo.getInformationFibrePbo3());
            if (StringUtil.isNotEmpty(vo.getConnecteurPriseNumero3()))
                item.setConnecteurPriseNumero3(vo.getConnecteurPriseNumero3());
            if (StringUtil.isNotEmpty(vo.getConnecteurPriseCouleur3()))
                item.setConnecteurPriseCouleur3(vo.getConnecteurPriseCouleur3());
            if (StringUtil.isNotEmpty(vo.getReserve3()))
                item.setReserve3(vo.getReserve3());
            if (StringUtil.isNotEmpty(vo.getOc4()))
                item.setOc4(vo.getOc4());
            if (StringUtil.isNotEmpty(vo.getNomModulePm4()))
                item.setNomModulePm4(vo.getNomModulePm4());
            if (StringUtil.isNotEmpty(vo.getPositionModulePm4()))
                item.setPositionModulePm4(vo.getPositionModulePm4());
            if (StringUtil.isNotEmpty(vo.getReferenceCableModulePm4()))
                item.setReferenceCableModulePm4(vo.getReferenceCableModulePm4());
            if (StringUtil.isNotEmpty(vo.getReferenceTubeModulePm4()))
                item.setReferenceTubeModulePm4(vo.getReferenceTubeModulePm4());
            if (StringUtil.isNotEmpty(vo.getInformationFibreModulePm4()))
                item.setInformationFibreModulePm4(vo.getInformationFibreModulePm4());
            if (StringUtil.isNotEmpty(vo.getReferenceCablePbo4()))
                item.setReferenceCablePbo4(vo.getReferenceCablePbo4());
            if (StringUtil.isNotEmpty(vo.getInformationTubePbo4()))
                item.setInformationTubePbo4(vo.getInformationTubePbo4());
            if (StringUtil.isNotEmpty(vo.getInformationFibrePbo4()))
                item.setInformationFibrePbo4(vo.getInformationFibrePbo4());
            if (StringUtil.isNotEmpty(vo.getConnecteurPriseNumero4()))
                item.setConnecteurPriseNumero4(vo.getConnecteurPriseNumero4());
            if (StringUtil.isNotEmpty(vo.getConnecteurPriseCouleur4()))
                item.setConnecteurPriseCouleur4(vo.getConnecteurPriseCouleur4());
            if (StringUtil.isNotEmpty(vo.getReserve4()))
                item.setReserve4(vo.getReserve4());
            if (StringUtil.isNotEmpty(vo.getDateEnvoiCri()))
                item.setDateEnvoiCri(DateUtil.parse(vo.getDateEnvoiCri()));
            if (StringUtil.isNotEmpty(vo.getPboReel()))
                item.setPboReel(vo.getPboReel());
            if (StringUtil.isNotEmpty(vo.getNumeroSerieOnt()))
                item.setNumeroSerieOnt(vo.getNumeroSerieOnt());
            if (StringUtil.isNotEmpty(vo.getWorkOrderType()))
                item.setWorkOrderType(vo.getWorkOrderType());
            if (StringUtil.isNotEmpty(vo.getProduct()))
                item.setProduct(vo.getProduct());
            if (StringUtil.isNotEmpty(vo.getProvider()))
                item.setProvider(vo.getProvider());
            if (StringUtil.isNotEmpty(vo.getProviderFileType()))
                item.setProviderFileType(vo.getProviderFileType());
            if (StringUtil.isNotEmpty(vo.getSpliter()))
                item.setSpliter(vo.getSpliter());
            if (vo.getExistingOtp() != null)
                item.setExistingOtp(vo.getExistingOtp());
            if (StringUtil.isNotEmpty(vo.getProfile()))
                item.setProfile(vo.getProfile());
            if (StringUtil.isNotEmpty(vo.getComment()))
                item.setComment(vo.getComment());
            if (StringUtil.isNotEmpty(vo.getProviderSlId()))
                item.setProviderSlId(vo.getProviderSlId());
            if (StringUtil.isNotEmpty(vo.getReferencePrestationPrise()))
                item.setReferencePrestationPrise(vo.getReferencePrestationPrise());
            if (StringUtil.isNotEmpty(vo.getDateInterventionTechniqueDebut()))
                item.setDateInterventionTechniqueDebut(DateUtil.parse(vo.getDateInterventionTechniqueDebut()));
            if (StringUtil.isNotEmpty(vo.getDateInterventionTechniqueFin()))
                item.setDateInterventionTechniqueFin(DateUtil.parse(vo.getDateInterventionTechniqueFin()));
            if (StringUtil.isNotEmpty(vo.getObjetClient()))
                item.setObjetClient(vo.getObjetClient());
            if (StringUtil.isNotEmpty(vo.getCorpsClient()))
                item.setCorpsClient(vo.getCorpsClient());
            if (vo.getEnvoyeClient() != null)
                item.setEnvoyeClient(vo.getEnvoyeClient());
            if (StringUtil.isNotEmpty(vo.getDateEnvoiClient()))
                item.setDateEnvoiClient(DateUtil.parse(vo.getDateEnvoiClient()));
            if (StringUtil.isNotEmpty(vo.getObjetKosc()))
                item.setObjetKosc(vo.getObjetKosc());
            if (StringUtil.isNotEmpty(vo.getCorpsKosc()))
                item.setCorpsKosc(vo.getCorpsKosc());
            if (vo.getEnvoyeKosc() != null)
                item.setEnvoyeKosc(vo.getEnvoyeKosc());
            if (StringUtil.isNotEmpty(vo.getDateEnvoiKosc()))
                item.setDateEnvoiKosc(DateUtil.parse(vo.getDateEnvoiKosc()));
            if (StringUtil.isNotEmpty(vo.getObjetPlanification()))
                item.setObjetPlanification(vo.getObjetPlanification());
            if (StringUtil.isNotEmpty(vo.getCorpsPlanification()))
                item.setCorpsPlanification(vo.getCorpsPlanification());
            if (vo.getEnvoyePlanification() != null)
                item.setEnvoyePlanification(vo.getEnvoyePlanification());
            if (StringUtil.isNotEmpty(vo.getDateEnvoiPlanification()))
                item.setDateEnvoiPlanification(DateUtil.parse(vo.getDateEnvoiPlanification()));
            if (StringUtil.isNotEmpty(vo.getObjetReplanification()))
                item.setObjetReplanification(vo.getObjetReplanification());
            if (StringUtil.isNotEmpty(vo.getCorpsReplanification()))
                item.setCorpsReplanification(vo.getCorpsReplanification());
            if (vo.getEnvoyeReplanification() != null)
                item.setEnvoyeReplanification(vo.getEnvoyeReplanification());
            if (StringUtil.isNotEmpty(vo.getDateEnvoiReplanification()))
                item.setDateEnvoiReplanification(DateUtil.parse(vo.getDateEnvoiReplanification()));
            if (StringUtil.isNotEmpty(vo.getObjetReport()))
                item.setObjetReport(vo.getObjetReport());
            if (StringUtil.isNotEmpty(vo.getCorpsReport()))
                item.setCorpsReport(vo.getCorpsReport());
            if (vo.getEnvoyeReport() != null)
                item.setEnvoyeReport(vo.getEnvoyeReport());
            if (StringUtil.isNotEmpty(vo.getDateEnvoiReport()))
                item.setDateEnvoiReport(DateUtil.parse(vo.getDateEnvoiReport()));
            if (StringUtil.isNotEmpty(vo.getCommentaireTechnicien()))
                item.setCommentaireTechnicien(vo.getCommentaireTechnicien());
            if (StringUtil.isNotEmpty(vo.getCommentaireClient()))
                item.setCommentaireClient(vo.getCommentaireClient());
            if (StringUtil.isNotEmpty(vo.getCommantaireCloture()))
                item.setCommantaireCloture(vo.getCommantaireCloture());
            if (StringUtil.isNotEmpty(vo.getObjetCloture()))
                item.setObjetCloture(vo.getObjetCloture());
            if (StringUtil.isNotEmpty(vo.getCorpsCloture()))
                item.setCorpsCloture(vo.getCorpsCloture());
            if (vo.getEnvoyeCloture() != null)
                item.setEnvoyeCloture(vo.getEnvoyeCloture());
            if (StringUtil.isNotEmpty(vo.getDateEnvoiCloture()))
                item.setDateEnvoiCloture(DateUtil.parse(vo.getDateEnvoiCloture()));
            if (StringUtil.isNotEmpty(vo.getEmailCloturePieceJoints()))
                item.setEmailCloturePieceJoints(vo.getEmailCloturePieceJoints());
            if (StringUtil.isNotEmpty(vo.getObjetSuivi()))
                item.setObjetSuivi(vo.getObjetSuivi());
            if (StringUtil.isNotEmpty(vo.getCorpsSuivi()))
                item.setCorpsSuivi(vo.getCorpsSuivi());
            if (vo.getEnvoyeSuivi() != null)
                item.setEnvoyeSuivi(vo.getEnvoyeSuivi());
            if (StringUtil.isNotEmpty(vo.getDateEnvoiSuivi()))
                item.setDateEnvoiSuivi(DateUtil.parse(vo.getDateEnvoiSuivi()));
            if (vo.getOperatorVo() != null && this.operator)
                item.setOperator(operatorConverter.toItem(vo.getOperatorVo()));
            if (vo.getDepartementVo() != null && this.departement)
                item.setDepartement(departementConverter.toItem(vo.getDepartementVo()));
            if (vo.getTechnicienVo() != null && this.technicien)
                item.setTechnicien(technicienConverter.toItem(vo.getTechnicienVo()));
            if (vo.getClientVo() != null && this.client)
                item.setClient(clientConverter.toItem(vo.getClientVo()));
            if (vo.getTemplateEmailClientInjoinableVo() != null && this.templateEmailClientInjoinable)
                item.setTemplateEmailClientInjoinable(templateEmailClientInjoinableConverter.toItem(vo.getTemplateEmailClientInjoinableVo()));
            if (vo.getTemplateEmailKoscVo() != null && this.templateEmailKosc)
                item.setTemplateEmailKosc(templateEmailKoscConverter.toItem(vo.getTemplateEmailKoscVo()));
            if (vo.getTemplateEmailPlanificationVo() != null && this.templateEmailPlanification)
                item.setTemplateEmailPlanification(templateEmailPlanificationConverter.toItem(vo.getTemplateEmailPlanificationVo()));
            if (vo.getTemplateEmailReplanificationVo() != null && this.templateEmailReplanification)
                item.setTemplateEmailReplanification(templateEmailReplanificationConverter.toItem(vo.getTemplateEmailReplanificationVo()));
            if (vo.getTemplateEmailReportVo() != null && this.templateEmailReport)
                item.setTemplateEmailReport(templateEmailReportConverter.toItem(vo.getTemplateEmailReportVo()));
            if (vo.getEtatDemandeKoscVo() != null && this.etatDemandeKosc)
                item.setEtatDemandeKosc(etatDemandeKoscConverter.toItem(vo.getEtatDemandeKoscVo()));
            if (vo.getTemplateEmailClotureVo() != null && this.templateEmailCloture)
                item.setTemplateEmailCloture(templateEmailClotureConverter.toItem(vo.getTemplateEmailClotureVo()));
            if (vo.getTemplateSuiviVo() != null && this.templateSuivi)
                item.setTemplateSuivi(templateSuiviConverter.toItem(vo.getTemplateSuiviVo()));


            return item;
        }
    }

    @Override
    public OrdreKoscVo toVo(OrdreKosc item) {
        if (item == null) {
            return null;
        } else {
            OrdreKoscVo vo = new OrdreKoscVo();
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));

            if (StringUtil.isNotEmpty(item.getReference()))
                vo.setReference(item.getReference());

            if (StringUtil.isNotEmpty(item.getReferenceWorkOrder()))
                vo.setReferenceWorkOrder(item.getReferenceWorkOrder());

            if (StringUtil.isNotEmpty(item.getCodeDecharge()))
                vo.setCodeDecharge(item.getCodeDecharge());

            if (StringUtil.isNotEmpty(item.getSupplierService()))
                vo.setSupplierService(item.getSupplierService());

            if (item.getDateDebutTraitement() != null)
                vo.setDateDebutTraitement(DateUtil.formateDate(item.getDateDebutTraitement()));
            if (StringUtil.isNotEmpty(item.getEndCustumorName()))
                vo.setEndCustumorName(item.getEndCustumorName());

            if (StringUtil.isNotEmpty(item.getEndCustumorSiret()))
                vo.setEndCustumorSiret(item.getEndCustumorSiret());

            if (StringUtil.isNotEmpty(item.getEndCustumorFirstName()))
                vo.setEndCustumorFirstName(item.getEndCustumorFirstName());

            if (StringUtil.isNotEmpty(item.getEndCustumorLastName()))
                vo.setEndCustumorLastName(item.getEndCustumorLastName());

            if (StringUtil.isNotEmpty(item.getEndCustumorZipcode()))
                vo.setEndCustumorZipcode(item.getEndCustumorZipcode());

            if (StringUtil.isNotEmpty(item.getEndCustumorStreetName()))
                vo.setEndCustumorStreetName(item.getEndCustumorStreetName());

            if (StringUtil.isNotEmpty(item.getEndCustumorStreetNumber()))
                vo.setEndCustumorStreetNumber(item.getEndCustumorStreetNumber());

            if (StringUtil.isNotEmpty(item.getEndCustumorCity()))
                vo.setEndCustumorCity(item.getEndCustumorCity());

            if (StringUtil.isNotEmpty(item.getEndCustumorBuilding()))
                vo.setEndCustumorBuilding(item.getEndCustumorBuilding());

            if (StringUtil.isNotEmpty(item.getEndCustumorStairs()))
                vo.setEndCustumorStairs(item.getEndCustumorStairs());

            if (StringUtil.isNotEmpty(item.getEndCustumorFloor()))
                vo.setEndCustumorFloor(item.getEndCustumorFloor());

            if (StringUtil.isNotEmpty(item.getEndCustumorContactFirstName()))
                vo.setEndCustumorContactFirstName(item.getEndCustumorContactFirstName());

            if (StringUtil.isNotEmpty(item.getEndCustumorContactLastName()))
                vo.setEndCustumorContactLastName(item.getEndCustumorContactLastName());

            if (StringUtil.isNotEmpty(item.getEndCustumorContactPhone()))
                vo.setEndCustumorContactPhone(item.getEndCustumorContactPhone());

            if (StringUtil.isNotEmpty(item.getEndCustumorContactCellPhone()))
                vo.setEndCustumorContactCellPhone(item.getEndCustumorContactCellPhone());

            if (StringUtil.isNotEmpty(item.getEndCustumorContactEmail()))
                vo.setEndCustumorContactEmail(item.getEndCustumorContactEmail());

            if (StringUtil.isNotEmpty(item.getCompany()))
                vo.setCompany(item.getCompany());

            if (StringUtil.isNotEmpty(item.getReferenDossier()))
                vo.setReferenDossier(item.getReferenDossier());

            if (item.getSubmissionDate() != null)
                vo.setSubmissionDate(DateUtil.formateDate(item.getSubmissionDate()));
            if (item.getDatePremierAppel() != null)
                vo.setDatePremierAppel(DateUtil.formateDate(item.getDatePremierAppel()));
            if (item.getDateDeuxiemeAppel() != null)
                vo.setDateDeuxiemeAppel(DateUtil.formateDate(item.getDateDeuxiemeAppel()));
            if (item.getDateTroisiemeAppel() != null)
                vo.setDateTroisiemeAppel(DateUtil.formateDate(item.getDateTroisiemeAppel()));
            if (item.getDatePriseRdv() != null)
                vo.setDatePriseRdv(DateUtil.formateDate(item.getDatePriseRdv()));
            if (item.getDateRdv() != null)
                vo.setDateRdv(DateUtil.formateDate(item.getDateRdv()));
            if (item.getDateAppelReplanification() != null)
                vo.setDateAppelReplanification(DateUtil.formateDate(item.getDateAppelReplanification()));
            if (item.getDateInterventionTechnique() != null)
                vo.setDateInterventionTechnique(DateUtil.formateDate(item.getDateInterventionTechnique()));
            if (item.getDateOuverture() != null)
                vo.setDateOuverture(DateUtil.formateDate(item.getDateOuverture()));
            if (item.getEnvoiMailClient() != null)
                vo.setEnvoiMailClient(item.getEnvoiMailClient());
            if (item.getEnvoiMailKosc() != null)
                vo.setEnvoiMailKosc(item.getEnvoiMailKosc());
            if (StringUtil.isNotEmpty(item.getCoordonnePboY()))
                vo.setCoordonnePboY(item.getCoordonnePboY());

            if (StringUtil.isNotEmpty(item.getHauteurPbo()))
                vo.setHauteurPbo(item.getHauteurPbo());

            if (StringUtil.isNotEmpty(item.getTypeMaterielPbo()))
                vo.setTypeMaterielPbo(item.getTypeMaterielPbo());

            if (StringUtil.isNotEmpty(item.getTypePbo()))
                vo.setTypePbo(item.getTypePbo());

            if (StringUtil.isNotEmpty(item.getConditionSyndics()))
                vo.setConditionSyndics(item.getConditionSyndics());

            if (StringUtil.isNotEmpty(item.getTypeRacordementPboPto()))
                vo.setTypeRacordementPboPto(item.getTypeRacordementPboPto());

            if (StringUtil.isNotEmpty(item.getAutreInfosPboPto()))
                vo.setAutreInfosPboPto(item.getAutreInfosPboPto());

            if (StringUtil.isNotEmpty(item.getCodeAccesImmeuble()))
                vo.setCodeAccesImmeuble(item.getCodeAccesImmeuble());

            if (StringUtil.isNotEmpty(item.getContacteImmeuble()))
                vo.setContacteImmeuble(item.getContacteImmeuble());

            if (StringUtil.isNotEmpty(item.getPmaAccessible()))
                vo.setPmaAccessible(item.getPmaAccessible());

            if (StringUtil.isNotEmpty(item.getInfoObtentionCle()))
                vo.setInfoObtentionCle(item.getInfoObtentionCle());

            if (StringUtil.isNotEmpty(item.getLocaleIpm()))
                vo.setLocaleIpm(item.getLocaleIpm());

            if (StringUtil.isNotEmpty(item.getContactsSyndic()))
                vo.setContactsSyndic(item.getContactsSyndic());

            if (item.getRacordementLong() != null)
                vo.setRacordementLong(item.getRacordementLong());
            if (StringUtil.isNotEmpty(item.getOc1()))
                vo.setOc1(item.getOc1());

            if (StringUtil.isNotEmpty(item.getNomModulePm1()))
                vo.setNomModulePm1(item.getNomModulePm1());

            if (StringUtil.isNotEmpty(item.getPositionModulePm1()))
                vo.setPositionModulePm1(item.getPositionModulePm1());

            if (StringUtil.isNotEmpty(item.getReferenceCableModulePm1()))
                vo.setReferenceCableModulePm1(item.getReferenceCableModulePm1());

            if (StringUtil.isNotEmpty(item.getReferenceTubeModulePm1()))
                vo.setReferenceTubeModulePm1(item.getReferenceTubeModulePm1());

            if (StringUtil.isNotEmpty(item.getInformationFibreModulePm1()))
                vo.setInformationFibreModulePm1(item.getInformationFibreModulePm1());

            if (StringUtil.isNotEmpty(item.getReferenceCablePbo1()))
                vo.setReferenceCablePbo1(item.getReferenceCablePbo1());

            if (StringUtil.isNotEmpty(item.getInformationTubePbo1()))
                vo.setInformationTubePbo1(item.getInformationTubePbo1());

            if (StringUtil.isNotEmpty(item.getInformationFibrePbo1()))
                vo.setInformationFibrePbo1(item.getInformationFibrePbo1());

            if (StringUtil.isNotEmpty(item.getConnecteurPriseNumero1()))
                vo.setConnecteurPriseNumero1(item.getConnecteurPriseNumero1());

            if (StringUtil.isNotEmpty(item.getConnecteurPriseCouleur1()))
                vo.setConnecteurPriseCouleur1(item.getConnecteurPriseCouleur1());

            if (StringUtil.isNotEmpty(item.getReserve1()))
                vo.setReserve1(item.getReserve1());

            if (StringUtil.isNotEmpty(item.getOc2()))
                vo.setOc2(item.getOc2());

            if (StringUtil.isNotEmpty(item.getNomModulePm2()))
                vo.setNomModulePm2(item.getNomModulePm2());

            if (StringUtil.isNotEmpty(item.getPositionModulePm2()))
                vo.setPositionModulePm2(item.getPositionModulePm2());

            if (StringUtil.isNotEmpty(item.getReferenceCableModulePm2()))
                vo.setReferenceCableModulePm2(item.getReferenceCableModulePm2());

            if (StringUtil.isNotEmpty(item.getReferenceTubeModulePm2()))
                vo.setReferenceTubeModulePm2(item.getReferenceTubeModulePm2());

            if (StringUtil.isNotEmpty(item.getInformationFibreModulePm2()))
                vo.setInformationFibreModulePm2(item.getInformationFibreModulePm2());

            if (StringUtil.isNotEmpty(item.getReferenceCablePbo2()))
                vo.setReferenceCablePbo2(item.getReferenceCablePbo2());

            if (StringUtil.isNotEmpty(item.getInformationTubePbo2()))
                vo.setInformationTubePbo2(item.getInformationTubePbo2());

            if (StringUtil.isNotEmpty(item.getInformationFibrePbo2()))
                vo.setInformationFibrePbo2(item.getInformationFibrePbo2());

            if (StringUtil.isNotEmpty(item.getConnecteurPriseNumero2()))
                vo.setConnecteurPriseNumero2(item.getConnecteurPriseNumero2());

            if (StringUtil.isNotEmpty(item.getConnecteurPriseCouleur2()))
                vo.setConnecteurPriseCouleur2(item.getConnecteurPriseCouleur2());

            if (StringUtil.isNotEmpty(item.getReserve2()))
                vo.setReserve2(item.getReserve2());

            if (StringUtil.isNotEmpty(item.getOc3()))
                vo.setOc3(item.getOc3());

            if (StringUtil.isNotEmpty(item.getNomModulePm3()))
                vo.setNomModulePm3(item.getNomModulePm3());

            if (StringUtil.isNotEmpty(item.getPositionModulePm3()))
                vo.setPositionModulePm3(item.getPositionModulePm3());

            if (StringUtil.isNotEmpty(item.getReferenceCableModulePm3()))
                vo.setReferenceCableModulePm3(item.getReferenceCableModulePm3());

            if (StringUtil.isNotEmpty(item.getReferenceTubeModulePm3()))
                vo.setReferenceTubeModulePm3(item.getReferenceTubeModulePm3());

            if (StringUtil.isNotEmpty(item.getInformationFibreModulePm3()))
                vo.setInformationFibreModulePm3(item.getInformationFibreModulePm3());

            if (StringUtil.isNotEmpty(item.getReferenceCablePbo3()))
                vo.setReferenceCablePbo3(item.getReferenceCablePbo3());

            if (StringUtil.isNotEmpty(item.getInformationTubePbo3()))
                vo.setInformationTubePbo3(item.getInformationTubePbo3());

            if (StringUtil.isNotEmpty(item.getInformationFibrePbo3()))
                vo.setInformationFibrePbo3(item.getInformationFibrePbo3());

            if (StringUtil.isNotEmpty(item.getConnecteurPriseNumero3()))
                vo.setConnecteurPriseNumero3(item.getConnecteurPriseNumero3());

            if (StringUtil.isNotEmpty(item.getConnecteurPriseCouleur3()))
                vo.setConnecteurPriseCouleur3(item.getConnecteurPriseCouleur3());

            if (StringUtil.isNotEmpty(item.getReserve3()))
                vo.setReserve3(item.getReserve3());

            if (StringUtil.isNotEmpty(item.getOc4()))
                vo.setOc4(item.getOc4());

            if (StringUtil.isNotEmpty(item.getNomModulePm4()))
                vo.setNomModulePm4(item.getNomModulePm4());

            if (StringUtil.isNotEmpty(item.getPositionModulePm4()))
                vo.setPositionModulePm4(item.getPositionModulePm4());

            if (StringUtil.isNotEmpty(item.getReferenceCableModulePm4()))
                vo.setReferenceCableModulePm4(item.getReferenceCableModulePm4());

            if (StringUtil.isNotEmpty(item.getReferenceTubeModulePm4()))
                vo.setReferenceTubeModulePm4(item.getReferenceTubeModulePm4());

            if (StringUtil.isNotEmpty(item.getInformationFibreModulePm4()))
                vo.setInformationFibreModulePm4(item.getInformationFibreModulePm4());

            if (StringUtil.isNotEmpty(item.getReferenceCablePbo4()))
                vo.setReferenceCablePbo4(item.getReferenceCablePbo4());

            if (StringUtil.isNotEmpty(item.getInformationTubePbo4()))
                vo.setInformationTubePbo4(item.getInformationTubePbo4());

            if (StringUtil.isNotEmpty(item.getInformationFibrePbo4()))
                vo.setInformationFibrePbo4(item.getInformationFibrePbo4());

            if (StringUtil.isNotEmpty(item.getConnecteurPriseNumero4()))
                vo.setConnecteurPriseNumero4(item.getConnecteurPriseNumero4());

            if (StringUtil.isNotEmpty(item.getConnecteurPriseCouleur4()))
                vo.setConnecteurPriseCouleur4(item.getConnecteurPriseCouleur4());

            if (StringUtil.isNotEmpty(item.getReserve4()))
                vo.setReserve4(item.getReserve4());

            if (item.getDateEnvoiCri() != null)
                vo.setDateEnvoiCri(DateUtil.formateDate(item.getDateEnvoiCri()));
            if (StringUtil.isNotEmpty(item.getPboReel()))
                vo.setPboReel(item.getPboReel());

            if (StringUtil.isNotEmpty(item.getNumeroSerieOnt()))
                vo.setNumeroSerieOnt(item.getNumeroSerieOnt());

            if (StringUtil.isNotEmpty(item.getWorkOrderType()))
                vo.setWorkOrderType(item.getWorkOrderType());

            if (StringUtil.isNotEmpty(item.getProduct()))
                vo.setProduct(item.getProduct());

            if (StringUtil.isNotEmpty(item.getProvider()))
                vo.setProvider(item.getProvider());

            if (StringUtil.isNotEmpty(item.getProviderFileType()))
                vo.setProviderFileType(item.getProviderFileType());

            if (StringUtil.isNotEmpty(item.getSpliter()))
                vo.setSpliter(item.getSpliter());

            if (item.getExistingOtp() != null)
                vo.setExistingOtp(item.getExistingOtp());
            if (StringUtil.isNotEmpty(item.getProfile()))
                vo.setProfile(item.getProfile());

            if (StringUtil.isNotEmpty(item.getComment()))
                vo.setComment(item.getComment());

            if (StringUtil.isNotEmpty(item.getProviderSlId()))
                vo.setProviderSlId(item.getProviderSlId());

            if (StringUtil.isNotEmpty(item.getReferencePrestationPrise()))
                vo.setReferencePrestationPrise(item.getReferencePrestationPrise());

            if (item.getDateInterventionTechniqueDebut() != null)
                vo.setDateInterventionTechniqueDebut(DateUtil.formateDate(item.getDateInterventionTechniqueDebut()));
            if (item.getDateInterventionTechniqueFin() != null)
                vo.setDateInterventionTechniqueFin(DateUtil.formateDate(item.getDateInterventionTechniqueFin()));
            if (StringUtil.isNotEmpty(item.getObjetClient()))
                vo.setObjetClient(item.getObjetClient());

            if (StringUtil.isNotEmpty(item.getCorpsClient()))
                vo.setCorpsClient(item.getCorpsClient());

            if (item.getEnvoyeClient() != null)
                vo.setEnvoyeClient(item.getEnvoyeClient());
            if (item.getDateEnvoiClient() != null)
                vo.setDateEnvoiClient(DateUtil.formateDate(item.getDateEnvoiClient()));
            if (StringUtil.isNotEmpty(item.getObjetKosc()))
                vo.setObjetKosc(item.getObjetKosc());

            if (StringUtil.isNotEmpty(item.getCorpsKosc()))
                vo.setCorpsKosc(item.getCorpsKosc());

            if (item.getEnvoyeKosc() != null)
                vo.setEnvoyeKosc(item.getEnvoyeKosc());
            if (item.getDateEnvoiKosc() != null)
                vo.setDateEnvoiKosc(DateUtil.formateDate(item.getDateEnvoiKosc()));
            if (StringUtil.isNotEmpty(item.getObjetPlanification()))
                vo.setObjetPlanification(item.getObjetPlanification());

            if (StringUtil.isNotEmpty(item.getCorpsPlanification()))
                vo.setCorpsPlanification(item.getCorpsPlanification());

            if (item.getEnvoyePlanification() != null)
                vo.setEnvoyePlanification(item.getEnvoyePlanification());
            if (item.getDateEnvoiPlanification() != null)
                vo.setDateEnvoiPlanification(DateUtil.formateDate(item.getDateEnvoiPlanification()));
            if (StringUtil.isNotEmpty(item.getObjetReplanification()))
                vo.setObjetReplanification(item.getObjetReplanification());

            if (StringUtil.isNotEmpty(item.getCorpsReplanification()))
                vo.setCorpsReplanification(item.getCorpsReplanification());

            if (item.getEnvoyeReplanification() != null)
                vo.setEnvoyeReplanification(item.getEnvoyeReplanification());
            if (item.getDateEnvoiReplanification() != null)
                vo.setDateEnvoiReplanification(DateUtil.formateDate(item.getDateEnvoiReplanification()));
            if (StringUtil.isNotEmpty(item.getObjetReport()))
                vo.setObjetReport(item.getObjetReport());

            if (StringUtil.isNotEmpty(item.getCorpsReport()))
                vo.setCorpsReport(item.getCorpsReport());

            if (item.getEnvoyeReport() != null)
                vo.setEnvoyeReport(item.getEnvoyeReport());
            if (item.getDateEnvoiReport() != null)
                vo.setDateEnvoiReport(DateUtil.formateDate(item.getDateEnvoiReport()));
            if (StringUtil.isNotEmpty(item.getCommentaireTechnicien()))
                vo.setCommentaireTechnicien(item.getCommentaireTechnicien());

            if (StringUtil.isNotEmpty(item.getCommentaireClient()))
                vo.setCommentaireClient(item.getCommentaireClient());

            if (StringUtil.isNotEmpty(item.getCommantaireCloture()))
                vo.setCommantaireCloture(item.getCommantaireCloture());

            if (StringUtil.isNotEmpty(item.getObjetCloture()))
                vo.setObjetCloture(item.getObjetCloture());

            if (StringUtil.isNotEmpty(item.getCorpsCloture()))
                vo.setCorpsCloture(item.getCorpsCloture());

            if (item.getEnvoyeCloture() != null)
                vo.setEnvoyeCloture(item.getEnvoyeCloture());
            if (item.getDateEnvoiCloture() != null)
                vo.setDateEnvoiCloture(DateUtil.formateDate(item.getDateEnvoiCloture()));
            if (StringUtil.isNotEmpty(item.getEmailCloturePieceJoints()))
                vo.setEmailCloturePieceJoints(item.getEmailCloturePieceJoints());

            if (StringUtil.isNotEmpty(item.getObjetSuivi()))
                vo.setObjetSuivi(item.getObjetSuivi());

            if (StringUtil.isNotEmpty(item.getCorpsSuivi()))
                vo.setCorpsSuivi(item.getCorpsSuivi());

            if (item.getEnvoyeSuivi() != null)
                vo.setEnvoyeSuivi(item.getEnvoyeSuivi());
            if (item.getDateEnvoiSuivi() != null)
                vo.setDateEnvoiSuivi(DateUtil.formateDate(item.getDateEnvoiSuivi()));
            if (item.getOperator() != null && this.operator) {
                vo.setOperatorVo(operatorConverter.toVo(item.getOperator()));
            }
            if (item.getDepartement() != null && this.departement) {
                vo.setDepartementVo(departementConverter.toVo(item.getDepartement()));
            }
            if (item.getTechnicien() != null && this.technicien) {
                vo.setTechnicienVo(technicienConverter.toVo(item.getTechnicien()));
            }
            if (item.getClient() != null && this.client) {
                vo.setClientVo(clientConverter.toVo(item.getClient()));
            }
            if (item.getTemplateEmailClientInjoinable() != null && this.templateEmailClientInjoinable) {
                vo.setTemplateEmailClientInjoinableVo(templateEmailClientInjoinableConverter.toVo(item.getTemplateEmailClientInjoinable()));
            }
            if (item.getTemplateEmailKosc() != null && this.templateEmailKosc) {
                vo.setTemplateEmailKoscVo(templateEmailKoscConverter.toVo(item.getTemplateEmailKosc()));
            }
            if (item.getTemplateEmailPlanification() != null && this.templateEmailPlanification) {
                vo.setTemplateEmailPlanificationVo(templateEmailPlanificationConverter.toVo(item.getTemplateEmailPlanification()));
            }
            if (item.getTemplateEmailReplanification() != null && this.templateEmailReplanification) {
                vo.setTemplateEmailReplanificationVo(templateEmailReplanificationConverter.toVo(item.getTemplateEmailReplanification()));
            }
            if (item.getTemplateEmailReport() != null && this.templateEmailReport) {
                vo.setTemplateEmailReportVo(templateEmailReportConverter.toVo(item.getTemplateEmailReport()));
            }
            if (item.getEtatDemandeKosc() != null && this.etatDemandeKosc) {
                vo.setEtatDemandeKoscVo(etatDemandeKoscConverter.toVo(item.getEtatDemandeKosc()));
            }
            if (item.getTemplateEmailCloture() != null && this.templateEmailCloture) {
                vo.setTemplateEmailClotureVo(templateEmailClotureConverter.toVo(item.getTemplateEmailCloture()));
            }
            if (item.getTemplateSuivi() != null && this.templateSuivi) {
                vo.setTemplateSuiviVo(templateSuiviConverter.toVo(item.getTemplateSuivi()));
            }

            return vo;
        }
    }

    public void init(Boolean value) {
        operator = value;
        departement = value;
        technicien = value;
        client = value;
        templateEmailClientInjoinable = value;
        templateEmailKosc = value;
        templateEmailPlanification = value;
        templateEmailReplanification = value;
        templateEmailReport = value;
        etatDemandeKosc = value;
        templateEmailCloture = value;
        templateSuivi = value;
    }


    public TemplateEmailReplanificationConverter getTemplateEmailReplanificationConverter() {
        return this.templateEmailReplanificationConverter;
    }

    public void setTemplateEmailReplanificationConverter(TemplateEmailReplanificationConverter templateEmailReplanificationConverter) {
        this.templateEmailReplanificationConverter = templateEmailReplanificationConverter;
    }

    public EtatDemandeKoscConverter getEtatDemandeKoscConverter() {
        return this.etatDemandeKoscConverter;
    }

    public void setEtatDemandeKoscConverter(EtatDemandeKoscConverter etatDemandeKoscConverter) {
        this.etatDemandeKoscConverter = etatDemandeKoscConverter;
    }

    public TemplateEmailPlanificationConverter getTemplateEmailPlanificationConverter() {
        return this.templateEmailPlanificationConverter;
    }

    public void setTemplateEmailPlanificationConverter(TemplateEmailPlanificationConverter templateEmailPlanificationConverter) {
        this.templateEmailPlanificationConverter = templateEmailPlanificationConverter;
    }

    public TemplateEmailClotureConverter getTemplateEmailClotureConverter() {
        return this.templateEmailClotureConverter;
    }

    public void setTemplateEmailClotureConverter(TemplateEmailClotureConverter templateEmailClotureConverter) {
        this.templateEmailClotureConverter = templateEmailClotureConverter;
    }

    public TemplateSuiviConverter getTemplateSuiviConverter() {
        return this.templateSuiviConverter;
    }

    public void setTemplateSuiviConverter(TemplateSuiviConverter templateSuiviConverter) {
        this.templateSuiviConverter = templateSuiviConverter;
    }

    public OperatorConverter getOperatorConverter() {
        return this.operatorConverter;
    }

    public void setOperatorConverter(OperatorConverter operatorConverter) {
        this.operatorConverter = operatorConverter;
    }

    public DepartementConverter getDepartementConverter() {
        return this.departementConverter;
    }

    public void setDepartementConverter(DepartementConverter departementConverter) {
        this.departementConverter = departementConverter;
    }

    public TemplateEmailKoscConverter getTemplateEmailKoscConverter() {
        return this.templateEmailKoscConverter;
    }

    public void setTemplateEmailKoscConverter(TemplateEmailKoscConverter templateEmailKoscConverter) {
        this.templateEmailKoscConverter = templateEmailKoscConverter;
    }

    public TemplateEmailReportConverter getTemplateEmailReportConverter() {
        return this.templateEmailReportConverter;
    }

    public void setTemplateEmailReportConverter(TemplateEmailReportConverter templateEmailReportConverter) {
        this.templateEmailReportConverter = templateEmailReportConverter;
    }

    public ClientConverter getClientConverter() {
        return this.clientConverter;
    }

    public void setClientConverter(ClientConverter clientConverter) {
        this.clientConverter = clientConverter;
    }

    public TechnicienConverter getTechnicienConverter() {
        return this.technicienConverter;
    }

    public void setTechnicienConverter(TechnicienConverter technicienConverter) {
        this.technicienConverter = technicienConverter;
    }

    public TemplateEmailClientInjoinableConverter getTemplateEmailClientInjoinableConverter() {
        return this.templateEmailClientInjoinableConverter;
    }

    public void setTemplateEmailClientInjoinableConverter(TemplateEmailClientInjoinableConverter templateEmailClientInjoinableConverter) {
        this.templateEmailClientInjoinableConverter = templateEmailClientInjoinableConverter;
    }

    public boolean isOperator() {
        return this.operator;
    }

    public void setOperator(boolean operator) {
        this.operator = operator;
    }

    public boolean isDepartement() {
        return this.departement;
    }

    public void setDepartement(boolean departement) {
        this.departement = departement;
    }

    public boolean isTechnicien() {
        return this.technicien;
    }

    public void setTechnicien(boolean technicien) {
        this.technicien = technicien;
    }

    public boolean isClient() {
        return this.client;
    }

    public void setClient(boolean client) {
        this.client = client;
    }

    public boolean isTemplateEmailClientInjoinable() {
        return this.templateEmailClientInjoinable;
    }

    public void setTemplateEmailClientInjoinable(boolean templateEmailClientInjoinable) {
        this.templateEmailClientInjoinable = templateEmailClientInjoinable;
    }

    public boolean isTemplateEmailKosc() {
        return this.templateEmailKosc;
    }

    public void setTemplateEmailKosc(boolean templateEmailKosc) {
        this.templateEmailKosc = templateEmailKosc;
    }

    public boolean isTemplateEmailPlanification() {
        return this.templateEmailPlanification;
    }

    public void setTemplateEmailPlanification(boolean templateEmailPlanification) {
        this.templateEmailPlanification = templateEmailPlanification;
    }

    public boolean isTemplateEmailReplanification() {
        return this.templateEmailReplanification;
    }

    public void setTemplateEmailReplanification(boolean templateEmailReplanification) {
        this.templateEmailReplanification = templateEmailReplanification;
    }

    public boolean isTemplateEmailReport() {
        return this.templateEmailReport;
    }

    public void setTemplateEmailReport(boolean templateEmailReport) {
        this.templateEmailReport = templateEmailReport;
    }

    public boolean isEtatDemandeKosc() {
        return this.etatDemandeKosc;
    }

    public void setEtatDemandeKosc(boolean etatDemandeKosc) {
        this.etatDemandeKosc = etatDemandeKosc;
    }

    public boolean isTemplateEmailCloture() {
        return this.templateEmailCloture;
    }

    public void setTemplateEmailCloture(boolean templateEmailCloture) {
        this.templateEmailCloture = templateEmailCloture;
    }

    public boolean isTemplateSuivi() {
        return this.templateSuivi;
    }

    public void setTemplateSuivi(boolean templateSuivi) {
        this.templateSuivi = templateSuivi;
    }


}
