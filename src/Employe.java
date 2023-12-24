public class Employe {
    private int cin;
    private String nom;
    private int matricule;
    private String prenom;

    public int getCin(){
        return cin;
    }
    public void setCin(int cin){
        this.cin=cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Employe(){

    }
    public Employe(int matricule,int cin , String nom,String prenom){
        this.matricule=matricule;
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
    }

    public String toString(){
        return "Cin :" +cin+ "Matricule :" +matricule+ "nom:" +nom+ "prenom: " +prenom ;
    }
    public boolean equals(Object o){
        if (o==this) return true;
        if(o==null) return false;
        if(this.getClass()!=o.getClass())return false;
        Employe e= (Employe) o;
        if(e.matricule==this.matricule&&(e.nom.equals(this.nom))) return true; return false;
    }
}
