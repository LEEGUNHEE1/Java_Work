package com.java_prac;

public class Prac2 {

	public static void main(String[] args) {
		
		Prac2 p2 = new Prac2();
		
		String a = p2.solution("qwe saddge sdwed dfse dsf s dwa g");
		
		System.out.println(a);
		
	}
	
	public String solution(String s) {
        String answer = "";
        String str[] = s.split(" ");
        for (int i = 0; i < str.length; i++) {
        	answer += Character.toUpperCase(str[i].charAt(0));
        	for (int j = 1; j < str[i].length(); j++) {
        		if (j % 2 != 0) {
        			answer += Character.toLowerCase(str[i].charAt(j));
    			}else{
    				answer += Character.toUpperCase(str[i].charAt(j));
				}
			}
        	answer += " ";
		}
        answer = answer.substring(0,answer.length()-1);
        return answer;
    }

}
