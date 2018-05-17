import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileClass03 {

	public static void main(String[] args) {
		File file = new File("c:\\temp\\newFIle.txt");

		//문장 읽어오기
		//Buffer == 저장공간
		try {
			//Buffer == 저장공간
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str; //= br.readLine();
			
			//while(str !=null) {
			while((str = br.readLine()) !=null) {
				System.out.println(str);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
