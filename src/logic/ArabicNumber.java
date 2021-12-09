package logic;

import commons.Converter;
import interfaces.ArithmeticOperation;

public class ArabicNumber implements ArithmeticOperation {
	private int oprnd_a;
	private int oprnd_b;
	private String oprt;
	
	public ArabicNumber(int oprnd_a, int oprnd_b, String oprt) { 
		this.oprnd_a = oprnd_a;
		this.oprnd_b = oprnd_b;
		this.oprt = oprt;
	}
	
	public String performOperation() {	
		int result = 0;
		switch(oprt) {
        	case "*": result = oprnd_a * oprnd_b; break;
        	case "/": result = oprnd_a / oprnd_b; break;
        	case "+": result = oprnd_a + oprnd_b; break;
        	case "-": result = oprnd_a - oprnd_b; break;
		}
		return Converter.intToString(result);
	}
}
