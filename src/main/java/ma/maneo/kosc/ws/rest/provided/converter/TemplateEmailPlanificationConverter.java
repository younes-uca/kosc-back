package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.TemplateEmailPlanification;
import ma.maneo.kosc.ws.rest.provided.vo.TemplateEmailPlanificationVo;

@Component
public class TemplateEmailPlanificationConverter extends AbstractConverter<TemplateEmailPlanification, TemplateEmailPlanificationVo> {


    public TemplateEmailPlanificationConverter() {
        init(true);
    }

    @Override
    public TemplateEmailPlanification toItem(TemplateEmailPlanificationVo vo) {
        if (vo == null) {
            return null;
        } else {
            TemplateEmailPlanification item = new TemplateEmailPlanification();
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
    public TemplateEmailPlanificationVo toVo(TemplateEmailPlanification item) {
        if (item == null) {
            return null;
        } else {
            TemplateEmailPlanificationVo vo = new TemplateEmailPlanificationVo();
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
