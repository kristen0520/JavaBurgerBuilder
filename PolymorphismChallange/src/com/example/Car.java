package com.example;

public class Car {
    private String engine;
    private int cylinders;
    private int wheels;
    private boolean engineRunning;
    private int speed;

    public Car(String engine, int cylinders, int wheels, boolean engineRunning, int speed) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.engineRunning = engineRunning;
        this.speed = speed;
    }

    public void startEngine(){
        System.out.println("start engine");
        this.engineRunning = true;
    }

    public void accelerate(int speed){
        if(speed < 0){
            System.out.println("invalid speed");
        }
        System.out.println("increase speed by " + speed);
        if(this.speed + speed > 150){
            this.speed = 150;
        }else {
            this.speed = this.speed + speed;
        }
    }

    public void hitBreak(int speed){
        if(speed < 0){
            System.out.println("invalid speed");
        }
        System.out.println("decrease speed by " + speed);
        if(this.speed - speed < 0){
            this.speed = 0;
        }else {
            this.speed = this.speed - speed;
        }
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public int getSpeed() {
        return speed;
    }
}
