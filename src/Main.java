// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Test avec SocieteHashMap:");
        InterfaceSociete societeHashMap = new SocieteHashMap();

        Employe emp1 = new Employe(788965, 85552, "John", "Doe");
        Employe emp2 = new Employe(7895, 788552, "Jane", "Smith");
        Departement dep1 = new Departement(85525, "Ressources Humaines");
        Departement dep2 = new Departement(52885, "Informatique");

        societeHashMap.ajouterEmployeDepartement(emp1, dep1);
        societeHashMap.ajouterEmployeDepartement(emp2, dep2);

        societeHashMap.afficherLesEmployesLeursDepartements();
        societeHashMap.afficherLesEmployes();
        societeHashMap.afficherLesDepartements();
        societeHashMap.afficherDepartement(emp1);

        // Test avec SocieteTreeMap
        System.out.println("\nTest avec SocieteTreeMap:");
        InterfaceSociete societeTreeMap = new SocieteTreeMap();

        Employe emp3 = new Employe(7785, 555588, "Bob", "Johnson");
        Employe emp4 = new Employe(5522, 45521, "Alice", "Williams");
        Departement dep3 = new Departement(455228, "Finance");

        societeTreeMap.ajouterEmployeDepartement(emp3, dep3);
        societeTreeMap.ajouterEmployeDepartement(emp4, dep1);

        societeTreeMap.afficherLesEmployesLeursDepartements();
        societeTreeMap.afficherLesEmployes();
        societeTreeMap.afficherLesDepartements();
        societeTreeMap.afficherDepartement(emp3);



    }
}