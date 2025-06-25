package com.day2;

public class Test4 {

	public static void main(String[] args) {
		
		float f = 0;  //0.0
		double d = 0;  //0.0
		
		for (int i = 1; i <= 100000; i++) {
			
//			System.out.println(i+". 수지만세!");
			
			f += 100000;//f = f + 100000;
			d += 100000;//d = d + 100000;
			
		}
		System.out.println(f/100000); //float은 계산이 부정확함
		System.out.println(d/100000);
	}

}