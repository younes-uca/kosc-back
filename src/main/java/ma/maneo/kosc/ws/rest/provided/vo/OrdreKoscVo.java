package ma.maneo.kosc.ws.rest.provided.vo;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrdreKoscVo {

    private String id;
    private String reference;
    private String referenceWorkOrder;
    private String codeDecharge;
    private String supplierService;
    private String dateDebutTraitement;
    private String endCustumorName;
    private String endCustumorSiret;
    private String endCustumorFirstName;
    private String endCustumorLastName;
    private String endCustumorZipcode;
    private String endCustumorStreetName;
    private String endCustumorStreetNumber;
    private String endCustumorCity;
    private String endCustumorBuilding;
    private String endCustumorStairs;
    private String endCustumorFloor;
    private String endCustumorContactFirstName;
    private String endCustumorContactLastName;
    private String endCustumorContactPhone;
    private String endCustumorContactCellPhone;
    private String endCustumorContactEmail;
    private String company;
    private String referenDossier;
    private String submissionDate;
    private String datePremierAppel;
    private String dateDeuxiemeAppel;
    private String dateTroisiemeAppel;
    private String datePriseRdv;
    private String dateRdv;
    private String dateAppelReplanification;
    private String dateInterventionTechnique;
    private String dateOuverture;
    private Boolean envoiMailClient;
    private Boolean envoiMailKosc;
    private String coordonnePboY;
    private String hauteurPbo;
    private String typeMaterielPbo;
    private String typePbo;
    private String conditionSyndics;
    private String typeRacordementPboPto;
    private String autreInfosPboPto;
    private String codeAccesImmeuble;
    private String contacteImmeuble;
    private String pmaAccessible;
    private String infoObtentionCle;
    private String localeIpm;
    private String contactsSyndic;
    private Boolean racordementLong;
    private String oc1;
    private String nomModulePm1;
    private String positionModulePm1;
    private String referenceCableModulePm1;
    private String referenceTubeModulePm1;
    private String informationFibreModulePm1;
    private String referenceCablePbo1;
    private String informationTubePbo1;
    private String informationFibrePbo1;
    private String connecteurPriseNumero1;
    private String connecteurPriseCouleur1;
    private String reserve1;
    private String oc2;
    private String nomModulePm2;
    private String positionModulePm2;
    private String referenceCableModulePm2;
    private String referenceTubeModulePm2;
    private String informationFibreModulePm2;
    private String referenceCablePbo2;
    private String informationTubePbo2;
    private String informationFibrePbo2;
    private String connecteurPriseNumero2;
    private String connecteurPriseCouleur2;
    private String reserve2;
    private String oc3;
    private String nomModulePm3;
    private String positionModulePm3;
    private String referenceCableModulePm3;
    private String referenceTubeModulePm3;
    private String informationFibreModulePm3;
    private String referenceCablePbo3;
    private String informationTubePbo3;
    private String informationFibrePbo3;
    private String connecteurPriseNumero3;
    private String connecteurPriseCouleur3;
    private String reserve3;
    private String oc4;
    private String nomModulePm4;
    private String positionModulePm4;
    private String referenceCableModulePm4;
    private String referenceTubeModulePm4;
    private String informationFibreModulePm4;
    private String referenceCablePbo4;
    private String informationTubePbo4;
    private String informationFibrePbo4;
    private String connecteurPriseNumero4;
    private String connecteurPriseCouleur4;
    private String reserve4;
    private String dateEnvoiCri;
    private String pboReel;
    private String numeroSerieOnt;
    private String workOrderType;
    private String product;
    private String provider;
    private String providerFileType;
    private String spliter;
    private Boolean existingOtp;
    private String profile;
    private String comment;
    private String providerSlId;
    private String referencePrestationPrise;
    private String dateInterventionTechniqueDebut;
    private String dateInterventionTechniqueFin;
    private String objetClient;
    private String corpsClient;
    private Boolean envoyeClient;
    private String dateEnvoiClient;
    private String objetKosc;
    private String corpsKosc;
    private Boolean envoyeKosc;
    private String dateEnvoiKosc;
    private String objetPlanification;
    private String corpsPlanification;
    private Boolean envoyePlanification;
    private String dateEnvoiPlanification;
    private String objetReplanification;
    private String corpsReplanification;
    private Boolean envoyeReplanification;
    private String dateEnvoiReplanification;
    private String objetReport;
    private String corpsReport;
    private Boolean envoyeReport;
    private String dateEnvoiReport;
    private String commentaireTechnicien;
    private String commentaireClient;
    private String commantaireCloture;
    private String objetCloture;
    private String corpsCloture;
    private Boolean envoyeCloture;
    private String dateEnvoiCloture;
    private String emailCloturePieceJoints;
    private String objetSuivi;
    private String corpsSuivi;
    private Boolean envoyeSuivi;
    private String dateEnvoiSuivi;


    private String dateDebutTraitementMax;
    private String dateDebutTraitementMin;
    private String submissionDateMax;
    private String submissionDateMin;
    private String datePremierAppelMax;
    private String datePremierAppelMin;
    private String dateDeuxiemeAppelMax;
    private String dateDeuxiemeAppelMin;
    private String dateTroisiemeAppelMax;
    private String dateTroisiemeAppelMin;
    private String datePriseRdvMax;
    private String datePriseRdvMin;
    private String dateRdvMax;
    private String dateRdvMin;
    private String dateAppelReplanificationMax;
    private String dateAppelReplanificationMin;
    private String dateInterventionTechniqueMax;
    private String dateInterventionTechniqueMin;
    private String dateOuvertureMax;
    private String dateOuvertureMin;
    private String dateEnvoiCriMax;
    private String dateEnvoiCriMin;
    private String dateInterventionTechniqueDebutMax;
    private String dateInterventionTechniqueDebutMin;
    private String dateInterventionTechniqueFinMax;
    private String dateInterventionTechniqueFinMin;
    private String dateEnvoiClientMax;
    private String dateEnvoiClientMin;
    private String dateEnvoiKoscMax;
    private String dateEnvoiKoscMin;
    private String dateEnvoiPlanificationMax;
    private String dateEnvoiPlanificationMin;
    private String dateEnvoiReplanificationMax;
    private String dateEnvoiReplanificationMin;
    private String dateEnvoiReportMax;
    private String dateEnvoiReportMin;
    private String dateEnvoiClotureMax;
    private String dateEnvoiClotureMin;
    private String dateEnvoiSuiviMax;
    private String dateEnvoiSuiviMin;

    private OperatorVo operatorVo;
    private DepartementVo departementVo;
    private TechnicienVo technicienVo;
    private ClientVo clientVo;
    private TemplateEmailClientInjoinableVo templateEmailClientInjoinableVo;
    private TemplateEmailKoscVo templateEmailKoscVo;
    private TemplateEmailPlanificationVo templateEmailPlanificationVo;
    private TemplateEmailReplanificationVo templateEmailReplanificationVo;
    private TemplateEmailReportVo templateEmailReportVo;
    private EtatDemandeKoscVo etatDemandeKoscVo;
    private TemplateEmailClotureVo templateEmailClotureVo;
    private TemplateSuiviVo templateSuiviVo;


    public OrdreKoscVo() {
        super();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferenceWorkOrder() {
        return this.referenceWorkOrder;
    }

    public void setReferenceWorkOrder(String referenceWorkOrder) {
        this.referenceWorkOrder = referenceWorkOrder;
    }

    public String getCodeDecharge() {
        return this.codeDecharge;
    }

    public void setCodeDecharge(String codeDecharge) {
        this.codeDecharge = codeDecharge;
    }

    public String getSupplierService() {
        return this.supplierService;
    }

    public void setSupplierService(String supplierService) {
        this.supplierService = supplierService;
    }

    public String getDateDebutTraitement() {
        return this.dateDebutTraitement;
    }

    public void setDateDebutTraitement(String dateDebutTraitement) {
        this.dateDebutTraitement = dateDebutTraitement;
    }

    public String getEndCustumorName() {
        return this.endCustumorName;
    }

    public void setEndCustumorName(String endCustumorName) {
        this.endCustumorName = endCustumorName;
    }

    public String getEndCustumorSiret() {
        return this.endCustumorSiret;
    }

    public void setEndCustumorSiret(String endCustumorSiret) {
        this.endCustumorSiret = endCustumorSiret;
    }

    public String getEndCustumorFirstName() {
        return this.endCustumorFirstName;
    }

    public void setEndCustumorFirstName(String endCustumorFirstName) {
        this.endCustumorFirstName = endCustumorFirstName;
    }

    public String getEndCustumorLastName() {
        return this.endCustumorLastName;
    }

    public void setEndCustumorLastName(String endCustumorLastName) {
        this.endCustumorLastName = endCustumorLastName;
    }

    public String getEndCustumorZipcode() {
        return this.endCustumorZipcode;
    }

    public void setEndCustumorZipcode(String endCustumorZipcode) {
        this.endCustumorZipcode = endCustumorZipcode;
    }

    public String getEndCustumorStreetName() {
        return this.endCustumorStreetName;
    }

    public void setEndCustumorStreetName(String endCustumorStreetName) {
        this.endCustumorStreetName = endCustumorStreetName;
    }

    public String getEndCustumorStreetNumber() {
        return this.endCustumorStreetNumber;
    }

    public void setEndCustumorStreetNumber(String endCustumorStreetNumber) {
        this.endCustumorStreetNumber = endCustumorStreetNumber;
    }

    public String getEndCustumorCity() {
        return this.endCustumorCity;
    }

    public void setEndCustumorCity(String endCustumorCity) {
        this.endCustumorCity = endCustumorCity;
    }

    public String getEndCustumorBuilding() {
        return this.endCustumorBuilding;
    }

    public void setEndCustumorBuilding(String endCustumorBuilding) {
        this.endCustumorBuilding = endCustumorBuilding;
    }

    public String getEndCustumorStairs() {
        return this.endCustumorStairs;
    }

    public void setEndCustumorStairs(String endCustumorStairs) {
        this.endCustumorStairs = endCustumorStairs;
    }

    public String getEndCustumorFloor() {
        return this.endCustumorFloor;
    }

    public void setEndCustumorFloor(String endCustumorFloor) {
        this.endCustumorFloor = endCustumorFloor;
    }

    public String getEndCustumorContactFirstName() {
        return this.endCustumorContactFirstName;
    }

    public void setEndCustumorContactFirstName(String endCustumorContactFirstName) {
        this.endCustumorContactFirstName = endCustumorContactFirstName;
    }

    public String getEndCustumorContactLastName() {
        return this.endCustumorContactLastName;
    }

    public void setEndCustumorContactLastName(String endCustumorContactLastName) {
        this.endCustumorContactLastName = endCustumorContactLastName;
    }

    public String getEndCustumorContactPhone() {
        return this.endCustumorContactPhone;
    }

    public void setEndCustumorContactPhone(String endCustumorContactPhone) {
        this.endCustumorContactPhone = endCustumorContactPhone;
    }

    public String getEndCustumorContactCellPhone() {
        return this.endCustumorContactCellPhone;
    }

    public void setEndCustumorContactCellPhone(String endCustumorContactCellPhone) {
        this.endCustumorContactCellPhone = endCustumorContactCellPhone;
    }

    public String getEndCustumorContactEmail() {
        return this.endCustumorContactEmail;
    }

    public void setEndCustumorContactEmail(String endCustumorContactEmail) {
        this.endCustumorContactEmail = endCustumorContactEmail;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getReferenDossier() {
        return this.referenDossier;
    }

    public void setReferenDossier(String referenDossier) {
        this.referenDossier = referenDossier;
    }

    public String getSubmissionDate() {
        return this.submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getDatePremierAppel() {
        return this.datePremierAppel;
    }

    public void setDatePremierAppel(String datePremierAppel) {
        this.datePremierAppel = datePremierAppel;
    }

    public String getDateDeuxiemeAppel() {
        return this.dateDeuxiemeAppel;
    }

    public void setDateDeuxiemeAppel(String dateDeuxiemeAppel) {
        this.dateDeuxiemeAppel = dateDeuxiemeAppel;
    }

    public String getDateTroisiemeAppel() {
        return this.dateTroisiemeAppel;
    }

    public void setDateTroisiemeAppel(String dateTroisiemeAppel) {
        this.dateTroisiemeAppel = dateTroisiemeAppel;
    }

    public String getDatePriseRdv() {
        return this.datePriseRdv;
    }

    public void setDatePriseRdv(String datePriseRdv) {
        this.datePriseRdv = datePriseRdv;
    }

    public String getDateRdv() {
        return this.dateRdv;
    }

    public void setDateRdv(String dateRdv) {
        this.dateRdv = dateRdv;
    }

    public String getDateAppelReplanification() {
        return this.dateAppelReplanification;
    }

    public void setDateAppelReplanification(String dateAppelReplanification) {
        this.dateAppelReplanification = dateAppelReplanification;
    }

    public String getDateInterventionTechnique() {
        return this.dateInterventionTechnique;
    }

    public void setDateInterventionTechnique(String dateInterventionTechnique) {
        this.dateInterventionTechnique = dateInterventionTechnique;
    }

    public String getDateOuverture() {
        return this.dateOuverture;
    }

    public void setDateOuverture(String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public Boolean getEnvoiMailClient() {
        return this.envoiMailClient;
    }

    public void setEnvoiMailClient(Boolean envoiMailClient) {
        this.envoiMailClient = envoiMailClient;
    }

    public Boolean getEnvoiMailKosc() {
        return this.envoiMailKosc;
    }

    public void setEnvoiMailKosc(Boolean envoiMailKosc) {
        this.envoiMailKosc = envoiMailKosc;
    }

    public String getCoordonnePboY() {
        return this.coordonnePboY;
    }

    public void setCoordonnePboY(String coordonnePboY) {
        this.coordonnePboY = coordonnePboY;
    }

    public String getHauteurPbo() {
        return this.hauteurPbo;
    }

    public void setHauteurPbo(String hauteurPbo) {
        this.hauteurPbo = hauteurPbo;
    }

    public String getTypeMaterielPbo() {
        return this.typeMaterielPbo;
    }

    public void setTypeMaterielPbo(String typeMaterielPbo) {
        this.typeMaterielPbo = typeMaterielPbo;
    }

    public String getTypePbo() {
        return this.typePbo;
    }

    public void setTypePbo(String typePbo) {
        this.typePbo = typePbo;
    }

    public String getConditionSyndics() {
        return this.conditionSyndics;
    }

    public void setConditionSyndics(String conditionSyndics) {
        this.conditionSyndics = conditionSyndics;
    }

    public String getTypeRacordementPboPto() {
        return this.typeRacordementPboPto;
    }

    public void setTypeRacordementPboPto(String typeRacordementPboPto) {
        this.typeRacordementPboPto = typeRacordementPboPto;
    }

    public String getAutreInfosPboPto() {
        return this.autreInfosPboPto;
    }

    public void setAutreInfosPboPto(String autreInfosPboPto) {
        this.autreInfosPboPto = autreInfosPboPto;
    }

    public String getCodeAccesImmeuble() {
        return this.codeAccesImmeuble;
    }

    public void setCodeAccesImmeuble(String codeAccesImmeuble) {
        this.codeAccesImmeuble = codeAccesImmeuble;
    }

    public String getContacteImmeuble() {
        return this.contacteImmeuble;
    }

    public void setContacteImmeuble(String contacteImmeuble) {
        this.contacteImmeuble = contacteImmeuble;
    }

    public String getPmaAccessible() {
        return this.pmaAccessible;
    }

    public void setPmaAccessible(String pmaAccessible) {
        this.pmaAccessible = pmaAccessible;
    }

    public String getInfoObtentionCle() {
        return this.infoObtentionCle;
    }

    public void setInfoObtentionCle(String infoObtentionCle) {
        this.infoObtentionCle = infoObtentionCle;
    }

    public String getLocaleIpm() {
        return this.localeIpm;
    }

    public void setLocaleIpm(String localeIpm) {
        this.localeIpm = localeIpm;
    }

    public String getContactsSyndic() {
        return this.contactsSyndic;
    }

    public void setContactsSyndic(String contactsSyndic) {
        this.contactsSyndic = contactsSyndic;
    }

    public Boolean getRacordementLong() {
        return this.racordementLong;
    }

    public void setRacordementLong(Boolean racordementLong) {
        this.racordementLong = racordementLong;
    }

    public String getOc1() {
        return this.oc1;
    }

    public void setOc1(String oc1) {
        this.oc1 = oc1;
    }

    public String getNomModulePm1() {
        return this.nomModulePm1;
    }

    public void setNomModulePm1(String nomModulePm1) {
        this.nomModulePm1 = nomModulePm1;
    }

    public String getPositionModulePm1() {
        return this.positionModulePm1;
    }

    public void setPositionModulePm1(String positionModulePm1) {
        this.positionModulePm1 = positionModulePm1;
    }

    public String getReferenceCableModulePm1() {
        return this.referenceCableModulePm1;
    }

    public void setReferenceCableModulePm1(String referenceCableModulePm1) {
        this.referenceCableModulePm1 = referenceCableModulePm1;
    }

    public String getReferenceTubeModulePm1() {
        return this.referenceTubeModulePm1;
    }

    public void setReferenceTubeModulePm1(String referenceTubeModulePm1) {
        this.referenceTubeModulePm1 = referenceTubeModulePm1;
    }

    public String getInformationFibreModulePm1() {
        return this.informationFibreModulePm1;
    }

    public void setInformationFibreModulePm1(String informationFibreModulePm1) {
        this.informationFibreModulePm1 = informationFibreModulePm1;
    }

    public String getReferenceCablePbo1() {
        return this.referenceCablePbo1;
    }

    public void setReferenceCablePbo1(String referenceCablePbo1) {
        this.referenceCablePbo1 = referenceCablePbo1;
    }

    public String getInformationTubePbo1() {
        return this.informationTubePbo1;
    }

    public void setInformationTubePbo1(String informationTubePbo1) {
        this.informationTubePbo1 = informationTubePbo1;
    }

    public String getInformationFibrePbo1() {
        return this.informationFibrePbo1;
    }

    public void setInformationFibrePbo1(String informationFibrePbo1) {
        this.informationFibrePbo1 = informationFibrePbo1;
    }

    public String getConnecteurPriseNumero1() {
        return this.connecteurPriseNumero1;
    }

    public void setConnecteurPriseNumero1(String connecteurPriseNumero1) {
        this.connecteurPriseNumero1 = connecteurPriseNumero1;
    }

    public String getConnecteurPriseCouleur1() {
        return this.connecteurPriseCouleur1;
    }

    public void setConnecteurPriseCouleur1(String connecteurPriseCouleur1) {
        this.connecteurPriseCouleur1 = connecteurPriseCouleur1;
    }

    public String getReserve1() {
        return this.reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getOc2() {
        return this.oc2;
    }

    public void setOc2(String oc2) {
        this.oc2 = oc2;
    }

    public String getNomModulePm2() {
        return this.nomModulePm2;
    }

    public void setNomModulePm2(String nomModulePm2) {
        this.nomModulePm2 = nomModulePm2;
    }

    public String getPositionModulePm2() {
        return this.positionModulePm2;
    }

    public void setPositionModulePm2(String positionModulePm2) {
        this.positionModulePm2 = positionModulePm2;
    }

    public String getReferenceCableModulePm2() {
        return this.referenceCableModulePm2;
    }

    public void setReferenceCableModulePm2(String referenceCableModulePm2) {
        this.referenceCableModulePm2 = referenceCableModulePm2;
    }

    public String getReferenceTubeModulePm2() {
        return this.referenceTubeModulePm2;
    }

    public void setReferenceTubeModulePm2(String referenceTubeModulePm2) {
        this.referenceTubeModulePm2 = referenceTubeModulePm2;
    }

    public String getInformationFibreModulePm2() {
        return this.informationFibreModulePm2;
    }

    public void setInformationFibreModulePm2(String informationFibreModulePm2) {
        this.informationFibreModulePm2 = informationFibreModulePm2;
    }

    public String getReferenceCablePbo2() {
        return this.referenceCablePbo2;
    }

    public void setReferenceCablePbo2(String referenceCablePbo2) {
        this.referenceCablePbo2 = referenceCablePbo2;
    }

    public String getInformationTubePbo2() {
        return this.informationTubePbo2;
    }

    public void setInformationTubePbo2(String informationTubePbo2) {
        this.informationTubePbo2 = informationTubePbo2;
    }

    public String getInformationFibrePbo2() {
        return this.informationFibrePbo2;
    }

    public void setInformationFibrePbo2(String informationFibrePbo2) {
        this.informationFibrePbo2 = informationFibrePbo2;
    }

    public String getConnecteurPriseNumero2() {
        return this.connecteurPriseNumero2;
    }

    public void setConnecteurPriseNumero2(String connecteurPriseNumero2) {
        this.connecteurPriseNumero2 = connecteurPriseNumero2;
    }

    public String getConnecteurPriseCouleur2() {
        return this.connecteurPriseCouleur2;
    }

    public void setConnecteurPriseCouleur2(String connecteurPriseCouleur2) {
        this.connecteurPriseCouleur2 = connecteurPriseCouleur2;
    }

    public String getReserve2() {
        return this.reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getOc3() {
        return this.oc3;
    }

    public void setOc3(String oc3) {
        this.oc3 = oc3;
    }

    public String getNomModulePm3() {
        return this.nomModulePm3;
    }

    public void setNomModulePm3(String nomModulePm3) {
        this.nomModulePm3 = nomModulePm3;
    }

    public String getPositionModulePm3() {
        return this.positionModulePm3;
    }

    public void setPositionModulePm3(String positionModulePm3) {
        this.positionModulePm3 = positionModulePm3;
    }

    public String getReferenceCableModulePm3() {
        return this.referenceCableModulePm3;
    }

    public void setReferenceCableModulePm3(String referenceCableModulePm3) {
        this.referenceCableModulePm3 = referenceCableModulePm3;
    }

    public String getReferenceTubeModulePm3() {
        return this.referenceTubeModulePm3;
    }

    public void setReferenceTubeModulePm3(String referenceTubeModulePm3) {
        this.referenceTubeModulePm3 = referenceTubeModulePm3;
    }

    public String getInformationFibreModulePm3() {
        return this.informationFibreModulePm3;
    }

    public void setInformationFibreModulePm3(String informationFibreModulePm3) {
        this.informationFibreModulePm3 = informationFibreModulePm3;
    }

    public String getReferenceCablePbo3() {
        return this.referenceCablePbo3;
    }

    public void setReferenceCablePbo3(String referenceCablePbo3) {
        this.referenceCablePbo3 = referenceCablePbo3;
    }

    public String getInformationTubePbo3() {
        return this.informationTubePbo3;
    }

    public void setInformationTubePbo3(String informationTubePbo3) {
        this.informationTubePbo3 = informationTubePbo3;
    }

    public String getInformationFibrePbo3() {
        return this.informationFibrePbo3;
    }

    public void setInformationFibrePbo3(String informationFibrePbo3) {
        this.informationFibrePbo3 = informationFibrePbo3;
    }

    public String getConnecteurPriseNumero3() {
        return this.connecteurPriseNumero3;
    }

    public void setConnecteurPriseNumero3(String connecteurPriseNumero3) {
        this.connecteurPriseNumero3 = connecteurPriseNumero3;
    }

    public String getConnecteurPriseCouleur3() {
        return this.connecteurPriseCouleur3;
    }

    public void setConnecteurPriseCouleur3(String connecteurPriseCouleur3) {
        this.connecteurPriseCouleur3 = connecteurPriseCouleur3;
    }

    public String getReserve3() {
        return this.reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    public String getOc4() {
        return this.oc4;
    }

    public void setOc4(String oc4) {
        this.oc4 = oc4;
    }

    public String getNomModulePm4() {
        return this.nomModulePm4;
    }

    public void setNomModulePm4(String nomModulePm4) {
        this.nomModulePm4 = nomModulePm4;
    }

    public String getPositionModulePm4() {
        return this.positionModulePm4;
    }

    public void setPositionModulePm4(String positionModulePm4) {
        this.positionModulePm4 = positionModulePm4;
    }

    public String getReferenceCableModulePm4() {
        return this.referenceCableModulePm4;
    }

    public void setReferenceCableModulePm4(String referenceCableModulePm4) {
        this.referenceCableModulePm4 = referenceCableModulePm4;
    }

    public String getReferenceTubeModulePm4() {
        return this.referenceTubeModulePm4;
    }

    public void setReferenceTubeModulePm4(String referenceTubeModulePm4) {
        this.referenceTubeModulePm4 = referenceTubeModulePm4;
    }

    public String getInformationFibreModulePm4() {
        return this.informationFibreModulePm4;
    }

    public void setInformationFibreModulePm4(String informationFibreModulePm4) {
        this.informationFibreModulePm4 = informationFibreModulePm4;
    }

    public String getReferenceCablePbo4() {
        return this.referenceCablePbo4;
    }

    public void setReferenceCablePbo4(String referenceCablePbo4) {
        this.referenceCablePbo4 = referenceCablePbo4;
    }

    public String getInformationTubePbo4() {
        return this.informationTubePbo4;
    }

    public void setInformationTubePbo4(String informationTubePbo4) {
        this.informationTubePbo4 = informationTubePbo4;
    }

    public String getInformationFibrePbo4() {
        return this.informationFibrePbo4;
    }

    public void setInformationFibrePbo4(String informationFibrePbo4) {
        this.informationFibrePbo4 = informationFibrePbo4;
    }

    public String getConnecteurPriseNumero4() {
        return this.connecteurPriseNumero4;
    }

    public void setConnecteurPriseNumero4(String connecteurPriseNumero4) {
        this.connecteurPriseNumero4 = connecteurPriseNumero4;
    }

    public String getConnecteurPriseCouleur4() {
        return this.connecteurPriseCouleur4;
    }

    public void setConnecteurPriseCouleur4(String connecteurPriseCouleur4) {
        this.connecteurPriseCouleur4 = connecteurPriseCouleur4;
    }

    public String getReserve4() {
        return this.reserve4;
    }

    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4;
    }

    public String getDateEnvoiCri() {
        return this.dateEnvoiCri;
    }

    public void setDateEnvoiCri(String dateEnvoiCri) {
        this.dateEnvoiCri = dateEnvoiCri;
    }

    public String getPboReel() {
        return this.pboReel;
    }

    public void setPboReel(String pboReel) {
        this.pboReel = pboReel;
    }

    public String getNumeroSerieOnt() {
        return this.numeroSerieOnt;
    }

    public void setNumeroSerieOnt(String numeroSerieOnt) {
        this.numeroSerieOnt = numeroSerieOnt;
    }

    public String getWorkOrderType() {
        return this.workOrderType;
    }

    public void setWorkOrderType(String workOrderType) {
        this.workOrderType = workOrderType;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProviderFileType() {
        return this.providerFileType;
    }

    public void setProviderFileType(String providerFileType) {
        this.providerFileType = providerFileType;
    }

    public String getSpliter() {
        return this.spliter;
    }

    public void setSpliter(String spliter) {
        this.spliter = spliter;
    }

    public Boolean getExistingOtp() {
        return this.existingOtp;
    }

    public void setExistingOtp(Boolean existingOtp) {
        this.existingOtp = existingOtp;
    }

    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getProviderSlId() {
        return this.providerSlId;
    }

    public void setProviderSlId(String providerSlId) {
        this.providerSlId = providerSlId;
    }

    public String getReferencePrestationPrise() {
        return this.referencePrestationPrise;
    }

    public void setReferencePrestationPrise(String referencePrestationPrise) {
        this.referencePrestationPrise = referencePrestationPrise;
    }

    public String getDateInterventionTechniqueDebut() {
        return this.dateInterventionTechniqueDebut;
    }

    public void setDateInterventionTechniqueDebut(String dateInterventionTechniqueDebut) {
        this.dateInterventionTechniqueDebut = dateInterventionTechniqueDebut;
    }

    public String getDateInterventionTechniqueFin() {
        return this.dateInterventionTechniqueFin;
    }

    public void setDateInterventionTechniqueFin(String dateInterventionTechniqueFin) {
        this.dateInterventionTechniqueFin = dateInterventionTechniqueFin;
    }

    public String getObjetClient() {
        return this.objetClient;
    }

    public void setObjetClient(String objetClient) {
        this.objetClient = objetClient;
    }

    public String getCorpsClient() {
        return this.corpsClient;
    }

    public void setCorpsClient(String corpsClient) {
        this.corpsClient = corpsClient;
    }

    public Boolean getEnvoyeClient() {
        return this.envoyeClient;
    }

    public void setEnvoyeClient(Boolean envoyeClient) {
        this.envoyeClient = envoyeClient;
    }

    public String getDateEnvoiClient() {
        return this.dateEnvoiClient;
    }

    public void setDateEnvoiClient(String dateEnvoiClient) {
        this.dateEnvoiClient = dateEnvoiClient;
    }

    public String getObjetKosc() {
        return this.objetKosc;
    }

    public void setObjetKosc(String objetKosc) {
        this.objetKosc = objetKosc;
    }

    public String getCorpsKosc() {
        return this.corpsKosc;
    }

    public void setCorpsKosc(String corpsKosc) {
        this.corpsKosc = corpsKosc;
    }

    public Boolean getEnvoyeKosc() {
        return this.envoyeKosc;
    }

    public void setEnvoyeKosc(Boolean envoyeKosc) {
        this.envoyeKosc = envoyeKosc;
    }

    public String getDateEnvoiKosc() {
        return this.dateEnvoiKosc;
    }

    public void setDateEnvoiKosc(String dateEnvoiKosc) {
        this.dateEnvoiKosc = dateEnvoiKosc;
    }

    public String getObjetPlanification() {
        return this.objetPlanification;
    }

    public void setObjetPlanification(String objetPlanification) {
        this.objetPlanification = objetPlanification;
    }

    public String getCorpsPlanification() {
        return this.corpsPlanification;
    }

    public void setCorpsPlanification(String corpsPlanification) {
        this.corpsPlanification = corpsPlanification;
    }

    public Boolean getEnvoyePlanification() {
        return this.envoyePlanification;
    }

    public void setEnvoyePlanification(Boolean envoyePlanification) {
        this.envoyePlanification = envoyePlanification;
    }

    public String getDateEnvoiPlanification() {
        return this.dateEnvoiPlanification;
    }

    public void setDateEnvoiPlanification(String dateEnvoiPlanification) {
        this.dateEnvoiPlanification = dateEnvoiPlanification;
    }

    public String getObjetReplanification() {
        return this.objetReplanification;
    }

    public void setObjetReplanification(String objetReplanification) {
        this.objetReplanification = objetReplanification;
    }

    public String getCorpsReplanification() {
        return this.corpsReplanification;
    }

    public void setCorpsReplanification(String corpsReplanification) {
        this.corpsReplanification = corpsReplanification;
    }

    public Boolean getEnvoyeReplanification() {
        return this.envoyeReplanification;
    }

    public void setEnvoyeReplanification(Boolean envoyeReplanification) {
        this.envoyeReplanification = envoyeReplanification;
    }

    public String getDateEnvoiReplanification() {
        return this.dateEnvoiReplanification;
    }

    public void setDateEnvoiReplanification(String dateEnvoiReplanification) {
        this.dateEnvoiReplanification = dateEnvoiReplanification;
    }

    public String getObjetReport() {
        return this.objetReport;
    }

    public void setObjetReport(String objetReport) {
        this.objetReport = objetReport;
    }

    public String getCorpsReport() {
        return this.corpsReport;
    }

    public void setCorpsReport(String corpsReport) {
        this.corpsReport = corpsReport;
    }

    public Boolean getEnvoyeReport() {
        return this.envoyeReport;
    }

    public void setEnvoyeReport(Boolean envoyeReport) {
        this.envoyeReport = envoyeReport;
    }

    public String getDateEnvoiReport() {
        return this.dateEnvoiReport;
    }

    public void setDateEnvoiReport(String dateEnvoiReport) {
        this.dateEnvoiReport = dateEnvoiReport;
    }

    public String getCommentaireTechnicien() {
        return this.commentaireTechnicien;
    }

    public void setCommentaireTechnicien(String commentaireTechnicien) {
        this.commentaireTechnicien = commentaireTechnicien;
    }

    public String getCommentaireClient() {
        return this.commentaireClient;
    }

    public void setCommentaireClient(String commentaireClient) {
        this.commentaireClient = commentaireClient;
    }

    public String getCommantaireCloture() {
        return this.commantaireCloture;
    }

    public void setCommantaireCloture(String commantaireCloture) {
        this.commantaireCloture = commantaireCloture;
    }

    public String getObjetCloture() {
        return this.objetCloture;
    }

    public void setObjetCloture(String objetCloture) {
        this.objetCloture = objetCloture;
    }

    public String getCorpsCloture() {
        return this.corpsCloture;
    }

    public void setCorpsCloture(String corpsCloture) {
        this.corpsCloture = corpsCloture;
    }

    public Boolean getEnvoyeCloture() {
        return this.envoyeCloture;
    }

    public void setEnvoyeCloture(Boolean envoyeCloture) {
        this.envoyeCloture = envoyeCloture;
    }

    public String getDateEnvoiCloture() {
        return this.dateEnvoiCloture;
    }

    public void setDateEnvoiCloture(String dateEnvoiCloture) {
        this.dateEnvoiCloture = dateEnvoiCloture;
    }

    public String getEmailCloturePieceJoints() {
        return this.emailCloturePieceJoints;
    }

    public void setEmailCloturePieceJoints(String emailCloturePieceJoints) {
        this.emailCloturePieceJoints = emailCloturePieceJoints;
    }

    public String getObjetSuivi() {
        return this.objetSuivi;
    }

    public void setObjetSuivi(String objetSuivi) {
        this.objetSuivi = objetSuivi;
    }

    public String getCorpsSuivi() {
        return this.corpsSuivi;
    }

    public void setCorpsSuivi(String corpsSuivi) {
        this.corpsSuivi = corpsSuivi;
    }

    public Boolean getEnvoyeSuivi() {
        return this.envoyeSuivi;
    }

    public void setEnvoyeSuivi(Boolean envoyeSuivi) {
        this.envoyeSuivi = envoyeSuivi;
    }

    public String getDateEnvoiSuivi() {
        return this.dateEnvoiSuivi;
    }

    public void setDateEnvoiSuivi(String dateEnvoiSuivi) {
        this.dateEnvoiSuivi = dateEnvoiSuivi;
    }


    public String getDateDebutTraitementMax() {
        return this.dateDebutTraitementMax;
    }

    public String getDateDebutTraitementMin() {
        return this.dateDebutTraitementMin;
    }

    public void setDateDebutTraitementMax(String dateDebutTraitementMax) {
        this.dateDebutTraitementMax = dateDebutTraitementMax;
    }

    public void setDateDebutTraitementMin(String dateDebutTraitementMin) {
        this.dateDebutTraitementMin = dateDebutTraitementMin;
    }

    public String getSubmissionDateMax() {
        return this.submissionDateMax;
    }

    public String getSubmissionDateMin() {
        return this.submissionDateMin;
    }

    public void setSubmissionDateMax(String submissionDateMax) {
        this.submissionDateMax = submissionDateMax;
    }

    public void setSubmissionDateMin(String submissionDateMin) {
        this.submissionDateMin = submissionDateMin;
    }

    public String getDatePremierAppelMax() {
        return this.datePremierAppelMax;
    }

    public String getDatePremierAppelMin() {
        return this.datePremierAppelMin;
    }

    public void setDatePremierAppelMax(String datePremierAppelMax) {
        this.datePremierAppelMax = datePremierAppelMax;
    }

    public void setDatePremierAppelMin(String datePremierAppelMin) {
        this.datePremierAppelMin = datePremierAppelMin;
    }

    public String getDateDeuxiemeAppelMax() {
        return this.dateDeuxiemeAppelMax;
    }

    public String getDateDeuxiemeAppelMin() {
        return this.dateDeuxiemeAppelMin;
    }

    public void setDateDeuxiemeAppelMax(String dateDeuxiemeAppelMax) {
        this.dateDeuxiemeAppelMax = dateDeuxiemeAppelMax;
    }

    public void setDateDeuxiemeAppelMin(String dateDeuxiemeAppelMin) {
        this.dateDeuxiemeAppelMin = dateDeuxiemeAppelMin;
    }

    public String getDateTroisiemeAppelMax() {
        return this.dateTroisiemeAppelMax;
    }

    public String getDateTroisiemeAppelMin() {
        return this.dateTroisiemeAppelMin;
    }

    public void setDateTroisiemeAppelMax(String dateTroisiemeAppelMax) {
        this.dateTroisiemeAppelMax = dateTroisiemeAppelMax;
    }

    public void setDateTroisiemeAppelMin(String dateTroisiemeAppelMin) {
        this.dateTroisiemeAppelMin = dateTroisiemeAppelMin;
    }

    public String getDatePriseRdvMax() {
        return this.datePriseRdvMax;
    }

    public String getDatePriseRdvMin() {
        return this.datePriseRdvMin;
    }

    public void setDatePriseRdvMax(String datePriseRdvMax) {
        this.datePriseRdvMax = datePriseRdvMax;
    }

    public void setDatePriseRdvMin(String datePriseRdvMin) {
        this.datePriseRdvMin = datePriseRdvMin;
    }

    public String getDateRdvMax() {
        return this.dateRdvMax;
    }

    public String getDateRdvMin() {
        return this.dateRdvMin;
    }

    public void setDateRdvMax(String dateRdvMax) {
        this.dateRdvMax = dateRdvMax;
    }

    public void setDateRdvMin(String dateRdvMin) {
        this.dateRdvMin = dateRdvMin;
    }

    public String getDateAppelReplanificationMax() {
        return this.dateAppelReplanificationMax;
    }

    public String getDateAppelReplanificationMin() {
        return this.dateAppelReplanificationMin;
    }

    public void setDateAppelReplanificationMax(String dateAppelReplanificationMax) {
        this.dateAppelReplanificationMax = dateAppelReplanificationMax;
    }

    public void setDateAppelReplanificationMin(String dateAppelReplanificationMin) {
        this.dateAppelReplanificationMin = dateAppelReplanificationMin;
    }

    public String getDateInterventionTechniqueMax() {
        return this.dateInterventionTechniqueMax;
    }

    public String getDateInterventionTechniqueMin() {
        return this.dateInterventionTechniqueMin;
    }

    public void setDateInterventionTechniqueMax(String dateInterventionTechniqueMax) {
        this.dateInterventionTechniqueMax = dateInterventionTechniqueMax;
    }

    public void setDateInterventionTechniqueMin(String dateInterventionTechniqueMin) {
        this.dateInterventionTechniqueMin = dateInterventionTechniqueMin;
    }

    public String getDateOuvertureMax() {
        return this.dateOuvertureMax;
    }

    public String getDateOuvertureMin() {
        return this.dateOuvertureMin;
    }

    public void setDateOuvertureMax(String dateOuvertureMax) {
        this.dateOuvertureMax = dateOuvertureMax;
    }

    public void setDateOuvertureMin(String dateOuvertureMin) {
        this.dateOuvertureMin = dateOuvertureMin;
    }

    public String getDateEnvoiCriMax() {
        return this.dateEnvoiCriMax;
    }

    public String getDateEnvoiCriMin() {
        return this.dateEnvoiCriMin;
    }

    public void setDateEnvoiCriMax(String dateEnvoiCriMax) {
        this.dateEnvoiCriMax = dateEnvoiCriMax;
    }

    public void setDateEnvoiCriMin(String dateEnvoiCriMin) {
        this.dateEnvoiCriMin = dateEnvoiCriMin;
    }

    public String getDateInterventionTechniqueDebutMax() {
        return this.dateInterventionTechniqueDebutMax;
    }

    public String getDateInterventionTechniqueDebutMin() {
        return this.dateInterventionTechniqueDebutMin;
    }

    public void setDateInterventionTechniqueDebutMax(String dateInterventionTechniqueDebutMax) {
        this.dateInterventionTechniqueDebutMax = dateInterventionTechniqueDebutMax;
    }

    public void setDateInterventionTechniqueDebutMin(String dateInterventionTechniqueDebutMin) {
        this.dateInterventionTechniqueDebutMin = dateInterventionTechniqueDebutMin;
    }

    public String getDateInterventionTechniqueFinMax() {
        return this.dateInterventionTechniqueFinMax;
    }

    public String getDateInterventionTechniqueFinMin() {
        return this.dateInterventionTechniqueFinMin;
    }

    public void setDateInterventionTechniqueFinMax(String dateInterventionTechniqueFinMax) {
        this.dateInterventionTechniqueFinMax = dateInterventionTechniqueFinMax;
    }

    public void setDateInterventionTechniqueFinMin(String dateInterventionTechniqueFinMin) {
        this.dateInterventionTechniqueFinMin = dateInterventionTechniqueFinMin;
    }

    public String getDateEnvoiClientMax() {
        return this.dateEnvoiClientMax;
    }

    public String getDateEnvoiClientMin() {
        return this.dateEnvoiClientMin;
    }

    public void setDateEnvoiClientMax(String dateEnvoiClientMax) {
        this.dateEnvoiClientMax = dateEnvoiClientMax;
    }

    public void setDateEnvoiClientMin(String dateEnvoiClientMin) {
        this.dateEnvoiClientMin = dateEnvoiClientMin;
    }

    public String getDateEnvoiKoscMax() {
        return this.dateEnvoiKoscMax;
    }

    public String getDateEnvoiKoscMin() {
        return this.dateEnvoiKoscMin;
    }

    public void setDateEnvoiKoscMax(String dateEnvoiKoscMax) {
        this.dateEnvoiKoscMax = dateEnvoiKoscMax;
    }

    public void setDateEnvoiKoscMin(String dateEnvoiKoscMin) {
        this.dateEnvoiKoscMin = dateEnvoiKoscMin;
    }

    public String getDateEnvoiPlanificationMax() {
        return this.dateEnvoiPlanificationMax;
    }

    public String getDateEnvoiPlanificationMin() {
        return this.dateEnvoiPlanificationMin;
    }

    public void setDateEnvoiPlanificationMax(String dateEnvoiPlanificationMax) {
        this.dateEnvoiPlanificationMax = dateEnvoiPlanificationMax;
    }

    public void setDateEnvoiPlanificationMin(String dateEnvoiPlanificationMin) {
        this.dateEnvoiPlanificationMin = dateEnvoiPlanificationMin;
    }

    public String getDateEnvoiReplanificationMax() {
        return this.dateEnvoiReplanificationMax;
    }

    public String getDateEnvoiReplanificationMin() {
        return this.dateEnvoiReplanificationMin;
    }

    public void setDateEnvoiReplanificationMax(String dateEnvoiReplanificationMax) {
        this.dateEnvoiReplanificationMax = dateEnvoiReplanificationMax;
    }

    public void setDateEnvoiReplanificationMin(String dateEnvoiReplanificationMin) {
        this.dateEnvoiReplanificationMin = dateEnvoiReplanificationMin;
    }

    public String getDateEnvoiReportMax() {
        return this.dateEnvoiReportMax;
    }

    public String getDateEnvoiReportMin() {
        return this.dateEnvoiReportMin;
    }

    public void setDateEnvoiReportMax(String dateEnvoiReportMax) {
        this.dateEnvoiReportMax = dateEnvoiReportMax;
    }

    public void setDateEnvoiReportMin(String dateEnvoiReportMin) {
        this.dateEnvoiReportMin = dateEnvoiReportMin;
    }

    public String getDateEnvoiClotureMax() {
        return this.dateEnvoiClotureMax;
    }

    public String getDateEnvoiClotureMin() {
        return this.dateEnvoiClotureMin;
    }

    public void setDateEnvoiClotureMax(String dateEnvoiClotureMax) {
        this.dateEnvoiClotureMax = dateEnvoiClotureMax;
    }

    public void setDateEnvoiClotureMin(String dateEnvoiClotureMin) {
        this.dateEnvoiClotureMin = dateEnvoiClotureMin;
    }

    public String getDateEnvoiSuiviMax() {
        return this.dateEnvoiSuiviMax;
    }

    public String getDateEnvoiSuiviMin() {
        return this.dateEnvoiSuiviMin;
    }

    public void setDateEnvoiSuiviMax(String dateEnvoiSuiviMax) {
        this.dateEnvoiSuiviMax = dateEnvoiSuiviMax;
    }

    public void setDateEnvoiSuiviMin(String dateEnvoiSuiviMin) {
        this.dateEnvoiSuiviMin = dateEnvoiSuiviMin;
    }


    public OperatorVo getOperatorVo() {
        return this.operatorVo;
    }

    public void setOperatorVo(OperatorVo operatorVo) {
        this.operatorVo = operatorVo;
    }

    public DepartementVo getDepartementVo() {
        return this.departementVo;
    }

    public void setDepartementVo(DepartementVo departementVo) {
        this.departementVo = departementVo;
    }

    public TechnicienVo getTechnicienVo() {
        return this.technicienVo;
    }

    public void setTechnicienVo(TechnicienVo technicienVo) {
        this.technicienVo = technicienVo;
    }

    public ClientVo getClientVo() {
        return this.clientVo;
    }

    public void setClientVo(ClientVo clientVo) {
        this.clientVo = clientVo;
    }

    public TemplateEmailClientInjoinableVo getTemplateEmailClientInjoinableVo() {
        return this.templateEmailClientInjoinableVo;
    }

    public void setTemplateEmailClientInjoinableVo(TemplateEmailClientInjoinableVo templateEmailClientInjoinableVo) {
        this.templateEmailClientInjoinableVo = templateEmailClientInjoinableVo;
    }

    public TemplateEmailKoscVo getTemplateEmailKoscVo() {
        return this.templateEmailKoscVo;
    }

    public void setTemplateEmailKoscVo(TemplateEmailKoscVo templateEmailKoscVo) {
        this.templateEmailKoscVo = templateEmailKoscVo;
    }

    public TemplateEmailPlanificationVo getTemplateEmailPlanificationVo() {
        return this.templateEmailPlanificationVo;
    }

    public void setTemplateEmailPlanificationVo(TemplateEmailPlanificationVo templateEmailPlanificationVo) {
        this.templateEmailPlanificationVo = templateEmailPlanificationVo;
    }

    public TemplateEmailReplanificationVo getTemplateEmailReplanificationVo() {
        return this.templateEmailReplanificationVo;
    }

    public void setTemplateEmailReplanificationVo(TemplateEmailReplanificationVo templateEmailReplanificationVo) {
        this.templateEmailReplanificationVo = templateEmailReplanificationVo;
    }

    public TemplateEmailReportVo getTemplateEmailReportVo() {
        return this.templateEmailReportVo;
    }

    public void setTemplateEmailReportVo(TemplateEmailReportVo templateEmailReportVo) {
        this.templateEmailReportVo = templateEmailReportVo;
    }

    public EtatDemandeKoscVo getEtatDemandeKoscVo() {
        return this.etatDemandeKoscVo;
    }

    public void setEtatDemandeKoscVo(EtatDemandeKoscVo etatDemandeKoscVo) {
        this.etatDemandeKoscVo = etatDemandeKoscVo;
    }

    public TemplateEmailClotureVo getTemplateEmailClotureVo() {
        return this.templateEmailClotureVo;
    }

    public void setTemplateEmailClotureVo(TemplateEmailClotureVo templateEmailClotureVo) {
        this.templateEmailClotureVo = templateEmailClotureVo;
    }

    public TemplateSuiviVo getTemplateSuiviVo() {
        return this.templateSuiviVo;
    }

    public void setTemplateSuiviVo(TemplateSuiviVo templateSuiviVo) {
        this.templateSuiviVo = templateSuiviVo;
    }


}
