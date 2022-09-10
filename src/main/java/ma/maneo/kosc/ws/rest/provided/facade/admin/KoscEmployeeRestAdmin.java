package ma.maneo.kosc.ws.rest.provided.facade.admin;

import ma.maneo.kosc.service.admin.facade.KoscEmployeeAdminService;

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
import ma.maneo.kosc.bean.KoscEmployee;
import ma.maneo.kosc.ws.rest.provided.converter.KoscEmployeeConverter;
import ma.maneo.kosc.ws.rest.provided.vo.KoscEmployeeVo;

@Api("Manages koscEmployee services")
@RestController
@RequestMapping("api/admin/koscEmployee")
public class KoscEmployeeRestAdmin {

    @Autowired
    private KoscEmployeeAdminService koscEmployeeService;

    @Autowired
    private KoscEmployeeConverter koscEmployeeConverter;


    @ApiOperation("Updates the specified  koscEmployee")
    @PutMapping("/")
    public KoscEmployeeVo update(@RequestBody KoscEmployeeVo koscEmployeeVo) {
        KoscEmployee koscEmployee = koscEmployeeConverter.toItem(koscEmployeeVo);
        koscEmployee = koscEmployeeService.update(koscEmployee);
        return koscEmployeeConverter.toVo(koscEmployee);
    }

    @ApiOperation("Finds a list of all koscEmployees")
    @GetMapping("/")
    public List<KoscEmployeeVo> findAll() {
        return koscEmployeeConverter.toVo(koscEmployeeService.findAll());
    }

    @ApiOperation("Finds a koscEmployee with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public KoscEmployeeVo findByIdWithAssociatedList(@PathVariable Long id) {
        return koscEmployeeConverter.toVo(koscEmployeeService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search koscEmployee by a specific criteria")
    @PostMapping("/search")
    public List<KoscEmployeeVo> findByCriteria(@RequestBody KoscEmployeeVo koscEmployeeVo) {
        return koscEmployeeConverter.toVo(koscEmployeeService.findByCriteria(koscEmployeeVo));
    }

    @ApiOperation("Finds a koscEmployee by id")
    @GetMapping("/id/{id}")
    public KoscEmployeeVo findById(@PathVariable Long id) {
        return koscEmployeeConverter.toVo(koscEmployeeService.findById(id));
    }

    @ApiOperation("Saves the specified  koscEmployee")
    @PostMapping("/")
    public KoscEmployeeVo save(@RequestBody KoscEmployeeVo koscEmployeeVo) {
        KoscEmployee koscEmployee = koscEmployeeConverter.toItem(koscEmployeeVo);
        koscEmployee = koscEmployeeService.save(koscEmployee);
        return koscEmployeeConverter.toVo(koscEmployee);
    }

    @ApiOperation("Delete the specified koscEmployee")
    @DeleteMapping("/")
    public int delete(@RequestBody KoscEmployeeVo koscEmployeeVo) {
        KoscEmployee koscEmployee = koscEmployeeConverter.toItem(koscEmployeeVo);
        return koscEmployeeService.delete(koscEmployee);
    }

    @ApiOperation("Deletes a koscEmployee by id")
    @DeleteMapping("/id/{id}")
    public int deleteById(@PathVariable Long id) {
        return koscEmployeeService.deleteById(id);
    }


}
