package com.company;

public class Transactions {

    public Transactions(double balance){

    }

    double depositAmount = 500;
    double balance = 500;

    public void deposit(double depAmount) {

        System.out.println("deposit amount : ");
        balance = balance + depAmount;

        System.out.println("balance after deposit: " + balance);
    }

    public void withdraw(double withAmount) {

        balance = balance - withAmount;

        System.out.println("You withdrew " + withAmount + " from your account.");
        System.out.println("New balance is " + balance);
    }
}
