public class BankAccount {
    private int accountNumber;
    private int id = 1;
    private double balance;

    public BankAccount() {
        accountNumber = id;
        balance = 0.0;
        id++;
    }

    //Eine normale exception muss ein throws beinhalten der jeweiligen Exception
    public void withdraw(double amount) throws CustomException {
        //hier schreibt man seinen Code ganz normal
        //wenn man sondersituationen, wie z.b hier eine unerlaubte Abbuchung behandelt werden soll
        //kann man ein "throw exception" implementieren
        if(amount > balance) {
            throw new CustomException("You're broke, go to work! (Insufficient funds)");
        }
        //hier schreibt man dann den regulären code
        else {
            balance -= amount;
            System.out.println("Withdraw Successful");
            System.out.println("New Balance: "+balance);
        }
    }

    //eine runtimeException braucht kein throws
    public void withdrawRuntime(double amount){
        //hier wieder genau so
        if(amount > balance) {
            throw new CustomRuntimeException("You're broke, go to work! (Insufficient funds)");
        }
        else {
            balance -= amount;
            System.out.println("Withdraw Successful");
            System.out.println("New Balance: "+balance);
        }
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }
}
