
public class mainClass {

	public static void main(String[] args) {
		DBConnection.initConnect();
		
		UpdateTest ut = new UpdateTest();
		
		
		int age = 26;
		
		ut.update(age);
		
		int count = ut.update(age);
		
		System.out.println(count + "명 변경");

	}

}
