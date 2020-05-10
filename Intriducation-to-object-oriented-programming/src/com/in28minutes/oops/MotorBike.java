package com.in28minutes.oops;

public class MotorBike {
	private int speed;

	void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}

	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + 100;
	}
	public void decreaseSpeed(int howMuch) {
		this.speed = this.speed - 50;
	}
	int getSpeed() {
		return this.speed;
	}
	void start() {
		System.out.println("Bike Started");
	}

}
