public class Departement {
    private int id;
    private String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Departement(){

    }
    public Departement(int id , String nom){
        this.id=id;
        this.nom=nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
    public boolean equals(Object o){
        if (o==this) return true;
        if(o==null) return false;
        if(this.getClass()!=o.getClass())return false;
        Departement d= (Departement) o;
        if(d.id==this.id&&(d.nom.equals(this.nom))) return true; return false;
    }
}
