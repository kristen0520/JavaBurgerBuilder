package com.example;

public class Main {

	public static void convertToKilos(double lbs){
		double lbToKg = 0.45359237;
		double kgs = lbs * lbToKg;
		System.out.println(kgs);
	}

    public static void main(String[] args) {

    	int myIntValue = 5/2;
    	float myFloatValue = 5f/ 3f;
    	double myDoubleValue = 5d / 3d;
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);
		convertToKilos(140);

    }
}
