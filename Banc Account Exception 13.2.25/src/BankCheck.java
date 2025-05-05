public class BankCheck {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        //------------ Testen von nicht akzeptablem abheben
        b.setBalance(100.0);
        try{
            b.withdraw(150.00);
        }
        catch(Exception e){
            System.out.println(e);
        }
        //------------ Funktionierendes abheben
        b.setBalance(100.0);
        try{
            b.withdraw(100.00);
        }
        catch(Exception e){
            System.out.println(e);
        }

        //------------ bsp einer Exception ohne handling
        //b.withdraw(150.00);

        b.setBalance(100.00);
        b.withdrawRuntime(150.00);

        System.out.println("Bank Transaction done!");

    }
}
