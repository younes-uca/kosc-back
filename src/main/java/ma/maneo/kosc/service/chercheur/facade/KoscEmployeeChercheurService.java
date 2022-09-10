package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.KoscEmployee;
import ma.maneo.kosc.ws.rest.provided.vo.KoscEmployeeVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface KoscEmployeeChercheurService extends AbstractService<KoscEmployee, Long, KoscEmployeeVo> {


    /**
     * delete KoscEmployee from database
     *
     * @param id - id of KoscEmployee to be deleted
     */
    int deleteById(Long id);


}
