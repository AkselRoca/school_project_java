package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import modele.Visite;

public class VisiteDao {

	public static Visite rechercher(String reference) {

		Visite uneVisite = null;

		ResultSet reqSelection = ConnexionMySql
				.execReqSelection("SELECT * from visite where Reference ='" + reference + "'");
		try {
			if (reqSelection.next()) {
				uneVisite = new Visite(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3),
						reqSelection.getString(4), reqSelection.getString(5));
			}
			;
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - SELECT * from visite where Reference ='"
					+ reference + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
	}

	public static void supprimer(String reference) {

		try {
			String reqDelete = "DELETE from visite where Reference ='" + reference + "'";
			ConnexionMySql.execReqDel(reqDelete);
			System.out.println("La Visite à bien été supprimée !");

		} catch (Exception e) {
			System.out.println(
					"erreur reqDelete pour la requête - DELETE from visite where Reference ='" + reference + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
	}

	public static boolean ajouter(String reference, String dateVisite, String commentaire, String matricule,
			String codemed) {
		Boolean ajouterTest = false;
		SimpleDateFormat date_entree = new SimpleDateFormat(
				"dd/MM/yyyy HH:mm:ss"); 
		SimpleDateFormat date_sql = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Date en entrée : " + dateVisite);
		try {
			Date date = date_entree.parse(dateVisite);
			dateVisite = date_sql.format(date);
			System.out.println("Date en sortie : " + date_sql.format(date));
		} catch (Exception e) {
			System.out.println("Error while parsing date");			
			e.printStackTrace();
		}

		try {
			String reqInsertion = "INSERT into visite values('" + reference + "','" + dateVisite + "','" + commentaire
					+ "','" + matricule + "','" + codemed + "')";
			// System.out.println(requeteInsertion);
			ConnexionMySql.execReqMaj(reqInsertion);
			System.out.println("Votre Visite a bien été prise en compte !");
		ajouterTest = true;
		} catch (Exception e) {
			System.out.println("erreur reqInsertion pour la requête - INSERT into visite values('" + reference + "','"
					+ dateVisite + "','" + commentaire + "','" + matricule + "','" + codemed + "'");
			e.printStackTrace();
		}
		return ajouterTest;
	}

	public static ArrayList<Visite> retournerCollectionDesVisites() {
		ArrayList<Visite> collectionDesVisites = new ArrayList<Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("SELECT REFERENCE from visite;");
		try {
			while (reqSelection.next()) {
				String reference = reqSelection.getString(1);
				collectionDesVisites.add(VisiteDao.rechercher(reference));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisites()");
		}
		return collectionDesVisites;
	}

	public static HashMap<String, Visite> retournerDictionnaireDesVisites() {
		HashMap<String, Visite> diccoDesVisites = new HashMap<String, Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REFERENCE from visite");
		try {
			while (reqSelection.next()) {
				String reference = reqSelection.getString(1);
				diccoDesVisites.put(reference, VisiteDao.rechercher(reference));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesVisites()");
		}
		return diccoDesVisites;
	}

}
