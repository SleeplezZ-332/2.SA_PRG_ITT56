//beispiel auch für Scanner mit einzelnem Buchstaben

import java.util.*;
import java.util.Scanner;

public class FertigGerichte {

    /** Methode zur Ausgabe von Infos über eine Map */
    public static void printAll(Map<String, Integer> m) {
        System.out.println("Im Kühlschrank sind:");
        for (String key : m.keySet()) {
            System.out.println(key + ": " + m.get(key) + " Packungen");
        }
    }

    /** Aufbau und Modifikation einer Map */
    public static void main(String[] args) {
        // Scanner zum Einlesen von Eingaben
        Scanner scanner = new Scanner(System.in);

        // Map mit den Gerichten und deren Beständen
        Map<String, Integer> m = new TreeMap<>();
        m.put("Pizza Knoblauch", 7);
        m.put("Maultaschen", 5);
        m.put("Schupfnudeln", 3);
        m.put("Backkaese", 2);

        // Endlosschleife für das Menü
        while (true) {
            // Menü anzeigen
            System.out.println("Sie können wählen:");
            System.out.println("(b) Bestand anzeigen");
            System.out.println("(e) Einkauf verbuchen");
            System.out.println("(v) Verzehr verbuchen");
            System.out.println("(x) Programm beenden");

            // Benutzerwahl einlesen
            char wahl = scanner.next().charAt(0);

            if (wahl == 'b') {
                // Bestand anzeigen
                printAll(m);
            } else if (wahl == 'e') {
                // Einkauf verbuchen
                scanner.nextLine();  // Puffer leeren
                System.out.print("Welches Gericht haben Sie eingekauft? ");
                String gericht = scanner.nextLine();
                System.out.print("Wie viele Packungen? ");
                int anzahl = scanner.nextInt();
                Integer bestand = m.get(gericht);
                if (bestand != null) {
                    bestand = bestand + anzahl;
                } else {
                    bestand = anzahl; // Wenn das Gericht noch nicht existiert, wird es mit der angegebenen Menge hinzugefügt.
                }
                m.put(gericht, bestand);
            } else if (wahl == 'v') {
                // Verzehr verbuchen
                scanner.nextLine();  // Puffer leeren
                System.out.print("Was wollen Sie essen? ");
                String gericht = scanner.nextLine();
                Integer bestand = m.get(gericht);
                if (bestand == null || bestand == 0) {
                    System.out.println("Gibt es nicht im Kühlschrank!");
                } else {
                    m.put(gericht, --bestand);
                }
            } else if (wahl == 'x') {
                // Programm beenden
                scanner.close();  // Scanner schließen
                return;
            }

            System.out.println();
        }
    }
}
