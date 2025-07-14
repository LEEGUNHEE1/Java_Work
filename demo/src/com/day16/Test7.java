package com.day16;

import java.util.Scanner;

class MyAuthenticator {

	public void intputformat(String str) throws Exception {

		// 1. 5~10자 이내인지 검사
		// 문자열의 길이는 5~10자 입니다
		if (str.length() < 5 || str.length() > 10) {
			throw new Exception("문자열의 길이는 5~10자 입니다");
		}

		// 2. 대소문자 구분없이 영문자와 숫자를 섞어서 입력
		// 영문자, 숫자 혼용만 가능합니다
		int eng = 0, num = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch >'a' && ch < 'z') || (ch > 'A' && ch < 'Z')) {
				eng++;

			} else if ((ch > '0' && ch < '9')) {
				num++;
			}

		}
		if (eng == 0 || num == 0) {
			throw new Exception("영문자, 숫자 혼용만 가능합니다");
		}

	}
}

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		MyAuthenticator auth = new MyAuthenticator();

		try {

			System.out.print("문자열 : ");// abasdaw
			str = sc.next();

			// 문자열 검사
			auth.intputformat(str);

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());

		}

	}

}
