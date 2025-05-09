package com.blc.clc.task;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setCarDetails("Baleno", "Suzuki", 500000.0);
		String res = c1.getCarDetails();
		System.out.println(res);

	}

}
