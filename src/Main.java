import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Création de départements
        département d1 = new département(1, 10, "Informatique");
        département d2 = new département(2, 15, "RH");
        département d3 = new département(3, 20, "Marketing");

        // Ajouter des départements
        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        // Afficher les départements
        gestionDepartements.displayDepartement();

        // Rechercher un département par nom
        System.out.println("Département 'RH' trouvé : " + gestionDepartements.rechercherDepartement("RH"));

        // Supprimer un département
        gestionDepartements.supprimerDepartement(d2);
        gestionDepartements.displayDepartement();

        // Trier les départements par ID
        TreeSet<département> triés = gestionDepartements.trierDepartementById();
        System.out.println("Départements triés par ID :");
        for (département d : triés) {
            System.out.println(d);
        }
    }
}