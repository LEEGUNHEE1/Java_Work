package com.day14;

class Outer1 {

	static int a = 10;
	int b = 20;

	public class Inner1 {
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}
	
	public void print() {
		Inner1 ob = new Inner1();
		ob.write();
	}


}

public class Test1 {

	public static void main(String[] args) {
		
		//외부 클래스 객체가 생성 되어야 내부 클래스 객체도 생성 가능
		//외부 클래스 객체가 생성됫다고해서 내부 클래스 객체가 생성된건 아님
		Outer1 out = new Outer1();
		out.print();
		
		Outer1.Inner1 in = out.new Inner1();
		//Outer1.Inner1 in = new Outer1().new Inner1();// 위랑 동일
		in.write();
		

	}

}
