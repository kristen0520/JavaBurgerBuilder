package com.example;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        double a = super.getArea();
        return a * this.height;
    }
}
