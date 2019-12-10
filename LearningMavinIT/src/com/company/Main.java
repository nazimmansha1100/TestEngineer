package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Transactions transaction = new Transactions();
        transaction.deposit(100.00);

        transaction.withdraw(50.00);
    }
}
