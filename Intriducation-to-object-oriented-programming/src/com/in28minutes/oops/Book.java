package com.in28minutes.oops;

public class Book {
	private int noOfCopies;

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	int getNoOfCopies() {
		return this.noOfCopies;
	}

	public void increaseNoOfCopies(int howMuch) {
		this.noOfCopies = this.noOfCopies + 100;
	}

	public void decreaseNoOfCopies(int howMuch) {
		this.noOfCopies = this.noOfCopies - 50;
	}

}
