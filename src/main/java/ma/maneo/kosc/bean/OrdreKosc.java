package ma.maneo.kosc.bean;

import java.util.Objects;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


import javax.persistence.*;


@Entity
@Table(name = "ordre_kosc")
public class OrdreKosc {

    @Id
    @SequenceGenerator(name = "ordre_kosc_seq", sequenceName = "ordre_kosc_seq",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordre_kosc_seq")
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String reference;
    @Column(columnDefinition = "TEXT")
    private String referenceWorkOrder;
    @Column(columnDefinition = "TEXT")
    private String codeDecharge;
    @Column(columnDefinition = "TEXT")
    private String supplierService;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateDebutTraitement;
    @Column(columnDefinition = "TEXT")
    private String endCustumorName;
    @Column(columnDefinition = "TEXT")
    private String endCustumorSiret;
    @Column(columnDefinition = "TEXT")
    private String endCustumorFirstName;
    @Column(columnDefinition = "TEXT")
    private String endCustumorLastName;
    @Column(columnDefinition = "TEXT")
    private String endCustumorZipcode;
    @Column(columnDefinition = "TEXT")
    private String endCustumorStreetName;
    @Column(columnDefinition = "TEXT")
    private String endCustumorStreetNumber;
    @Column(columnDefinition = "TEXT")
    private String endCustumorCity;
    @Column(columnDefinition = "TEXT")
    private String endCustumorBuilding;
    @Column(columnDefinition = "TEXT")
    private String endCustumorStairs;
    @Column(columnDefinition = "TEXT")
    private String endCustumorFloor;
    @Column(columnDefinition = "TEXT")
    private String endCustumorContactFirstName;
    @Column(columnDefinition = "TEXT")
    private String endCustumorContactLastName;
    @Column(columnDefinition = "TEXT")
    private String endCustumorContactPhone;
    @Column(columnDefinition = "TEXT")
    private String endCustumorContactCellPhone;
    @Column(columnDefinition = "TEXT")
    private String endCustumorContactEmail;
    @Column(columnDefinition = "TEXT")
    private String company;
    @Column(columnDefinition = "TEXT")
    private String referenDossier;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date submissionDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date datePremierAppel;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateDeuxiemeAppel;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateTroisiemeAppel;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date datePriseRdv;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateRdv;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateAppelReplanification;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateInterventionTechnique;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateOuverture;
    @Column(columnDefinition = "boolean default false")
    private Boolean envoiMailClient = false;
    @Column(columnDefinition = "boolean default false")
    private Boolean envoiMailKosc = false;
    @Column(columnDefinition = "TEXT")
    private String coordonnePboY;
    @Column(columnDefinition = "TEXT")
    private String hauteurPbo;
    @Column(columnDefinition = "TEXT")
    private String typeMaterielPbo;
    @Column(columnDefinition = "TEXT")
    private String typePbo;
    @Column(columnDefinition = "TEXT")
    private String conditionSyndics;
    @Column(columnDefinition = "TEXT")
    private String typeRacordementPboPto;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String autreInfosPboPto;
    @Column(columnDefinition = "TEXT")
    private String codeAccesImmeuble;
    @Column(columnDefinition = "TEXT")
    private String contacteImmeuble;
    @Column(columnDefinition = "TEXT")
    private String pmaAccessible;
    @Column(columnDefinition = "TEXT")
    private String infoObtentionCle;
    @Column(columnDefinition = "TEXT")
    private String localeIpm;
    @Column(columnDefinition = "TEXT")
    private String contactsSyndic;
    @Column(columnDefinition = "boolean default false")
    private Boolean racordementLong = false;
    @Column(columnDefinition = "TEXT")
    private String oc1;
    @Column(columnDefinition = "TEXT")
    private String nomModulePm1;
    @Column(columnDefinition = "TEXT")
    private String positionModulePm1;
    @Column(columnDefinition = "TEXT")
    private String referenceCableModulePm1;
    @Column(columnDefinition = "TEXT")
    private String referenceTubeModulePm1;
    @Column(columnDefinition = "TEXT")
    private String informationFibreModulePm1;
    @Column(columnDefinition = "TEXT")
    private String referenceCablePbo1;
    @Column(columnDefinition = "TEXT")
    private String informationTubePbo1;
    @Column(columnDefinition = "TEXT")
    private String informationFibrePbo1;
    @Column(columnDefinition = "TEXT")
    private String connecteurPriseNumero1;
    @Column(columnDefinition = "TEXT")
    private String connecteurPriseCouleur1;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String reserve1;
    @Column(columnDefinition = "TEXT")
    private String oc2;
    @Column(columnDefinition = "TEXT")
    private String nomModulePm2;
    @Column(columnDefinition = "TEXT")
    private String positionModulePm2;
    @Column(columnDefinition = "TEXT")
    private String referenceCableModulePm2;
    @Column(columnDefinition = "TEXT")
    private String referenceTubeModulePm2;
    @Column(columnDefinition = "TEXT")
    private String informationFibreModulePm2;
    @Column(columnDefinition = "TEXT")
    private String referenceCablePbo2;
    @Column(columnDefinition = "TEXT")
    private String informationTubePbo2;
    @Column(columnDefinition = "TEXT")
    private String informationFibrePbo2;
    @Column(columnDefinition = "TEXT")
    private String connecteurPriseNumero2;
    @Column(columnDefinition = "TEXT")
    private String connecteurPriseCouleur2;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String reserve2;
    @Column(columnDefinition = "TEXT")
    private String oc3;
    @Column(columnDefinition = "TEXT")
    private String nomModulePm3;
    @Column(columnDefinition = "TEXT")
    private String positionModulePm3;
    @Column(columnDefinition = "TEXT")
    private String referenceCableModulePm3;
    @Column(columnDefinition = "TEXT")
    private String referenceTubeModulePm3;
    @Column(columnDefinition = "TEXT")
    private String informationFibreModulePm3;
    @Column(columnDefinition = "TEXT")
    private String referenceCablePbo3;
    @Column(columnDefinition = "TEXT")
    private String informationTubePbo3;
    @Column(columnDefinition = "TEXT")
    private String informationFibrePbo3;
    @Column(columnDefinition = "TEXT")
    private String connecteurPriseNumero3;
    @Column(columnDefinition = "TEXT")
    private String connecteurPriseCouleur3;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String reserve3;
    @Column(columnDefinition = "TEXT")
    private String oc4;
    @Column(columnDefinition = "TEXT")
    private String nomModulePm4;
    @Column(columnDefinition = "TEXT")
    private String positionModulePm4;
    @Column(columnDefinition = "TEXT")
    private String referenceCableModulePm4;
    @Column(columnDefinition = "TEXT")
    private String referenceTubeModulePm4;
    @Column(columnDefinition = "TEXT")
    private String informationFibreModulePm4;
    @Column(columnDefinition = "TEXT")
    private String referenceCablePbo4;
    @Column(columnDefinition = "TEXT")
    private String informationTubePbo4;
    @Column(columnDefinition = "TEXT")
    private String informationFibrePbo4;
    @Column(columnDefinition = "TEXT")
    private String connecteurPriseNumero4;
    @Column(columnDefinition = "TEXT")
    private String connecteurPriseCouleur4;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String reserve4;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoiCri;
    @Column(columnDefinition = "TEXT")
    private String pboReel;
    @Column(columnDefinition = "TEXT")
    private String numeroSerieOnt;
    @Column(columnDefinition = "TEXT")
    private String workOrderType;
    @Column(columnDefinition = "TEXT")
    private String product;
    @Column(columnDefinition = "TEXT")
    private String provider;
    @Column(columnDefinition = "TEXT")
    private String providerFileType;
    @Column(columnDefinition = "TEXT")
    private String spliter;
    @Column(columnDefinition = "boolean default false")
    private Boolean existingOtp = false;
    @Column(columnDefinition = "TEXT")
    private String profile;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String comment;
    @Column(columnDefinition = "TEXT")
    private String providerSlId;
    @Column(columnDefinition = "TEXT")
    private String referencePrestationPrise;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateInterventionTechniqueDebut;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateInterventionTechniqueFin;
    @Column(columnDefinition = "TEXT")
    private String objetClient;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String corpsClient;
    @Column(columnDefinition = "boolean default false")
    private Boolean envoyeClient = false;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoiClient;
    @Column(columnDefinition = "TEXT")
    private String objetKosc;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String corpsKosc;
    @Column(columnDefinition = "boolean default false")
    private Boolean envoyeKosc = false;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoiKosc;
    @Column(columnDefinition = "TEXT")
    private String objetPlanification;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String corpsPlanification;
    @Column(columnDefinition = "boolean default false")
    private Boolean envoyePlanification = false;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoiPlanification;
    @Column(columnDefinition = "TEXT")
    private String objetReplanification;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String corpsReplanification;
    @Column(columnDefinition = "boolean default false")
    private Boolean envoyeReplanification = false;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoiReplanification;
    @Column(columnDefinition = "TEXT")
    private String objetReport;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String corpsReport;
    @Column(columnDefinition = "boolean default false")
    private Boolean envoyeReport = false;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoiReport;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String commentaireTechnicien;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String commentaireClient;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String commantaireCloture;
    @Column(columnDefinition = "TEXT")
    private String objetCloture;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String corpsCloture;
    @Column(columnDefinition = "boolean default false")
    private Boolean envoyeCloture = false;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoiCloture;
    @Column(columnDefinition = "TEXT")
    private String emailCloturePieceJoints;
    @Column(columnDefinition = "TEXT")
    private String objetSuivi;
    @Column(columnDefinition = "TEXT") // TO DO: change text
    private String corpsSuivi;
    @Column(columnDefinition = "boolean default false")
    private Boolean envoyeSuivi = false;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoiSuivi;

    @ManyToOne
    private Operator operator;
    @ManyToOne
    private Departement departement;
    @ManyToOne
    private Technicien technicien;
    @ManyToOne
    private Client client;
    @ManyToOne
    private TemplateEmailClientInjoinable templateEmailClientInjoinable;
    @ManyToOne
    private TemplateEmailKosc templateEmailKosc;
    @ManyToOne
    private TemplateEmailPlanification templateEmailPlanification;
    @ManyToOne
    private TemplateEmailReplanification templateEmailReplanification;
    @ManyToOne
    private TemplateEmailReport templateEmailReport;
    @ManyToOne
    private EtatDemandeKosc etatDemandeKosc;
    @ManyToOne
    private TemplateEmailCloture templateEmailCloture;
    @ManyToOne
    private TemplateSuivi templateSuivi;


    public OrdreKosc() {
        super();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
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

    public Date getDateDebutTraitement() {
        return this.dateDebutTraitement;
    }

    public void setDateDebutTraitement(Date dateDebutTraitement) {
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

    public Operator getOperator() {
        return this.operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
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

    public Date getSubmissionDate() {
        return this.submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public Date getDatePremierAppel() {
        return this.datePremierAppel;
    }

    public void setDatePremierAppel(Date datePremierAppel) {
        this.datePremierAppel = datePremierAppel;
    }

    public Date getDateDeuxiemeAppel() {
        return this.dateDeuxiemeAppel;
    }

    public void setDateDeuxiemeAppel(Date dateDeuxiemeAppel) {
        this.dateDeuxiemeAppel = dateDeuxiemeAppel;
    }

    public Date getDateTroisiemeAppel() {
        return this.dateTroisiemeAppel;
    }

    public void setDateTroisiemeAppel(Date dateTroisiemeAppel) {
        this.dateTroisiemeAppel = dateTroisiemeAppel;
    }

    public Date getDatePriseRdv() {
        return this.datePriseRdv;
    }

    public void setDatePriseRdv(Date datePriseRdv) {
        this.datePriseRdv = datePriseRdv;
    }

    public Date getDateRdv() {
        return this.dateRdv;
    }

    public void setDateRdv(Date dateRdv) {
        this.dateRdv = dateRdv;
    }

    public Date getDateAppelReplanification() {
        return this.dateAppelReplanification;
    }

    public void setDateAppelReplanification(Date dateAppelReplanification) {
        this.dateAppelReplanification = dateAppelReplanification;
    }

    public Date getDateInterventionTechnique() {
        return this.dateInterventionTechnique;
    }

    public void setDateInterventionTechnique(Date dateInterventionTechnique) {
        this.dateInterventionTechnique = dateInterventionTechnique;
    }

    public Date getDateOuverture() {
        return this.dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
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

    public Departement getDepartement() {
        return this.departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Technicien getTechnicien() {
        return this.technicien;
    }

    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }

    public Date getDateEnvoiCri() {
        return this.dateEnvoiCri;
    }

    public void setDateEnvoiCri(Date dateEnvoiCri) {
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

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateInterventionTechniqueDebut() {
        return this.dateInterventionTechniqueDebut;
    }

    public void setDateInterventionTechniqueDebut(Date dateInterventionTechniqueDebut) {
        this.dateInterventionTechniqueDebut = dateInterventionTechniqueDebut;
    }

    public Date getDateInterventionTechniqueFin() {
        return this.dateInterventionTechniqueFin;
    }

    public void setDateInterventionTechniqueFin(Date dateInterventionTechniqueFin) {
        this.dateInterventionTechniqueFin = dateInterventionTechniqueFin;
    }

    public TemplateEmailClientInjoinable getTemplateEmailClientInjoinable() {
        return this.templateEmailClientInjoinable;
    }

    public void setTemplateEmailClientInjoinable(TemplateEmailClientInjoinable templateEmailClientInjoinable) {
        this.templateEmailClientInjoinable = templateEmailClientInjoinable;
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

    public Date getDateEnvoiClient() {
        return this.dateEnvoiClient;
    }

    public void setDateEnvoiClient(Date dateEnvoiClient) {
        this.dateEnvoiClient = dateEnvoiClient;
    }

    public TemplateEmailKosc getTemplateEmailKosc() {
        return this.templateEmailKosc;
    }

    public void setTemplateEmailKosc(TemplateEmailKosc templateEmailKosc) {
        this.templateEmailKosc = templateEmailKosc;
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

    public Date getDateEnvoiKosc() {
        return this.dateEnvoiKosc;
    }

    public void setDateEnvoiKosc(Date dateEnvoiKosc) {
        this.dateEnvoiKosc = dateEnvoiKosc;
    }

    public TemplateEmailPlanification getTemplateEmailPlanification() {
        return this.templateEmailPlanification;
    }

    public void setTemplateEmailPlanification(TemplateEmailPlanification templateEmailPlanification) {
        this.templateEmailPlanification = templateEmailPlanification;
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

    public Date getDateEnvoiPlanification() {
        return this.dateEnvoiPlanification;
    }

    public void setDateEnvoiPlanification(Date dateEnvoiPlanification) {
        this.dateEnvoiPlanification = dateEnvoiPlanification;
    }

    public TemplateEmailReplanification getTemplateEmailReplanification() {
        return this.templateEmailReplanification;
    }

    public void setTemplateEmailReplanification(TemplateEmailReplanification templateEmailReplanification) {
        this.templateEmailReplanification = templateEmailReplanification;
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

    public Date getDateEnvoiReplanification() {
        return this.dateEnvoiReplanification;
    }

    public void setDateEnvoiReplanification(Date dateEnvoiReplanification) {
        this.dateEnvoiReplanification = dateEnvoiReplanification;
    }

    public TemplateEmailReport getTemplateEmailReport() {
        return this.templateEmailReport;
    }

    public void setTemplateEmailReport(TemplateEmailReport templateEmailReport) {
        this.templateEmailReport = templateEmailReport;
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

    public Date getDateEnvoiReport() {
        return this.dateEnvoiReport;
    }

    public void setDateEnvoiReport(Date dateEnvoiReport) {
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

    public EtatDemandeKosc getEtatDemandeKosc() {
        return this.etatDemandeKosc;
    }

    public void setEtatDemandeKosc(EtatDemandeKosc etatDemandeKosc) {
        this.etatDemandeKosc = etatDemandeKosc;
    }

    public TemplateEmailCloture getTemplateEmailCloture() {
        return this.templateEmailCloture;
    }

    public void setTemplateEmailCloture(TemplateEmailCloture templateEmailCloture) {
        this.templateEmailCloture = templateEmailCloture;
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

    public Date getDateEnvoiCloture() {
        return this.dateEnvoiCloture;
    }

    public void setDateEnvoiCloture(Date dateEnvoiCloture) {
        this.dateEnvoiCloture = dateEnvoiCloture;
    }

    public String getEmailCloturePieceJoints() {
        return this.emailCloturePieceJoints;
    }

    public void setEmailCloturePieceJoints(String emailCloturePieceJoints) {
        this.emailCloturePieceJoints = emailCloturePieceJoints;
    }

    public TemplateSuivi getTemplateSuivi() {
        return this.templateSuivi;
    }

    public void setTemplateSuivi(TemplateSuivi templateSuivi) {
        this.templateSuivi = templateSuivi;
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

    public Date getDateEnvoiSuivi() {
        return this.dateEnvoiSuivi;
    }

    public void setDateEnvoiSuivi(Date dateEnvoiSuivi) {
        this.dateEnvoiSuivi = dateEnvoiSuivi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdreKosc ordreKosc = (OrdreKosc) o;
        return id != null && id.equals(ordreKosc.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

