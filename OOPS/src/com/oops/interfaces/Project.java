package com.oops.interfaces;

public class Project {

	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}
}
