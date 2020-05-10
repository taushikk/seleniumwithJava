package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(80);
		cleanCode.setNoOfCopies(50);

		System.out.println("Initial no of books count : " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("Initial no of books count : " + effectiveJava.getNoOfCopies());
		System.out.println("Initial no of books count : " + cleanCode.getNoOfCopies());

		artOfComputerProgramming.increaseNoOfCopies(100);
		effectiveJava.increaseNoOfCopies(80);
		cleanCode.increaseNoOfCopies(50);

		System.out.println("After Increase total no of books count : " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("After Increase total no of books count : " + effectiveJava.getNoOfCopies());
		System.out.println("After Increase total no of books count : " + cleanCode.getNoOfCopies());

		artOfComputerProgramming.decreaseNoOfCopies(100);
		effectiveJava.decreaseNoOfCopies(80);
		cleanCode.decreaseNoOfCopies(50);

		System.out.println("After decrease total no of books count : " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("After decrease total no of books count : " + effectiveJava.getNoOfCopies());
		System.out.println("After decrease total no of books count : " + cleanCode.getNoOfCopies());

	}

}
