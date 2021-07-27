package com.bh.tdd.service;

public class AccountService {

    int balance;

    public AccountService(int money) {
        this.balance = money;
    }

    public int getBalance() {
        return this.balance;
    }

    public int deposit(int money) {
        return this.balance += money;
    }

    public int withdraw(int money) {
        return this.balance -= money;
    }
}
