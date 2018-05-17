package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ServerThread extends Thread {
	
	private Socket sock;	// 자기 소켓
	private List<Socket> list;
	
	public ServerThread(Socket sock, List<Socket> list) {
		this.sock = sock;
		this.list = list;
	}	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			while(true) {
				String str;		
				str = reader.readLine();		
				System.out.println("클라이언트로 부터 메시지:" + str);
				
				// send			
				for (int i = 0; i < list.size(); i++) {
					Socket s = list.get(i);
					
					if(sock != s) {
						PrintWriter writer = new PrintWriter(s.getOutputStream());
						writer.println(str);
						writer.flush();
					}
				}				
				
				Thread.sleep(100);				
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
