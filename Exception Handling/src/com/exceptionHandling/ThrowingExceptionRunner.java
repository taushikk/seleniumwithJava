package com.exceptionHandling;

import com.exceptionHandling.Amount.currenciesDoNotMatchException;

class Amount{

	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	class currenciesDoNotMatchException extends Exception {
		public currenciesDoNotMatchException(String msg) {
			super(msg);
		}
	}

	public void add(Amount other) throws currenciesDoNotMatchException {
		if (!this.currency.equals(other.currency)) {
			// throw new Exception("Currencies don't match : " + this.currency + " & " +
			// other.currency);
			throw new currenciesDoNotMatchException(
					"Currencies don't match : " + this.currency + " & " + other.currency);
		}

		this.amount = this.amount + other.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws currenciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("INR", 20);
		amount1.add(amount2);
		System.out.println(amount1);

	}

}
