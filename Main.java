import java.util.ArrayList;
import java.util.Vector;

import animaux.Animaux;
import animaux.Carnivore;
import animaux.Herbivore;
import point.Point;

public class Main {
    public static void main(String[] args) {
        Vector<Animaux> animaux = new Vector<>();
        // ArrayList<Carnivore> carnivores = new ArrayList<>();

        animaux.add(new Carnivore("lion", 200, new Point(1, 1), new Point(1, 1)));
        animaux.add(new Carnivore("lionne", 100, new Point(2, 2), new Point(2, 3)));
        animaux.add(new Carnivore("puma", 150, new Point(2, 1), new Point(1, 2)));
        animaux.add(new Herbivore("zebre", 100, new Point(3, 3), new Point(1, 1)));
        animaux.add(new Herbivore("moutons", 150, new Point(4, 4), new Point(2, 2)));

        for (int i = 0; i < animaux.size(); i++) {
            Point e = animaux.get(i).deplacer();
            System.out.println(animaux.get(i).getnom() + " " + e.get_x() + " " + e.get_y());
        }

    }
}