import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDépartement<département> {
    private HashSet<département> departements;

    // Constructeur
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(département d) {
        if (departements.add(d)) {
            System.out.println("Département ajouté : " + d);
        } else {
            System.out.println("Département existe déjà : " + d);
        }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (département d : departements) {
            if (d.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(département d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(département d) {
        if (departements.remove(d)) {
            System.out.println("Département supprimé : " + d);
        } else {
            System.out.println("Département introuvable : " + d);
        }
    }

    @Override
    public void displayDepartement() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département à afficher.");
        } else {
            System.out.println("Liste des départements :");
            for (département d : departements) {
                System.out.println(d);
            }
        }
    }

    @Override
    public TreeSet<département> trierDepartementById() {
        TreeSet<département> sortedDepartements = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedDepartements.addAll(departements);
        return sortedDepartements;
    }
}