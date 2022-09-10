package ma.maneo.kosc.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.maneo.kosc.service.util.*;


import ma.maneo.kosc.bean.Technicien;
import ma.maneo.kosc.ws.rest.provided.vo.TechnicienVo;

@Component
public class TechnicienConverter extends AbstractConverter<Technicien, TechnicienVo> {

    @Autowired
    private EntrepriseConverter entrepriseConverter;
    private Boolean entreprise;

    public TechnicienConverter() {
        init(true);
    }

    @Override
    public Technicien toItem(TechnicienVo vo) {
        if (vo == null) {
            return null;
        } else {
            Technicien item = new Technicien();
            if (StringUtil.isNotEmpty(vo.getId()))
                item.setId(NumberUtil.toLong(vo.getId()));
            if (StringUtil.isNotEmpty(vo.getNom()))
                item.setNom(vo.getNom());
            if (StringUtil.isNotEmpty(vo.getPrenom()))
                item.setPrenom(vo.getPrenom());
            if (StringUtil.isNotEmpty(vo.getCellPhone()))
                item.setCellPhone(vo.getCellPhone());
            if (StringUtil.isNotEmpty(vo.getEmail()))
                item.setEmail(vo.getEmail());
            if (StringUtil.isNotEmpty(vo.getEmailAttachement()))
                item.setEmailAttachement(vo.getEmailAttachement());
            if (StringUtil.isNotEmpty(vo.getIdentifiant()))
                item.setIdentifiant(vo.getIdentifiant());
            if (StringUtil.isNotEmpty(vo.getMotPasse()))
                item.setMotPasse(vo.getMotPasse());
            if (StringUtil.isNotEmpty(vo.getAdresseOnt()))
                item.setAdresseOnt(vo.getAdresseOnt());
            if (vo.getEntrepriseVo() != null && this.entreprise)
                item.setEntreprise(entrepriseConverter.toItem(vo.getEntrepriseVo()));


            return item;
        }
    }

    @Override
    public TechnicienVo toVo(Technicien item) {
        if (item == null) {
            return null;
        } else {
            TechnicienVo vo = new TechnicienVo();
            if (item.getId() != null)
                vo.setId(NumberUtil.toString(item.getId()));

            if (StringUtil.isNotEmpty(item.getNom()))
                vo.setNom(item.getNom());

            if (StringUtil.isNotEmpty(item.getPrenom()))
                vo.setPrenom(item.getPrenom());

            if (StringUtil.isNotEmpty(item.getCellPhone()))
                vo.setCellPhone(item.getCellPhone());

            if (StringUtil.isNotEmpty(item.getEmail()))
                vo.setEmail(item.getEmail());

            if (StringUtil.isNotEmpty(item.getEmailAttachement()))
                vo.setEmailAttachement(item.getEmailAttachement());

            if (StringUtil.isNotEmpty(item.getIdentifiant()))
                vo.setIdentifiant(item.getIdentifiant());

            if (StringUtil.isNotEmpty(item.getMotPasse()))
                vo.setMotPasse(item.getMotPasse());

            if (StringUtil.isNotEmpty(item.getAdresseOnt()))
                vo.setAdresseOnt(item.getAdresseOnt());

            if (item.getEntreprise() != null && this.entreprise) {
                vo.setEntrepriseVo(entrepriseConverter.toVo(item.getEntreprise()));
            }

            return vo;
        }
    }

    public void init(Boolean value) {
        entreprise = value;
    }


    public EntrepriseConverter getEntrepriseConverter() {
        return this.entrepriseConverter;
    }

    public void setEntrepriseConverter(EntrepriseConverter entrepriseConverter) {
        this.entrepriseConverter = entrepriseConverter;
    }

    public boolean isEntreprise() {
        return this.entreprise;
    }

    public void setEntreprise(boolean entreprise) {
        this.entreprise = entreprise;
    }


}
