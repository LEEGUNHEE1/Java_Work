package com.java_prac;

public class ShopService {
	
	private static ShopService ss = new ShopService();
	
	private ShopService(){
		
	}
	
	static ShopService getInstance() {
		return ss;
	}

}
