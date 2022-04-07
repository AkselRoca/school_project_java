package modele;

public class Visite {

	protected String references;
	protected String date;
	protected String commentaires;
	protected String matricule;
	protected String codeMed;
	public Visite(String references, String date, String commentaires, String matricule, String codeMed) {
		super();
		this.references = references;
		this.date = date;
		this.commentaires = commentaires;
		this.matricule = matricule;
		this.codeMed = codeMed;
	}
	public String getReferences() {
		return references;
	}
	public void setReferences(String references) {
		this.references = references;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getCodeMed() {
		return codeMed;
	}
	public void setCodeMed(String codeMed) {
		this.codeMed = codeMed;
	}


}
