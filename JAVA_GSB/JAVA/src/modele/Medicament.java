package modele;

public class Medicament {
		protected String depotLegal;
		protected String nomCommercial;
		protected String composition;
		protected String effets;
		protected String contreIndication;
		protected String prixEchantillon;
		protected Famille Famille;


public Medicament(String depotLegal, String nomCommercial, String composition, String effets, String contreIndication, String prixEchantillon, Famille codeFamille, Famille Famille) {
		super();
		this.depotLegal = depotLegal ;
		this.nomCommercial = nomCommercial ;
		this.composition = composition ; 
		this.effets = effets ;
		this.contreIndication = contreIndication ;
		this.prixEchantillon = prixEchantillon ;
		this.Famille = Famille;

}

public String getDepotLegal() {
	return depotLegal;
}


public void setDepotLegal(String depotLegal) {
	this.depotLegal = depotLegal;
}


public String getNomCommercial() {
	return nomCommercial;
}


public void setNomCommercial(String nomCommercial) {
	this.nomCommercial = nomCommercial;
}


public String getComposition() {
	return composition;
}


public void setComposition(String composition) {
	this.composition = composition;
}


public String getEffets() {
	return effets;
}


public void setEffets(String effets) {
	this.effets = effets;
}


public String getContreIndication() {
	return contreIndication;
}


public void setContreIndication(String contreIndication) {
	this.contreIndication = contreIndication;
}


public String getPrixEchantillon() {
	return prixEchantillon;
}


public void setPrixEchantillon(String prixEchantillon) {
	this.prixEchantillon = prixEchantillon;
}

public Famille getFamille() {
	return Famille;
}
public void setFamille(Famille famille) {
	Famille = famille;
}


}
