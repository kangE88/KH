public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insertTest it = new insertTest();
		
		String id = "Dragon";
		String name = "청룡";
		int age = 25;
		
		int count = it.insert(id, name, age);
		System.out.println(count+"개 추가 성공");
		
	}



}
