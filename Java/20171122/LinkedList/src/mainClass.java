import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * 
		 *	0	-	1	-	2	-	3
		 * 			x
		 * 	0	-	2	-	3
		 * 	ArrayList	:	검색				=	vector
		 * 
		 * 	LinkedList	:	실시간(추가, 삭제)	=	list
		 * 
		 * 		
		 * 
		 * 
		 * 
		 */
		
		Vector<String> vec = new Vector<>();
		vec.add("자이언츠");
		
		LinkedList<String> list = new LinkedList<String>();
		//List<String> _list = new LinkedList<String>();
		List<String> arraylist = new ArrayList<String>();
		
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		}
		
		list.add("Tigers");
		list.add("Giants");
		list.add("Bears");
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(i + " === "+s);
		}
		
		
		// iterfator == 반복자 -> 포인터 p -> p + 1
		Iterator<String> it;
		it = list.iterator();
		
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		list.addFirst("Lions");
		
		it = list.iterator();
		
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		list.addLast("Twins");
		
		it = list.iterator();
		
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		List<String> arrlist = new ArrayList<>();
		
		for (String string : arrlist) {
			System.out.println("arrlist == " + string);
		}
	

	}

}
