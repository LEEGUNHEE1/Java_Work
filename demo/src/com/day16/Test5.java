package com.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//사용자 정의 에러 처리
public class Test5 {

	public static String getOper() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String oper = "";

		try {
			System.out.print("연산자 : ");
			oper = br.readLine();

			if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
				// throw로 에러를 의도적으로 발생 시킴
				// 사용자 정의 에러는 try문으로 안에 기술

				throw new Exception("연산자 입력 오류");

			}

		} catch (IOException e) {
			System.out.println("입력 오류");

		}
		return oper;
	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int num1, num2, result;
			String oper;

			System.out.print("첫번째 수 : ");
			num1 = Integer.parseInt(br.readLine());

			System.out.print("두번째 수 : ");
			num2 = Integer.parseInt(br.readLine());

			oper = Test5.getOper();

			result = 0;
			if (oper.equals("+")) {
				result = num1 + num2;

			} else if (oper.equals("-")) {
				result = num1 - num2;

			} else if (oper.equals("*")) {
				result = num1 * num2;

			} else if (oper.equals("/")) {
				result = num1 / num2;

			}
			System.out.printf("%d%s%d=%d\n", num1, oper, num2, result);

		} catch (Exception e) {

			System.out.println(e.toString());
		}

	}

}
