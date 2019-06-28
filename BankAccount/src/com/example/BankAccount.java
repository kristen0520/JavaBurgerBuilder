package com.example;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private double phoneNumber;

    public BankAccount(){
        this(11111, 1, "default name", "default address", 11111);
        System.out.println("empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, double phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    };

    public BankAccount(String name, String email, double phoneNumber){
        this(2222, 2.50, name, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber){
        System.out.println("old account number = " + this.accountNumber);
        this.accountNumber = accountNumber;
        System.out.println("new account number = "+ this.accountNumber);
    }

    public void setBalance(int balance){
        System.out.println("old balance = "+this.balance);
        this.balance = balance;
        System.out.println("new balance = "+this.balance);
    }

    public void setName(String name){
        System.out.println("old name = "+ this.name);
        this.name = name;
        System.out.println("new name = "+this.name);
    }

    public void setEmail(String email){
        System.out.println("old email = " + this.email);
        this.email = email;
        System.out.println("new email = " + this.email);
    }

    public void setPhoneNumber(int phoneNumber){
        System.out.println(this.phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        System.out.println(this.accountNumber);
        return this.accountNumber;
    }

    public double getBalance(){
        System.out.println(this.balance);
        return this.balance;
    }

    public String getName(){
        System.out.println(this.name);
        return this.name;
    }

    public String getEmail(){
        System.out.println(this.email);
        return this.email;
    }

    public double getPhoneNumber(){
        System.out.println(this.phoneNumber);
        return this.phoneNumber;
    }

    public void withdrawFunds(double withdrawAmount){
        System.out.println("balance before withdraw = "+balance);
        if(withdrawAmount > this.balance){
            System.out.println("not enough funds");
            return;
        }
        System.out.println("balance after withdraw = "+balance);
        this.balance = this.balance - withdrawAmount;
    }

    public void depositFunds(double depositAmount){
        System.out.println("balance before deposit = "+balance);
        this.balance = this.balance + depositAmount;
        System.out.println("balance after deposit = " + balance);
    }
}


