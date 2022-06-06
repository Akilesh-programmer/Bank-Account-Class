package com.akilesh;

public class BankAccount {

    // Fields
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // Method to deposit funds.
    public void depositFunds(double amount) {
        this.balance += amount;
    }

    // Method to withdraw funds.
    public double withdrawFunds(double amount) {
        if (amount > this.balance) {
            System.out.println("Not enough balance.");
            return 0;
        } else {
            this.balance -= amount;
            System.out.println("Successfully withdrawn " + amount);
            return amount;
        }
    }
}
