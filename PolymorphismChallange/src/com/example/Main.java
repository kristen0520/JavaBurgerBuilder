package com.example;

public class Main {

    public static void main(String[] args) {
	    Civic civic = new Civic("1.5L", 4, 4, false, 0);
	    Fit fit = new Fit("1.3L", 4, 4, false, 0);
	    Accord accord = new Accord("2L", 6, 4, false, 0);

//	    accord.startEngine();
	    fit.startEngine();
	    civic.startEngine();

    }
}
