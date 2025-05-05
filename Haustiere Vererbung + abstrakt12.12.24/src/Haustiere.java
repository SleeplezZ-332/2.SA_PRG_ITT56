//Beispiele für Vererbung, abstrakte Klassen und Methoden
//CompareTo -> Array.Sort

//durch das abstract, kann man die Klasse selbst nicht aufrufen
//das implement ist notwendig um das compareTo durchführen zu können
abstract class Haustiere implements Comparable<Haustiere>{
    String name;
    double futtervorrat;
    int    anzahlTage; // gibt die Anzahl Tage aus, die der Futtervorrat reicht
    int     gewicht;

    public Haustiere(String name, double futtervorrat, int gewicht){
        this.name = name;
        this.futtervorrat = futtervorrat;
        this.gewicht = gewicht;
    }

    public void fuettern(){
        sprich();
        while(futtervorrat > 0){
            friss();
        }
    }

    //durch das abstract, müssen alle Klassen die von dieser Klasse erben, diese methode Implementieren
    //die Methoden selbst der Klasse haustiere z.B. können dabei nicht aufgerufen werden.
    public abstract void sprich();
    public abstract void friss();

    public void anzeigen(){
        System.out.println("["+gewicht+"kg] "+"Der Vorrat fuer " + name + " reicht " + anzahlTage + " Tage");
    }

    public int compareTo(Haustiere o){ // notwendig damit Arrays.sort weiß, wonach es sortieren soll

        //return this.name.compareTo(o.name); //wenn man nach name sortieren will > liefert auch 0,1,-1
        //return o.name.compareTo(this.name); //umgekehrte reihenfolge

        //return Integer.compare(gewicht, o.gewicht); //kürzere version

        //wenn man compareTo verwendet, erwartet das .sort entweder -1,0 oder 1
        //wenn gleich dann 0
        //wenn kleinerer Wert -1
        //wenn größer dann 1
        if(gewicht == o.gewicht){
            return 0;
        }
        else if(gewicht > o.gewicht){
            return 1;
        }
        else{
            return -1;
        }
    }
}