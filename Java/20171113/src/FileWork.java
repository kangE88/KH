import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWork {

	public static void main(String[] args) {
		/*
		 * 
		 * 어느 작업을 하시겠습니까?
		 * 
		 * 1. 파일 생성 
		 * 2. 파일 삭제
		 * 3. 파일 쓰기
		 * 4. 파일 읽기
		 * 5. 파일 추가 쓰기
		 * 6. 파일 데이터를 모두 출력
		 * 7. 데이터를 검색
		 * 8. 종료
		 * 
		 * 번호, 이름 -> 1-홍길동-생년월일(2010/10/10)
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		String dir = "";
		String filedir ="";
		
		int menu;
		while(true) {
			menu = menu();
			
			if(menu ==8) {
				break;
			}
		
			System.out.print("경로를 입력하세요. : ");
			dir = sc.next();
			System.out.print("파일 이름을 입력하세요. : ");
			filedir = sc.next();
			
			selectmenu(menu,dir,filedir);
			
		}
	}
	
	static int menu() {
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		System.out.println("==== 실행 할 메뉴를 선택하세요 ====");
		System.out.println("* 1. 파일 생성");
		System.out.println("* 2. 파일 삭제");
		System.out.println("* 3. 파일 쓰기");
		System.out.println("* 4. 파일 읽기");
		System.out.println("* 5. 파일 추가 쓰기");
		System.out.println("* 6. 파일 데이터를 모두 출력");
		System.out.println("* 7. 데이터를 검색");
		System.out.println("* 8. 종료");
		System.out.print("====> ");
		
		choice = sc.nextInt();

		return choice;
		
	}
	static void mkFile(File newFile) {
		try {
			if(newFile.exists()==false) {
				newFile.createNewFile();
				System.out.println(" 파일 생성 완료!");
			}else {
				System.out.println("파일이 존재 합니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void deleteFile(File newFile) {
		if(checkBeforeReadFile(newFile)) {
			newFile.delete();
			System.out.println("파일 삭제 완료!");
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
	static void writeAll(File newFile){
		Scanner sc = new Scanner(System.in);
		String str ="";
		
		try {
			FileWriter fileW = new FileWriter(newFile);
	
			System.out.println("해당 파일에 내용을 전부 덮어씁니다.");
			System.out.print("내용을 입력하세요 : ");
			
			str = sc.next();
			
			fileW.write(str);
			fileW.close();
			
			System.out.println("입력 종료!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void writeAppend(File newFile){
		Scanner sc = new Scanner(System.in);
		String str ="";
		
		try {
			FileWriter fileAppend = new FileWriter(newFile, true);

			System.out.println("해당 파일에 내용을 추가합니다.");
			System.out.print("내용을 입력하세요 : ");
			
			str = sc.next();
			
			fileAppend.write(str);
			fileAppend.close();
			
			System.out.println("입력 종료!");
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void fileRead(File newFile){
		try {
		
			FileReader fileR = new FileReader(newFile);

			if(checkBeforeReadFile(newFile)) {
				BufferedReader  br = new BufferedReader(fileR);
						
				String str = br.readLine();
				String cstr[] =str.split(",");

				for(int j=0;j<cstr.length;j++) {
					System.out.println("cstr["+j+"] === "+cstr[j]);
				}
				br.close();
			}else {
				System.out.println("읽을 파일이 존재 하지 않습니다.");
			}
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void fileReadAll(File newFile){
		try {
			FileReader fileR = new FileReader(newFile);
			
			BufferedReader  br = new BufferedReader(fileR);
					
			String str; //= br.readLine();
			
			//while(str !=null) {
			while((str = br.readLine()) !=null) {
				System.out.println(str);
			}
			br.close();	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void fileSeach(File newFile) {
		Scanner sc = new Scanner(System.in);
		try {
			
			FileReader fileR = new FileReader(newFile);
			
			BufferedReader  br = new BufferedReader(fileR);
			
			
			String str = br.readLine();
			
			String cstr ="";
			
			System.out.print("읽을 단어 선택 : ");
			cstr = sc.next();
			
			while(br != null) {
				if(str.indexOf(cstr) > -1) {
					System.out.println("문자 발견!! : "+cstr);
					break;
				}else {
					System.out.println("찾으신 문자가 없습니다.");
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	static void selectmenu(int i, String str1, String str2) {
		try {
		
			Scanner sc = new Scanner(System.in);
			
			File newFile = new File(str1+str2);
			
			FileReader fileR = new FileReader(newFile);

			if(i==1) {
				mkFile(newFile);
			}else if(i==2) {
				deleteFile(newFile);
			}else if(i==3 || i==5) {
				if(i==3) {
					writeAll(newFile); //3 파일 쓰기 (내용 전부 덮어씀)
				}else if(i==5){
					writeAppend(newFile); //5 파일 추가 쓰기
				}
			}else if(i==4) {
				fileRead(newFile);	//파일 읽기
			}else if(i==6) {
				fileReadAll(newFile);
			}else if(i==7) {
				fileSeach(newFile);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
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

}
