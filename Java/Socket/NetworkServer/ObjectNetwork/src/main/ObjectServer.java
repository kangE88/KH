package main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ObjectServer {

	public static void main(String[] args) {
		
		ServerSocket server = null;		
		Vector<Socket> vec = new Vector<>();
				
		try {
			server = new ServerSocket(9000);
			
			while(true) {
			
				System.out.println("접속중...");
				Socket socket = server.accept();
				
				vec.add(socket);
			
				// thread 구동
				new EchoThread(socket, vec).start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

class EchoThread extends Thread{
	
	Socket socket;
	Vector<Socket> vec;
	
	public EchoThread(Socket socket, Vector<Socket> vec) {
		this.socket = socket;
		this.vec = vec;		
	}

	@Override
	public void run() {		
		super.run();
		int playerNum = 0;
		
		try {
			while(true) {
			
				// recv			
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				DTO dto = (DTO)ois.readObject();
				
				System.out.println("네트워크로 전송된 Object:" + dto.toString());
							
				playerNum++;
				dto.setNumber(playerNum);
								
				// send		
				for (int i = 0; i < vec.size(); i++) {
					Socket s = vec.get(i);
					
					ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
					
					oos.writeObject(dto);					
					oos.flush();
				}			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}	
}