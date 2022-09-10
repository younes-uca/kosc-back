package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.Region;
import ma.maneo.kosc.ws.rest.provided.vo.RegionVo;

@Component
public class RegionConverter extends AbstractConverter<Region, RegionVo> {


    public RegionConverter() {
        init(true);
    }

    @Override
    public Region toItem(RegionVo vo) {
        if (vo == null) {
            return null;
        } else {
            Region item = new Region();
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getLibelle()))
                item.setLibelle(vo.getLibelle());
            if (StringUtil.isNotEmpty(vo.getCode()))
                item.setCode(vo.getCode());


            return item;
        }
    }

    @Override
    public RegionVo toVo(Region item) {
        if (item == null) {
            return null;
        } else {
            RegionVo vo = new RegionVo();
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));

            if (StringUtil.isNotEmpty(item.getLibelle()))
                vo.setLibelle(item.getLibelle());

            if (StringUtil.isNotEmpty(item.getCode()))
                vo.setCode(item.getCode());


            return vo;
        }
    }

    public void init(Boolean value) {
    }


}
