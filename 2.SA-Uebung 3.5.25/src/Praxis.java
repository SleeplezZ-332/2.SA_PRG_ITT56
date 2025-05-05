public class Praxis {
    public static void main(String[] args) {
        Patient test1 = new Patient("Meier","Hans", 34);
        Privatpatient test2 = new Privatpatient("Pfeiffer","Andi", 22);
        Kassenpatient test3 = new Kassenpatient("Shenja", "Nikol", 23, true);
        Kassenpatient test4 = new Kassenpatient("Lars", "Horcher", 99, false);

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
}
