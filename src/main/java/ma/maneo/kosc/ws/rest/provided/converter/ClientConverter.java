package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.Client;
import ma.maneo.kosc.ws.rest.provided.vo.ClientVo;

@Component
public class ClientConverter extends AbstractConverter<Client, ClientVo> {


    public ClientConverter() {
        init(true);
    }

    @Override
    public Client toItem(ClientVo vo) {
        if (vo == null) {
            return null;
        } else {
            Client item = new Client();
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getEmail()))
                item.setEmail(vo.getEmail());
            if (StringUtil.isNotEmpty(vo.getNom()))
                item.setNom(vo.getNom());
            if (StringUtil.isNotEmpty(vo.getPrenom()))
                item.setPrenom(vo.getPrenom());


            return item;
        }
    }

    @Override
    public ClientVo toVo(Client item) {
        if (item == null) {
            return null;
        } else {
            ClientVo vo = new ClientVo();
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));

            if (StringUtil.isNotEmpty(item.getEmail()))
                vo.setEmail(item.getEmail());

            if (StringUtil.isNotEmpty(item.getNom()))
                vo.setNom(item.getNom());

            if (StringUtil.isNotEmpty(item.getPrenom()))
                vo.setPrenom(item.getPrenom());


            return vo;
        }
    }

    public void init(Boolean value) {
    }


}
