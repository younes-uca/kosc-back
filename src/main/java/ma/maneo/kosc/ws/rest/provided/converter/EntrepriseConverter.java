package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.Entreprise;
import ma.maneo.kosc.ws.rest.provided.vo.EntrepriseVo;

@Component
public class EntrepriseConverter extends AbstractConverter<Entreprise, EntrepriseVo> {


    public EntrepriseConverter() {
        init(true);
    }

    @Override
    public Entreprise toItem(EntrepriseVo vo) {
        if (vo == null) {
            return null;
        } else {
            Entreprise item = new Entreprise();
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
    public EntrepriseVo toVo(Entreprise item) {
        if (item == null) {
            return null;
        } else {
            EntrepriseVo vo = new EntrepriseVo();
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
