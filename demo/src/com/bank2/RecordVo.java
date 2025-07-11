package com.bank2;

public class RecordVo {

	private String name;
	private String jumin;
	private String account;
	private String password;
	
	private int money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
	
		String str;
		
		str = String.format(" 이름 : %s 계좌번호 : %d",name,account);
		
		return str;
	}

}
