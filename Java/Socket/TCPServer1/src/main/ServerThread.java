package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ServerThread extends Thread {
	private Socket socket; //	자기 자신 소켓
	private List<Socket> sockets; //	모든 소켓
	
	
	
	public ServerThread(Socket socket, List<Socket> sockets) {
		super();
		this.socket = socket;
		this.sockets = sockets;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		BufferedReader br;
		try {
			while(true) {
				//	리시브 ( receive ) : 서버는 항상 받고 난 후에 값을 전달한다.
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String recvStr = br.readLine();	//	전달하는 객체는 String or Object 이다. (실제적인 recv를 하는 공간)
				System.out.println("Receive data from client : "+ recvStr);
				
				//	센드 ( send )
				for (int i = 0; i < sockets.size(); i++) {
					Socket temp = sockets.get(i);
					System.out.println("Socket"+i+" : "+temp);
					//	자기 자신을 제외한 나머지 소켓에 받은 메세지를 전달한다.
					//	if(!temp.equals(socket)) {
					PrintWriter pw = new PrintWriter(temp.getOutputStream());
					pw.println(recvStr);
					pw.flush();	// pw.close() 와 동작이 같다 ( 스트림에 남아있는 데이터를 전부 내보내준다. )												
					//	}
				}
				Thread.sleep(1000);				
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
