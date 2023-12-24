import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete{

    TreeMap<Employe,Departement> employeDepartementMap=new TreeMap<>();
    public SocieteTreeMap() {
        // Utilisation d'un TreeMap avec un comparateur basé sur le numéro de CIN de l'employé
        this.employeDepartementMap = new TreeMap<>(Comparator.comparing(Employe::getCin));
    }
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employeDepartementMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employeDepartementMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : employeDepartementMap.entrySet()) {
            System.out.println(entry.getKey() + " travaille dans le département " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : employeDepartementMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : employeDepartementMap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = employeDepartementMap.get(e);
        if (d != null) {
            System.out.println("Le département de l'employé " + e + " est " + d);
        } else {
            System.out.println("L'employé " + e + " n'est affecté à aucun département.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employeDepartementMap.containsValue(d);
    }

}
