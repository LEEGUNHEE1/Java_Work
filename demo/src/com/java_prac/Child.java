package com.java_prac;

public class Child extends Parent{

	public String name;
	
	
	public Child() {
		this("홍길동");
	 System.out.println("Chile() call");
	}
	
	
	public Child(String name) {
		this.name = name;
		System.out.println("child(String name) call");
		
	}
	
}
