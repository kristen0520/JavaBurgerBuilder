package com.example;

public class Fit extends Car{
    public Fit(String engine, int cylinders, int wheels, boolean engineRunning, int speed) {
        super(engine, cylinders, wheels, engineRunning, speed);
    }

    @Override
    public void startEngine(){
        System.out.println("starting Honda Fit");
    }
}
