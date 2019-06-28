package com.example;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){

        String validModel = model.toLowerCase();
        if(validModel.equals("lx") || validModel.equals("xd")){
            this.model = model;
        } else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
