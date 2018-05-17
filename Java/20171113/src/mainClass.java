package fileWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 	어느 작업을 하시겠습니까?
		 * 
		 *  1. 파일 생성	-> function
		 *  2. 파일 삭제
		 *  3. 파일 쓰기
		 *  4. 파일 읽기(원하는 데이터를 검색)	String[]
		 *  5. 파일 추가 쓰기
		 *  6. 파일 데이터를 모두 출력
		 *  7. 종료
		 *  
		 *  번호, 이름 -> 1-홍길동-2001/10/25 		data transfer object
		 *  
		 * 
		 */
		int choice = 7;
		
		while(true) {			
		
			System.out.println("1. 파일 생성");
			System.out.println("2. 파일 삭제");
			System.out.println("3. 파일 쓰기");
			System.out.println("4. 파일 읽기");
			System.out.println("5. 파일 추가 쓰기");
			System.out.println("6. 파일 데이터를 모두 출력");
			System.out.println("7. 종료");
			
			System.out.print("어느 작업을 하시겠습니까? >> ");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:	// 파일 생성
					createFile();
					break;
				case 2:	// 파일 삭제	
					deleteFile();
					break;
				case 3:	// 파일 쓰기	
					writeFile();
					break;
				case 4:	// 파일 읽기
					readFile();
					break;
				case 5: // 파일 추가 쓰기
					writeAppend();
					break;
				case 6:	// 파일 데이터를 모두 출력
					
					break;
				default: // 종료	
					System.exit(0);
			}
			System.out.println();		
		}

	}
	
	static void createFile() {
		Scanner sc = new Scanner(System.in);
		String filename = "";
		
		while(true) {
			
			System.out.print("생성할 파일 명 = ");
			filename = sc.next();
			
			/*File dirFile = new File("e:\\tmp");
			String fileList[] = dirFile.list();
			boolean b = false;
			
			for (int i = 0; i < fileList.length; i++) {
				if(fileList[i].equals(filename + ".txt")) {					
					b = true;
					break;
				}
			}*/
			
			boolean b = findFile(filename);
			if(b == true) {	
				System.out.println("파일을 생성할 수 없습니다");
				continue;
			}
			
			File newFile = new File("e:\\tmp\\" + filename + ".txt");
			
			try {
				if(newFile.createNewFile()) {
					System.out.println("파일을 생성했습니다");
					break;
				}
				else {
					System.out.println("파일을 생성하지 못했습니다");
				}			
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}		
	}
	
	static void readFile() {
		Scanner sc = new Scanner(System.in);
		
		String datas[] = null;
		String filename = "";
		
		System.out.print("읽을 파일 명 = ");
		filename = sc.next();
		
		File readFile = new File("e:\\tmp\\" + filename + ".txt");
		
		boolean b = checkBeforeReadFile(readFile);
		if(!b) {
			System.out.println("파일 존재하지 않거나 읽을 수 없습니다");
			return;
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(readFile));
		
			// 데이터의 갯수를 취득
			int count = 0;
			String str;	
			while((str = br.readLine()) != null) {
				count++;
			}
			br.close();
					
			// 배열의 동적할당
			System.out.println("데이터의 갯수 = " + count);
			datas = new String[count];
		
			// 데이터를 읽어 들임
			int w = 0;
			br = new BufferedReader(new FileReader(readFile));
			while((str = br.readLine()) != null) {
				datas[w] = str;
				w++;
			}
			br.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < datas.length; i++) {
			System.out.println("datas[" + i + "] = " + datas[i]);
		}
		
		String name = "";
		boolean findIt = false;
		
		System.out.print("검색할 이름:");
		name = sc.next();
		
		for (int i = 0; i < datas.length; i++) {
			String n = datas[i];
			String arr[] = n.split("-");
			if(name.equals(arr[1])) {
				findIt = true;
				break;
			}
		}		
		
		if(findIt) {
			System.out.println("찾은 이름이 데이터에 있습니다");
		}else {
			System.out.println("찾은 이름이 데이터에 없습니다");
		}		
		
	}
	
	
	static void deleteFile() {
		Scanner sc = new Scanner(System.in);
		String filename = "";
		/*
		while(true) {
			System.out.print("삭제할 파일 명 = ");
			filename = sc.next();
			
			boolean b = findFile(filename);
			if(!b) {
				System.out.println("삭제할 파일 존재하지 않습니다");
				continue;
			}
			
			File delFile = new File("e:\\tmp\\" + filename + ".txt");
			
			if(delFile.delete()) {
				System.out.println("파일을 삭제하였습니다");
				break;
			}
			else {
				System.out.println("파일을 삭제하지 못했습니다");
			}			
		}*/
		
		System.out.print("삭제할 파일 명 = ");
		filename = sc.next();
		
		boolean b = findFile(filename);
		if(!b) {
			System.out.println("삭제할 파일 존재하지 않습니다");
			return;
		}
		
		File delFile = new File("e:\\tmp\\" + filename + ".txt");
		
		if(delFile.delete()) {
			System.out.println("파일을 삭제하였습니다");			
		}
		else {
			System.out.println("파일을 삭제하지 못했습니다");
		}
	}
	
	
	static boolean findFile(String fn) {
		File dirFile = new File("e:\\tmp");
		String fileList[] = dirFile.list();
		boolean b = false;
		
		for (int i = 0; i < fileList.length; i++) {
			if(fileList[i].equals(fn + ".txt")) {					
				b = true;
				System.out.println("기입하신 파일이 존재합니다");
				break;
			}
		}	
		
		return b;
	}
	
	static void writeFile() {
		Scanner sc = new Scanner(System.in);
		
		String datas[] = null;
		String filename = "";
		
		System.out.print("기입하고 싶은 파일 명 = ");
		filename = sc.next();
		
		File writeFile = new File("e:\\tmp\\" + filename + ".txt");
		
		boolean b = findFile(filename);
		if(!b) {
			System.out.println("파일이 존재하지 않습니다");
			return;
		}
		
		b = checkBeforeWriteFile(writeFile);
		if(!b) {
			System.out.println("파일에 기입할 수 없습니다");
			return;
		}
		
		// 1-홍길동-1998/12/03  
		
		System.out.print("번호 = ");
		int number = sc.nextInt();
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("생년월일 = ");
		String birth = sc.next();
		
		String str = number + "-" + name + "-" + birth; 	
		
		System.out.println("str = " + str);
		
		PrintWriter pw;
		
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(writeFile)));
			pw.println(str);
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("기입했습니다");		
	}
	
	static void writeAppend() {
		Scanner sc = new Scanner(System.in);
		
		String datas[] = null;
		String filename = "";
		
		System.out.print("기입하고 싶은 파일 명 = ");
		filename = sc.next();
		
		File writeFile = new File("e:\\tmp\\" + filename + ".txt");
		
		boolean b = findFile(filename);
		if(!b) {
			return;
		}
		
		b = checkBeforeWriteFile(writeFile);
		if(!b) {
			return;
		}
		
		System.out.print("번호 = ");
		int number = sc.nextInt();
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("생년월일 = ");
		String birth = sc.next();
		
		String str = number + "-" + name + "-" + birth; 	
		
		System.out.println("str = " + str);
		
		PrintWriter pw;
		
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(writeFile, true)));
			pw.println(str);
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("추가 기입했습니다");		
	}
	
	static boolean checkBeforeReadFile(File f) {
		if(f.exists()) {
			if(f.isFile() && f.canRead()) {
				return true;
			}
		}
		
		return false;
	}
	
	static boolean checkBeforeWriteFile(File f) {
		if(f.exists()) {
			if(f.isFile() && f.canWrite()) {
				return true;
			}
		}
		
		return false;
	}

}







