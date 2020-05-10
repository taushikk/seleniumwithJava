package com.in28minutes.oops;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 88, 90, 76 };
		Student student = new Student("Khan", marks);

		int number = student.getNumberOfmarks();
		System.out.println("number of marks : " + number);

		int sum = student.getTotalSumOfmarks();
		System.out.println("sum of marks : " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum of Mark : " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum of Mark : " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average Mark : " + average);

		System.out.println(student);


	}

}
