package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.EtatDemandeKosc;
import ma.maneo.kosc.ws.rest.provided.vo.EtatDemandeKoscVo;

@Component
public class EtatDemandeKoscConverter extends AbstractConverter<EtatDemandeKosc, EtatDemandeKoscVo> {


    public EtatDemandeKoscConverter() {
        init(true);
    }

    @Override
    public EtatDemandeKosc toItem(EtatDemandeKoscVo vo) {
        if (vo == null) {
            return null;
        } else {
            EtatDemandeKosc item = new EtatDemandeKosc();
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getCode()))
                item.setCode(vo.getCode());
            if (StringUtil.isNotEmpty(vo.getLibelle()))
                item.setLibelle(vo.getLibelle());


            return item;
        }
    }

    @Override
    public EtatDemandeKoscVo toVo(EtatDemandeKosc item) {
        if (item == null) {
            return null;
        } else {
            EtatDemandeKoscVo vo = new EtatDemandeKoscVo();
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));

            if (StringUtil.isNotEmpty(item.getCode()))
                vo.setCode(item.getCode());

            if (StringUtil.isNotEmpty(item.getLibelle()))
                vo.setLibelle(item.getLibelle());


            return vo;
        }
    }

    public void init(Boolean value) {
    }


}
