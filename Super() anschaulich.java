class Mahlzeit {
    Mahlzeit() {
        System.out.println("Mahlzeit()");
    }
}

class Brot {
    Brot() {
        System.out.println("Brot()");
    }
}

class Wurst {
    Wurst() {
        System.out.println("Wurst()");
    }
}

class Salat {
    Salat() {
        System.out.println("Salat()");
    }
}

class Mittagessen extends Mahlzeit {
    Mittagessen() {
        System.out.println("Mittagessen()");
    }
}

class Vesper extends Mittagessen {
    Vesper() {
        System.out.println("Vesper()");
    }
}

class Sandwich extends Vesper {
    Brot b = new Brot();
    Wurst w = new Wurst();
    Salat s = new Salat();

    Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

//Ausgabe lautet in der Reihenfolge:
//Mahlzeit() -> 1.
//Mittagessen() -> 1.
//Vesper() -> 1.
//Brot() -> 2.
//Wurst() -> 2.
//Salat() -> 2.
//Sandwich() -> 3.
//1. Liegt damit zusammen, da zuerst alle Vererbungen (durch das Standard super() aufgerufen werden)
//2. dann werden die eigenen variablen generiert (und dabei aufgerufen)
//3. dann wird erst der eigene Konstruktor aufgerufen


