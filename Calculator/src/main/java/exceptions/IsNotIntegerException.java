package exceptions;

public class IsNotIntegerException extends Exception{

	public IsNotIntegerException() {
		super("Some value of the rational number hasn´t exact root");
	}

}
