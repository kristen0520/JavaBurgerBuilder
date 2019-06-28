package com.example;

public class DeluxBurger extends Burger{
    private int chips;
    private int drink;

    public DeluxBurger(double price, String name) {
        super(price, name);
        this.chips = 1;
        this.drink = 1;
    }

    @Override
    public void addTomato() {
        System.out.println("cannot customize combo burger");
    }

    @Override
    public void addSauce() {
        System.out.println("cannot customize combo burger");
    }

    @Override
    public void addOnion() {
        System.out.println("cannot customize combo burger");
    }

    @Override
    public void addLettuce() {
        System.out.println("cannot customize combo burger");
    }

}
