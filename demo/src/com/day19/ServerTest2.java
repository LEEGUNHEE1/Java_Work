package com.day19;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//단체 채팅 서버 만들기
public class ServerTest2 {

	private List<Socket> clients = new ArrayList<Socket>();

	public void serverStart() {

		try {

			ServerSocket ss = new ServerSocket(7777);
			
			System.out.println("서버시작");

			while (true) {

				Socket sc = ss.accept();

				// 스레드
				WorkerThread wt = new WorkerThread(sc);

				wt.start();
			}

		} catch (Exception e) {

		}

	}

	// 스레드 만드는 클래스
	class WorkerThread extends Thread {

		private Socket sc;

		public WorkerThread(Socket sc) {
			this.sc = sc;
		}

		@Override
		public void run() {

			String ip= "";
			String msg;

			try {

				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));

				ip = sc.getInetAddress().getHostAddress();

				// 클라이언트 list에 저장
				clients.add(sc);

				// 다른 클라이언트에게 접속 사실알림
				msg = ip + "]가 입장 했습니다";

				for (Socket s : clients) {
					if (s == sc) {
						continue;// 이번만 생략
					}
					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
					pw.println(msg);
				}
				System.out.println(msg);

				// 대화 전송

				while ((msg = br.readLine()) != null) {

					for (Socket s : clients) {
						if (s == sc) {
							continue;// 이번만 생략
						}
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
					}
					System.out.println(msg);
				}

			} catch (Exception e) {

				msg = ip + "]가 퇴장했습니다";

				try {

					for (Socket s : clients) {
						if (s == sc) {
							continue;// 이번만 생략
						}
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
					}
					System.out.println(msg);

				} catch (Exception e2) {

				}

			}

		}

	}

	public static void main(String[] args) {
		new ServerTest2().serverStart();

	}

}
