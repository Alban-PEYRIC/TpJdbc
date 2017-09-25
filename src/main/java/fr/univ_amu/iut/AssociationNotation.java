package fr.univ_amu.iut;

import fr.univ_amu.iut.beans.Etudiant;
import fr.univ_amu.iut.beans.Module;

import java.util.Set;

/**
 * Created by p16002371 on 25/09/17.
 */
public class AssociationNotation {
    private Set<Lien> liens;
    private AssociationNotation instance;

    public void creerLien(Module mod, Etudiant etu, Notation note)
    {

    }
    public void supprimerLien(Module mode, Etudiant etu)
    {

    }
    public void supprimerLien(Lien link) {

    }
   public Lien getLien(Module mod, Etudiant etu){

   }
   public Set<Lien> getLiens(Etudiant etu)
   {

   }
   public Set<Lien> getLiens(Module mod)
   {

   }
   public Set<Module> getModules(Etudiant etu)
   {

   }
    public Set<Etudiant> getEtudiants(Module mod)
    {
        return;

    }

    public AssociationNotation getInstance() {
        return instance;
    }


}
