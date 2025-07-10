package com.day14;

//내부 클래스(Local)
//메소드안에 클래스를 만들수 있다

class Outer2{
	
	static int a =10;
	int b=20;
	
	public void write() {
		
		int c =30;
		final int d = 40;
		
		class Inner2{
			
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
		}
		
		Inner2 in = new Inner2();
		in.print();
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		out.write();
		

	}

}
