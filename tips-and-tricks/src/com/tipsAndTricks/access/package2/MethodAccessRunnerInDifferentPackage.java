package com.tipsAndTricks.access.package2;

import com.tipsAndTricks.access.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		// exampleClass.privateMethod();
		// exampleClass.protectedMethod();
		// exampleClass.defaultMethod();

	}

}
