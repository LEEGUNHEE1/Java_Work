package com.bank;

import java.util.Random;

public class Account {
	Random rd = new Random();

	
	public String accountCreate() {
		String acccount = "";
		for(int i =0; i < 13; i++) {
			
			acccount += Integer.toString(rd.nextInt(10));
		}
		
		return acccount;
	}

}
