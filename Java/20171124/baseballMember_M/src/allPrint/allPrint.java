package allPrint;

import java.util.List;

import Singleton.SingletonClass;
import dto.Batter;
import dto.Human;
import dto.Pitcher;

public class allPrint {
	
	public void allPrint() {
		
		List<Human> list = SingletonClass.getInstance().getArray();
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) != null) {
				if(list.get(i) instanceof Pitcher) {
					Pitcher pit = (Pitcher)list.get(i);
					System.out.println(pit.toString());
				}
				else {
					Batter bat = (Batter)list.get(i);
					System.out.println(bat.toString());
				}
			}
		}	
	}
}
