package fr.univ_amu.iut.DAO.JDBC;

import fr.univ_amu.iut.ConnexionUnique;
import fr.univ_amu.iut.DAO.DAOEtudiant;
import fr.univ_amu.iut.beans.Etudiant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOEtudiantJDBC implements DAOEtudiant {








    @Override
    public int computeNbEtudiant() {
        return 0;
    }

    @Override
    public List<Etudiant> findByAnnee(int annee) {
         final String reqFindAnnee = "SELECT NUM_ET, NOM_ET, PRENOM_ET " +
                "FROM ETUDIANT "+
                "WHERE ANNEE =" + annee ;

        List<Etudiant> LesEtudiants = new ArrayList<>();

        try (Connection conn = ConnexionUnique.getInstance().getConnection() ){
            System.out.println("Connecte\n");
            // Creation d'une instruction SQL
            Statement stmt = conn.createStatement();
            // Execution de la requete
            System.out.println("Execution de la requete : " + reqFindAnnee );
            ResultSet rset = stmt.executeQuery(reqFindAnnee);
            // Affichage du resultat

            while (rset.next()){
                Etudiant etu = new Etudiant();
                etu.setNomEt(rset.getString("NOM_ET"));
                etu.setPrenomEt(rset.getString("PRENOM_ET"));
                etu.setNumEt(rset.getInt("NUM_ET"));
                LesEtudiants.add(etu);

            }
            // Fermeture de l'instruction (liberation des ressources)
            stmt.close();
            return LesEtudiants;
        } catch (SQLException e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        }
        return LesEtudiants;
    }

    @Override
    public List<Etudiant> findByGroupe(int groupe) {
         final String reqFindByGroup = "SELECT NUM_ET, NOM_ET, PRENOM_ET " +
                "FROM ETUDIANT "+
                "WHERE GROUP="+ groupe;
        List<Etudiant> LesEtudiants = new ArrayList<>();

        try (Connection conn = ConnexionUnique.getInstance().getConnection() ){
            System.out.println("Connecte\n");
            // Creation d'une instruction SQL
            Statement stmt = conn.createStatement();
            // Execution de la requete
            System.out.println("Execution de la requete : " + reqFindByGroup );
            ResultSet rset = stmt.executeQuery(reqFindByGroup);
            // Affichage du resultat

            while (rset.next()){
                Etudiant etu = new Etudiant();
                etu.setNomEt(rset.getString("NOM_ET"));
                etu.setPrenomEt(rset.getString("PRENOM_ET"));
                etu.setNumEt(rset.getInt("NUM_ET"));
                LesEtudiants.add(etu);

            }
            // Fermeture de l'instruction (liberation des ressources)
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        }
        return LesEtudiants;
    }

    @Override
    public List<Etudiant> findByNom(String nomEt) {
        final String reqFindNom = "SELECT NUM_ET, NOM_ET, PRENOM_ET " +
                "FROM ETUDIANT "+
                "WHERE GROUP="+ nomEt;


        List<Etudiant> LesEtudiants = new ArrayList<>();

        try (Connection conn = ConnexionUnique.getInstance().getConnection() ){
            System.out.println("Connecte\n");
            // Creation d'une instruction SQL
            Statement stmt = conn.createStatement();
            // Execution de la requete
            System.out.println("Execution de la requete : " + reqFindNom );
            ResultSet rset = stmt.executeQuery(reqFindNom);
            // Affichage du resultat

            while (rset.next()){
                Etudiant etu = new Etudiant();
                etu.setNomEt(rset.getString("NOM_ET"));
                etu.setPrenomEt(rset.getString("PRENOM_ET"));
                etu.setNumEt(rset.getInt("NUM_ET"));
                LesEtudiants.add(etu);

            }
            // Fermeture de l'instruction (liberation des ressources)
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        }
        return LesEtudiants;
    }

    @Override
    public boolean delete(Etudiant obj) {
        return false;
    }

    @Override
    public List<Etudiant> FindAll(){

         final String reqFindAll = "SELECT NUM_ET, NOM_ET, PRENOM_ET " +
                "FROM ETUDIANT ";
        List<Etudiant> LesEtudiants = new ArrayList<>();
        try (Connection conn = ConnexionUnique.getInstance().getConnection() ){
            System.out.println("Connecte\n");
            // Creation d'une instruction SQL
            Statement stmt = conn.createStatement();
            // Execution de la requete
            System.out.println("Execution de la requete : " + reqFindAll );
            ResultSet rset = stmt.executeQuery(reqFindAll);
            // Affichage du resultat

            while (rset.next()){
                Etudiant etu = new Etudiant();
                etu.setNomEt(rset.getString("NOM_ET"));
                etu.setPrenomEt(rset.getString("PRENOM_ET"));
                etu.setNumEt(rset.getInt("NUM_ET"));
                LesEtudiants.add(etu);

            }
            // Fermeture de l'instruction (liberation des ressources)
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        }
        return LesEtudiants;
    }

    @Override
    public Etudiant getById(int id) {
        return null;
    }

    @Override
    public Etudiant insert(Etudiant obj) {

        return null;
    }

    @Override
    public boolean update(Etudiant obj) {
        return false;
    }
}
