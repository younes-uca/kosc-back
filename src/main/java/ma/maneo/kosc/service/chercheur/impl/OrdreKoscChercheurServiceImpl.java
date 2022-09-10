package ma.maneo.kosc.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

import ma.maneo.kosc.bean.OrdreKosc;
import ma.maneo.kosc.bean.Operator;
import ma.maneo.kosc.bean.Departement;
import ma.maneo.kosc.bean.Technicien;
import ma.maneo.kosc.bean.Client;
import ma.maneo.kosc.bean.TemplateEmailClientInjoinable;
import ma.maneo.kosc.bean.TemplateEmailKosc;
import ma.maneo.kosc.bean.TemplateEmailPlanification;
import ma.maneo.kosc.bean.TemplateEmailReplanification;
import ma.maneo.kosc.bean.TemplateEmailReport;
import ma.maneo.kosc.bean.EtatDemandeKosc;
import ma.maneo.kosc.bean.TemplateEmailCloture;
import ma.maneo.kosc.bean.TemplateSuivi;
import ma.maneo.kosc.dao.OrdreKoscDao;
import ma.maneo.kosc.service.chercheur.facade.OrdreKoscChercheurService;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailReplanificationChercheurService;
import ma.maneo.kosc.service.chercheur.facade.EtatDemandeKoscChercheurService;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailPlanificationChercheurService;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailClotureChercheurService;
import ma.maneo.kosc.service.chercheur.facade.TemplateSuiviChercheurService;
import ma.maneo.kosc.service.chercheur.facade.OperatorChercheurService;
import ma.maneo.kosc.service.chercheur.facade.DepartementChercheurService;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailKoscChercheurService;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailReportChercheurService;
import ma.maneo.kosc.service.chercheur.facade.ClientChercheurService;
import ma.maneo.kosc.service.chercheur.facade.TechnicienChercheurService;
import ma.maneo.kosc.service.chercheur.facade.TemplateEmailClientInjoinableChercheurService;

import ma.maneo.kosc.ws.rest.provided.vo.OrdreKoscVo;
import ma.maneo.kosc.service.util.*;

import ma.maneo.kosc.service.core.impl.AbstractServiceImpl;

@Service
public class OrdreKoscChercheurServiceImpl extends AbstractServiceImpl<OrdreKosc> implements OrdreKoscChercheurService {

    @Autowired
    private OrdreKoscDao ordreKoscDao;

    @Autowired
    private TemplateEmailReplanificationChercheurService templateEmailReplanificationService;
    @Autowired
    private EtatDemandeKoscChercheurService etatDemandeKoscService;
    @Autowired
    private TemplateEmailPlanificationChercheurService templateEmailPlanificationService;
    @Autowired
    private TemplateEmailClotureChercheurService templateEmailClotureService;
    @Autowired
    private TemplateSuiviChercheurService templateSuiviService;
    @Autowired
    private OperatorChercheurService operatorService;
    @Autowired
    private DepartementChercheurService departementService;
    @Autowired
    private TemplateEmailKoscChercheurService templateEmailKoscService;
    @Autowired
    private TemplateEmailReportChercheurService templateEmailReportService;
    @Autowired
    private ClientChercheurService clientService;
    @Autowired
    private TechnicienChercheurService technicienService;
    @Autowired
    private TemplateEmailClientInjoinableChercheurService templateEmailClientInjoinableService;


    @Autowired
    private EntityManager entityManager;


    @Override
    public List<OrdreKosc> findAll() {
        return ordreKoscDao.findAll();
    }

    @Override
    public List<OrdreKosc> findByOperatorReference(String reference) {
        return ordreKoscDao.findByOperatorReference(reference);
    }

    @Override
    @Transactional
    public int deleteByOperatorReference(String reference) {
        return ordreKoscDao.deleteByOperatorReference(reference);
    }

    @Override
    public List<OrdreKosc> findByOperatorId(Long id) {
        return ordreKoscDao.findByOperatorId(id);
    }

    @Override
    @Transactional
    public int deleteByOperatorId(Long id) {
        return ordreKoscDao.deleteByOperatorId(id);
    }


    @Override
    public List<OrdreKosc> findByDepartementCode(String code) {
        return ordreKoscDao.findByDepartementCode(code);
    }

    @Override
    @Transactional
    public int deleteByDepartementCode(String code) {
        return ordreKoscDao.deleteByDepartementCode(code);
    }

    @Override
    public List<OrdreKosc> findByDepartementId(Long id) {
        return ordreKoscDao.findByDepartementId(id);
    }

    @Override
    @Transactional
    public int deleteByDepartementId(Long id) {
        return ordreKoscDao.deleteByDepartementId(id);
    }


    @Override
    public List<OrdreKosc> findByTechnicienIdentifiant(String identifiant) {
        return ordreKoscDao.findByTechnicienIdentifiant(identifiant);
    }

    @Override
    @Transactional
    public int deleteByTechnicienIdentifiant(String identifiant) {
        return ordreKoscDao.deleteByTechnicienIdentifiant(identifiant);
    }

    @Override
    public List<OrdreKosc> findByTechnicienId(Long id) {
        return ordreKoscDao.findByTechnicienId(id);
    }

    @Override
    @Transactional
    public int deleteByTechnicienId(Long id) {
        return ordreKoscDao.deleteByTechnicienId(id);
    }

    @Override
    public List<OrdreKosc> findByClientId(Long id) {
        return ordreKoscDao.findByClientId(id);
    }

    @Override
    @Transactional
    public int deleteByClientId(Long id) {
        return ordreKoscDao.deleteByClientId(id);
    }


