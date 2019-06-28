package com.example;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        //get circle area from Circle/parent
        double a = super.getArea();
        return a * this.height;
    }
}
