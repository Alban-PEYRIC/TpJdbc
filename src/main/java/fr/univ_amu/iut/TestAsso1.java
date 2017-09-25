package fr.univ_amu.iut;

import fr.univ_amu.iut.beans.Etudiant;
import fr.univ_amu.iut.beans.Module;
import fr.univ_amu.iut.beans.Prof;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by p16002371 on 25/09/17.
 */
public class TestAsso1 {
    // La requete de test
    static final String req = "SELECT NUM_PROF, NOM_PROF, PRENOM_PROF, MAT_SPEC " +
            "FROM PROF, MODULE ";


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
            List<Prof> LesProfs = new ArrayList<>();
            while (rset.next()){
                Prof popo = new Prof();
                Module specialite = new Module();
                popo.setNumProf(rset.getInt("NUM_PROF"));
                popo.setNomProf(rset.getString("NOM_PROF"));
                popo.setPrenomProf(rset.getString("PRENOM_PROF"));
                specialite.setCode(rset.getString("MAT_SPEC"));
                popo.setMatSpec(specialite);
                LesProfs.add(popo);



            }
            // Fermeture de l'instruction (liberation des ressources)
            stmt.close();
            System.out.println(LesProfs);
            System.out.println("\nOk.\n");
        } catch (SQLException e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        }
    }
}
