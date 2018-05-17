package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import view.ClientFrame;

public class ReadThread extends Thread{

	Socket socket;
	ClientFrame cf;
	
	public ReadThread(Socket socket, ClientFrame cf) {
		this.cf = cf;
		this.socket = socket;
	}
		
	@Override
	public void run() {		
		super.run();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String str = null;
			
			while(true) {
				str = br.readLine();
				if(str == null) {
					System.out.println("접속 끊김");
					break;
				}
				
				cf.textA.append(str + "\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
