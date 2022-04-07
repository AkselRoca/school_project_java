package vue;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modele.Visite;

public class JIFVisite extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    protected JPanel p;
    protected JPanel pTexte;
    protected JPanel pBoutons;

    protected JLabel JLreferences;
    protected JLabel JLdatevisite;
    protected JLabel JLcommentaire;
    protected JLabel JLmatricule;
    protected JLabel JLcodemed;

    protected JTextField JTreferences;
    protected JTextField JTdatevisite;
    protected JTextField JTcommentaire;
    protected JTextField JTmatricule;
    protected JTextField JTcodemed;

    public JIFVisite() {

        p = new JPanel(); // panneau principal de la fenêtre
        pBoutons = new JPanel(); // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(6, 2));

        JLreferences = new JLabel("References");
        JLdatevisite = new JLabel("Date visite");
        JLcommentaire = new JLabel("Commentaires");
        JLmatricule = new JLabel("Matricule");
        JLcodemed = new JLabel("Code médecin");

        JTreferences = new JTextField(20);
        JTdatevisite = new JTextField();
        JTcommentaire = new JTextField();
        JTmatricule = new JTextField();
        JTcodemed = new JTextField();

        pTexte.add(JLreferences);
        pTexte.add(JTreferences);
        pTexte.add(JLdatevisite);
        pTexte.add(JTdatevisite);
        pTexte.add(JLcommentaire);
        pTexte.add(JTcommentaire);
        pTexte.add(JLmatricule);
        pTexte.add(JTmatricule);
        pTexte.add(JLcodemed);
        pTexte.add(JTcodemed);

        p.add(pTexte);
        p.add(pBoutons);
        Container contentPane = getContentPane();
        contentPane.add(p);

    }

    public void remplirText(Visite uneVisite) {
        JTreferences.setText(uneVisite.getReferences());
        JTdatevisite.setText(uneVisite.getDate());
        JTcommentaire.setText(uneVisite.getCommentaires());
        JTmatricule.setText(uneVisite.getMatricule());
        JTcodemed.setText(uneVisite.getCodeMed());

    }

    public void viderText() {

        JTreferences.setText("");
        JTdatevisite.setText("");
        JTcommentaire.setText("");
        JTmatricule.setText("");
        JTcodemed.setText("");
    }

}
