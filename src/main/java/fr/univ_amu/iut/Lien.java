package fr.univ_amu.iut;


import fr.univ_amu.iut.beans.Etudiant;
import fr.univ_amu.iut.beans.Module;

import java.io.NotActiveException;

/**
 * Created by p16002371 on 25/09/17.
 */
public class Lien {
     private Module module;
     private Etudiant etudiant;
     private Notation note;

     public Lien(Module mod, Etudiant etu){
         etudiant = etu;
         module = mod;

     }

    public Module getModule() {
        return module;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Notation getNote() {
        return note;
    }

    public void setNote(Notation note) {
        this.note = note;
    }
}
