package com.in28minutes.oops;

import java.math.BigDecimal;

public class SimpleInterestCalulatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalulator calculator = new SimpleInterestCalulator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
