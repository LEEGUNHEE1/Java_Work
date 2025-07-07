package com.day11;

//상속(부모가 자식한테 주는것)
//1.부모꺼는 자식꺼다
//2.private로 선언한 것은 상속 불가
//3.protected로 선언한 것은 상속 가능
//4.자식꺼는 자식꺼
//5.부모와 자식이 같은 객체를 가지고 있으면 내꺼를 사용한다

class TestA {

	private String title;
	private int area;

	public void set(String title, int area) {
		this.title = title;
		this.area = area;
	}

	public void print() {
		System.out.println(title + " : " + area);
	}

}

class RectA extends TestA{

	private int w, h;

	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		
		int a = w*h;
		set("사각형", a);
		
	}

}

public class Test2 {

	public static void main(String[] args) {
		
		RectA ob = new RectA(10, 5);
		ob.rectArea();
		ob.print();

	}

}
