package com.java_prac;

public class Prac2 {

	public static void main(String[] args) {

		Prac2 p2 = new Prac2();

		String a = p2.solution("a             hello hi ");

		System.out.println(a);

	}

	public String solution(String s) {
        String answer = "";
        int count = 0;
        String sub;
        for (int i=0; i<s.length(); i++){
            sub = s.substring(i,i+1);
            if (sub.equals(" ")){
                answer += " ";
                count = 0;
            }else{
                if (count % 2 == 0){
                    answer += sub.toUpperCase();
                    System.out.println(answer);
                    count++;
                }else{
                    answer += sub.toLowerCase();
                    count++;
                }
            }
        }
        return answer;
    }

}
