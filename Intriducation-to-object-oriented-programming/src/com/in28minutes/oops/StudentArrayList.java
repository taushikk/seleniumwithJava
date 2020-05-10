package com.in28minutes.oops;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class StudentArrayList {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public StudentArrayList(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfmarks() {
		return marks.size();
	}

	public int getTotalSumOfmarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int maximum = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfmarks();
		int number = getNumberOfmarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);

	}

	public void removeMarkAtIndex(int index) {
		marks.remove(3);

	}

}
