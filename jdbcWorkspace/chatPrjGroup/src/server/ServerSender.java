package server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServerSender implements Runnable {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		try {
			while(true) {			//cpu 중 코어 하나가 계속 저걸 물고 있으면 컴퓨터 자원이 효율적으로 돌아가지 x
				Thread.sleep(100); //so 쓰레드한테 잠깐 쉬라고 하는 것 (while 문이 계속 돌면 cpu 과부하..)
				String msg = Main.msgQueue.poll();
				if(msg == null) continue;
				for(BufferedWriter bw : Main.bwList) {
					bw.write(msg);
					bw.newLine();
					bw.flush();
				}
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
