package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map<key,value> 인터페이스
//HashTable : Vector와 동일
//HashMap : ArrayList와 동일, 출력시 뒤에서부터 출력
//TreeMap : 자동 정렬되서나옴
//key는 중복값 가질수 없다(Set 타입)
//key가 중복되면 수정됨, 기존 데이터 삭제 
//Map은 iterator가 없다,Set꺼 가져다 씀



public class Test2 {

	//value
	public static final String name[] = {"배수지","유인나","정인선","정소미","서예지"};
	//key
	public static final String tel[] = {"111-1111","222-2222","333-3333","111-1111","444-4444"};
	
	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<String, String>();
		
		//추가
		for (int i = 0; i < name.length; i++) {
			h.put(tel[i],name[i]);
		}
		
		System.out.println(h);
		
		//key를 넣으면 value값 줌
		String str;
		str = h.get("111-1111");
		if (str == null) {
			System.out.println("자료없음");
		}else {
			System.out.println(str);
		}
		
		//키 존재 여부
		if (h.containsKey("222-2222")) {
			System.out.println("222-2222 키 있음");
		}
		
		//value 존재 여부
		if (h.containsValue("서예지")) {
			System.out.println("서예지 있음");
		}
		
		//데이터 삭제
		h.remove("222-2222");
		if (h.contains("222-2222")) {
			System.out.println("222-2222 있다");
		}else {
			System.out.println("222-2222 없다");
		}
		System.out.println(h);
		
		
		
		Iterator<String> it = h.keySet().iterator();
		
		while (it.hasNext()) {
			
			String key = it.next();
			String value = h.get(key);
			
			
			System.out.println(key + " : " +value);
			
			
		}
		
		
		
		
		
		
		
	}

}
