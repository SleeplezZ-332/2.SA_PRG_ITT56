//uebung 10.5 Seite 385
interface Tier {
}

interface Haustier extends Tier {
}

interface Wildtier extends Tier {
}

class Katze implements Tier {
    public String toString() {
        return getClass().getName();
    }
}

class Hauskatze extends Katze implements Haustier {
}

class Wildkatze extends Katze implements Wildtier {
}

public class Tierleben {

    /*
    public static void gibAus(Object tier) {
        System.out.println("Objekt: " + tier);
    }
    */

    /*
    public static void gibAus(Katze tier) {
        System.out.println("Katze:" + tier);
    }
    */

    //Typ 1
    public static <T> void gibAus(T tier) {
        System.out.println("Unbekannt: " + tier);
    }

    //Typ 2
    public static <T extends Tier> void gibAus(T tier) {
        System.out.println("Tier: " + tier);
    }

    //Typ 3
    public static <T extends Haustier> void gibAus(T tier) {
        System.out.println("Haustier: " + tier);
    }

    public static void main(String... args) {
        gibAus("Amoebe"); //typ 1 greift
        gibAus(new Katze()); //typ 2 oder 1 greift
        gibAus(new Hauskatze()); //typ 3 greift
        gibAus(new Wildkatze()); //typ 2 oder 1 greift
    }
}
