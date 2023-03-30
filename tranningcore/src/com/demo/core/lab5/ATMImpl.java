package com.demo.core.lab5;

public class ATMImpl implements ATM {
    private int idATM;
    private int accountId;

    public ATMImpl(int idATM) {
        this.idATM = idATM;
    }

    @Override
    public boolean withdraw(int accountId, double amount) {
        // implement withdraw method
        return false;
    }

    @Override
    public boolean deposit(int accountId, double amount) {
        // implement deposit method
        return false;
    }

    @Override
    public boolean queryBalance(int accountId) {
        // implement queryBalance method
        return false;
    }

    @Override
    public boolean login(String username, String password) {
        // implement login method
        return false;
    }

    @Override
    public boolean logout(String username) {
        // implement logout method
        return false;
    }

}
