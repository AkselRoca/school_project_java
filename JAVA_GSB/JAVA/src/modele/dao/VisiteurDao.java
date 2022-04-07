/*
 * Créé le 22 févr. 2015
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import modele.Visiteur;

/**
 * @author Isabelle 22 févr. 2015 TODO Pour changer le modèle de ce commentaire
 *         de type généré, allez à : Fenêtre - Préférences - Java - Style de
 *         code - Modèles de code
 */
public class VisiteurDao {

	public static Visiteur rechercher(String unMatricule) {
		Visiteur unVisiteur = null;
		ResultSet reqSelection = ConnexionMySql
				.execReqSelection("select * from visiteur where matricule='" + unMatricule + "'");

		try {
			if (reqSelection.next()) {
				String matricule = reqSelection.getString(1);
				String nom = reqSelection.getString(2);
				String prenom = reqSelection.getString(3);
				String login = reqSelection.getString(4);
				String mdp = reqSelection.getString(5);
				String adresse = reqSelection.getString(6);
				String codePostal = reqSelection.getString(7);
				String dateEntree = reqSelection.getString(8);
				String codeUnit = reqSelection.getString(9);
				String nomUnit = reqSelection.getString(10);
				unVisiteur = new Visiteur(matricule, nom, prenom, login, mdp, adresse, codePostal, dateEntree, codeUnit,
						nomUnit);
			}
			;
		} catch (Exception e) {
			System.out
					.println("erreur reqSelection.next() pour la requête - select * from VISITEUR where CODEVISITEUR='"
							+ unMatricule + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
	}

	public static ArrayList<Visiteur> retournerCollectionDesVisiteurs() {
		ArrayList<Visiteur> collectionDesVisiteurs = new ArrayList<Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEMED from Visiteur");
		try {
			while (reqSelection.next()) {
				String codeVisiteur = reqSelection.getString(1);
				collectionDesVisiteurs.add(VisiteurDao.rechercher(codeVisiteur));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisiteurs()");
		}
		return collectionDesVisiteurs;
	}

	public static HashMap<String, Visiteur> retournerDictionnaireDesVisiteurs() {
		HashMap<String, Visiteur> diccoDesVisiteurs = new HashMap<String, Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEMED from Visiteur");
		try {
			while (reqSelection.next()) {
				String codeVisiteur = reqSelection.getString(1);
				diccoDesVisiteurs.put(codeVisiteur, VisiteurDao.rechercher(codeVisiteur));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesVisiteurs()");
		}
		return diccoDesVisiteurs;
	}

}
