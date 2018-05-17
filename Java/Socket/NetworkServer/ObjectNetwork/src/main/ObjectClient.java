package main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ObjectClient {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		InetSocketAddress sockAddr = new InetSocketAddress("192.168.10.30", 9000);
		
		try {
		
			Socket socket = new Socket();		
			socket.connect(sockAddr);
			
			InetAddress inetAddr;
			if((inetAddr = socket.getInetAddress())!=null) {
				System.out.println("연결:" + inetAddr);
			}
			
			// recv
			new ObjectThread(socket).start();
			
			while(true) {
			
				System.out.print("이름:");
				String name = sc.next();
				
				System.out.print("나이:");
				int age = sc.nextInt();
				
				DTO dto = new DTO(0, name, age);
				
				// send
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(dto);
				oos.flush();			
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

class ObjectThread extends Thread{
	
	Socket socket;
	
	public ObjectThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {		
		super.run();
		
		try {
			
			while(true) {
				
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				DTO dto = (DTO)ois.readObject();
				System.out.println("받은 Object:" + dto.toString());				
			}
			
		}catch (Exception e) {			
		}
		
	}
	
}
















