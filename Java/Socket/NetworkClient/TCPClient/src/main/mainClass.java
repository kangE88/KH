package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
	/*
	 	1. 접속을 해야 할 Server의 주소를 설정
	 	2. Socket 생성
	 
	 	3. send(보내다)
	 	4. resive(받는다)
	 
	 */
		// IP, Port
		InetSocketAddress socketAddr = new InetSocketAddress("192.168.10.30", 9000);
		
		try {
			while(true) {
				// Client Socket 생성
				Socket socket = new Socket();
				
				// Server 접속
				socket.connect(socketAddr, 10000);
				
				InetAddress inetAddr;
				
				if((inetAddr = socket.getInetAddress()) != null) {
					System.out.println("연결:"+inetAddr);
				}else {
					System.out.println("연결실패");
					return;
				}
			
			
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				
				System.out.print("전달할 메세지 ==> ");
				String str = sc.next();
				
				writer.println(str);  //send 전송
				
				writer.flush();
				
			}

			
/*			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str2 = reader.readLine(); //resive 받는다
			System.out.println("서버로부터 받은 메세지 ===>" + str2);*/
			
			//socket.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
