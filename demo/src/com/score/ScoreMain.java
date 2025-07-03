package com.score;

public class ScoreMain {

	public static void main(String[] args) {
		
		//학생 이름, 국영수 점수, 합계 점수, 평균, 랭킹 구하기
		
		Score scr = new Score();
		
		scr.set();
		scr.input();
//		scr.ranking();
		scr.print();
		
	}

}
