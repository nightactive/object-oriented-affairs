package com.company;

public class Account {
    public static final double DEFAULT_BALANCE = 0.0;

    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = DEFAULT_BALANCE;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Sum is over the balance");
        }
    }

    public String toString() {
        return "Account number is " + accountNumber
                + "; Balance: " + Math.round(balance * 100.0) / 100.0;
        // or return String.format("Account number is %d, Balance is %.2f, accountNumber, balance);
    }
}
