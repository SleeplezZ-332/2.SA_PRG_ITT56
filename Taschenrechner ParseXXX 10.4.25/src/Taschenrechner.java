import java.util.Scanner;

public class Taschenrechner {

    public static void rechnen(Scanner sc) {
        System.out.println("Bitte Rechenoperation eingeben (Bsp: 2 + 5)");
        String Text = sc.nextLine();
        String[] zerlegt = Text.split(" ");

        int i1 = Integer.parseInt(zerlegt[0]);
        String s1 = zerlegt[1];
        int i2 = Integer.parseInt(zerlegt[2]);

        int erg = 0;
        switch (s1) {
            case "+":
                erg = i1 + i2;
                break;
            case "-":
                erg = i1 - i2;
                break;
            case "*":
                erg = i1 * i2;
                break;
            case "/":
                erg = i1 / i2;
                break;
            default:
                System.out.println("Fehler // Falscher Operator verwendet");
                return; // Keine Ausgabe, wenn der Operator ungültig ist
        }

        System.out.println("Das Ergebnis lautet: " + erg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;

        do {
            rechnen(sc);
            System.out.println("Wollen Sie weiter rechnen? y = ja / n = nein");
            c = sc.next().charAt(0);
            sc.nextLine(); // Rest der Zeile aufräumen
        } while (c == 'y');

        sc.close();
    }
}
