//TreeMap ist sortiert
import java.util.*;

class HaustierNamenSortedMap {

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
        Map<String, Haustier> m = new TreeMap<>();  // Verwendung von TreeMap statt HashMap

        // Haustiere hinzufügen
        m.put("Bubu", new Haustier("Katze", 7));
        m.put("Alf", new Haustier("Hund", 4));
        m.put("Ede", new Haustier("Goldfisch", 3));
        m.put("Caesar", new Haustier("Maus", 2));
        m.put("Dodo", new Haustier("Wellensittich", 1));

        // Info über die Map ausgeben
        printInfo(m);

        // Einträge modifizieren
        m.remove("Bubu");
        m.put("Ede", new Haustier("Hamster", 0));

        // Info nach Modifikationen ausgeben
        printInfo(m);
    }
}