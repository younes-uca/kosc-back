package ma.maneo.kosc.ws.rest.provided.facade.admin;

import ma.maneo.kosc.service.admin.facade.OrdreKoscAdminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.maneo.kosc.bean.OrdreKosc;
import ma.maneo.kosc.ws.rest.provided.converter.OrdreKoscConverter;
import ma.maneo.kosc.ws.rest.provided.vo.OrdreKoscVo;

@Api("Manages ordreKosc services")
@RestController
@RequestMapping("api/admin/ordreKosc")
public class OrdreKoscRestAdmin {

    @Autowired
    private OrdreKoscAdminService ordreKoscService;

    @Autowired
    private OrdreKoscConverter ordreKoscConverter;


    @ApiOperation("Updates the specified  ordreKosc")
    @PutMapping("/")
    public OrdreKoscVo update(@RequestBody OrdreKoscVo ordreKoscVo) {
        OrdreKosc ordreKosc = ordreKoscConverter.toItem(ordreKoscVo);
        ordreKosc = ordreKoscService.update(ordreKosc);
        return ordreKoscConverter.toVo(ordreKosc);
    }

    @ApiOperation("Finds a list of all ordreKoscs")
    @GetMapping("/")
    public List<OrdreKoscVo> findAll() {
        return ordreKoscConverter.toVo(ordreKoscService.findAll());
    }

