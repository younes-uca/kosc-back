package ma.maneo.kosc.service.chercheur.facade;

import java.util.List;

import ma.maneo.kosc.bean.Client;
import ma.maneo.kosc.ws.rest.provided.vo.ClientVo;
import ma.maneo.kosc.service.core.facade.AbstractService;

public interface ClientChercheurService extends AbstractService<Client, Long, ClientVo> {


    /**
     * delete Client from database
     *
     * @param id - id of Client to be deleted
     */
    int deleteById(Long id);


}
