package com.day11;

import java.util.Random;

public class RandomSu {
	int su;
	
	public int rdsu() {
		Random rd = new Random();
		
		su = rd.nextInt(3) + 1;
		return su;

	}

}
