package com.example;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        double r = radius * Math.PI;
        //r = r * r;
        return r;
    }
}
