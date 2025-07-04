package com.day10;

public class Test6 {

	int a = 5;

	// 초기화 블럭, 객체가 생성되 메모리에 할당 됫을때 딱 한번 무조건 실행
	{
		System.out.println("초기화 블럭 a : " + a);
		a= 10;
		System.out.println("초기화 블럭 a : " + a);
	}

	static int b; //클래스 변수
	
	//static 블럭, 객체 생성 안해도 실행시 자동으로 메모리에 할당 무조건 한번 실행
	static {
		b = 10;
		System.out.println("static 블럭 b : "+ b);
	}
	
	//상수 : 프로그램 실행될때 반드시 초기화 해야되고 끝날때까지 변수값 변경 불가
	final int C;
	
	public Test6() {
		System.out.println("생성자");
		C = 100;
		System.out.println("C : "+ C);
	}
	
	
	public static void main(String[] args) {
		
		Test6 ob = new Test6();
		Test6 ob1 = new Test6();
		
	}

}
