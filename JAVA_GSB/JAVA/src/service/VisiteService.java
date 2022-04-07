package service;

import javax.swing.JOptionPane;

import modele.Visite;
import modele.dao.VisiteDao;

public class VisiteService {

	public static Visite rechercherVisite(String uneReference, String date, String matricule, String codeMed) {
		Visite uneVisite = null;
		try {
			if (uneReference == null) {
				throw new Exception("Donnée obligatoire : Référence");
			}
			uneVisite = VisiteDao.rechercher(uneReference);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "La visite a déjà été ajoutée ! ", "Erreur", JOptionPane.ERROR_MESSAGE);
		}

		return uneVisite;
	}

	public static int ajouterVisite(String uneReference, String date, String commentaire, String matricule,
			String codeMed) {                                                                                                              
		int entier = 0;
		if (uneReference.length() == 0 ) {
			System.out.println("Donnée obligatoire : Référence");
			entier = 1;
		} else {
			JOptionPane.showMessageDialog(null, "La visite a déjà été ajoutée ! ", "Erreur", JOptionPane.ERROR_MESSAGE);
		}

		return entier;
	}
}
