package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.KoscEmployee;
import ma.maneo.kosc.ws.rest.provided.vo.KoscEmployeeVo;

@Component
public class KoscEmployeeConverter extends AbstractConverter<KoscEmployee, KoscEmployeeVo> {


    public KoscEmployeeConverter() {
        init(true);
    }

    @Override
    public KoscEmployee toItem(KoscEmployeeVo vo) {
        if (vo == null) {
            return null;
        } else {
            KoscEmployee item = new KoscEmployee();
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getFirstName()))
                item.setFirstName(vo.getFirstName());
            if (StringUtil.isNotEmpty(vo.getLastName()))
                item.setLastName(vo.getLastName());
            if (StringUtil.isNotEmpty(vo.getPhone()))
                item.setPhone(vo.getPhone());
            if (StringUtil.isNotEmpty(vo.getCellPhone()))
                item.setCellPhone(vo.getCellPhone());
            if (StringUtil.isNotEmpty(vo.getEmail1()))
                item.setEmail1(vo.getEmail1());
            if (StringUtil.isNotEmpty(vo.getEmail2()))
                item.setEmail2(vo.getEmail2());
            if (StringUtil.isNotEmpty(vo.getEmail3()))
                item.setEmail3(vo.getEmail3());


            return item;
        }
    }

    @Override
    public KoscEmployeeVo toVo(KoscEmployee item) {
        if (item == null) {
            return null;
        } else {
            KoscEmployeeVo vo = new KoscEmployeeVo();
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));

            if (StringUtil.isNotEmpty(item.getFirstName()))
                vo.setFirstName(item.getFirstName());

            if (StringUtil.isNotEmpty(item.getLastName()))
                vo.setLastName(item.getLastName());

            if (StringUtil.isNotEmpty(item.getPhone()))
                vo.setPhone(item.getPhone());

            if (StringUtil.isNotEmpty(item.getCellPhone()))
                vo.setCellPhone(item.getCellPhone());

            if (StringUtil.isNotEmpty(item.getEmail1()))
                vo.setEmail1(item.getEmail1());

            if (StringUtil.isNotEmpty(item.getEmail2()))
                vo.setEmail2(item.getEmail2());

            if (StringUtil.isNotEmpty(item.getEmail3()))
                vo.setEmail3(item.getEmail3());


            return vo;
        }
    }

    public void init(Boolean value) {
    }


}
