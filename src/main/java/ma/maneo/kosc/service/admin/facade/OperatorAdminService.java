package ma.maneo.kosc.service.admin.facade;

import java.util.List;

import ma.maneo.kosc.bean.Operator;
import ma.maneo.kosc.ws.rest.provided.vo.OperatorVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface OperatorAdminService extends AbstractService<Operator, Long, OperatorVo> {


    /**
     * find Operator from database by reference (reference)
     *
     * @param reference - reference of Operator
     * @return the founded Operator , If no Operator were
     * found in database return  null.
     */
    Operator findByReference(String reference);

    /**
     * find Operator from database by id (PK) or reference (reference)
     *
     * @param id        - id of Operator
     * @param reference - reference of Operator
     * @return the founded Operator , If no Operator were
     * found in database return  null.
     */
    Operator findByIdOrReference(Operator operator);


    /**
     * delete Operator from database
     *
     * @param id - id of Operator to be deleted
     */
    int deleteById(Long id);


    /**
     * delete Operator from database by reference (reference)
     *
     * @param reference - reference of Operator to be deleted
     * @return 1 if Operator deleted successfully
     */
    int deleteByReference(String reference);


}
