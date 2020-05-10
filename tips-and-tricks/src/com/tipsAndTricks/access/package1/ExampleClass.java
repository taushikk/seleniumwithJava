package com.tipsAndTricks.access.package1;

public class ExampleClass {

	public void publicMethod() {
	}

	protected void protectedMethod() {
	}

	private void privateMethod() {
	}

	void defaultMethod() {
	}

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();
	}

}
