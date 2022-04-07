package modele;

public class Unite {

    protected String codeunit;
    protected String nom;

    public Unite(String codeunit, String nom) {
        super();
        this.codeunit = codeunit;
        this.nom = nom;
    }

    public String getCodeunit() {
        return codeunit;
    }

    public void setCodeunit(String codeunit) {
        this.codeunit = codeunit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}