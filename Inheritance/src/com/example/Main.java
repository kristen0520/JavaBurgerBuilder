package com.example;

public class Main {

    public static void main(String[] args) {

    	//Vehicle vehicle = new Vehicle("default", 1);

    	//Car car = new Car("default", 1, false, 1, 1, "default");

		Civic myCar = new Civic("wheel", 60, false, 4, 4, "L13A", true, false, 3747);

		myCar.getEngine();
		myCar.getSpeed();
		myCar.reduceSpeed(30);
		myCar.getSpeed();
		myCar.getSteering();
		myCar.getRadioLockCode();
    }

}
