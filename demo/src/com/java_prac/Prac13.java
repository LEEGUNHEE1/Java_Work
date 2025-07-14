package com.java_prac;

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
