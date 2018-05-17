package main;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
		
		List<Socket> list = new ArrayList<Socket>();
		
		try {
			// 문지기 소켓
			ServerSocket serSock = new ServerSocket(9000);
			
			while(true) {
			
				System.out.print("대기중...");
				Socket socket = serSock.accept();	// <-- connect
				// 담당자 소켓
				list.add(socket);
				
				System.out.println("IP:" + socket.getInetAddress()
								+ " Port:" + socket.getPort());
				
				new ServerThread(socket, list).start();
				
				// recv
				/*BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String str = reader.readLine();
				
				System.out.println("클라이언트로 부터 메시지:" + str);
				
				// send
				String msg = "안녕";
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				writer.println(msg);
				writer.flush();*/		
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
