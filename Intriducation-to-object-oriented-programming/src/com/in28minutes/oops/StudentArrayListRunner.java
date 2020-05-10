package com.in28minutes.oops;

import java.math.BigDecimal;

public class StudentArrayListRunner {

	public static void main(String[] args) {

		StudentArrayList student1 = new StudentArrayList("Khan", 88, 90, 76);

		int number = student1.getNumberOfmarks();
		System.out.println("number of marks : " + number);

		int sum = student1.getTotalSumOfmarks();
		System.out.println("sum of marks : " + sum);

		int maximumMark = student1.getMaximumMark();
		System.out.println("Maximum of Mark : " + maximumMark);

		int minimumMark = student1.getMinimumMark();
		System.out.println("Minimum of Mark : " + minimumMark);

		BigDecimal average = student1.getAverageMarks();
		System.out.println("Average Mark : " + average);

		System.out.println(student1);

		student1.addNewMark(80);
		System.out.println(student1);

		student1.removeMarkAtIndex(3);
		System.out.println(student1);
	}

}
