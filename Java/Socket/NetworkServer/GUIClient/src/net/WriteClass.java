package net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import view.ClientFrame;
import view.id;

// 전송 클래스
public class WriteClass {
	
	Socket socket;
	ClientFrame cf;
	
	String str;
	String idStr;
	
	public WriteClass(ClientFrame cf) {
		this.cf = cf;
		this.socket = cf.socket;		
	}
	
	public void sendMsg() {
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(socket.getOutputStream(), true);
			
			if(cf.isFirst) {	// 첫번째 전송
				InetAddress iaddr = socket.getLocalAddress();
				String ip = iaddr.getHostAddress();	// ip주소
				this.idStr = id.getId();
				
				System.out.println("id:" + idStr);
				
				str	= "[" + idStr + "]님 로그인 (" + ip + ")"; 				
			}
			else {	// 그 다음부터 계속
				str = "[" + idStr + "]" + cf.textF.getText();
			}	
			
			pw.println(str);
			pw.flush();			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}








