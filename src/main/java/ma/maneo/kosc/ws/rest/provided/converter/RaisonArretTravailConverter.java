package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.RaisonArretTravail;
import ma.maneo.kosc.ws.rest.provided.vo.RaisonArretTravailVo;

@Component
public class RaisonArretTravailConverter extends AbstractConverter<RaisonArretTravail, RaisonArretTravailVo> {


    public RaisonArretTravailConverter() {
        init(true);
    }

    @Override
    public RaisonArretTravail toItem(RaisonArretTravailVo vo) {
        if (vo == null) {
            return null;
        } else {
            RaisonArretTravail item = new RaisonArretTravail();
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
    public RaisonArretTravailVo toVo(RaisonArretTravail item) {
        if (item == null) {
            return null;
        } else {
            RaisonArretTravailVo vo = new RaisonArretTravailVo();
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
