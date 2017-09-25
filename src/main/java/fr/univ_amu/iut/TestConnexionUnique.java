package fr.univ_amu.iut;// Ne pas faire un copier/coller du pdf...

// Importer les classes jdbc

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnexionUnique {

	// La requete de test
	static final String req = "SELECT NUM_ET, NOM_ET, PRENOM_ET " +
	                          "FROM ETUDIANT " +
	                          "WHERE VILLE_ET = 'AIX-EN-PROVENCE'";

	public static void main(String[] args) throws SQLException {
		// Connexion a la base
		System.out.println("Connexion ");
		try (Connection conn = ConnexionUnique.getInstance().getConnection() ){
			System.out.println("Connecte\n");
			// Creation d'une instruction SQL
			Statement stmt = conn.createStatement();
			// Execution de la requete
			System.out.println("Execution de la requete : " + req );
			ResultSet rset = stmt.executeQuery(req);
			// Affichage du resultat
			while (rset.next()){	
				System.out.print(rset.getInt("NUM_ET") + " ");
				System.out.print(rset.getString("NOM_ET") + " ");
				System.out.println(rset.getString("PRENOM_ET"));
			}
			// Fermeture de l'instruction (liberation des ressources)
			stmt.close();
			System.out.println("\nOk.\n");
		} catch (SQLException e) {
			e.printStackTrace();// Arggg!!!
			System.out.println(e.getMessage() + "\n");
		}
	}
}
