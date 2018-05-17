import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {

	public static void main(String[] args) {
		
		//NullPointerException
		
		String str = null; //str =""; str =new String();
		
		try {
			System.out.println("str.lenth()"+str.length());	
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
		}
		
		
		int arr[] = {1,2,3};
		
		try {
			System.out.println(arr[3]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		File file = new File("c:\\text.txt");
		System.out.println(file.exists());
		
		try {
			FileInputStream is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//StringIndexOutOfBountsException
		
		String str1 = "java";
		
		try {
			System.out.println(str1.charAt(4));
		}catch (Exception e) {
			
		}
		
		//NumberFormatException
		
		int i;
		double d;
		
		
		try {
			i = Integer.parseInt("123.456");
			d = Double.parseDouble("234.567");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
