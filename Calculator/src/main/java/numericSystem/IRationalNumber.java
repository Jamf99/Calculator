package numericSystem;

import exceptions.IsNotIntegerException;

public interface IRationalNumber <T>{
	
	public void addRational(T rationalToBeAdded);
	public void substractRational(T rationalToBeSubstracted);
	public void multiplyRational(T rationalFactor);
	public void divideRational(T rationalQuocient);
	public void simplifyRational();
	public void rationalInverse();
	public void squaredRational() throws IsNotIntegerException;
	public Number getNumerator();
	public Number getDenominator();
	public String toString();
	
}