package com.java_prac;

public class Prac2 {
//	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
//	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, 
//	solution을 완성하세요.
//
//	제한 사항
//	문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//	첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
	public static void main(String[] args) {

		Prac2 p2 = new Prac2();

		String a = p2.solution("a             hello hi ");

		System.out.println(a);

	}

//	public String solution(String s) {
//        String answer = "";
//        int count = 0;
//        String sub;
//        for (int i=0; i<s.length(); i++){
//            sub = s.substring(i,i+1);
//            if (sub.equals(" ")){
//                answer += " ";
//                count = 0;
//            }else{
//                if (count % 2 == 0){
//                    answer += sub.toUpperCase();
//                    System.out.println(answer);
//                    count++;
//                }else{
//                    answer += sub.toLowerCase();
//                    count++;
//                }
//            }
//        }
//        return answer;
//    }

	public String solution(String s) {

		String answer = "";
		int cnt = 0;
		String[] array = s.split("");

		for (String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		return answer;
	}

}
