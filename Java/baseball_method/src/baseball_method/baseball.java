package baseball_method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//baseball 
		int r_num[], u_num[];
		String win_lose_c[];
		boolean clear;

		String name = "";
		String[] datas = null;
		String[] player = null;
		
		String re;
		
		//init
		clear = false;
		r_num = new int[3];
		u_num = new int[3];
		win_lose_c = new String[3];
		
		String temp = "";
		String Filedir = "e:\\tmp1\\";
		
		//이름 입력
		//이름 확인 -> 없으면 회원가입 -> 있으면 승/패 사용
		
		System.out.print("사용자 이름을 입력하세요 : ");
		name = sc.next();
		
		File newFile = new File(Filedir+name+".txt");
		
		if(checkBeforeReadFile(newFile)){
			System.out.println(name+" 님 재방문을 환영합니다!!");
			try {
				FileReader fr = new FileReader(newFile);
				
				BufferedReader br = new BufferedReader(fr);
				
				temp = br.readLine();
				datas = temp.split("-");
				
				for (int i = 0; i < datas.length; i++) {
					System.out.println("datas[ "+ i +" ] == " +datas[i]);
				}
						
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}else{
			System.out.println(name+" 님 신규방문을 환영합니다!!");
			mktxt(name,newFile);
			try {
				FileReader fr = new FileReader(newFile);
				
				BufferedReader br = new BufferedReader(fr);
				
				temp = br.readLine();
				datas = temp.split("-");
				
				for (int i = 0; i < datas.length; i++) {
					System.out.println("datas[ "+ i +" ] == " +datas[i]);
				}
						
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		while(true) {
			//random
			_random(r_num);
			
			clear = loop(r_num,u_num);
			
			//resultPrint 에서 가져온 승 2 / 패 1 값으로 win / lose 카운트 증가
			//resultPrint
			player = resultPrint(clear,datas,Filedir);
			
			win_lose_c[0] = datas[1];
			win_lose_c[1] = datas[2];
			
			System.out.println("승 : "+win_lose_c[0]);
			System.out.println("패 : "+win_lose_c[1]);

			//regame 
			System.out.print("다시 하실?");
			re = sc.next();
			if("Y".equalsIgnoreCase(re)) {
				continue;
			}else {
				break;
			}

		}


	}
	static boolean checkBeforeReadFile(File f) {
		if(f.exists()) {
			if(f.isFile() && f.canRead()) {
				return true;
			}
		}
		return false;
	}
	static void mktxt(String name, File newFile) {
		
		while(true) {
			try {
				if(!checkBeforeReadFile(newFile)) {
					if(newFile.createNewFile()) {
						try {
							FileWriter fw = new FileWriter(newFile);
							
							fw.write(name+"-0-0");
							fw.close();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("파일 생성 성공!");
					}else {
						System.out.println("파일 생성 실패!");
					}
				}else {
					System.out.println("파일이 이미 존재합니다.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
		}
		
	}
	
	static void _random(int rnum[]) {
		
		boolean swit[] = new boolean[10]; 
		
		int w, r;
		
		w=0;
		while(w < 3){
			r = (int)(Math.random() * 9);	// 0 ~ 9
			if(swit[r] == false){
				swit[r] = true;		// 00100 00000 
				rnum[w] = r + 1;	// 1 ~ 10 
				w++;
			}
		}

		for(int i = 0;i < rnum.length; i++){
			System.out.println("r_num[" + i + "] = " + rnum[i]);
		}
	}
	
	static  boolean loop(int rnum[], int unum[]) {

		int strike = 0, ball = 0;
		int w = 0;
		boolean clear = false;
		
		while(w<10) {
			strike = 0;
			ball =0;
			//user_input
			userInput(unum);
			
			//finding
			// ball
			for(int i = 0;i < 3; i++){
				for(int j = 0;j < 3; j++){
					if(unum[i] == rnum[j] && i != j){
						ball++;
					}
				}
			}
			// strike
			for(int i = 0;i < 3; i++){
				if(unum[i] == rnum[i]){
					strike++;
				}
			}
			
			if(strike > 2){
				clear = true;
				break;
			}
			//message
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");
	
			w++;
		}
		return clear;
	}
	static void userInput(int unum[]) {
		Scanner sc = new Scanner(System.in);
		
		int w= 0;
	
		while(w < 3){				
			System.out.print((w + 1) + "번째 수:");
			unum[w] = sc.nextInt();
			w++;
		}
	}
	
	static String[] resultPrint(boolean clear, String[] datas, String dir) {
		int result = 0;
		int win = 0;
		int lose = 0;
		
		if(clear){
			System.out.println("승리!");
			BufferedWriter b_writer = null;
			try {

				b_writer = new BufferedWriter(new FileWriter(dir+datas[0]+".txt"));

				win = Integer.parseInt(datas[1]);
				win++;
				
				datas[1] = String.valueOf(win);
				
				System.out.println("result process  == "+datas[0]+"-"+datas[1]+"-"+datas[2]);
				
				//쓰기 (내용 전부 덮어쓰여짐)
				b_writer.write(datas[0]+"-"+datas[1]+"-"+datas[2]);
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					b_writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}else{
			System.out.println("패배");
			BufferedWriter b_writer = null;
			try {
				b_writer = new BufferedWriter(new FileWriter(dir+datas[0]+".txt"));
	
				lose = Integer.parseInt(datas[2]);
				lose++;
				
				datas[2] = String.valueOf(lose);
				
				System.out.println("result process  == "+datas[0]+"-"+datas[1]+"-"+datas[2]);
				
				//쓰기 (내용 전부 덮어쓰여짐)
				b_writer.write(datas[0]+"-"+datas[1]+"-"+datas[2]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					b_writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		System.out.println("\n==== 게임 결과 ====");
		System.out.println("승 : "+datas[1]+" 패 : "+datas[2]);
		System.out.println();

		}
		return datas;
	}
}

