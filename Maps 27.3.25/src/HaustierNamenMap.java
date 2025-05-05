//HashMap ist unsortiert (reihenfolge random, hängt von hash und Java ab)
//also reihenfolge kann ungleich der Reihenfolge sein wie man es hinzugefügt hat
import java.util.*;

public class HaustierNamenMap {

    /** Methode zur Ausgabe von Informationen über eine Map */
    public static void printInfo(Map<String, Haustier> m) {
        System.out.println("Die Map enthält " + m.size() + " Elemente.");
        System.out.println("Ist Bubu in der Menge enthalten? " + m.containsKey("Bubu"));

        System.out.println("Alle Elemente der Map:");
        for (String key : m.keySet()) {
            System.out.println(key + ": " + m.get(key));
        }
        System.out.println();
    }

    /** Aufbau und Modifikation einer Map */
    public static void main(String[] args) {
        Map<String, Haustier> m = new HashMap<>();
        m.put("Bubu", new Haustier("Katze", 7));
        m.put("Alf", new Haustier("Hund", 4));
        m.put("Ede", new Haustier("Goldfisch", 3));
        m.put("Caesar", new Haustier("Maus", 2));
        m.put("Dodo", new Haustier("Wellensittich", 1));

        printInfo(m);

        m.remove("Bubu");
        m.put("Ede", new Haustier("Hamster", 0));

        printInfo(m);
    }
}




