package projet.demo.myMovie;


public class Films {
    private int id;
    private String nom;
    private int annee;
    private Acteurs acteurs;
    
    public Films(int id, String nom, int annee, Acteurs acteurs) {
        this.id = id;
        this.nom = nom;
        this.annee = annee;
        this.acteurs = acteurs;
    }
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
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public Acteurs getActeurs() {
        return acteurs;
    }
    public void setActeurs(Acteurs acteurs) {
        this.acteurs = acteurs;
    }
    @Override
    public String toString() {
        return "Films [id=" + id + ", nom=" + nom + ", annee=" + annee + ", acteurs=" + acteurs + "]";
    }
    
}
