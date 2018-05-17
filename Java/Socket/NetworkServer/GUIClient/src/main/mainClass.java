package main;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import net.ReadThread;
import view.ClientFrame;

public class mainClass {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.10.30", 9000);
				
			System.out.println("연결성공!!");
			ClientFrame cf = new ClientFrame(socket);
			
			new ReadThread(socket, cf).start();
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
