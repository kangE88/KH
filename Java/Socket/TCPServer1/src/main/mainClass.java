package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = Integer.parseInt("9000");
		List<Socket> sockets = new ArrayList<Socket>(); 
		
		try {
			//	문지기 소켓
			ServerSocket serverSocket = new ServerSocket(port);
			//binding ( ip, port setting )
			
			while(true) {
				//	담당자 소켓 : client 의 connect를 기다린다.
				System.out.println("Waiting...");
				Socket socket = serverSocket.accept();
				//	모든 소켓들을 모은다.
				sockets.add(socket);
				
				//	포트는 담당자 포트 ( os에서 설정해서 자동적으로 주어짐 )
				System.out.println("Connected from : "+socket.getInetAddress()+":"+socket.getPort());
				
				
				//	방금 접속한 소켓과 모든 소켓을 인자로 보내준다.
				new ServerThread(socket, sockets).start();
//				//	리시브와 센드를 쓰레드로 만들어 항시 체크할 수 있도록 한다.
//				//	리시브 ( receive ) : 서버는 항상 받고 난 후에 값을 전달한다.
//				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				String recvStr = br.readLine();	//	전달하는 객체는 String or Object 이다. (실제적인 recv를 하는 공간)
//				System.out.println("Receive data from client : "+ recvStr);
//				
//				//	센드 ( send )
//				String sendStr = "HELLO!";	//	데이터 확인용 ( 서버에서는 입력을 받지 않는다. )
//				PrintWriter pw = new PrintWriter(socket.getOutputStream());
//				pw.println(sendStr);
//				pw.flush();	// pw.close() 와 동작이 같다 ( 스트림에 남아있는 데이터를 전부 내보내준다. )				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
