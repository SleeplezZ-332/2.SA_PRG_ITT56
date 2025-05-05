public class Katze extends Haustiere {
    String haltung;

    public Katze(String name, double futtervorrat, String haltung, int gewicht) {
        super(name, futtervorrat, gewicht);
        this.haltung = haltung;
    }

    //hier werden die abstrakten Methoden in ihrer eigenen Art und Weise mit Ihren einzelheiten und Spezialitäten
    //deklariert
    public void sprich(){
        System.out.println("Miau");
    }

    public void friss(){
        System.out.println(name + ": " + futtervorrat);
        futtervorrat = futtervorrat - 0.5;
        anzahlTage++;
    }

    public void anzeigen(){
        System.out.print("(Haltung: " + haltung + ") ");
        super.anzeigen();
    }
}