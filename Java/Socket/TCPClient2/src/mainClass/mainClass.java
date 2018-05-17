package mainClass;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//	IP, Port
		int port = Integer.parseInt("9000");
		String ip = "192.168.10.30";
		InetSocketAddress sockAddr = new InetSocketAddress(ip, port);
		
		try {
			
			Socket socket = new Socket();
			socket.connect(sockAddr, 10000);
			
			//	연결 정보를 얻어오는 작업 ( 안해도 무방하지만 접속이 됐는지 확인을 하기 위한 것이다. )
			InetAddress inetAddress;
			if((inetAddress = socket.getInetAddress())!=null) {
				System.out.println("Connected to Server : "+inetAddress);
			}else {
				System.out.println("Connection Fail");
			}
			
			new ReadThread(socket).start();
			
			while(true) {
				System.out.println("Msg to Send : ");
				String sendMsg = scanner.next();
				
				//	send
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println(sendMsg);
				pw.flush();
				
				//	receive 가 스레드가 되어야 한다. ( 항상 대기상태로 받을 준비를 해야한다. )
				//	receive ( 받는 상태를 대기상태로 만들어야 한다. )
		//		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//		String recvStr = br.readLine();	//	실제 데이터를 받는 부분
		//		System.out.println("Receive Msg from Server : " + recvStr);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

