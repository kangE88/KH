
public class mainClass {

	public static void main(String[] args) {
		
		DBConnection.initConnect();
		
		DeleteTest dt = new DeleteTest();
		
		
		int age = 26;
		
		dt.delete(25);
		
		int count = dt.delete(age);
		
		System.out.println(count + "명 탈퇴");

	}

}
