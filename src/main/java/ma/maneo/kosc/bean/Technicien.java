package ma.maneo.kosc.bean;

import java.util.Objects;


import javax.persistence.*;


@Entity
@Table(name = "technicien")
public class Technicien {

    @Id
    @SequenceGenerator(name = "technicien_seq", sequenceName = "technicien_seq",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "technicien_seq")
    private Long id;

    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String cellPhone;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String emailAttachement;
    @Column(length = 500)
    private String identifiant;
    @Column(length = 500)
    private String motPasse;
    @Column(length = 500) // TO DO: change text
    private String adresseOnt;

    @ManyToOne
    private Entreprise entreprise;


    public Technicien() {
        super();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCellPhone() {
        return this.cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAttachement() {
        return this.emailAttachement;
    }

    public void setEmailAttachement(String emailAttachement) {
        this.emailAttachement = emailAttachement;
    }

    public Entreprise getEntreprise() {
        return this.entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public String getIdentifiant() {
        return this.identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotPasse() {
        return this.motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getAdresseOnt() {
        return this.adresseOnt;
    }

    public void setAdresseOnt(String adresseOnt) {
        this.adresseOnt = adresseOnt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technicien technicien = (Technicien) o;
        return id != null && id.equals(technicien.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

