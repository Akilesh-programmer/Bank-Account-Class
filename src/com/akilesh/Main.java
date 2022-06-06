package com.akilesh;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.withdrawFunds(1000));

        bankAccount.setAccountNumber("1234567891012131");
        bankAccount.setBalance(10000000L);
        bankAccount.setName("Akilesh");
        bankAccount.setEmail("something@gmail.com");
        bankAccount.setPhoneNumber("1234567891");
        bankAccount.depositFunds(1);

        bankAccount.withdrawFunds(1);

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.withdrawFunds(1000));

    }
}
