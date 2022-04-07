package modele;

public class Offrir {

    protected int QteOfferte;
    protected Visite laVisite;
    protected Medicament leMedicament;
    protected String offre;

    public Offrir(String offre, Visite laVisite, Medicament leMedicament, int qteOfferte) {
        super();
        QteOfferte = qteOfferte;
        this.laVisite = laVisite;
        this.leMedicament = leMedicament;
        this.offre = offre;
    }

    public int getQteOfferte() {
        return QteOfferte;
    }

    public void setQteOfferte(int qteOfferte) {
        QteOfferte = qteOfferte;
    }

    public Visite getLaVisite() {
        return laVisite;
    }

    public void setLaVisite(Visite laVisite) {
        this.laVisite = laVisite;
    }

    public Medicament getLeMedicament() {
        return leMedicament;
    }

    public void setLeMedicament(Medicament leMedicament) {
        this.leMedicament = leMedicament;
    }

    public String getOffre() {
        return offre;
    }

    public void setOffre(String offre) {
        this.offre = offre;
    }

}