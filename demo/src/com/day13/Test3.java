package com.day13;

//final
//변수에 사용하면 단 한번만 초기화 가능
//메소드에 사용하면 Override 불가능
//클래스에 사용하면 상속 불가능

//final class TestA{
class TestA {
	public static final double PI;

	static {
		PI = 3.14;
	}

	public double area;

	public final void write(String title) {
		System.out.println(title + " : " + area);
	}

}

public class Test3 extends TestA {

//	@Override
//	public void write(String title) {
//	}

	public void circlrArea(int r) {
		area = r*r*PI;
	}
	
	public static void main(String[] args) {
		
		Test3 ob = new Test3();
		
		ob.circlrArea(10);
		ob.write("원");
	}

}
