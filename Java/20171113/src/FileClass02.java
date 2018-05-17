import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileClass02 {

	public static void main(String[] args) {
		
		File file = new File("e:\\tmp1\\newFile.txt");
		try {
			//[중요한 부분] 파일 체크하는부분이 중요
			if(checkBeforeReadFile(file)) {
				FileReader fileReader = new FileReader(file);
				
				/*
				//한문자씩 읽어들이기
				int ch = fileReader.read();
				
				while(ch != -1) {
					System.out.print((char)ch);
					ch = fileReader.read();
				}
				*/
				
				int ch;
				while((ch = fileReader.read()) != -1) {
					System.out.print((char)ch);
					ch = fileReader.read();
				}
				
			}else {
				System.out.println("파일을 읽거나 쓸 수 없습니다.");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
