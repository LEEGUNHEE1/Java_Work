package com.day16;

import java.util.Scanner;

//예외처리

public class Test3 {

	public static void main(String[] args) {

		try {
			
			int num1,num2,result;
			String oper;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("두개의 수 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("연산자 : ");
			oper = sc.next();
			
			result = 0;
			if (oper.equals("+")) {
				result = num1 +num2;
				
			}else if (oper.equals("-")) {
				result = num1 -num2;
				
			}else if (oper.equals("*")) {
				result = num1 *num2;
				
			}else if (oper.equals("/")) {
				result = num1 / num2;
				
			}
			System.out.printf("%d%s%d=%d\n",
					num1,oper,num2,result);

			
		} catch (Exception e) {

		System.out.println("숫자 아님");
		
		
		}		
		
		
		
		
	}

}
