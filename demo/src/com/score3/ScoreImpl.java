package com.score3;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score{

	Scanner sc = new Scanner(System.in);
	
	//private Map<String, ScoreVO> hMap = new HashMap<String, ScoreVO>();
	private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>();
	
	String hak;
	
	@Override
	public void input() {
		
		System.out.print("학번 : ");
		hak = sc.next();
		
		if (searchHak(hak)) {
			
			System.out.println("학번이 존재합니다. 추가 실패");
			return;
		}
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름 : ");
		vo.setName(sc.next());
		
		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 : ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		
		System.out.println("추가 성공");
	}

	@Override
	public boolean searchHak(String hak) {
		
		if (hMap.containsKey(hak)) {
			return true;
		}
		
		return false;
	}

	@Override
	public void print() {
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while (it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			System.out.println(hak + " " + vo);
		}
		
		
		
	}

	@Override
	public void delete() {
		
		System.out.print("삭제할 학번 : ");
		String hak= sc.next();
		
		if (searchHak(hak)) {
			
			hMap.remove(hak);
			
			System.out.println("삭제 성공");
			return;
		}
		System.out.println("삭제 실패");
		
	}

	@Override
	public void update() {
		System.out.print("수정할 학번 : ");
		String hak = sc.next();
		
		if (!searchHak(hak)) {
			
			System.out.println("수정 실패");
			return;
		}
		
		Iterator<String> it = hMap.keySet().iterator();
		
		//방법1
		ScoreVO preVO = hMap.get(hak);
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("수정할 국어 : ");
		vo.setKor(sc.nextInt());
		
		System.out.print("수정할 영어 : ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수정할 수학 : ");
		vo.setMat(sc.nextInt());
		
		String preName = preVO.getName();
		
		vo.setName(preName);
		hMap.put(hak, vo);
		
//		//방법2
//		ScoreVO vo = hMap.get(hak);
//		System.out.print("수정할 국어 : ");
//		vo.setKor(sc.nextInt());
//		
//		System.out.print("수정할 영어 : ");
//		vo.setEng(sc.nextInt());
//		
//		System.out.print("수정할 수학 : ");
//		vo.setMat(sc.nextInt());
//		
//		System.out.println("수정 성공");
		
	}

	@Override
	public void findHak() {
		System.out.print("검색할 학번 : ");
		String hak = sc.next();
		
		if (!searchHak(hak)) {
			
			System.out.println("검색 실패");	
			return;
		}
		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + " " + vo);
		
	}

	@Override
	public void findName() {
		
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		
		boolean flag = false;
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while (it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			if (vo.getName().equals(name)) {
				
				System.out.println(hak + " " + vo);
				
				flag = true;
			}
		}
		if (!flag) {
			
			System.out.println("검색 실패");
			
		}
		
		
	}

}
