package ma.maneo.kosc.service.admin.facade;

import java.util.List;

import ma.maneo.kosc.bean.Region;
import ma.maneo.kosc.ws.rest.provided.vo.RegionVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface RegionAdminService extends AbstractService<Region, Long, RegionVo> {


    /**
     * find Region from database by code (reference)
     *
     * @param code - reference of Region
     * @return the founded Region , If no Region were
     * found in database return  null.
     */
    Region findByCode(String code);

    /**
     * find Region from database by id (PK) or code (reference)
     *
     * @param id   - id of Region
     * @param code - reference of Region
     * @return the founded Region , If no Region were
     * found in database return  null.
     */
    Region findByIdOrCode(Region region);


    /**
     * delete Region from database
     *
     * @param id - id of Region to be deleted
     */
    int deleteById(Long id);


    /**
     * delete Region from database by code (reference)
     *
     * @param code - reference of Region to be deleted
     * @return 1 if Region deleted successfully
     */
    int deleteByCode(String code);


}
