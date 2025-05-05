import java.util.*;
import java.util.Scanner;

public class BabyWoerter {

    /** Methode zur Ausgabe von Infos über eine Map */
    public static void printAll(Map<String, String> m) {
        System.out.println("Baby-Wörterbuch:");
        for (String key : m.keySet()) {
            System.out.println(key + " bedeutet: " + m.get(key));
        }
    }

    /** Aufbau und Modifikation einer Map */
    public static void main(String[] args) {
        // Scanner zum Einlesen von Eingaben
        Scanner scanner = new Scanner(System.in);

        // Map für Baby-Wörter
        Map<String, String> m = new TreeMap<>();

        while (true) {
            // Menü anzeigen
            System.out.println("Sie können wählen:");
            System.out.println("(a) alle Wörter anzeigen");
            System.out.println("(n) neues Wort eintragen");
            System.out.println("(x) Programm beenden");

            // Benutzerwahl einlesen
            char wahl = scanner.next().charAt(0);

            if (wahl == 'a') {
                // Alle Wörter anzeigen
                printAll(m);
            } else if (wahl == 'n') {
                // Neues Wort eintragen
                scanner.nextLine();  // Puffer leeren
                System.out.print("Was sagt das Baby? ");
                String babywort = scanner.nextLine();
                System.out.print("Was bedeutet es? ");
                String wort = scanner.nextLine();
                m.put(babywort, wort);
            } else if (wahl == 'x') {
                // Programm beenden
                scanner.close();  // Scanner schließen
                return;
            }

            System.out.println();
        }
    }
}
