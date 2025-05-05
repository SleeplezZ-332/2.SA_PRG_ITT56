//Enthält auch scanner für ganze Sätze

//Siehe Seite 471 11.8
import java.util.*;

public class Tokenizer {
    public static void print(StringTokenizer s) {
        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
        System.out.println(); // Fügt eine neue Zeile nach der Ausgabe hinzu
    }

    public static void printInfo(Collection<String> c) {
        System.out.println("Folgende Wörter sind vorhanden (Ohne Doppelt + Sortiert):");
        for (Iterator<?> i = c.iterator(); i.hasNext();) {
            System.out.print(i.next() + " "); // Bleibt in der gleichen Zeile
        }
        System.out.println(); // Fügt eine neue Zeile nach der Ausgabe hinzu
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Satz ein (gerne auch mit doppelten Wörtern):");
        String Text = sc.nextLine();

        // Erster Durchlauf: Tokens ausgeben
        StringTokenizer ZerlegterText = new StringTokenizer(Text);
        //StringTokenizer test = new StringTokenizer(Text, " "); //mit delimiter
        print(ZerlegterText);
        //----------
        // Zweiter Durchlauf: Tokens in TreeSet speichern
        Collection<String> TokenizerTreeset = new TreeSet<String>();
        StringTokenizer ZerlegterText2 = new StringTokenizer(Text);
        while (ZerlegterText2.hasMoreTokens()) {
            TokenizerTreeset.add(ZerlegterText2.nextToken());
        }
        // TreeSet ausgeben
        printInfo(TokenizerTreeset);
        //----------- alternativ mit Split
        System.out.println("Zerlegt mit Split: ");
        String[] erneutZerlegt = Text.split(" ");
        for(String s : erneutZerlegt){
            System.out.println(s);
        }
    }
}
