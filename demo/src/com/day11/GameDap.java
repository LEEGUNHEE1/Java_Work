package com.day11;

import java.util.Random;
import java.util.Scanner;

public class GameDap {
	
//	public static void main(String[] args){
//
//		Scanner sc = new Scanner(System.in);
//		String[] str ={"가위","바위","보"};
//		Random rd = new Random();
//
//		//1~3사이의 난수발생
//		int com = rd.nextInt(3)+1;
//
//		//1~3사이의 숫자입력
//		int su;
//		do{
//			System.out.print("1:가위, 2:바위, 3:보 ?");
//			su = sc.nextInt();
//		}while(su<1||su>3);
//
//	System.out.println("사람 :" + str[su-1] + "  컴퓨터 :" + str[com-1]);
//	
//
//	//결과처리
//	String result="";
//
//	result="무승부입니다";
//
//	if((su==1 && com==3) || (su>com && !(com==1 && su ==3)))
//		result="당신이 이겼습니다";
//
//	if((com==1 && su==3) || (com>su && !(su==1 && com ==3)))
//		result="컴퓨터가 이겼습니다";
//		
//
//	System.out.println("결과 : " + result);
//
//}
	
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int su,com;
		String str;
		
		String[] a ={"가위","바위","보"};

		com = rd.nextInt(3);

		System.out.print("1:가위, 2:바위, 3:보 ?");

		su = sc.nextInt()-1;

	System.out.println("컴퓨터 :" + a[com] + " 사람 :" + a[su]);

	if(com==su)
		str="비겼습니다";
	else if((su+2)%3==com)	//수학공식
		str="당신이 이겼습니다";
	else
		str="컴퓨터가 이겼습니다";

	System.out.println(str);

}

}
