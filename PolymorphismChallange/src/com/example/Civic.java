package com.example;

public class Civic extends Car{
    public Civic(String engine, int cylinders, int wheels, boolean engineRunning, int speed) {
        super(engine, cylinders, wheels, engineRunning, speed);
    }

    @Override
    public void startEngine(){
        System.out.println("starting Honda Civic");
        super.startEngine();
    }
}
