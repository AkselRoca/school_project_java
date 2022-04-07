package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import modele.Visite;
import modele.dao.VisiteDao;
import modele.dao.VisiteurDao;

public class JIFVisiteAjout extends JIFVisite implements ActionListener {
	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private JButton ajout;
	private ArrayList<Visite> lesVisites;

	public JIFVisiteAjout() {
		// TODO Auto-generated constructor stub
		super();
		ajout = new JButton("Ajouter");
		pBoutons.add(ajout);

		// d�claration des sources d'�v�nements
		ajout.addActionListener(this);

		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setTitle("Ajout Visite");
	}

	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		if (source == ajout) {

			try {
				String references = JTreferences.getText();
				String datevisite = JTdatevisite.getText();
				String commentaire = JTcommentaire.getText();
				String matricule = JTmatricule.getText();
				String codemed = JTcodemed.getText();

				System.out.println(references);
				System.out.println(datevisite);
				System.out.println(commentaire);
				System.out.println(matricule);
				System.out.println(codemed);
				if (references.equals("") || datevisite.equals("") || matricule.equals("") || codemed.equals("")) {
					throw new Exception("Tous les champs n'ont pas �t� compl�t�s !");
				} else if (VisiteurDao.rechercher(matricule) == null) {
					throw new Exception("Ce visiteur n'existe pas");
				} else if (VisiteDao.rechercher(references) != null) {
					throw new Exception("Cette visite existe d�j�");
				} else {
					VisiteDao.ajouter(references, datevisite, commentaire, matricule, codemed);
					JOptionPane.showMessageDialog(null, "La visite a �t� ajout��");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
		}
	}

	public ArrayList<Visite> getLesVisites() {
		return lesVisites;
	}

	public void setLesVisites(ArrayList<Visite> lesVisites) {
		this.lesVisites = lesVisites;
	}
}