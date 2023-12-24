import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete{

    HashMap<Employe,Departement> hashmap=new HashMap<>();
    public void ajouterEmployeDepartement(Employe e,Departement d){
        hashmap.put(e,d);
    }
    public void supprimerEmploye(Employe e){
        hashmap.remove(e);
    }
    public void afficherLesEmployesLeursDepartements(){
        for(Map.Entry<Employe,Departement> map :hashmap.entrySet()){
            System.out.println(map.getKey() +"travail dans le department :" +map.getValue() );
        }
    }
    public void afficherLesEmployes(){
        for(Employe e : hashmap.keySet()){
            System.out.println(e);
        }
    }
    public void afficherLesDepartements(){
        for(Departement d: hashmap.values()){
            System.out.println(d);
        }
    }
    public void afficherDepartement(Employe e) {
        Departement d = hashmap.get(e);
        if (d != null) {
            System.out.println("Le département de l'employé " + e + " est " + d);
        } else {
            System.out.println("L'employé " + e + " n'est affecté à aucun département.");
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return hashmap.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d){
        return hashmap.containsValue(d);
    }


}
