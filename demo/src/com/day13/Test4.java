package com.day13;

//추상클래스
//메모리 낭비없이 클래스 미리 설계
//메소드를 재정의 해서 사용
//추상 메소드 1개가 반드시 있어야함
//일반 메소드도 가능


abstract class ShapeClass{
	
	abstract void draw();
	
}

class Circ extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
}

class Rect extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Tria extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		Circ c= new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw();
		r.draw();
		t.draw();
		
		
	}

}
