package com.java_prac;

public class Account {
	
	private int balance;
	private String number;
	private String name;
	
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public Account(String number,String name, int balance) {
		
		this.number = number;
		this.name = name;
		this.balance = balance;
		
	}
	
	
	
	public String getNum() {
		return number;
	}
	public void setNum(String num) {
		this.number = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}else {
			return;
		}
		
	}
	
	
	
	
}
