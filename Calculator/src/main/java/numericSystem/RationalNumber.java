package numericSystem;


public class RationalNumber<T extends Number> implements IRationalNumber<RationalNumber<Number>> {
	
	private T numerator;
	private T denominator;

	public RationalNumber(T numerator, T denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	@Override
	public void addRational(RationalNumber<Number> rationalToBeAdded) {
		T aux = this.multiply(numerator, (T) rationalToBeAdded.getDenominator());
		T aux2 = this.multiply(denominator, (T) rationalToBeAdded.getNumerator());
		this.numerator = plus(aux, aux2);
		this.denominator = this.multiply(denominator, (T) rationalToBeAdded.getDenominator());
		simplifyRational();
	}

	@Override
	public void substractRational(RationalNumber<Number> rationalToBeSubstracted) {
		T aux = this.multiply(numerator, (T) rationalToBeSubstracted.getDenominator());
		T aux2 = this.multiply(denominator, (T) rationalToBeSubstracted.getNumerator());
		this.numerator = substract(aux, aux2);
		this.denominator = this.multiply(denominator, (T) rationalToBeSubstracted.getDenominator());
		simplifyRational();
	}

	@Override
	public void multiplyRational(RationalNumber<Number> rationalFactor) {
		this.numerator = multiply(numerator, (T) rationalFactor.getNumerator());
		this.denominator = multiply(denominator, (T) rationalFactor.getDenominator());
		simplifyRational();
	}
	
	private T substract(T number1,T number2) {
		T number=null;
		if(number1 instanceof Long) {
			number=(T)Long.valueOf(number1.longValue()-number2.longValue());
		}else if(number1 instanceof Integer) {
			number=(T)Integer.valueOf(number1.intValue()-number2.intValue());
		}else if(number1 instanceof Short) {
			number=(T)Short.valueOf((short) (number1.shortValue()-number2.shortValue()));
		}
		return number;
	}
	
	private T plus(T number1,T number2) {
		T number=null;
		if(number1 instanceof Long) {
			number=(T)Long.valueOf(number1.longValue()+number2.longValue());
		}else if(number1 instanceof Integer) {
			number=(T)Integer.valueOf(number1.intValue()+number2.intValue());
		}else if(number1 instanceof Short) {
			number=(T)Short.valueOf((short) (number1.shortValue()+number2.shortValue()));
		}
		return number;
	}
	
	private T multiply(T number1,T number2) {
		T number=null;
		if(number1 instanceof Long) {
			number=(T)Long.valueOf(number1.longValue()*number2.longValue());
		}else if(number1 instanceof Integer) {
			number=(T)Integer.valueOf(number1.intValue()*number2.intValue());
		}else if(number1 instanceof Short) {
			number=(T)Short.valueOf((short) (number1.shortValue()*number2.shortValue()));
		}
		return number;
	}
	
	private T mcd(T n,T d) {
		T mcdResult=null;
		if(n instanceof Long) {
			long numerator = n.longValue();
			long denominator = d.longValue();
			if(numerator == 0) {
				mcdResult=(T)Long.valueOf(1);
			}else {
				if(numerator < 0) {
					numerator = numerator*-1;
				}
				if(denominator < 0) {
					denominator = denominator*-1;
				}
				if(denominator > numerator) {
					long aux = numerator;
					numerator = denominator;
					denominator = aux;
				}
				long mcd = 1;
				while(denominator != 0) {
					mcd = denominator;
					denominator = numerator % denominator;
					numerator = mcd;
				}
				mcdResult=(T)Long.valueOf(mcd);
			}
			
		}else if(n instanceof Integer) {
			int numerator = n.intValue();
			int denominator = d.intValue();
			if(numerator == 0) {
				mcdResult=(T)Integer.valueOf(1);
			}else {
				if(numerator < 0) {
					numerator = numerator*-1;
				}
				if(denominator < 0) {
					denominator = denominator*-1;
				}
				if(denominator > numerator) {
					int aux = numerator;
					numerator = denominator;
					denominator = aux;
				}
				int mcd = 1;
				while(denominator != 0) {
					mcd = denominator;
					denominator = numerator % denominator;
					numerator = mcd;
				}
				mcdResult=(T)Integer.valueOf(mcd);
			}
		}else if(n instanceof Short) {
			short numerator = n.shortValue();
			short denominator = d.shortValue();
			if(numerator == 0) {
				mcdResult=(T)Short.valueOf((short) 1);
			}else {
				if(numerator < 0) {
					numerator = (short) (numerator*-1);
				}
				if(denominator < 0) {
					denominator = (short) (denominator*-1);
				}
				if(denominator > numerator) {
					short aux = numerator;
					numerator = denominator;
					denominator = aux;
				}
				short mcd = 1;
				while(denominator != 0) {
					mcd = denominator;
					denominator = (short) (numerator % denominator);
					numerator = mcd;
				}
				mcdResult=(T)Short.valueOf(mcd);
			}
		}
		return mcdResult;
	}
	
	@Override
	public void divideRational(RationalNumber<Number> rationalQuocient) {
		this.numerator = multiply(numerator, (T) rationalQuocient.getDenominator());
		this.denominator = multiply(denominator, (T) rationalQuocient.getNumerator());
		simplifyRational();
	}
	
	private T divideToMcd(T numb,T mcd) {
		T number=null;
		if(numerator instanceof Long) {
			number=(T)Long.valueOf(numb.longValue()/mcd.longValue());
		}else if(numerator instanceof Integer) {
			number=(T)Integer.valueOf(numb.intValue()/mcd.intValue());
		}else if(numerator instanceof Short) {
			number=(T)Short.valueOf((short) (numb.shortValue()/mcd.shortValue()));
		}
		return number;
	}
	
	private boolean areNegative(T num,T den) {
		boolean number=false;
		if(numerator instanceof Long) {
			if(num.longValue() < 0 && den.longValue() < 0) {
				number = true;
			}
		}else if(numerator instanceof Integer) {
			if(num.intValue() < 0 && den.intValue() < 0) {
				number = true;
			}
		}else if(numerator instanceof Short) {
			if(num.shortValue() < 0 && den.shortValue() < 0) {
				number = true;
			}
		}
		return number;
	}
	
	private T transform(T numb) {
		T number=null;
		if(numerator instanceof Long) {
			number=(T)Long.valueOf(numb.longValue()*-1);
		}else if(numerator instanceof Integer) {
			number=(T)Integer.valueOf(numb.intValue()*-1);
		}else if(numerator instanceof Short) {
			number=(T)Short.valueOf((short)(numb.shortValue()*-1));
		}
		return number;
	}

	@Override
	public void simplifyRational() {
		T mcd = mcd(numerator, denominator);
		numerator = divideToMcd(numerator, mcd);
		denominator = divideToMcd(denominator, mcd);
		if(areNegative(numerator, denominator)) {
			numerator = transform(numerator);
			denominator = transform(denominator);
		}
	}

	private boolean verifyngDenominatorIsDiferentToZero(T numb) {
		boolean diferent = false;
		if(numerator instanceof Long) {
			if(numb.longValue() != 0) {
				diferent =  true;
			}
		}else if(numerator instanceof Integer) {
			if(numb.intValue() != 0) {
				diferent =  true;
			}
		}else if(numerator instanceof Short) {
			if(numb.shortValue() != 0) {
				diferent =  true;
			}
		}
		return diferent;
	}
	
	@Override
	public void rationalInverse() {
		if(verifyngDenominatorIsDiferentToZero(numerator)) {
			T aux = numerator;
			this.numerator = denominator;
			this.denominator = aux;
			simplifyRational();
		}		
	}

	private T squeare(T numb) {
		T number=null;
		if(numerator instanceof Long) {
			number=(T)Long.valueOf((long) Math.pow(numb.longValue(), 2));
		}else if(numerator instanceof Integer) {
			number=(T)Integer.valueOf((int) Math.pow(numb.intValue(), 2));
		}else if(numerator instanceof Short) {
			number=(T)Short.valueOf((short) Math.pow(numb.shortValue(), 2));
		}
		return number;
	}
	
	@Override
	public void squaredRational() {
		numerator = squeare(numerator);
		denominator = squeare(denominator);
		simplifyRational();
	}

	@Override
	public Number getNumerator() {
		return numerator;
	}

	@Override
	public Number getDenominator() {
		return denominator;
	}

}
