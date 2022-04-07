/*
 * Créé le 23 févr. 2015
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package tests;

import modele.dao.ConnexionMySql;

import java.sql.ResultSet;

/**
 * @author Isabelle
 * 23 févr. 2015
 * TODO Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class ConnexionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Raccord de méthode auto-généré
		ResultSet resultat = ConnexionMySql
				.execReqSelection("select * from localite");
		try {
			while (resultat.next()) {
				System.out.println(resultat.getString(1) + "  " + resultat.getString(2));
			};
			System.out.println("fin");
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
	}

}


