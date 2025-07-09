package com.day13;

class TestB{
	
	public void print() {
		System.out.println("TestB Class");
	}
	
}

class TestC{
	public void print() {
		System.out.println("TestC Class");
	}
	
}


public class Test6 {

	public static void main(String[] args) {

		TestB ob1 = new TestB();
		TestC ob2;
		//클래스 달라서 오류
		//ob2 = ob1;
		
	}

}
