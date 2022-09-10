package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.Operator;
import ma.maneo.kosc.ws.rest.provided.vo.OperatorVo;

@Component
public class OperatorConverter extends AbstractConverter<Operator, OperatorVo> {


    public OperatorConverter() {
        init(true);
    }

    @Override
    public Operator toItem(OperatorVo vo) {
        if (vo == null) {
            return null;
        } else {
            Operator item = new Operator();
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getReference()))
                item.setReference(vo.getReference());
            if (StringUtil.isNotEmpty(vo.getLibelle()))
                item.setLibelle(vo.getLibelle());


            return item;
        }
    }

    @Override
    public OperatorVo toVo(Operator item) {
        if (item == null) {
            return null;
        } else {
            OperatorVo vo = new OperatorVo();
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));

            if (StringUtil.isNotEmpty(item.getReference()))
                vo.setReference(item.getReference());

            if (StringUtil.isNotEmpty(item.getLibelle()))
                vo.setLibelle(item.getLibelle());


            return vo;
        }
    }

    public void init(Boolean value) {
    }


}
