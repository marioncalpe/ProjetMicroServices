package projet.demo.myMovie;

public class Acteurs {
    private String nomActeurs;
    private Films films;
    public Acteurs(String nomActeurs, Films films) {
        this.nomActeurs = nomActeurs;
        this.films = films;
    }
    public String getNomActeurs() {
        return nomActeurs;
    }
    public void setNomActeurs(String nomActeurs) {
        this.nomActeurs = nomActeurs;
    }
    public Films getFilms() {
        return films;
    }
    public void setFilms(Films films) {
        this.films = films;
    }
    @Override
    public String toString() {
        return "Acteurs [nomActeurs=" + nomActeurs + ", films=" + films + "]";
    }

}