package com.day8;

public class Test3 {

	public static void main(String[] args) {

		Com ob = new Com();
		int a, l;

		ob.input();
		a = ob.area();
		l = ob.length();
		ob.print(a, l);

		// -----------------------

		Com ob1 = new Com();

		ob1.input();
		a = ob1.area();
		l = ob1.length();
		ob1.print(a, l);
		
		
		System.out.println(ob.w);
		System.out.println(ob.h);
		System.out.println(ob1.w);
		System.out.println(ob1.h);

	}

}