    @ApiOperation("Finds a ordreKosc with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public OrdreKoscVo findByIdWithAssociatedList(@PathVariable Long id) {
        return ordreKoscConverter.toVo(ordreKoscService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search ordreKosc by a specific criteria")
    @PostMapping("/search")
    public List<OrdreKoscVo> findByCriteria(@RequestBody OrdreKoscVo ordreKoscVo) {
        return ordreKoscConverter.toVo(ordreKoscService.findByCriteria(ordreKoscVo));
    }

    @ApiOperation("Finds a ordreKosc by id")
    @GetMapping("/id/{id}")
    public OrdreKoscVo findById(@PathVariable Long id) {
        return ordreKoscConverter.toVo(ordreKoscService.findById(id));
    }

    @ApiOperation("Saves the specified  ordreKosc")
    @PostMapping("/")
    public OrdreKoscVo save(@RequestBody OrdreKoscVo ordreKoscVo) {
        OrdreKosc ordreKosc = ordreKoscConverter.toItem(ordreKoscVo);
        ordreKosc = ordreKoscService.save(ordreKosc);
        return ordreKoscConverter.toVo(ordreKosc);
    }

    @ApiOperation("Delete the specified ordreKosc")
    @DeleteMapping("/")
    public int delete(@RequestBody OrdreKoscVo ordreKoscVo) {
        OrdreKosc ordreKosc = ordreKoscConverter.toItem(ordreKoscVo);
        return ordreKoscService.delete(ordreKosc);
    }

    @ApiOperation("Deletes a ordreKosc by id")
    @DeleteMapping("/id/{id}")
    public int deleteById(@PathVariable Long id) {
        return ordreKoscService.deleteById(id);
    }

    @ApiOperation("find by operator reference")
    @GetMapping("/operator/reference/{reference}")
    public List<OrdreKosc> findByOperatorReference(@PathVariable String reference) {
        return ordreKoscService.findByOperatorReference(reference);
    }

    @ApiOperation("delete by operator reference")
    @DeleteMapping("/operator/reference/{reference}")
    public int deleteByOperatorReference(@PathVariable String reference) {
        return ordreKoscService.deleteByOperatorReference(reference);
    }

    @ApiOperation("find by operator id")
    @GetMapping("/operator/id/{id}")
    public List<OrdreKosc> findByOperatorId(@PathVariable Long id) {
        return ordreKoscService.findByOperatorId(id);
    }

    @ApiOperation("delete by operator id")
    @DeleteMapping("/operator/id/{id}")
    public int deleteByOperatorId(@PathVariable Long id) {
        return ordreKoscService.deleteByOperatorId(id);
    }

    @ApiOperation("find by departement code")
    @GetMapping("/departement/code/{code}")
    public List<OrdreKosc> findByDepartementCode(@PathVariable String code) {
        return ordreKoscService.findByDepartementCode(code);
    }

    @ApiOperation("delete by departement code")
    @DeleteMapping("/departement/code/{code}")
    public int deleteByDepartementCode(@PathVariable String code) {
        return ordreKoscService.deleteByDepartementCode(code);
    }

    @ApiOperation("find by departement id")
    @GetMapping("/departement/id/{id}")
    public List<OrdreKosc> findByDepartementId(@PathVariable Long id) {
        return ordreKoscService.findByDepartementId(id);
    }

    @ApiOperation("delete by departement id")
    @DeleteMapping("/departement/id/{id}")
    public int deleteByDepartementId(@PathVariable Long id) {
        return ordreKoscService.deleteByDepartementId(id);
    }

    @ApiOperation("find by technicien identifiant")
    @GetMapping("/technicien/identifiant/{identifiant}")
    public List<OrdreKosc> findByTechnicienIdentifiant(@PathVariable String identifiant) {
        return ordreKoscService.findByTechnicienIdentifiant(identifiant);
    }

    @ApiOperation("delete by technicien identifiant")
    @DeleteMapping("/technicien/identifiant/{identifiant}")
    public int deleteByTechnicienIdentifiant(@PathVariable String identifiant) {
        return ordreKoscService.deleteByTechnicienIdentifiant(identifiant);
    }

    @ApiOperation("find by technicien id")
    @GetMapping("/technicien/id/{id}")
    public List<OrdreKosc> findByTechnicienId(@PathVariable Long id) {
        return ordreKoscService.findByTechnicienId(id);
    }

    @ApiOperation("delete by technicien id")
    @DeleteMapping("/technicien/id/{id}")
    public int deleteByTechnicienId(@PathVariable Long id) {
        return ordreKoscService.deleteByTechnicienId(id);
    }

    @ApiOperation("find by client id")
    @GetMapping("/client/id/{id}")
    public List<OrdreKosc> findByClientId(@PathVariable Long id) {
        return ordreKoscService.findByClientId(id);
    }

    @ApiOperation("delete by client id")
    @DeleteMapping("/client/id/{id}")
    public int deleteByClientId(@PathVariable Long id) {
        return ordreKoscService.deleteByClientId(id);
    }

    @ApiOperation("find by templateEmailClientInjoinable code")
    @GetMapping("/templateEmailClientInjoinable/code/{code}")
    public List<OrdreKosc> findByTemplateEmailClientInjoinableCode(@PathVariable String code) {
        return ordreKoscService.findByTemplateEmailClientInjoinableCode(code);
    }

    @ApiOperation("delete by templateEmailClientInjoinable code")
    @DeleteMapping("/templateEmailClientInjoinable/code/{code}")
    public int deleteByTemplateEmailClientInjoinableCode(@PathVariable String code) {
        return ordreKoscService.deleteByTemplateEmailClientInjoinableCode(code);
    }

    @ApiOperation("find by templateEmailClientInjoinable id")
    @GetMapping("/templateEmailClientInjoinable/id/{id}")
    public List<OrdreKosc> findByTemplateEmailClientInjoinableId(@PathVariable Long id) {
        return ordreKoscService.findByTemplateEmailClientInjoinableId(id);
    }

    @ApiOperation("delete by templateEmailClientInjoinable id")
    @DeleteMapping("/templateEmailClientInjoinable/id/{id}")
    public int deleteByTemplateEmailClientInjoinableId(@PathVariable Long id) {
        return ordreKoscService.deleteByTemplateEmailClientInjoinableId(id);
    }

    @ApiOperation("find by templateEmailKosc code")
    @GetMapping("/templateEmailKosc/code/{code}")
    public List<OrdreKosc> findByTemplateEmailKoscCode(@PathVariable String code) {
        return ordreKoscService.findByTemplateEmailKoscCode(code);
    }

    @ApiOperation("delete by templateEmailKosc code")
    @DeleteMapping("/templateEmailKosc/code/{code}")
    public int deleteByTemplateEmailKoscCode(@PathVariable String code) {
        return ordreKoscService.deleteByTemplateEmailKoscCode(code);
    }

    @ApiOperation("find by templateEmailKosc id")
    @GetMapping("/templateEmailKosc/id/{id}")
    public List<OrdreKosc> findByTemplateEmailKoscId(@PathVariable Long id) {
        return ordreKoscService.findByTemplateEmailKoscId(id);
    }

    @ApiOperation("delete by templateEmailKosc id")
    @DeleteMapping("/templateEmailKosc/id/{id}")
    public int deleteByTemplateEmailKoscId(@PathVariable Long id) {
        return ordreKoscService.deleteByTemplateEmailKoscId(id);
    }

    @ApiOperation("find by templateEmailPlanification code")
    @GetMapping("/templateEmailPlanification/code/{code}")
    public List<OrdreKosc> findByTemplateEmailPlanificationCode(@PathVariable String code) {
        return ordreKoscService.findByTemplateEmailPlanificationCode(code);
    }

    @ApiOperation("delete by templateEmailPlanification code")
    @DeleteMapping("/templateEmailPlanification/code/{code}")
    public int deleteByTemplateEmailPlanificationCode(@PathVariable String code) {
        return ordreKoscService.deleteByTemplateEmailPlanificationCode(code);
    }

    @ApiOperation("find by templateEmailPlanification id")
    @GetMapping("/templateEmailPlanification/id/{id}")
    public List<OrdreKosc> findByTemplateEmailPlanificationId(@PathVariable Long id) {
        return ordreKoscService.findByTemplateEmailPlanificationId(id);
    }

    @ApiOperation("delete by templateEmailPlanification id")
    @DeleteMapping("/templateEmailPlanification/id/{id}")
    public int deleteByTemplateEmailPlanificationId(@PathVariable Long id) {
        return ordreKoscService.deleteByTemplateEmailPlanificationId(id);
    }

    @ApiOperation("find by templateEmailReplanification code")
    @GetMapping("/templateEmailReplanification/code/{code}")
    public List<OrdreKosc> findByTemplateEmailReplanificationCode(@PathVariable String code) {
        return ordreKoscService.findByTemplateEmailReplanificationCode(code);
    }

    @ApiOperation("delete by templateEmailReplanification code")
    @DeleteMapping("/templateEmailReplanification/code/{code}")
    public int deleteByTemplateEmailReplanificationCode(@PathVariable String code) {
        return ordreKoscService.deleteByTemplateEmailReplanificationCode(code);
    }

    @ApiOperation("find by templateEmailReplanification id")
    @GetMapping("/templateEmailReplanification/id/{id}")
    public List<OrdreKosc> findByTemplateEmailReplanificationId(@PathVariable Long id) {
        return ordreKoscService.findByTemplateEmailReplanificationId(id);
    }

    @ApiOperation("delete by templateEmailReplanification id")
    @DeleteMapping("/templateEmailReplanification/id/{id}")
    public int deleteByTemplateEmailReplanificationId(@PathVariable Long id) {
        return ordreKoscService.deleteByTemplateEmailReplanificationId(id);
    }

    @ApiOperation("find by templateEmailReport code")
    @GetMapping("/templateEmailReport/code/{code}")
    public List<OrdreKosc> findByTemplateEmailReportCode(@PathVariable String code) {
        return ordreKoscService.findByTemplateEmailReportCode(code);
    }

    @ApiOperation("delete by templateEmailReport code")
    @DeleteMapping("/templateEmailReport/code/{code}")
    public int deleteByTemplateEmailReportCode(@PathVariable String code) {
        return ordreKoscService.deleteByTemplateEmailReportCode(code);
    }

    @ApiOperation("find by templateEmailReport id")
    @GetMapping("/templateEmailReport/id/{id}")
    public List<OrdreKosc> findByTemplateEmailReportId(@PathVariable Long id) {
        return ordreKoscService.findByTemplateEmailReportId(id);
    }

    @ApiOperation("delete by templateEmailReport id")
    @DeleteMapping("/templateEmailReport/id/{id}")
    public int deleteByTemplateEmailReportId(@PathVariable Long id) {
        return ordreKoscService.deleteByTemplateEmailReportId(id);
    }

    @ApiOperation("find by etatDemandeKosc code")
    @GetMapping("/etatDemandeKosc/code/{code}")
    public List<OrdreKosc> findByEtatDemandeKoscCode(@PathVariable String code) {
        return ordreKoscService.findByEtatDemandeKoscCode(code);
    }

    @ApiOperation("delete by etatDemandeKosc code")
    @DeleteMapping("/etatDemandeKosc/code/{code}")
    public int deleteByEtatDemandeKoscCode(@PathVariable String code) {
        return ordreKoscService.deleteByEtatDemandeKoscCode(code);
    }

    @ApiOperation("find by etatDemandeKosc id")
    @GetMapping("/etatDemandeKosc/id/{id}")
    public List<OrdreKosc> findByEtatDemandeKoscId(@PathVariable Long id) {
        return ordreKoscService.findByEtatDemandeKoscId(id);
    }

    @ApiOperation("delete by etatDemandeKosc id")
    @DeleteMapping("/etatDemandeKosc/id/{id}")
    public int deleteByEtatDemandeKoscId(@PathVariable Long id) {
        return ordreKoscService.deleteByEtatDemandeKoscId(id);
    }

    @ApiOperation("find by templateEmailCloture code")
    @GetMapping("/templateEmailCloture/code/{code}")
    public List<OrdreKosc> findByTemplateEmailClotureCode(@PathVariable String code) {
        return ordreKoscService.findByTemplateEmailClotureCode(code);
    }

    @ApiOperation("delete by templateEmailCloture code")
    @DeleteMapping("/templateEmailCloture/code/{code}")
    public int deleteByTemplateEmailClotureCode(@PathVariable String code) {
        return ordreKoscService.deleteByTemplateEmailClotureCode(code);
    }

    @ApiOperation("find by templateEmailCloture id")
    @GetMapping("/templateEmailCloture/id/{id}")
    public List<OrdreKosc> findByTemplateEmailClotureId(@PathVariable Long id) {
        return ordreKoscService.findByTemplateEmailClotureId(id);
    }

    @ApiOperation("delete by templateEmailCloture id")
    @DeleteMapping("/templateEmailCloture/id/{id}")
    public int deleteByTemplateEmailClotureId(@PathVariable Long id) {
        return ordreKoscService.deleteByTemplateEmailClotureId(id);
    }

    @ApiOperation("find by templateSuivi code")
    @GetMapping("/templateSuivi/code/{code}")
    public List<OrdreKosc> findByTemplateSuiviCode(@PathVariable String code) {
        return ordreKoscService.findByTemplateSuiviCode(code);
    }

    @ApiOperation("delete by templateSuivi code")
    @DeleteMapping("/templateSuivi/code/{code}")
    public int deleteByTemplateSuiviCode(@PathVariable String code) {
        return ordreKoscService.deleteByTemplateSuiviCode(code);
    }

    @ApiOperation("find by templateSuivi id")
    @GetMapping("/templateSuivi/id/{id}")
    public List<OrdreKosc> findByTemplateSuiviId(@PathVariable Long id) {
        return ordreKoscService.findByTemplateSuiviId(id);
    }

    @ApiOperation("delete by templateSuivi id")
    @DeleteMapping("/templateSuivi/id/{id}")
    public int deleteByTemplateSuiviId(@PathVariable Long id) {
        return ordreKoscService.deleteByTemplateSuiviId(id);
    }


}
