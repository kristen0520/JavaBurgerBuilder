package com.example;

public class VIPCustomer {
    private String name;
    private double limit;
    private String email;

    public VIPCustomer(String name, double limit, String email){
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public VIPCustomer(){
        this("default name", 100, "example@mail.com");
    }

    public VIPCustomer(String name, String email){
        this(name, 100, email);
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
