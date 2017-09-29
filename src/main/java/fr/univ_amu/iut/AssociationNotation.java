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
   public Lien getLien(Module mod, Etudiant etu){return null;}
   public Set<Lien> getLiens(Etudiant etu)
   {
       return null;
   }
   public Set<Lien> getLiens(Module mod)
   {
       return null;
   }
   public Set<Module> getModules(Etudiant etu)
   {
       return null;
   }
    public Set<Etudiant> getEtudiants(Module mod)
    {
        return null;

    }

    public AssociationNotation getInstance() {
        return instance;
    }


}
