package com.java_prac;

//네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 
//일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

public class Prac13 {

	public static void main(String[] args) {
		
		String s = "one4seveneight";
		
		Prac13 p13 = new Prac13();
		System.out.println(p13.solution(s));

	}
	
	
	public int solution(String s) {
        int answer = 0;
        String ar[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] su = {"0","1","2","3","4","5","6","7","8","9"};
        
        	for (int i = 0; i < su.length; i++) {
				s = s.replaceAll(ar[i], su[i]);
				System.out.println(s);
			}
        	
        answer = Integer.parseInt(s);
        return answer;
    }
}
