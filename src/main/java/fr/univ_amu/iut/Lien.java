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

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lien lien = (Lien) o;

        if (module != null ? !module.equals(lien.module) : lien.module != null) return false;
        if (etudiant != null ? !etudiant.equals(lien.etudiant) : lien.etudiant != null) return false;
        return note != null ? note.equals(lien.note) : lien.note == null;
    }

    @Override
    public int hashCode() {
        int result = module != null ? module.hashCode() : 0;
        result = 31 * result + (etudiant != null ? etudiant.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}

