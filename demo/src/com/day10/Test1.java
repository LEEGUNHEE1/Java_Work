package com.day10;

public class Test1 {

	// static
	// 객체가 100개 생성되도 메모리 공간은 1개만 사용

	public static int a = 10; // Class 변수
	// 클래스변수 또는 클래스 메소드는 로딩되는 순간 메모리 할당이 이뤄지고
	// 클래스의 [클래스이름.객체]로 접근 가능
	// 즉 new를 통해 메모리 할당을 받지 않아도 사용가능

	public int b = 20;// Instance 변수
	// 인스턴스 변수 또는 인스턴스 메소드는 new를 통해 객체를 생성하고
	// 객체를 통해서만 접근이 가능하다
	// 인스턴스 변수는 같은 클래스의 메소드에서는 바로 접근 가능하지만
	// 클래스 메소드에서는 접근 불가

	public void write() { // Instance 메소드
		System.out.println("class 변수 a : " + a);
		System.out.println("instance 변수 b : " + b);
	}

	public static void print() {// Class 메소드
		System.out.println("class 변수 a : " + a);
		// System.out.println("instance 변수 b : " + b);
	}

	public static void main(String[] args) {

		System.out.println("class 변수 a : " + a);
		System.out.println("class 변수 a : " + Test1.a);
		// System.out.println(b);
		// write();

		Test1.print();

		Test1 ob = new Test1();

		System.out.println(ob.b);
		ob.write();

		System.out.println("----------------------");

		Test1 ob1 = new Test1();
		ob1.a = 100;
		ob1.b = 200;

		ob1.write();
		ob.write();

		Test1 ob2 = new Test1();
		
		ob2.a=300;
		ob2.b=500;
		
		ob2.write();
		ob1.write();
		ob.write();
	}

}
