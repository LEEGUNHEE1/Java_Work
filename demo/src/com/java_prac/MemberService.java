package com.java_prac;

public class MemberService {

	
	
	
	boolean login(String id, String password) {
		
		if (id.equals("hong") && password.equals("12345") ) {
			return true;
		}else {
			return false;
		}
		
	}
	
	void logout(String id) {
		if (id.equals("hong")) {
			System.out.printf("%s 님이 로그아웃\n",id);
		}
	}

}
