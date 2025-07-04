package com.day10;

class Rect {
	
	private int w,h;
	
	public void set(int w,int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	//메소드 오버로딩(중복정의)
	//하나의 클래스 안에서 메소드 이름 통일
	//매개변수의 갯수가 다르거나 자료형이 다르면 다른 메소드로 인식
	public void print(int a,int l) {
		System.out.printf("가로 : %d\n", w);
		System.out.printf("세로 : %d\n", h);
		System.out.printf("넓이 : %d\n",a);
		System.out.printf("둘레 : %d\n",l);
	}
	public void print() {
		System.out.printf("가로 : %d\n", w);
		System.out.printf("세로 : %d\n", h);
	}
	
	public void print(int a) {
		System.out.printf("가로 : %d\n", w);
		System.out.printf("세로 : %d\n", h);
		System.out.printf("넓이 : %d\n",a);
	}
	
	public void print(double l) {
		System.out.printf("가로 : %d\n", w);
		System.out.printf("세로 : %d\n", h);
		System.out.printf("둘레 : %d\n",l);
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		Rect r = new Rect();
		
		r.set(10, 20);
		int a = r.area();
		int l = r.length();
		r.print(a, l);
		r.print();
		r.print(a);
		r.print(l);
		
		String str;
		
		

	}

}
