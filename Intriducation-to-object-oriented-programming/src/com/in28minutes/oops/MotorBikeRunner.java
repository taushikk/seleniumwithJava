package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();
		ducati.setSpeed(100);
		System.out.println("Ducati speed is : " + ducati.getSpeed());
		ducati.increaseSpeed(100);
		honda.increaseSpeed(50);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		// int ducatiSpeed = ducati.getSpeed();
		// ducatiSpeed = ducatiSpeed + 100;
		// ducati.setSpeed(ducatiSpeed);
		// System.out.println(ducatiSpeed);
		// honda.setSpeed(20);
		// System.out.println("Honda speed is : " + honda.getSpeed());
		//		ducati.setSpeed(80);
		//		honda.setSpeed(0);
	}

}
