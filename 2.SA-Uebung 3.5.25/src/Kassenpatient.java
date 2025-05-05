public class Kassenpatient extends Patient{
    private boolean familienversichert;

    public Kassenpatient(String name, String Vorname,int alter, boolean familienversichert){
        super(name,Vorname,alter);
        this.familienversichert = familienversichert;
    }

    @Override
    public String toString() {
        String text;
        if (familienversichert){
            text = ", familienversichert";
        }
        else{
            text = ", nicht familienversichert";
        }
        return super.toString() + text;
    }
}
