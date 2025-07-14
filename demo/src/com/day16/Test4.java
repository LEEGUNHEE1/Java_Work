package com.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//예외처리

public class Test4 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int num1, num2, result;
			String oper;

			System.out.print("첫번째 수 : ");
			num1 = Integer.parseInt(br.readLine());

			System.out.print("두번째 수 : ");
			num2 = Integer.parseInt(br.readLine());

			System.out.print("연산자 : ");
			oper = br.readLine();

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

		} catch (ArithmeticException e) {

			System.out.println("0으로 못나눔");
			System.out.println(e.toString());

		}catch (IOException e) {

			System.out.println("숫자 아님");
			System.out.println(e.toString());
			
		} catch (Exception e) {

			System.out.println("입력오류");
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("항상 실행");
		}

	}

}
