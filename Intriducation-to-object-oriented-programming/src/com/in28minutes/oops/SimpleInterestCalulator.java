package com.in28minutes.oops;

import java.math.BigDecimal;

public class SimpleInterestCalulator {

	BigDecimal principle;
	BigDecimal interest;

	public SimpleInterestCalulator(String principle, String interest) {
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		this.principle = new BigDecimal(principle);

	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principle.add(principle.multiply(interest).multiply(noOfYearsBigDecimal));
		return totalValue;
	}

}
