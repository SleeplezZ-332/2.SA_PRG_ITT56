// https://gailer-net.de/tutorials/java/Notes/chap52/progExercises52.html

import java.util.*; //notwendig für Arrays.sort();

public class HaustiereTest {
    public static void main(String[] args) {
        Haustiere[] haustiere = new Haustiere[5];
        haustiere[0] = new Katze("Minka", 2.0, "Wohnung", 8);
        haustiere[1] = new Katze("Kitty", 3.0, "Wohnung", 6);
        haustiere[2] = new Hund("Strolchi", 2.0, "Kleinhunde", 10);
        haustiere[3] = new Hund("Bello", 3.0, "Kleinhunde", 20);
        haustiere[4] = new Hund("Lessie", 3.0, "Kleinhunde", 12);

        for(int i = 0; i < haustiere.length; i++){
            haustiere[i].fuettern();
            haustiere[i].anzeigen();
        }

        System.out.println("--------------------------------------------------");
        Arrays.sort(haustiere);

        for(int i = 0; i < haustiere.length; i++){
            haustiere[i].fuettern();
            haustiere[i].anzeigen();
        }
    }
}