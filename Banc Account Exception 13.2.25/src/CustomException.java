//Eine normale Excpetion MUSS mit Try+Catch im code abgefangen werden können
//Sonst kompeliert der Code nicht.
//Dadurch: wenn excpetion eintrifft -> passier was man halt gecodet hat, und der Code läuft weiter

public class CustomException extends Exception {
    public CustomException() {}

    public CustomException(String message) {
        super(message);
    }
}
