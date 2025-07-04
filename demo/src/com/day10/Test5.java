package com.day10;

import java.util.Scanner;

class RectA {
	private int w, h;

	public void set(int w, int h) {// 변수 초기화 메소드
		this.w = w;
		this.h = h;
	}

	RectA() {

	}

	public RectA(int w, int h) {// 오버로딩된 생성자
		this.w = w;
		this.h = h;
	}

	public int area() {
		return w * h;
	}

	public int length() {
		return (w + h) * 2;
	}

	public void print() {
		System.out.printf("가로 : %d\n", w);
		System.out.printf("세로 : %d\n", h);
	}

	public void print(int a, int l) {
		System.out.printf("가로 : %d\n", w);
		System.out.printf("세로 : %d\n", h);
		System.out.printf("넓이 : %d\n", a);
		System.out.printf("둘레 : %d\n", l);
	}
}

public class Test5 {

	public static void main(String[] args) {

		RectA ra = new RectA();//기본 생성자
		ra.set(10, 20);
		int a = ra.area();
		int l = ra.length();
		ra.print();
		ra.print(a,l);
		System.out.println("-------------------");
		
		RectA ra1 = new RectA(100, 200);//오버로딩된 생성자
		a = ra1.area();
		l = ra1.length();
		ra1.print();
		ra1.print(a,l);
		
		Scanner sc = new Scanner(System.in);
		
		
	}

}
