package com.java_prac;

public class Parent {
	
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String natin) {
		
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}

}
