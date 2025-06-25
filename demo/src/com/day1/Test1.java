//이클립스 안에서 비슷한 작업을 하는 클래스들을 모아놓는 논리적 공간
//윈도우 탐색기에서는 폴더로 생성됨
package com.day1;

//Class
//이름: 첫글자 영문자 대문자
//여러개 단어로 클래스이름을 만들때는 카멜 표기법 사용
//예:CustomInfoNote
//접근지정자: public,private,protected
public class Test1 {

	//메서드 - 명령어
	//기본 메인 메소드
	//JDK의 JVM이 자동으로 호출
	//메소드의 이름은 반드시 소문자 영문자로 시작
	//뒷부분은 카멜 표기법 사용
	//예:customInfoNote
	public static void main(String[] args) {
		
		System.out.print("자바 첫시간\n");
		System.out.println("\n오늘은 월요일\n");
		System.out.println("날씨가 더워요");
	}

}
