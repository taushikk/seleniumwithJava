package com.oops.level2;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("Usha", 0.5, "White");
		fan.switchOn();
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
