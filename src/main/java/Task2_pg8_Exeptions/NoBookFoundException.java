package Task2_pg8_Exeptions;

public class NoBookFoundException extends Exception{

    public NoBookFoundException(String message) {
        super(message);
    }
}
