package com.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		
		//Map<key,vlaue>
		//key : Set
		
		Set<String> s = new HashSet<String>();
		
		s.add("서울");
		s.add("부산");
		s.add("대구");
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		s.add("서울");//중복값을 허용하지 않음
		System.out.println(s);
	}

}
