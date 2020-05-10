package com.in28minutes.oops;

public class BiNumber {

	private int number1;
	private int number2;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public BiNumber(int number1, int number2) {
		this.number1= number1;
		this.number2 = number2;
		// TODO Auto-generated constructor stub
	}

	public int add() {
		// TODO Auto-generated method stub
		int sum = number1 + number2;
		return sum;
	}

	public int multiply() {
		// TODO Auto-generated method stub
		int multiplication = number1 * number2;
		return multiplication;
	}

	public void doubleValue() {
		this.number1 *= 2;
		this.number2 *= 2;

	}

}
