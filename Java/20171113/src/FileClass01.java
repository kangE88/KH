import java.io.File;
import java.io.IOException;

public class FileClass01 {

	public static void main(String[] args) {
		/*
		 
		 window -> 파일
		 
		 network -> 소켓 -> 전송(문자열)
		 
		 unix  파일 -> 전송
		 
		 파일 : 저장매체
		 		*.txt -> 변환
		 
		 Database : data를 저장하는 공간
		
		
		 
		 */

		File fdir = new File("E:\\workspace\\");
		
		/*
		String filelist[] = fdir.list();
		
		for(int i=0;i<filelist.length;i++) {
			System.out.println(filelist[i]);
		}

		File filelist[] = fdir.listFiles();
		
		for(int i=0;i<filelist.length;i++) {
			if(filelist[i].isFile()) {
				System.out.println("isFile == "+filelist[i].getName());
			}else if(filelist[i].isDirectory()) {
				System.out.println("isDirectory == "+filelist[i].getName());
			}else {
				System.out.println(filelist[i].getName());
			}
			
			//파일 생성
			File newFile = new File("e:\\tmp\\newFile.txt");
			
			try {
				if(newFile.createNewFile()) {
					System.out.println("파일 생성 성공");
				}else {
					System.out.println("파일 생성 실패");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		*/
		
		//폴더 생성
		String dirStr ="e:\\tmp1\\";
		
		File newFo = new File(dirStr);
		
		if(newFo.mkdirs()) {
			System.out.println("디렉토리 생성 완료");
		}else {
			System.out.println("디렉토리 생성 실패");	
		}

		String filename = "newFile"+".txt";
		
		File myFile = new File(dirStr+filename);
		
		try {
			if(myFile.createNewFile()) {
				System.out.println("파일생성 성공!!");
			}else {
				System.out.println("파일생성 실패!!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//파일 존재 여부
		if(myFile.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		//파일 삭제
		if(myFile.delete()) {
			System.out.println("파일을 삭제 했습니다.");
		}else {
			System.out.println("파일을 삭제하지 못했습니다.");
		}
		
		//읽기 기능 여부
		if(myFile.canRead()) {
			System.out.println("파일을 읽을 수 있습니다.");
		}else {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		
		
		//쓰기 기능 여부
		if(myFile.canWrite()) {
			System.out.println("파일을 쓸 수 있습니다.");
		}else {
			System.out.println("파일을 쓸 수 없습니다.");
		}
		
	}

}
