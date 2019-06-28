package com.example;

public class Car extends Vehicle {
    private boolean changingGears;
    private int doors;
    private int wheels;
    private String engine;

    public Car(String steering, int speed, boolean changingGears, int doors, int wheels, String engine) {
        super(steering, speed);
        this.changingGears = changingGears;
        this.doors = doors;
        this.wheels = wheels;
        this.engine = engine;
    }

    public boolean isChangingGears() {
        System.out.println(changingGears);
        return changingGears;
    }

    public int getDoors() {
        System.out.println(doors);
        return doors;
    }

    public int getWheels() {
        System.out.println(wheels);
        return wheels;
    }

    public String getEngine() {
        System.out.println(engine);
        return engine;
    }

}
