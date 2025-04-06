package animaux;

public class Animaux {
    private String nom;
    private int poids;

    public Animaux(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public Animaux() {
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public int getpoids() {
        return poids;
    }

    public void setpoids(int poids) {
        this.poids = poids;
    }

}
