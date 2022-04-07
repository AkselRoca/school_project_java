package modele;

public class Famille {

    protected String codeFamille;
    protected String libelleFamille;

    public Famille(String codeFamille, String libelleFamille) {
        super();
        this.codeFamille = codeFamille;
        this.libelleFamille = libelleFamille;
    }

    public String getCodeFamille() {
        return codeFamille;
    }

    public void setCodeFamille(String codeFamille) {
        this.codeFamille = codeFamille;
    }

    public String getLibelleFamille() {
        return libelleFamille;
    }

    public void setLibelleFamille(String libelleFamille) {
        this.libelleFamille = libelleFamille;
    }

}