    @Override
    public List<OrdreKosc> findByTemplateEmailClientInjoinableCode(String code) {
        return ordreKoscDao.findByTemplateEmailClientInjoinableCode(code);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailClientInjoinableCode(String code) {
        return ordreKoscDao.deleteByTemplateEmailClientInjoinableCode(code);
    }

    @Override
    public List<OrdreKosc> findByTemplateEmailClientInjoinableId(Long id) {
        return ordreKoscDao.findByTemplateEmailClientInjoinableId(id);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailClientInjoinableId(Long id) {
        return ordreKoscDao.deleteByTemplateEmailClientInjoinableId(id);
    }


    @Override
    public List<OrdreKosc> findByTemplateEmailKoscCode(String code) {
        return ordreKoscDao.findByTemplateEmailKoscCode(code);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailKoscCode(String code) {
        return ordreKoscDao.deleteByTemplateEmailKoscCode(code);
    }

    @Override
    public List<OrdreKosc> findByTemplateEmailKoscId(Long id) {
        return ordreKoscDao.findByTemplateEmailKoscId(id);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailKoscId(Long id) {
        return ordreKoscDao.deleteByTemplateEmailKoscId(id);
    }


    @Override
    public List<OrdreKosc> findByTemplateEmailPlanificationCode(String code) {
        return ordreKoscDao.findByTemplateEmailPlanificationCode(code);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailPlanificationCode(String code) {
        return ordreKoscDao.deleteByTemplateEmailPlanificationCode(code);
    }

    @Override
    public List<OrdreKosc> findByTemplateEmailPlanificationId(Long id) {
        return ordreKoscDao.findByTemplateEmailPlanificationId(id);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailPlanificationId(Long id) {
        return ordreKoscDao.deleteByTemplateEmailPlanificationId(id);
    }


    @Override
    public List<OrdreKosc> findByTemplateEmailReplanificationCode(String code) {
        return ordreKoscDao.findByTemplateEmailReplanificationCode(code);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailReplanificationCode(String code) {
        return ordreKoscDao.deleteByTemplateEmailReplanificationCode(code);
    }

    @Override
    public List<OrdreKosc> findByTemplateEmailReplanificationId(Long id) {
        return ordreKoscDao.findByTemplateEmailReplanificationId(id);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailReplanificationId(Long id) {
        return ordreKoscDao.deleteByTemplateEmailReplanificationId(id);
    }


    @Override
    public List<OrdreKosc> findByTemplateEmailReportCode(String code) {
        return ordreKoscDao.findByTemplateEmailReportCode(code);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailReportCode(String code) {
        return ordreKoscDao.deleteByTemplateEmailReportCode(code);
    }

    @Override
    public List<OrdreKosc> findByTemplateEmailReportId(Long id) {
        return ordreKoscDao.findByTemplateEmailReportId(id);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailReportId(Long id) {
        return ordreKoscDao.deleteByTemplateEmailReportId(id);
    }


    @Override
    public List<OrdreKosc> findByEtatDemandeKoscCode(String code) {
        return ordreKoscDao.findByEtatDemandeKoscCode(code);
    }

    @Override
    @Transactional
    public int deleteByEtatDemandeKoscCode(String code) {
        return ordreKoscDao.deleteByEtatDemandeKoscCode(code);
    }

    @Override
    public List<OrdreKosc> findByEtatDemandeKoscId(Long id) {
        return ordreKoscDao.findByEtatDemandeKoscId(id);
    }

    @Override
    @Transactional
    public int deleteByEtatDemandeKoscId(Long id) {
        return ordreKoscDao.deleteByEtatDemandeKoscId(id);
    }


    @Override
    public List<OrdreKosc> findByTemplateEmailClotureCode(String code) {
        return ordreKoscDao.findByTemplateEmailClotureCode(code);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailClotureCode(String code) {
        return ordreKoscDao.deleteByTemplateEmailClotureCode(code);
    }

    @Override
    public List<OrdreKosc> findByTemplateEmailClotureId(Long id) {
        return ordreKoscDao.findByTemplateEmailClotureId(id);
    }

    @Override
    @Transactional
    public int deleteByTemplateEmailClotureId(Long id) {
        return ordreKoscDao.deleteByTemplateEmailClotureId(id);
    }


    @Override
    public List<OrdreKosc> findByTemplateSuiviCode(String code) {
        return ordreKoscDao.findByTemplateSuiviCode(code);
    }

    @Override
    @Transactional
    public int deleteByTemplateSuiviCode(String code) {
        return ordreKoscDao.deleteByTemplateSuiviCode(code);
    }

    @Override
    public List<OrdreKosc> findByTemplateSuiviId(Long id) {
        return ordreKoscDao.findByTemplateSuiviId(id);
    }

    @Override
    @Transactional
    public int deleteByTemplateSuiviId(Long id) {
        return ordreKoscDao.deleteByTemplateSuiviId(id);
    }

    @Override
    public OrdreKosc findByReferenceWorkOrder(String referenceWorkOrder) {
        if (referenceWorkOrder == null) return null;
        return ordreKoscDao.findByReferenceWorkOrder(referenceWorkOrder);
    }

    @Override
    @Transactional
    public int deleteByReferenceWorkOrder(String referenceWorkOrder) {
        return ordreKoscDao.deleteByReferenceWorkOrder(referenceWorkOrder);
    }

    @Override
    public OrdreKosc findByIdOrReferenceWorkOrder(OrdreKosc ordreKosc) {
        OrdreKosc resultat = null;
        if (ordreKosc != null) {
            if (StringUtil.isNotEmpty(ordreKosc.getId())) {
                resultat = ordreKoscDao.getOne(ordreKosc.getId());
            } else if (StringUtil.isNotEmpty(ordreKosc.getReferenceWorkOrder())) {
                resultat = ordreKoscDao.findByReferenceWorkOrder(ordreKosc.getReferenceWorkOrder());
            }
        }
        return resultat;
    }

    @Override
    public OrdreKosc findById(Long id) {
        if (id == null) return null;
        return ordreKoscDao.getOne(id);
    }

    @Override
    public OrdreKosc findByIdWithAssociatedList(Long id) {
        return findById(id);
    }


    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (ordreKoscDao.findById(id).isPresent()) {
            ordreKoscDao.deleteById(id);
            res = 1;
        }
        return res;
    }


    @Override
    public OrdreKosc update(OrdreKosc ordreKosc) {
        OrdreKosc foundedOrdreKosc = findById(ordreKosc.getId());
        if (foundedOrdreKosc == null) return null;
        else {
            return ordreKoscDao.save(ordreKosc);
        }
    }

    private void prepareSave(OrdreKosc ordreKosc) {
        if (ordreKosc.getEnvoiMailClient() == null)
            ordreKosc.setEnvoiMailClient(false);
        if (ordreKosc.getEnvoiMailKosc() == null)
            ordreKosc.setEnvoiMailKosc(false);
        if (ordreKosc.getRacordementLong() == null)
            ordreKosc.setRacordementLong(false);
        if (ordreKosc.getExistingOtp() == null)
            ordreKosc.setExistingOtp(false);
        if (ordreKosc.getEnvoyeClient() == null)
            ordreKosc.setEnvoyeClient(false);
        if (ordreKosc.getEnvoyeKosc() == null)
            ordreKosc.setEnvoyeKosc(false);
        if (ordreKosc.getEnvoyePlanification() == null)
            ordreKosc.setEnvoyePlanification(false);
        if (ordreKosc.getEnvoyeReplanification() == null)
            ordreKosc.setEnvoyeReplanification(false);
        if (ordreKosc.getEnvoyeReport() == null)
            ordreKosc.setEnvoyeReport(false);
        if (ordreKosc.getEnvoyeCloture() == null)
            ordreKosc.setEnvoyeCloture(false);
        if (ordreKosc.getEnvoyeSuivi() == null)
            ordreKosc.setEnvoyeSuivi(false);


    }

    @Override
    public OrdreKosc save(OrdreKosc ordreKosc) {
        prepareSave(ordreKosc);

        OrdreKosc result = null;
        OrdreKosc foundedOrdreKosc = findByReferenceWorkOrder(ordreKosc.getReferenceWorkOrder());
        if (foundedOrdreKosc == null) {


            findOperator(ordreKosc);
            findDepartement(ordreKosc);
            findTechnicien(ordreKosc);
            findClient(ordreKosc);
            findTemplateEmailClientInjoinable(ordreKosc);
            findTemplateEmailKosc(ordreKosc);
            findTemplateEmailPlanification(ordreKosc);
            findTemplateEmailReplanification(ordreKosc);
            findTemplateEmailReport(ordreKosc);
            findEtatDemandeKosc(ordreKosc);
            findTemplateEmailCloture(ordreKosc);
            findTemplateSuivi(ordreKosc);

            OrdreKosc savedOrdreKosc = ordreKoscDao.save(ordreKosc);

            result = savedOrdreKosc;
        }

        return result;
    }

    @Override
    public List<OrdreKosc> save(List<OrdreKosc> ordreKoscs) {
        List<OrdreKosc> list = new ArrayList<>();
        for (OrdreKosc ordreKosc : ordreKoscs) {
            list.add(save(ordreKosc));
        }
        return list;
    }


    @Override
    @Transactional
    public int delete(OrdreKosc ordreKosc) {
        if (ordreKosc.getReferenceWorkOrder() == null) return -1;

        OrdreKosc foundedOrdreKosc = findByReferenceWorkOrder(ordreKosc.getReferenceWorkOrder());
        if (foundedOrdreKosc == null) return -1;
        ordreKoscDao.delete(foundedOrdreKosc);
        return 1;
    }


    public List<OrdreKosc> findByCriteria(OrdreKoscVo ordreKoscVo) {

        String query = "SELECT o FROM OrdreKosc o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", ordreKoscVo.getId());
        query += SearchUtil.addConstraint("o", "reference", "LIKE", ordreKoscVo.getReference());
        query += SearchUtil.addConstraint("o", "referenceWorkOrder", "LIKE", ordreKoscVo.getReferenceWorkOrder());
        query += SearchUtil.addConstraint("o", "codeDecharge", "LIKE", ordreKoscVo.getCodeDecharge());
        query += SearchUtil.addConstraint("o", "supplierService", "LIKE", ordreKoscVo.getSupplierService());
        query += SearchUtil.addConstraintDate("o", "dateDebutTraitement", "=", ordreKoscVo.getDateDebutTraitement());
        query += SearchUtil.addConstraint("o", "endCustumorName", "LIKE", ordreKoscVo.getEndCustumorName());
        query += SearchUtil.addConstraint("o", "endCustumorSiret", "LIKE", ordreKoscVo.getEndCustumorSiret());
        query += SearchUtil.addConstraint("o", "endCustumorFirstName", "LIKE", ordreKoscVo.getEndCustumorFirstName());
        query += SearchUtil.addConstraint("o", "endCustumorLastName", "LIKE", ordreKoscVo.getEndCustumorLastName());
        query += SearchUtil.addConstraint("o", "endCustumorZipcode", "LIKE", ordreKoscVo.getEndCustumorZipcode());
        query += SearchUtil.addConstraint("o", "endCustumorStreetName", "LIKE", ordreKoscVo.getEndCustumorStreetName());
        query += SearchUtil.addConstraint("o", "endCustumorStreetNumber", "LIKE", ordreKoscVo.getEndCustumorStreetNumber());
        query += SearchUtil.addConstraint("o", "endCustumorCity", "LIKE", ordreKoscVo.getEndCustumorCity());
        query += SearchUtil.addConstraint("o", "endCustumorBuilding", "LIKE", ordreKoscVo.getEndCustumorBuilding());
        query += SearchUtil.addConstraint("o", "endCustumorStairs", "LIKE", ordreKoscVo.getEndCustumorStairs());
        query += SearchUtil.addConstraint("o", "endCustumorFloor", "LIKE", ordreKoscVo.getEndCustumorFloor());
        query += SearchUtil.addConstraint("o", "endCustumorContactFirstName", "LIKE", ordreKoscVo.getEndCustumorContactFirstName());
        query += SearchUtil.addConstraint("o", "endCustumorContactLastName", "LIKE", ordreKoscVo.getEndCustumorContactLastName());
        query += SearchUtil.addConstraint("o", "endCustumorContactPhone", "LIKE", ordreKoscVo.getEndCustumorContactPhone());
        query += SearchUtil.addConstraint("o", "endCustumorContactCellPhone", "LIKE", ordreKoscVo.getEndCustumorContactCellPhone());
        query += SearchUtil.addConstraint("o", "endCustumorContactEmail", "LIKE", ordreKoscVo.getEndCustumorContactEmail());
        query += SearchUtil.addConstraint("o", "company", "LIKE", ordreKoscVo.getCompany());
        query += SearchUtil.addConstraint("o", "referenDossier", "LIKE", ordreKoscVo.getReferenDossier());
        query += SearchUtil.addConstraintDate("o", "submissionDate", "=", ordreKoscVo.getSubmissionDate());
        query += SearchUtil.addConstraintDate("o", "datePremierAppel", "=", ordreKoscVo.getDatePremierAppel());
        query += SearchUtil.addConstraintDate("o", "dateDeuxiemeAppel", "=", ordreKoscVo.getDateDeuxiemeAppel());
        query += SearchUtil.addConstraintDate("o", "dateTroisiemeAppel", "=", ordreKoscVo.getDateTroisiemeAppel());
        query += SearchUtil.addConstraintDate("o", "datePriseRdv", "=", ordreKoscVo.getDatePriseRdv());
        query += SearchUtil.addConstraintDate("o", "dateRdv", "=", ordreKoscVo.getDateRdv());
        query += SearchUtil.addConstraintDate("o", "dateAppelReplanification", "=", ordreKoscVo.getDateAppelReplanification());
        query += SearchUtil.addConstraintDate("o", "dateInterventionTechnique", "=", ordreKoscVo.getDateInterventionTechnique());
        query += SearchUtil.addConstraintDate("o", "dateOuverture", "=", ordreKoscVo.getDateOuverture());
        query += SearchUtil.addConstraint("o", "envoiMailClient", "=", ordreKoscVo.getEnvoiMailClient());
        query += SearchUtil.addConstraint("o", "envoiMailKosc", "=", ordreKoscVo.getEnvoiMailKosc());
        query += SearchUtil.addConstraint("o", "coordonnePboY", "LIKE", ordreKoscVo.getCoordonnePboY());
        query += SearchUtil.addConstraint("o", "hauteurPbo", "LIKE", ordreKoscVo.getHauteurPbo());
        query += SearchUtil.addConstraint("o", "typeMaterielPbo", "LIKE", ordreKoscVo.getTypeMaterielPbo());
        query += SearchUtil.addConstraint("o", "typePbo", "LIKE", ordreKoscVo.getTypePbo());
        query += SearchUtil.addConstraint("o", "conditionSyndics", "LIKE", ordreKoscVo.getConditionSyndics());
        query += SearchUtil.addConstraint("o", "typeRacordementPboPto", "LIKE", ordreKoscVo.getTypeRacordementPboPto());
        query += SearchUtil.addConstraint("o", "autreInfosPboPto", "LIKE", ordreKoscVo.getAutreInfosPboPto());
        query += SearchUtil.addConstraint("o", "codeAccesImmeuble", "LIKE", ordreKoscVo.getCodeAccesImmeuble());
        query += SearchUtil.addConstraint("o", "contacteImmeuble", "LIKE", ordreKoscVo.getContacteImmeuble());
        query += SearchUtil.addConstraint("o", "pmaAccessible", "LIKE", ordreKoscVo.getPmaAccessible());
        query += SearchUtil.addConstraint("o", "infoObtentionCle", "LIKE", ordreKoscVo.getInfoObtentionCle());
        query += SearchUtil.addConstraint("o", "localeIpm", "LIKE", ordreKoscVo.getLocaleIpm());
        query += SearchUtil.addConstraint("o", "contactsSyndic", "LIKE", ordreKoscVo.getContactsSyndic());
        query += SearchUtil.addConstraint("o", "racordementLong", "=", ordreKoscVo.getRacordementLong());
        query += SearchUtil.addConstraint("o", "oc1", "LIKE", ordreKoscVo.getOc1());
        query += SearchUtil.addConstraint("o", "nomModulePm1", "LIKE", ordreKoscVo.getNomModulePm1());
        query += SearchUtil.addConstraint("o", "positionModulePm1", "LIKE", ordreKoscVo.getPositionModulePm1());
        query += SearchUtil.addConstraint("o", "referenceCableModulePm1", "LIKE", ordreKoscVo.getReferenceCableModulePm1());
        query += SearchUtil.addConstraint("o", "referenceTubeModulePm1", "LIKE", ordreKoscVo.getReferenceTubeModulePm1());
        query += SearchUtil.addConstraint("o", "informationFibreModulePm1", "LIKE", ordreKoscVo.getInformationFibreModulePm1());
        query += SearchUtil.addConstraint("o", "referenceCablePbo1", "LIKE", ordreKoscVo.getReferenceCablePbo1());
        query += SearchUtil.addConstraint("o", "informationTubePbo1", "LIKE", ordreKoscVo.getInformationTubePbo1());
        query += SearchUtil.addConstraint("o", "informationFibrePbo1", "LIKE", ordreKoscVo.getInformationFibrePbo1());
        query += SearchUtil.addConstraint("o", "connecteurPriseNumero1", "LIKE", ordreKoscVo.getConnecteurPriseNumero1());
        query += SearchUtil.addConstraint("o", "connecteurPriseCouleur1", "LIKE", ordreKoscVo.getConnecteurPriseCouleur1());
        query += SearchUtil.addConstraint("o", "reserve1", "LIKE", ordreKoscVo.getReserve1());
        query += SearchUtil.addConstraint("o", "oc2", "LIKE", ordreKoscVo.getOc2());
        query += SearchUtil.addConstraint("o", "nomModulePm2", "LIKE", ordreKoscVo.getNomModulePm2());
        query += SearchUtil.addConstraint("o", "positionModulePm2", "LIKE", ordreKoscVo.getPositionModulePm2());
        query += SearchUtil.addConstraint("o", "referenceCableModulePm2", "LIKE", ordreKoscVo.getReferenceCableModulePm2());
        query += SearchUtil.addConstraint("o", "referenceTubeModulePm2", "LIKE", ordreKoscVo.getReferenceTubeModulePm2());
        query += SearchUtil.addConstraint("o", "informationFibreModulePm2", "LIKE", ordreKoscVo.getInformationFibreModulePm2());
        query += SearchUtil.addConstraint("o", "referenceCablePbo2", "LIKE", ordreKoscVo.getReferenceCablePbo2());
        query += SearchUtil.addConstraint("o", "informationTubePbo2", "LIKE", ordreKoscVo.getInformationTubePbo2());
        query += SearchUtil.addConstraint("o", "informationFibrePbo2", "LIKE", ordreKoscVo.getInformationFibrePbo2());
        query += SearchUtil.addConstraint("o", "connecteurPriseNumero2", "LIKE", ordreKoscVo.getConnecteurPriseNumero2());
        query += SearchUtil.addConstraint("o", "connecteurPriseCouleur2", "LIKE", ordreKoscVo.getConnecteurPriseCouleur2());
        query += SearchUtil.addConstraint("o", "reserve2", "LIKE", ordreKoscVo.getReserve2());
        query += SearchUtil.addConstraint("o", "oc3", "LIKE", ordreKoscVo.getOc3());
        query += SearchUtil.addConstraint("o", "nomModulePm3", "LIKE", ordreKoscVo.getNomModulePm3());
        query += SearchUtil.addConstraint("o", "positionModulePm3", "LIKE", ordreKoscVo.getPositionModulePm3());
        query += SearchUtil.addConstraint("o", "referenceCableModulePm3", "LIKE", ordreKoscVo.getReferenceCableModulePm3());
        query += SearchUtil.addConstraint("o", "referenceTubeModulePm3", "LIKE", ordreKoscVo.getReferenceTubeModulePm3());
        query += SearchUtil.addConstraint("o", "informationFibreModulePm3", "LIKE", ordreKoscVo.getInformationFibreModulePm3());
        query += SearchUtil.addConstraint("o", "referenceCablePbo3", "LIKE", ordreKoscVo.getReferenceCablePbo3());
        query += SearchUtil.addConstraint("o", "informationTubePbo3", "LIKE", ordreKoscVo.getInformationTubePbo3());
        query += SearchUtil.addConstraint("o", "informationFibrePbo3", "LIKE", ordreKoscVo.getInformationFibrePbo3());
        query += SearchUtil.addConstraint("o", "connecteurPriseNumero3", "LIKE", ordreKoscVo.getConnecteurPriseNumero3());
        query += SearchUtil.addConstraint("o", "connecteurPriseCouleur3", "LIKE", ordreKoscVo.getConnecteurPriseCouleur3());
        query += SearchUtil.addConstraint("o", "reserve3", "LIKE", ordreKoscVo.getReserve3());
        query += SearchUtil.addConstraint("o", "oc4", "LIKE", ordreKoscVo.getOc4());
        query += SearchUtil.addConstraint("o", "nomModulePm4", "LIKE", ordreKoscVo.getNomModulePm4());
        query += SearchUtil.addConstraint("o", "positionModulePm4", "LIKE", ordreKoscVo.getPositionModulePm4());
        query += SearchUtil.addConstraint("o", "referenceCableModulePm4", "LIKE", ordreKoscVo.getReferenceCableModulePm4());
        query += SearchUtil.addConstraint("o", "referenceTubeModulePm4", "LIKE", ordreKoscVo.getReferenceTubeModulePm4());
        query += SearchUtil.addConstraint("o", "informationFibreModulePm4", "LIKE", ordreKoscVo.getInformationFibreModulePm4());
        query += SearchUtil.addConstraint("o", "referenceCablePbo4", "LIKE", ordreKoscVo.getReferenceCablePbo4());
        query += SearchUtil.addConstraint("o", "informationTubePbo4", "LIKE", ordreKoscVo.getInformationTubePbo4());
        query += SearchUtil.addConstraint("o", "informationFibrePbo4", "LIKE", ordreKoscVo.getInformationFibrePbo4());
        query += SearchUtil.addConstraint("o", "connecteurPriseNumero4", "LIKE", ordreKoscVo.getConnecteurPriseNumero4());
        query += SearchUtil.addConstraint("o", "connecteurPriseCouleur4", "LIKE", ordreKoscVo.getConnecteurPriseCouleur4());
        query += SearchUtil.addConstraint("o", "reserve4", "LIKE", ordreKoscVo.getReserve4());
        query += SearchUtil.addConstraintDate("o", "dateEnvoiCri", "=", ordreKoscVo.getDateEnvoiCri());
        query += SearchUtil.addConstraint("o", "pboReel", "LIKE", ordreKoscVo.getPboReel());
        query += SearchUtil.addConstraint("o", "numeroSerieOnt", "LIKE", ordreKoscVo.getNumeroSerieOnt());
        query += SearchUtil.addConstraint("o", "workOrderType", "LIKE", ordreKoscVo.getWorkOrderType());
        query += SearchUtil.addConstraint("o", "product", "LIKE", ordreKoscVo.getProduct());
        query += SearchUtil.addConstraint("o", "provider", "LIKE", ordreKoscVo.getProvider());
        query += SearchUtil.addConstraint("o", "providerFileType", "LIKE", ordreKoscVo.getProviderFileType());
        query += SearchUtil.addConstraint("o", "spliter", "LIKE", ordreKoscVo.getSpliter());
        query += SearchUtil.addConstraint("o", "existingOtp", "=", ordreKoscVo.getExistingOtp());
        query += SearchUtil.addConstraint("o", "profile", "LIKE", ordreKoscVo.getProfile());
        query += SearchUtil.addConstraint("o", "comment", "LIKE", ordreKoscVo.getComment());
        query += SearchUtil.addConstraint("o", "providerSlId", "LIKE", ordreKoscVo.getProviderSlId());
        query += SearchUtil.addConstraint("o", "referencePrestationPrise", "LIKE", ordreKoscVo.getReferencePrestationPrise());
        query += SearchUtil.addConstraintDate("o", "dateInterventionTechniqueDebut", "=", ordreKoscVo.getDateInterventionTechniqueDebut());
        query += SearchUtil.addConstraintDate("o", "dateInterventionTechniqueFin", "=", ordreKoscVo.getDateInterventionTechniqueFin());
        query += SearchUtil.addConstraint("o", "objetClient", "LIKE", ordreKoscVo.getObjetClient());
        query += SearchUtil.addConstraint("o", "corpsClient", "LIKE", ordreKoscVo.getCorpsClient());
        query += SearchUtil.addConstraint("o", "envoyeClient", "=", ordreKoscVo.getEnvoyeClient());
        query += SearchUtil.addConstraintDate("o", "dateEnvoiClient", "=", ordreKoscVo.getDateEnvoiClient());
        query += SearchUtil.addConstraint("o", "objetKosc", "LIKE", ordreKoscVo.getObjetKosc());
        query += SearchUtil.addConstraint("o", "corpsKosc", "LIKE", ordreKoscVo.getCorpsKosc());
        query += SearchUtil.addConstraint("o", "envoyeKosc", "=", ordreKoscVo.getEnvoyeKosc());
        query += SearchUtil.addConstraintDate("o", "dateEnvoiKosc", "=", ordreKoscVo.getDateEnvoiKosc());
        query += SearchUtil.addConstraint("o", "objetPlanification", "LIKE", ordreKoscVo.getObjetPlanification());
        query += SearchUtil.addConstraint("o", "corpsPlanification", "LIKE", ordreKoscVo.getCorpsPlanification());
        query += SearchUtil.addConstraint("o", "envoyePlanification", "=", ordreKoscVo.getEnvoyePlanification());
        query += SearchUtil.addConstraintDate("o", "dateEnvoiPlanification", "=", ordreKoscVo.getDateEnvoiPlanification());
        query += SearchUtil.addConstraint("o", "objetReplanification", "LIKE", ordreKoscVo.getObjetReplanification());
        query += SearchUtil.addConstraint("o", "corpsReplanification", "LIKE", ordreKoscVo.getCorpsReplanification());
        query += SearchUtil.addConstraint("o", "envoyeReplanification", "=", ordreKoscVo.getEnvoyeReplanification());
        query += SearchUtil.addConstraintDate("o", "dateEnvoiReplanification", "=", ordreKoscVo.getDateEnvoiReplanification());
        query += SearchUtil.addConstraint("o", "objetReport", "LIKE", ordreKoscVo.getObjetReport());
        query += SearchUtil.addConstraint("o", "corpsReport", "LIKE", ordreKoscVo.getCorpsReport());
        query += SearchUtil.addConstraint("o", "envoyeReport", "=", ordreKoscVo.getEnvoyeReport());
        query += SearchUtil.addConstraintDate("o", "dateEnvoiReport", "=", ordreKoscVo.getDateEnvoiReport());
        query += SearchUtil.addConstraint("o", "commentaireTechnicien", "LIKE", ordreKoscVo.getCommentaireTechnicien());
        query += SearchUtil.addConstraint("o", "commentaireClient", "LIKE", ordreKoscVo.getCommentaireClient());
        query += SearchUtil.addConstraint("o", "commantaireCloture", "LIKE", ordreKoscVo.getCommantaireCloture());
        query += SearchUtil.addConstraint("o", "objetCloture", "LIKE", ordreKoscVo.getObjetCloture());
        query += SearchUtil.addConstraint("o", "corpsCloture", "LIKE", ordreKoscVo.getCorpsCloture());
        query += SearchUtil.addConstraint("o", "envoyeCloture", "=", ordreKoscVo.getEnvoyeCloture());
        query += SearchUtil.addConstraintDate("o", "dateEnvoiCloture", "=", ordreKoscVo.getDateEnvoiCloture());
        query += SearchUtil.addConstraint("o", "emailCloturePieceJoints", "LIKE", ordreKoscVo.getEmailCloturePieceJoints());
        query += SearchUtil.addConstraint("o", "objetSuivi", "LIKE", ordreKoscVo.getObjetSuivi());
        query += SearchUtil.addConstraint("o", "corpsSuivi", "LIKE", ordreKoscVo.getCorpsSuivi());
        query += SearchUtil.addConstraint("o", "envoyeSuivi", "=", ordreKoscVo.getEnvoyeSuivi());
        query += SearchUtil.addConstraintDate("o", "dateEnvoiSuivi", "=", ordreKoscVo.getDateEnvoiSuivi());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateDebutTraitement", ordreKoscVo.getDateDebutTraitementMin(), ordreKoscVo.getDateDebutTraitementMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "submissionDate", ordreKoscVo.getSubmissionDateMin(), ordreKoscVo.getSubmissionDateMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "datePremierAppel", ordreKoscVo.getDatePremierAppelMin(), ordreKoscVo.getDatePremierAppelMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateDeuxiemeAppel", ordreKoscVo.getDateDeuxiemeAppelMin(), ordreKoscVo.getDateDeuxiemeAppelMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateTroisiemeAppel", ordreKoscVo.getDateTroisiemeAppelMin(), ordreKoscVo.getDateTroisiemeAppelMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "datePriseRdv", ordreKoscVo.getDatePriseRdvMin(), ordreKoscVo.getDatePriseRdvMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateRdv", ordreKoscVo.getDateRdvMin(), ordreKoscVo.getDateRdvMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateAppelReplanification", ordreKoscVo.getDateAppelReplanificationMin(), ordreKoscVo.getDateAppelReplanificationMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateInterventionTechnique", ordreKoscVo.getDateInterventionTechniqueMin(), ordreKoscVo.getDateInterventionTechniqueMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateOuverture", ordreKoscVo.getDateOuvertureMin(), ordreKoscVo.getDateOuvertureMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateEnvoiCri", ordreKoscVo.getDateEnvoiCriMin(), ordreKoscVo.getDateEnvoiCriMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateInterventionTechniqueDebut", ordreKoscVo.getDateInterventionTechniqueDebutMin(), ordreKoscVo.getDateInterventionTechniqueDebutMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateInterventionTechniqueFin", ordreKoscVo.getDateInterventionTechniqueFinMin(), ordreKoscVo.getDateInterventionTechniqueFinMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateEnvoiClient", ordreKoscVo.getDateEnvoiClientMin(), ordreKoscVo.getDateEnvoiClientMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateEnvoiKosc", ordreKoscVo.getDateEnvoiKoscMin(), ordreKoscVo.getDateEnvoiKoscMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateEnvoiPlanification", ordreKoscVo.getDateEnvoiPlanificationMin(), ordreKoscVo.getDateEnvoiPlanificationMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateEnvoiReplanification", ordreKoscVo.getDateEnvoiReplanificationMin(), ordreKoscVo.getDateEnvoiReplanificationMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateEnvoiReport", ordreKoscVo.getDateEnvoiReportMin(), ordreKoscVo.getDateEnvoiReportMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateEnvoiCloture", ordreKoscVo.getDateEnvoiClotureMin(), ordreKoscVo.getDateEnvoiClotureMax());
        query += SearchUtil.addConstraintMinMaxDate("o", "dateEnvoiSuivi", ordreKoscVo.getDateEnvoiSuiviMin(), ordreKoscVo.getDateEnvoiSuiviMax());
        if (ordreKoscVo.getOperatorVo() != null) {
            query += SearchUtil.addConstraint("o", "operator.id", "=", ordreKoscVo.getOperatorVo().getId());
            query += SearchUtil.addConstraint("o", "operator.reference", "LIKE", ordreKoscVo.getOperatorVo().getReference());
        }

        if (ordreKoscVo.getDepartementVo() != null) {
            query += SearchUtil.addConstraint("o", "departement.id", "=", ordreKoscVo.getDepartementVo().getId());
            query += SearchUtil.addConstraint("o", "departement.code", "LIKE", ordreKoscVo.getDepartementVo().getCode());
        }

        if (ordreKoscVo.getTechnicienVo() != null) {
            query += SearchUtil.addConstraint("o", "technicien.id", "=", ordreKoscVo.getTechnicienVo().getId());
            query += SearchUtil.addConstraint("o", "technicien.identifiant", "LIKE", ordreKoscVo.getTechnicienVo().getIdentifiant());
        }

        if (ordreKoscVo.getClientVo() != null) {
            query += SearchUtil.addConstraint("o", "client.id", "=", ordreKoscVo.getClientVo().getId());
        }

        if (ordreKoscVo.getTemplateEmailClientInjoinableVo() != null) {
            query += SearchUtil.addConstraint("o", "templateEmailClientInjoinable.id", "=", ordreKoscVo.getTemplateEmailClientInjoinableVo().getId());
            query += SearchUtil.addConstraint("o", "templateEmailClientInjoinable.code", "LIKE", ordreKoscVo.getTemplateEmailClientInjoinableVo().getCode());
        }

        if (ordreKoscVo.getTemplateEmailKoscVo() != null) {
            query += SearchUtil.addConstraint("o", "templateEmailKosc.id", "=", ordreKoscVo.getTemplateEmailKoscVo().getId());
            query += SearchUtil.addConstraint("o", "templateEmailKosc.code", "LIKE", ordreKoscVo.getTemplateEmailKoscVo().getCode());
        }

        if (ordreKoscVo.getTemplateEmailPlanificationVo() != null) {
            query += SearchUtil.addConstraint("o", "templateEmailPlanification.id", "=", ordreKoscVo.getTemplateEmailPlanificationVo().getId());
            query += SearchUtil.addConstraint("o", "templateEmailPlanification.code", "LIKE", ordreKoscVo.getTemplateEmailPlanificationVo().getCode());
        }

        if (ordreKoscVo.getTemplateEmailReplanificationVo() != null) {
            query += SearchUtil.addConstraint("o", "templateEmailReplanification.id", "=", ordreKoscVo.getTemplateEmailReplanificationVo().getId());
            query += SearchUtil.addConstraint("o", "templateEmailReplanification.code", "LIKE", ordreKoscVo.getTemplateEmailReplanificationVo().getCode());
        }

        if (ordreKoscVo.getTemplateEmailReportVo() != null) {
            query += SearchUtil.addConstraint("o", "templateEmailReport.id", "=", ordreKoscVo.getTemplateEmailReportVo().getId());
            query += SearchUtil.addConstraint("o", "templateEmailReport.code", "LIKE", ordreKoscVo.getTemplateEmailReportVo().getCode());
        }

        if (ordreKoscVo.getEtatDemandeKoscVo() != null) {
            query += SearchUtil.addConstraint("o", "etatDemandeKosc.id", "=", ordreKoscVo.getEtatDemandeKoscVo().getId());
            query += SearchUtil.addConstraint("o", "etatDemandeKosc.code", "LIKE", ordreKoscVo.getEtatDemandeKoscVo().getCode());
        }

        if (ordreKoscVo.getTemplateEmailClotureVo() != null) {
            query += SearchUtil.addConstraint("o", "templateEmailCloture.id", "=", ordreKoscVo.getTemplateEmailClotureVo().getId());
            query += SearchUtil.addConstraint("o", "templateEmailCloture.code", "LIKE", ordreKoscVo.getTemplateEmailClotureVo().getCode());
        }

        if (ordreKoscVo.getTemplateSuiviVo() != null) {
            query += SearchUtil.addConstraint("o", "templateSuivi.id", "=", ordreKoscVo.getTemplateSuiviVo().getId());
            query += SearchUtil.addConstraint("o", "templateSuivi.code", "LIKE", ordreKoscVo.getTemplateSuiviVo().getCode());
        }

        return entityManager.createQuery(query).getResultList();
    }

    private void findOperator(OrdreKosc ordreKosc) {
        Operator loadedOperator = operatorService.findByIdOrReference(ordreKosc.getOperator());

        if (loadedOperator == null) {
            return;
        }
        ordreKosc.setOperator(loadedOperator);
    }

    private void findDepartement(OrdreKosc ordreKosc) {
        Departement loadedDepartement = departementService.findByIdOrCode(ordreKosc.getDepartement());

        if (loadedDepartement == null) {
            return;
        }
        ordreKosc.setDepartement(loadedDepartement);
    }

    private void findTechnicien(OrdreKosc ordreKosc) {
        Technicien loadedTechnicien = technicienService.findByIdOrIdentifiant(ordreKosc.getTechnicien());

        if (loadedTechnicien == null) {
            return;
        }
        ordreKosc.setTechnicien(loadedTechnicien);
    }

    private void findClient(OrdreKosc ordreKosc) {
        Client loadedClient = null;
        if (ordreKosc.getClient() != null && ordreKosc.getClient().getId() != null)
            loadedClient = clientService.findById(ordreKosc.getClient().getId());

        if (loadedClient == null) {
            return;
        }
        ordreKosc.setClient(loadedClient);
    }

    private void findTemplateEmailClientInjoinable(OrdreKosc ordreKosc) {
        TemplateEmailClientInjoinable loadedTemplateEmailClientInjoinable = templateEmailClientInjoinableService.findByIdOrCode(ordreKosc.getTemplateEmailClientInjoinable());

        if (loadedTemplateEmailClientInjoinable == null) {
            return;
        }
        ordreKosc.setTemplateEmailClientInjoinable(loadedTemplateEmailClientInjoinable);
    }

    private void findTemplateEmailKosc(OrdreKosc ordreKosc) {
        TemplateEmailKosc loadedTemplateEmailKosc = templateEmailKoscService.findByIdOrCode(ordreKosc.getTemplateEmailKosc());

        if (loadedTemplateEmailKosc == null) {
            return;
        }
        ordreKosc.setTemplateEmailKosc(loadedTemplateEmailKosc);
    }

    private void findTemplateEmailPlanification(OrdreKosc ordreKosc) {
        TemplateEmailPlanification loadedTemplateEmailPlanification = templateEmailPlanificationService.findByIdOrCode(ordreKosc.getTemplateEmailPlanification());

        if (loadedTemplateEmailPlanification == null) {
            return;
        }
        ordreKosc.setTemplateEmailPlanification(loadedTemplateEmailPlanification);
    }

    private void findTemplateEmailReplanification(OrdreKosc ordreKosc) {
        TemplateEmailReplanification loadedTemplateEmailReplanification = templateEmailReplanificationService.findByIdOrCode(ordreKosc.getTemplateEmailReplanification());

        if (loadedTemplateEmailReplanification == null) {
            return;
        }
        ordreKosc.setTemplateEmailReplanification(loadedTemplateEmailReplanification);
    }

    private void findTemplateEmailReport(OrdreKosc ordreKosc) {
        TemplateEmailReport loadedTemplateEmailReport = templateEmailReportService.findByIdOrCode(ordreKosc.getTemplateEmailReport());

        if (loadedTemplateEmailReport == null) {
            return;
        }
        ordreKosc.setTemplateEmailReport(loadedTemplateEmailReport);
    }

    private void findEtatDemandeKosc(OrdreKosc ordreKosc) {
        EtatDemandeKosc loadedEtatDemandeKosc = etatDemandeKoscService.findByIdOrCode(ordreKosc.getEtatDemandeKosc());

        if (loadedEtatDemandeKosc == null) {
            return;
        }
        ordreKosc.setEtatDemandeKosc(loadedEtatDemandeKosc);
    }

    private void findTemplateEmailCloture(OrdreKosc ordreKosc) {
        TemplateEmailCloture loadedTemplateEmailCloture = templateEmailClotureService.findByIdOrCode(ordreKosc.getTemplateEmailCloture());

        if (loadedTemplateEmailCloture == null) {
            return;
        }
        ordreKosc.setTemplateEmailCloture(loadedTemplateEmailCloture);
    }

    private void findTemplateSuivi(OrdreKosc ordreKosc) {
        TemplateSuivi loadedTemplateSuivi = templateSuiviService.findByIdOrCode(ordreKosc.getTemplateSuivi());

        if (loadedTemplateSuivi == null) {
            return;
        }
        ordreKosc.setTemplateSuivi(loadedTemplateSuivi);
    }

    @Override
    @Transactional
    public void delete(List<OrdreKosc> ordreKoscs) {
        if (ListUtil.isNotEmpty(ordreKoscs)) {
            ordreKoscs.forEach(e -> ordreKoscDao.delete(e));
        }
    }

    @Override
    public void update(List<OrdreKosc> ordreKoscs) {
        if (ListUtil.isNotEmpty(ordreKoscs)) {
            ordreKoscs.forEach(e -> ordreKoscDao.save(e));
        }
    }


}
