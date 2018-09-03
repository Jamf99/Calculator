package exceptions;

public class DenominatorZeroException extends Exception{

	public DenominatorZeroException() {
		super("Some denominator is zero");
	}
}
