/*
 * Cr�� le 22 f�vr. 2015
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package modele.dao;

import java.sql.ResultSet;

import modele.Localite;

/**
 * @author Isabelle 22 f�vr. 2015 TODO Pour changer le mod�le de ce commentaire
 *         de type g�n�r�, allez � : Fen�tre - Pr�f�rences - Java - Style de
 *         code - Mod�les de code
 */
public class LocaliteDao {

    public static Localite rechercher(String codeLocalite) {
        Localite uneLocalite = null;
        ResultSet reqSelection = ConnexionMySql
                .execReqSelection("select * from LOCALITE where CODEPOSTAL='" + codeLocalite + "'");
        try {
            if (reqSelection.next()) {
                uneLocalite = new Localite(reqSelection.getString(1), reqSelection.getString(2));
            }
            ;
        } catch (Exception e) {
            System.out.println("erreur reqSelection.next() pour la requ�te - select * from LOCALITE where CODEPOSTAL='"
                    + codeLocalite + "'");
            e.printStackTrace();
        }
        ConnexionMySql.fermerConnexionBd();
        return uneLocalite;
    }

}