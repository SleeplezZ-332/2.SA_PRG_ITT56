public class Hund extends Haustiere {
    String kategorie;

    public Hund(String name, double futtervorrat, String kategorie, int gewicht) {
        super(name, futtervorrat, gewicht);
        this.kategorie = kategorie;
    }

    //hier werden die abstrakten Methoden in ihrer eigenen Art und Weise mit Ihren einzelheiten und Spezialitäten
    //deklariert
    @Override
    public void sprich(){
        System.out.println("Wuff");
    }

    public void friss(){
        System.out.println(name + ": " + futtervorrat);
        futtervorrat = futtervorrat - 1.0;
        anzahlTage++;
    }

    public void anzeigen(){
        System.out.print("(Kategorie: " + kategorie + ") ");
        super.anzeigen();
    }
}