//Eine Runtime Excpetion KANN mit Try+Catch im code abgefangen werden können (MUSS ABER NICHT)
//Sollte kein TRY+CATCH vorhanden sein, dann passiert ein Laufzeit abbruch
//Mit try and catch:
//wenn excpetion eintrifft -> passiert was man halt gecodet hat, und der Code läuft weiter

public class CustomRuntimeException extends RuntimeException {
    public CustomRuntimeException() {}

    public CustomRuntimeException(String message) {
        super(message);
    }
}
