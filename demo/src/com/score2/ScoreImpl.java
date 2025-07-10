package com.score2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> lists = new ArrayList<ScoreVO>();

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);

		ScoreVO vo = new ScoreVO();

		System.out.print("학번 : ");
		vo.setHak(sc.next());

		System.out.print("이름 : ");
		vo.setName(sc.next());

		System.out.print("국어점수 : ");
		vo.setKor(sc.nextInt());

		System.out.print("영어점수 : ");
		vo.setEng(sc.nextInt());

		System.out.print("수학점수 : ");
		vo.setMat(sc.nextInt());

		lists.add(vo);

	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
	}
}
