package com.example;

import java.text.DecimalFormat;

public class Burger {
    private String bun;
    private String patty;
    private int tomato;
    private int sauce;
    private int onion;
    private int lettuce;
    private double price;
    private String basePriceString;
    private String name;


    public Burger() {
        this.bun = "Sesame Seed Bun";
        this.patty = "Beef Patty";
        this.tomato = 0;
        this.sauce = 0;
        this.onion = 0;
        this.lettuce = 0;
        this.price = 3.00;
        this.basePriceString = "$3.00";
        this.name = "Hamburger";
    }

    public Burger(double price, String name) {
        this();
        this.price = price;
        this.name = name;
    }

    public Burger(String bun, String patty, double price, String name){
        this();
        this.bun = bun;
        this.patty = patty;
        this.price = price;
        this.name = name;
    };

    public void setBasePriceString(String basePriceString) {
        this.basePriceString = basePriceString;
    }

    public String getBasePriceString() {
        System.out.println(basePriceString);
        return basePriceString;
    }

    public void addTomato() {
        this.tomato++;
        this.increasePrice(0.15);
    }

    public void addSauce() {
        this.sauce++;
        this.increasePrice(0.25);
    }

    public void addOnion() {
        this.onion++;
        this.increasePrice(0.15);
    }

    public void addLettuce() {
        this.lettuce++;
        this.increasePrice(0.10);
    }

    public void increasePrice(double price){
        price = this.price + price;
        DecimalFormat f = new DecimalFormat("##.000");
        this.price = price;
        this.getPrice();
    }

    public int getTomato() {
        if(tomato > 0){
            System.out.println("tomato x " + tomato + ": " + "$" + tomato * .15);
        }
        return tomato;
    }

    public int getSauce() {
        if(sauce > 0){
            System.out.println("sauce x " + sauce + ": " + "$" + sauce * .25);
        }
        return sauce;
    }

    public int getOnion() {
        if(onion > 0){
            System.out.println("onion x " + onion + ": " + "$" + onion * .15);
        }
        return onion;
    }

    public int getLettuce() {
        if(lettuce > 0){
            System.out.println("lettuce x " + lettuce + ": " + "$" + lettuce * .10);
        }
        return lettuce;
    }

    public String getName() {
        return name;
    }

    public String priceToString(double price){
        double change = this.price % 1;
        int c = (int) Math.round(change*100)/1;
        int d = (int) this.price;
        String priceString = "$" + Integer.toString(d) + "." + Integer.toString(c);
        return priceString;
    }

    public double getPrice(){
        String priceString = this.priceToString(this.price);
        System.out.println(priceString);
        return price;
    }

    public void getAddOns(){
        this.getOnion();
        this.getSauce();
        this.getTomato();
        this.getLettuce();
        System.out.println("total: " + this.priceToString(this.price));
    }

}
