package com.day14;

import java.util.Vector;

//Collection Framework
//List(I) - ArrayList(C),Vector(C)
//Map(I) - HashMap(C),HashTable(C),TreeMap(C)
//객체 생성때 제너릭 안주면 요소들이 들어갈때 자동으로 오브젝트 타입으로 업캐스팅됨

public class Test5 {
	
	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.add("서울");
		v.add(30);
		v.add('a');
		
		String str;
		Integer i;
		Character c;
		
		str = (String)v.get(0);
		System.out.println(str);
		
		i = (Integer)v.get(1);
		System.out.println(i);
		
		c = (Character)v.get(2);
		System.out.println(c);
		
		for(i = 0; i < v.size();i++) {
			
			System.out.print(v.get(i) + " ");
			
		}
		System.out.println();
		for(Object ob : v) {
			if (ob instanceof String) {
				str = (String) ob;
				System.out.println(str);
			}else if (ob instanceof Integer) {
				i = (Integer)ob;
				System.out.println(i);
			}else if(ob instanceof Character) {
				c = (Character)ob;
				System.out.println(c);
			}
			
		}
		
	}

}
