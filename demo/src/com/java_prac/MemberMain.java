package com.java_prac;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		boolean result = ms.login("hong", "12345");
		
		if (result) {
			System.out.println("로그인됨.");
			ms.logout("hong");
		}else {
			System.out.println("id 또는 password가 틀림.");
		}

	}

}
