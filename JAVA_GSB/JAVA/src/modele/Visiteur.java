package modele;

public class Visiteur {

	protected String matricule;
    protected String nom;
    protected String prenom;
    protected String login;
    protected String mdp;
    protected String adresse;
    protected String codePostal;
    protected String dateEntree;
    protected String codeUnit;
    protected String nomUnit;
	public Visiteur(String matricule, String nom, String prenom, String login, String mdp, String adresse,
			String codePostal, String dateEntree, String codeUnit, String nomUnit) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.dateEntree = dateEntree;
		this.codeUnit = codeUnit;
		this.nomUnit = nomUnit;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}
	public String getCodeUnit() {
		return codeUnit;
	}
	public void setCodeUnit(String codeUnit) {
		this.codeUnit = codeUnit;
	}
	public String getNomUnit() {
		return nomUnit;
	}
	public void setNomUnit(String nomUnit) {
		this.nomUnit = nomUnit;
	}
    
    
}
