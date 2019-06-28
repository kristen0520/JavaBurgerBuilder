package com.example;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger();
        HealthyBurger healthyBurger = new HealthyBurger("Brown Rye Bread", "veggie Patty", 3.50,"Veggie Burger");
        DeluxBurger deluxBurger = new DeluxBurger(5.00, "Delux Burger");

        burger.addSauce();
        burger.addOnion();
        burger.getAddOns();

        healthyBurger.addAvacado();
        healthyBurger.addAvacado();
        healthyBurger.addLettuce();
        healthyBurger.addTomato();
        healthyBurger.getAddOns();

        deluxBurger.addOnion();
    }
}
