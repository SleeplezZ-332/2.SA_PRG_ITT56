import java.util.*;

// public abstract class Patient → Dann kann man Patient nicht mehr direkt aufrufen
public class Patient {
    private String name;
    private String vorname;
    private int PatientNr;
    private int alter;

    private static int nummer_vorgabe = 1000; //static benötigt, dass es für alle gleich ist

    public Patient(String name, String Vorname,int alter){
        this.name = name;
        this.vorname = Vorname;
        this.alter = alter;
        setPatientNr();
    }

    String getName(){return name;}
    String getVorname(){return vorname;}
    int getAlter(){return alter;}
    int getPatientNr(){return PatientNr;}

    public void setPatientNr(){
        PatientNr = nummer_vorgabe;
        nummer_vorgabe++;

        //mit Zufallszahl
        // Random random = new Random();
        // return random.nextInt(9000) + 1000;
    }
    
    public String toString(){
        return name + ", " + vorname + ", " + alter+ ", " + PatientNr;
    }
}
