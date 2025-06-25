package com.day1;

public class Test2 {
	public static void main(String[] args) {
		//변수
		//메소드 이름 정의를 따름
		//자료형 변수;
		//예:customInfoNote
		//int: 8개 자료형중 하나(정수만)
		//10,-10,0(약 플마 21억)
//		int num1;
//		int num2;
		//int num1 = 10; 변수 선언과 동시에 초기화
		
		int num1,num2;
		
		//변수 초기화
		// = 은 대입 연산자
		num1 = 10;
		num2 = 3;
		
		int num3,num4; //초기화 안해서 쓰레기값 들어감

//		System.out.println(num3);//쓰레기값은 출력 불가
		
		num3 = num1 + num2;
		num4 = num1 - num2;
	
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println("--------------");
		
		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println(num1 + "-" + num2 + "=" + num4);
		
		System.out.printf("%d + %d = %d\n",num1,num2,num3);
		System.out.printf("%d - %d = %d%n",num1,num2,num4);
		
		
		
		
		
	}

}
