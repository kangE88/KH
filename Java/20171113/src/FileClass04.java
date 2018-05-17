import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileClass04 {

	public static void main(String[] args) {
		
		File file = new File("e:\\tmp1\\newFile.txt");
		
	
		//쓰기
		try {
			/*	
			FileWriter filewriter = new FileWriter(file);
			
			//쓰기 (내용 전부 덮어쓰여짐)
			filewriter.write("안녕하세요"+"\r\n");
			filewriter.close();
			
			
			
			//내용 건드리지 않고 추가하여 쓰기
			FileWriter fileAppend = new FileWriter(file, true);
			fileAppend.write("반갑습니다.");
			fileAppend.close();
			*/
			
			if(checkBeforeReadFile(file)){
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				
				bw.write("11111111111");
				bw.write("11111111112");
				bw.write("11111111113");
				bw.write("11111111114");
				
				bw.close();
				
				/*
				
				pw.print("안녕");
				pw.println("하이");
				pw.println("바이");
				
				pw.close();
				
				*/
				
				
				System.out.println("파일에 기입 하였습니다.");
			}else {
				System.out.println("파일에 기입 할 수 없습니다.");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
