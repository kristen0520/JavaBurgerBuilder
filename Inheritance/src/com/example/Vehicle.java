package com.example;

public class Vehicle {
    private String steering;
    private int speed;
    private int color;

    public Vehicle(String steering, int speed) {
        this.steering = steering;
        this.speed = speed;
    }

    public void increaseSpeed(int speed) {
        if(speed < 0){
            System.out.println("Invalid speed value");
            return;
        }
        System.out.println(speed);
        this.speed = this.speed + speed;
    }

    public void reduceSpeed(int speed){
        if(speed > this.speed){
            System.out.println("Invalid speed value");
            return;
        }
        System.out.println(speed);
        this.speed = this.speed - speed;
    }

    public String getSteering() {
        System.out.println(steering);
        return steering;
    }

    public int getSpeed() {
        System.out.println(speed);
        return speed;
    }
}
