package ma.maneo.kosc.bean;

import java.util.Objects;


import javax.persistence.*;


@Entity
@Table(name = "template_email_kosc")
public class TemplateEmailKosc {

    @Id
    @SequenceGenerator(name = "template_email_kosc_seq", sequenceName = "template_email_kosc_seq",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "template_email_kosc_seq")
    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String objet;
    @Column(length = 500) // TO DO: change text
    private String corps;


    public TemplateEmailKosc() {
        super();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getObjet() {
        return this.objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getCorps() {
        return this.corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateEmailKosc templateEmailKosc = (TemplateEmailKosc) o;
        return id != null && id.equals(templateEmailKosc.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
