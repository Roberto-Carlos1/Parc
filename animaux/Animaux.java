package animaux;

import point.*;

public class Animaux {
    private String nom;
    private int poids;
    private Point point;
    private Point new_point;

    public Animaux(String nom, int poids, Point point, Point new_point) {
        this.nom = nom;
        this.poids = poids;
        this.point = point;
        this.new_point = new_point;
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

    public Point deplacer() {
        int x = this.point.get_x() + this.new_point.get_x();
        int y = this.point.get_y() + this.new_point.get_y();

        return new Point(x, y);
    }
}
