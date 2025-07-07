package com.day11;

import java.io.IOException;

public class Game {

	public static void main(String[] args) throws IOException {

		Screen scr = new Screen();
		RandomSu rs = new RandomSu();
		int i;
		boolean esc = true;

		do {
			String result = "";
			i = scr.screen(rs.rdsu());

			switch (i) {
			case 1:
				if (rs.su == 1) {
					result = "비겼습니다";
				} else if (rs.su == 2) {
					result = "졌습니다";
				} else {
					result = "이겼습니다";
				}
				break;
			case 2:
				if (rs.su == 1) {
					result = "이겼습니다";
				} else if (rs.su == 2) {
					result = "비겼습니다";
				} else {
					result = "졌습니다";
				}
				break;
			case 3:
				if (rs.su == 1) {
					result = "졌습니다";
				} else if (rs.su == 2) {
					result = "이겼습니다";
				} else {
					result = "비겼습니다";
				}
				break;
			default:
				esc = false;
				result = "종료";
				break;

			}
			System.out.println(result);

		} while (esc);

	}

}
