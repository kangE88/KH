import java.util.ArrayList;
import java.util.List;

public class mainClass {
	public static void main(String[] args) {
		DBConnection.initConnect();
		
		SelectTest st = new SelectTest();
		
		//하나의 데이터를 검색
		
		Dto dto = st.search("BBB");
		if(dto != null) {
			System.out.println("검색된 데이터"+dto.toString());
		}
		
		
		///
		
		List<Dto> list = st.addData();
		
		System.out.println("모든 정보 목록");
		System.out.println("아이디\t이름\t나이\t가입일");
		System.out.println("---------------------------");
		
		for (int i = 0; i < list.size(); i++) {
			Dto d = list.get(i);
			
			System.out.println(d.getId() + "\t"+d.getName()+"\t"+d.getAge()+"\t"+d.getJoindate()+"\t");
			
		}
		
		
	}
}
