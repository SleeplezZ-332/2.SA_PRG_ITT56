//beinhaltet Zahlen Randomiser
//collections (HashSet -> keine Doppelten // TreeSet -> keine Doppelten und Sortiert

//http://www.scalingbits.com/java/javakurs2/programmieren2/collection/loesungen
import java.util.*;

public class LottoTreeset {
    static int lotto = 49; //rein zu testzwecken ausgelagert

    public static void printInfo(Collection<?> c, int n) {
        System.out.println("Alle Lotto Zahlen:");
        for(Iterator<?> i = c.iterator(); i.hasNext();) {
            System.out.println(i.next()+" ");
        }
        System.out.println("Die Zusatzzahl lautet: "+n);
    }

    //hashSet -> Nur keine doppelten
    public static void main(String[] args) {
        Random rand = new Random(); //notwendig für Zahlen randomiser

        System.out.println("TreeSet Lotto:");//treeSet → Keine doppelten und sortiert
        Collection<Integer> lottoTreeset = new TreeSet<Integer>(); //TreeSet ggf. durch HashSet bei Bedarf ersetzen
        //Doppelte werden "übersprungen", deswegen while schleife
        while (lottoTreeset.size() < 6) { //wie bei array, und fängt bei 0 an
            int randomInt = rand.nextInt(lotto)+1; //lotto =0 bis 48 -> daher + 1
            lottoTreeset.add(randomInt);
        }

        int ZusatzZahl = rand.nextInt(lotto)+1;
        while(lottoTreeset.contains(ZusatzZahl)){
            ZusatzZahl = rand.nextInt(lotto)+1;
        }

        printInfo(lottoTreeset, ZusatzZahl);

        System.out.println("--------------------------------------------");

        //linkedList → doppel verkettete Liste → Sehr einfaches einfügen von neuen Elementen
        // schwieriges/langsames Sortieren
        System.out.println("ArrayList Lotto:"); //ArrayList → Doppelte möglich + unsortiert
        List<Integer> lottoArraylist = new ArrayList<Integer>(); //Arraylist → deswegen list
        while (lottoArraylist.size() < 6) {
            int randomInt = rand.nextInt(lotto)+1;
            while(lottoArraylist.contains(randomInt)){
                randomInt = rand.nextInt(lotto)+1;
            }
            lottoArraylist.add(randomInt);
        }
        Collections.sort(lottoArraylist); //sortiert aufsteigend
        //absteigend: Collections.sort(lottoArraylist.reverseOrder());

        ZusatzZahl = rand.nextInt(lotto)+1;
        while(lottoArraylist.contains(ZusatzZahl)){
            ZusatzZahl = rand.nextInt(lotto)+1;
        }

        printInfo(lottoArraylist, ZusatzZahl);
    }
}
