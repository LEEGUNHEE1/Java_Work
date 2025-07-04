package com.day10;

//생성자
//메모리 할당을 받을때 사용
//변수 초기화 목적으로 사용
//생성자는 Class이름과 동일
//리턴값이 없기때문에 property(반환값)이 없다
//중복 정의(overload) 가능
//생성자 안에서 다른 생성자 호출 가능
//단, 제일 선두에서 한번만 호출 가능

public class Test4 {

	private int x;
	
//	public Test4() {// 기본 생성자
//		this(50);
//
//		System.out.println("기본 생성자");
//		x = 10;
//		System.out.println("x : " + x);
//	}
	public Test4() {
		
	}
	public Test4(int x) {
		System.out.println("오버로딩 생성자");
		this.x = x;
		System.out.println("x : " + this.x);
	}

	public static void main(String[] args) {

		Test4 ob = new Test4();
		Test4 ob1 = new Test4(20);

	}

}
