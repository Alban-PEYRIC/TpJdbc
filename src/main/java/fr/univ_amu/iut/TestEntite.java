package fr.univ_amu.iut;

import fr.univ_amu.iut.ConnexionUnique;
import fr.univ_amu.iut.beans.Etudiant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by p16002371 on 25/09/17.
 */
public class TestEntite {
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
            List<Etudiant> LesEtudiants = new ArrayList<>();
            while (rset.next()){
                Etudiant etu = new Etudiant();
                etu.setNomEt(rset.getString("NOM_ET"));
                etu.setPrenomEt(rset.getString("PRENOM_ET"));
                etu.setNumEt(rset.getInt("NUM_ET"));
                LesEtudiants.add(etu);

            }
            // Fermeture de l'instruction (liberation des ressources)
            stmt.close();
            System.out.println(LesEtudiants);
            System.out.println("\nOk.\n");
        } catch (SQLException e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        }
    }
}
