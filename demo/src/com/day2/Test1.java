package com.day2;

public class Test1 {

	public static void main(String[] args) {
		int r = 11;
		float area,length;

		area = r*r*3.14f;
		length = r*2*3.14f;
		
		System.out.println("반지름: " + r + ",면적: "+ area);
		System.out.printf("반지름: %d , 면적 : %.2f\n",r,area);
		System.out.printf("반지름: %d , 면적 : %g\n",r,area);//%g = double
		
		int a = 10;
		float b = 6;
		System.out.println(a +":" + b);
		
		a= (int)b;
		System.out.println(a +":" + b);
		
	}

}
