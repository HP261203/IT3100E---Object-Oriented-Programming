package hust.soict.globalict.aims.exception;
import java.lang.Exception;
public class RepeatException extends Exception{
    public RepeatException() {
        super();
    }

    public RepeatException(String s) {
        super();
        System.err.println(s);
    }
}
