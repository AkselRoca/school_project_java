package service;

import modele.Visiteur;
import modele.dao.VisiteurDao;

public class VisiteurService {
	public static Visiteur rechercherVisiteur(String unMatricule) {

		Visiteur unVisiteur = null;
		try {
			if (unMatricule == null) {
				throw new Exception("Donnée obligatoire : Code Visiteur");
			}
			unVisiteur = VisiteurDao.rechercher(unMatricule);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return unVisiteur;
	}

}
