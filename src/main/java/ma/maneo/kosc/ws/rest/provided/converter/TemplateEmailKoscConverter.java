package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.TemplateEmailKosc;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailKoscVo;

@Component
public class TemplateEmailKoscConverter extends AbstractConverter<TemplateEmailKosc, TemplateEmailKoscVo> {


    public TemplateEmailKoscConverter() {
        init(true);
    }

    @Override
    public TemplateEmailKosc toItem(TemplateEmailKoscVo vo) {
        if (vo == null) {
            return null;
        } else {
            TemplateEmailKosc item = new TemplateEmailKosc();
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getCode()))
                item.setCode(vo.getCode());
            if (StringUtil.isNotEmpty(vo.getLibelle()))
                item.setLibelle(vo.getLibelle());
            if (StringUtil.isNotEmpty(vo.getObjet()))
                item.setObjet(vo.getObjet());
            if (StringUtil.isNotEmpty(vo.getCorps()))
                item.setCorps(vo.getCorps());


            return item;
        }
    }

    @Override
    public TemplateEmailKoscVo toVo(TemplateEmailKosc item) {
        if (item == null) {
            return null;
        } else {
            TemplateEmailKoscVo vo = new TemplateEmailKoscVo();
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));

            if (StringUtil.isNotEmpty(item.getCode()))
                vo.setCode(item.getCode());

            if (StringUtil.isNotEmpty(item.getLibelle()))
                vo.setLibelle(item.getLibelle());

            if (StringUtil.isNotEmpty(item.getObjet()))
                vo.setObjet(item.getObjet());

            if (StringUtil.isNotEmpty(item.getCorps()))
                vo.setCorps(item.getCorps());


            return vo;
        }
    }

    public void init(Boolean value) {
    }


}
