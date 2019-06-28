package com.example;

public class Main {

    public static void main(String[] args) {
        BankAccount myaccount = new BankAccount();
        BankAccount kristensAccount = new BankAccount(1555345888, 200000000, "Kristen", "kk@mail.com", 7045533);
        BankAccount defaultAccount = new BankAccount();
        BankAccount pacosAccount = new BankAccount("Paco", "paco@example.com", 22222);

        pacosAccount.getAccountNumber();
        pacosAccount.getName();
        pacosAccount.setName("good boyyy");
        pacosAccount.getName();
        pacosAccount.getBalance();
        pacosAccount.depositFunds(30000);
        pacosAccount.getBalance();
    }
}
