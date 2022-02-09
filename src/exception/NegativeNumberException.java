package exception;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(double number) {
    	super ("The number entered is negative "+ number);
    }
}
