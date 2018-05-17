package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
	
		/*
		 
		 종단 시스템 - host
		 네트워크 라인을 통해서 더 연장되지 않는 것
		 ex) pc, smart phone, printer, scanner
		 
		 router - hardware
		 host끼리 상호데이터를 교환할 수 있도록 하는 장비
		  
		 protocol - 통신규약
		 종단 시스템과 종단시스템의 통신 약속 
		 
		 protocol
		 TCP, UDP
		 
		 7 Layer
		 1계층 : Physical Layer 물리
		 2계층 : Data Link Layer 주소를 헤더에 첨부
		 3계층 : Network Layer 네트워크 IP address
		 4계층 : Transport Layer 트랜스 port 주소를 지정
		 5계층 : Session Layer 세션부분을 동기화
		 6계층 : Presentation Layer 보안, 데이터의 압축, 확장
		 7계층 : Application Layer 프로그램
		 
		 
		 TCP, UDP
		 
		 Transmission Control Protocol
		 신사적인 프로토콜
		 전화 -> 상대방 연결
		 데이터의 경계가 없다( 반드시 연결이 되야 통신이 이루어진다. )
		 1 : 1 통신
		 채팅
		 
		 User Datagram Protocol
		 비 연결형
		 편지, 지상파 방송
		 데이터의 경계가 있다(크기 정해져 있음)
		 1 : 1 통신 (unicast)
		 1 : 다중(boradcast)
		 다중 : 다중 (multicast)
		 
		 Application <-> Application
		 
		 data == packet
		 
		 Packet : 제어정보가 결합된 형태로 전송되는 실제 데이터
		 			String, Object(DTO)
		 			TCP/UDP
		 			IP, Port
		 			
		 IP : InterNet Protocol
		 
		 IPv4 0 ~ 255 * 4  	192.168.10.45
		 IPv6 0 ~ 255 * 6  	
		 
		 127.0.0.1 -> 자시자신을 접속 (main)
		  
		 Port Number
		 IP 주소는 인터넷에 존재하는 호스트를 식별 할 수 있으나,
		 최종 주체인프로세스(Program)를 식별하지 못하기 때문에
		 프로세스를 식별하기 위한 수치(0 ~ 1024:sys영역으로 사용 못함)
		 
		 Socket - 통신을 하기 위한 Object
		 
		 Java < Win32 	< 	linux(Unix)   
		 		소켓통신	파일 통신
		 
		 통신순서(Server)
		 
		 1. Socket 버전 확인
		 2. binding -> IP, Port 번호 설정
		 3. Listen
		 
		 4. accept <------- Client Connect (접속하기를 기다린다.)
		 	통신 성공 유무 확정
		 5. Packet
		 	1) 수신 resive(받다)	-- Read 
		 	2) 송신	send(보내다)	-- Write
		 	
		 DNS(Domain Network Socket) - 통신 IP -> URL(www.naver.com)
		 
		 
		 
		 */
		
		List<Socket> list = new ArrayList<Socket>();

		int port = Integer.parseInt("9000");
		
		//Socket 생성 부분
		
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			Socket socket =null;	
			
			while(true) {
			
				System.out.println("대기중...");
				//접속 대기
				socket = serverSocket.accept(); //connect	
				list.add(socket);
				
				System.out.println("접속 ip ==>"+socket.getInetAddress()+ " : "+ socket.getPort());
				
				new serverThread(socket, list).start();
			}
			
			/*
			//resive
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = reader.readLine(); //resive 받는다
			System.out.println("클라이언트로부터 받은 메세지 ===>" + str);
			
			
			//send
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			String str2 = "반갑습니다..";
			writer.println(str2);  //send 전송
			writer.flush();
			*/
			
			
			//socket.close();
			//serverSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
