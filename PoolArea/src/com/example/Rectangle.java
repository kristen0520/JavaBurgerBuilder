package com.example;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if(width < 0){
            width = 0;
        }
        if(length < 0){
            length = 0;
        }
        this.length = length;
        this.width = width;
    }P

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return this.length * this.width;
    }
}
