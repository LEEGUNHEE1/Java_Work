package com.day11;

class SuperTestA {

	private int a = 10;

	public void write() {
		System.out.println("a : " + a);
	}

}

public class Test7 {

	public static void main(String[] args) {
		
		SuperTestA ob1 = new SuperTestA();
		SuperTestA ob2 = new SuperTestA();
		
		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		System.out.println("ob1.equals(ob2) : " + (ob1.equals(ob2)));
		
		//HashCode
		System.out.println("ob1 : " + ob1);//@51521cc1
		System.out.println("ob2 : " + ob2);//@1b4fb997
		System.out.println("ob2.toString();" + ob2.toString());
		
		char ch = 'a';
		System.out.println(ch);
		System.out.println(Integer.toString(ch));

	}

}
