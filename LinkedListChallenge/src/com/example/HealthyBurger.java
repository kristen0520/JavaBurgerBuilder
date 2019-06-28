package com.example;

public class HealthyBurger extends Burger {
    private int avacado;
    private int veganaise;

    public HealthyBurger(String bun, String patty, double price, String name) {
        super(bun, patty, price, name);
        this.avacado = 0;
        this.veganaise = 0;
        super.setBasePriceString( super.priceToString(price) );

    }

    public void addAvacado() {
        this.avacado++;
        super.increasePrice(0.60);
    }

    public void addVeganaise() {
        this.veganaise++;
        super.increasePrice(0.25);
    }

    public int getAvacado() {
        if(avacado > 0){
            System.out.println("avacado x " + avacado + ": " + "$" + avacado * .60);
        }
        return avacado;
    }

    public int getVeganaise() {
        if(veganaise > 0){
            System.out.println("veganaise x " + veganaise + ": " + "$" + veganaise * .25);
        }
        return veganaise;
    }

    @Override
    public void getAddOns(){
        System.out.println(super.getName() + ": " + super.getBasePriceString());
        this.getAvacado();
        this.getVeganaise();
        super.getAddOns();
    }


}
