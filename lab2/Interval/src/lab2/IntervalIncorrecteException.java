package lab2;

public class IntervalIncorrecteException extends Exception{
	 public IntervalIncorrecteException() { super(); }
	  public IntervalIncorrecteException(String message) { super(message); }
	  public IntervalIncorrecteException(String message, Throwable cause) { super(message, cause); }
	  public IntervalIncorrecteException(Throwable cause) { super(cause); }
}
