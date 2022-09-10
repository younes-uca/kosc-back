package ma.maneo.kosc.ws.rest.provided.vo;


public class TechnicienVo {

    private String id;
    private String nom;
    private String prenom;
    private String cellPhone;
    private String email;
    private String emailAttachement;
    private String identifiant;
    private String motPasse;
    private String adresseOnt;


    private EntrepriseVo entrepriseVo;


    public TechnicienVo() {
        super();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
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


    public EntrepriseVo getEntrepriseVo() {
        return this.entrepriseVo;
    }

    public void setEntrepriseVo(EntrepriseVo entrepriseVo) {
        this.entrepriseVo = entrepriseVo;
    }


}
