package com.day13;

//Interface
//추상클래스의 일종으로 선언만 있고 정의가 없다
//final변수만 선언 가능
//변수는 무조건 public, static, final 보유, 생략되있음
//메소드는 public, abstract 보유,생략 , 일반메소드 불가
//interface를 구현하기위해서는 implements사용
//하나 이상의 인터페이스를 구현한 클래스는 모든 메소드를 오버라이드해야함
//인터페이스가 인터페이스를 상속 받을수 있고 이때는 extends 사용
//클래스랑은 다르게 다중 구현 가능

interface Fruit {
	String Won = "원"; // public, static, final 생략

	int getPrice(); // public abstract 생략

	public String getName(); // abstract 생략

}
class FruitImpl implements Fruit{
	
	@Override
	public int getPrice() {

		return 1000;
	}

	@Override
	public String getName() {

		return "사과";
	}

	public String getItem() {
		return "과일";
	}
	
}

public class Test7 {

	public static void main(String[] args) {
		
		// Fruit ob1 = new FruitImpl(); upcast로 객체 생성
		FruitImpl ob1 = new FruitImpl();
		System.out.println(ob1.getItem());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1;//upcast
		
		System.out.println(ob2.getName());
		//System.out.println(ob2.getItem());
		
		
		
	}

}
