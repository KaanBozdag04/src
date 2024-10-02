import java.util.ArrayList;
import java.util.List;

class Matratt {
    // Egenskaper för klassen Matratt
    private String namn;
    private double pris;
    private String typ;
    private int kalorier;

    // Konstruktor för att skapa nya Matratt-objekt
    public Matratt(String namn, double pris, String typ, int kalorier) {
        this.namn = namn;
        this.pris = pris;
        this.typ = typ;
        this.kalorier = kalorier;
    }

    // Getter-metoder för att komma åt information
    public String getNamn() {
        return namn;
    }

    public double getPris() {
        return pris;
    }

    public String getTyp() {
        return typ;
    }

    public int getKalorier() {
        return kalorier;
    }

    // En metod som returnerar en strängrepresentation av maträtten
    @Override
    public String toString() {
        return namn + " (" + typ + ") - " + pris + " SEK, " + kalorier + " kcal";
    }
}

public class LunchMeny {
    public static void main(String[] args) {
        // Skapa en lista för att hålla dagens maträtter
        List<Matratt> dagensMeny = new ArrayList<>();

        // Skapa några maträtter och lägg till dem i listan
        dagensMeny.add(new Matratt("Vegansk Lasagne", 95.0, "Vegansk", 600));
        dagensMeny.add(new Matratt("Grillad Kyckling", 120.0, "Kött", 750));
        dagensMeny.add(new Matratt("Vegetarisk Pizza", 100.0, "Vegetarisk", 850));
        dagensMeny.add(new Matratt("Sallad med Quinoa", 85.0, "Vegetarisk", 350));

        // Skriv ut dagens lunchmeny
        System.out.println("Dagens Lunchmeny:");
        for (Matratt matratt : dagensMeny) {
            System.out.println(matratt);
        }
    }
}
