package com.demo.core.lab5;

public interface ATM {
	 boolean withdraw(int accountId, double amount);
	 boolean deposit(int accountId, double amount);
	 boolean queryBalance(int accountId);
	 boolean login(String username, String password);
	 boolean logout(String username);
}
