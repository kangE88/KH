package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class serverThread extends Thread {

	private Socket socket;
	private List<Socket> list;
	
	public serverThread(Socket socket, List<Socket> list) {
		this.socket = socket;
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		
		try {
			//resive
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
								
				String str = reader.readLine();
				
				//resive 받는다
				System.out.println("클라이언트로부터 받은 메세지 ===>" + str);
				
				//send
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				
				String str2 = "반갑습니다..";
				
				writer.println(str2);  //send 전송
				
				writer.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
