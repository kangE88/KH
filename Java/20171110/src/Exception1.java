
public class Exception1 {

	public static void main(String[] args) {
		/*
		 *  Exception : 예외
		 *  baseball ->1 2 3 -> a(65)
		 *  개발자 용
		 * 
		 *  number -> format    1 -> a
		 *  array    -> index
		 * 	 class    ->  없다(NotFound)
		 *   file      ->  없다(NotFound)
		 *   
		 *   try{
		 *		//예외가 발생할 소지가 있는 코드
		 *	  int num[] = new int[2];
		 *	  num2 = a;
		 *	  }catch(예외클래스1 e){
		 *     메세지
		 *	  }finally{
		 *   	//무조건 실행된다.
		 *   	// undo(되돌림) 
		 *   	//rollback(복구)
		 *   }
		 *
		 *
		 *
		 */
		
		int n[] = {1,2,3};
		
		System.out.println("시작합니다.");
		try {
			for(int i=0;i<4;i++){
				System.out.println(n[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			// System.out.println("배열 범위 초과");
			//	e.printStackTrace();
			System.out.println(e.getMessage());
		//}catch (Exception e) {
		//	e.printStackTrace();
		}finally {
			System.out.println("무조건 실행");
		}
		
		callDriver();
		
	}
	static void callDriver() throws ArrayIndexOutOfBoundsException{
		int n[] = {11, 22, 33};
		
		System.out.println("시작합니다.");		
		for(int i=0;i<4;i++) {
			System.out.println(n[i]);
		}
		System.out.println("종료합니다.");
	}

}
