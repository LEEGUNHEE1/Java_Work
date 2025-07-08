package com.day12;

//String : 자료형이 아닌 클래스
//저장할 데이터의 양은 커서 Heap영역에 저장하고 사용빈도가 높아 자료형처럼 사용함
//String은 불변의 법칙을 가진다
//문자열비교는 ==가 아니라 equals로 비교해야함


public class Test1 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		
		System.out.println("ob1 == ob2 : "+(ob1 == ob2));//true
		System.out.println("ob1 == ob3 : "+(ob1 == ob3));//false
		System.out.println("ob1.equals(ob3) : "+(ob1.equals(ob3)));//true
		
		ob2 = "Korea";
		System.out.println("ob1 == ob2 : "+(ob1 == ob2));
		
		ob2 = "Japan";
		System.out.println("ob1 == ob2 : "+(ob1 == ob2));
		
		ob2 = "Seoul";
		System.out.println("ob1 == ob2 : "+(ob1 == ob2));
		
	}

}
