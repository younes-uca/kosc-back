package ma.maneo.kosc.ws.rest.provided.facade.chercheur;

import ma.maneo.kosc.service.chercheur.facade.TemplateEmailKoscChercheurService;

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
import ma.maneo.kosc.bean.TemplateEmailKosc;
import ma.maneo.kosc.ws.rest.provided.converter.TemplateEmailKoscConverter;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailKoscVo;

@Api("Manages templateEmailKosc services")
@RestController
@RequestMapping("api/chercheur/templateEmailKosc")
public class TemplateEmailKoscRestChercheur {

    @Autowired
    private TemplateEmailKoscChercheurService templateEmailKoscService;

    @Autowired
    private TemplateEmailKoscConverter templateEmailKoscConverter;


    @ApiOperation("Updates the specified  templateEmailKosc")
    @PutMapping("/")
    public TemplateEmailKoscVo update(@RequestBody TemplateEmailKoscVo templateEmailKoscVo) {
        TemplateEmailKosc templateEmailKosc = templateEmailKoscConverter.toItem(templateEmailKoscVo);
        templateEmailKosc = templateEmailKoscService.update(templateEmailKosc);
        return templateEmailKoscConverter.toVo(templateEmailKosc);
    }

    @ApiOperation("Finds a list of all templateEmailKoscs")
    @GetMapping("/")
    public List<TemplateEmailKoscVo> findAll() {
        return templateEmailKoscConverter.toVo(templateEmailKoscService.findAll());
    }

    @ApiOperation("Finds a templateEmailKosc with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public TemplateEmailKoscVo findByIdWithAssociatedList(@PathVariable Long id) {
        return templateEmailKoscConverter.toVo(templateEmailKoscService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search templateEmailKosc by a specific criteria")
    @PostMapping("/search")
    public List<TemplateEmailKoscVo> findByCriteria(@RequestBody TemplateEmailKoscVo templateEmailKoscVo) {
        return templateEmailKoscConverter.toVo(templateEmailKoscService.findByCriteria(templateEmailKoscVo));
    }

    @ApiOperation("Finds a templateEmailKosc by id")
    @GetMapping("/id/{id}")
    public TemplateEmailKoscVo findById(@PathVariable Long id) {
        return templateEmailKoscConverter.toVo(templateEmailKoscService.findById(id));
    }

    @ApiOperation("Saves the specified  templateEmailKosc")
    @PostMapping("/")
    public TemplateEmailKoscVo save(@RequestBody TemplateEmailKoscVo templateEmailKoscVo) {
        TemplateEmailKosc templateEmailKosc = templateEmailKoscConverter.toItem(templateEmailKoscVo);
        templateEmailKosc = templateEmailKoscService.save(templateEmailKosc);
        return templateEmailKoscConverter.toVo(templateEmailKosc);
    }

    @ApiOperation("Delete the specified templateEmailKosc")
    @DeleteMapping("/")
    public int delete(@RequestBody TemplateEmailKoscVo templateEmailKoscVo) {
        TemplateEmailKosc templateEmailKosc = templateEmailKoscConverter.toItem(templateEmailKoscVo);
        return templateEmailKoscService.delete(templateEmailKosc);
    }

    @ApiOperation("Deletes a templateEmailKosc by id")
    @DeleteMapping("/id/{id}")
    public int deleteById(@PathVariable Long id) {
        return templateEmailKoscService.deleteById(id);
    }


}
