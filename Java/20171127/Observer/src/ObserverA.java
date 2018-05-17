import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		String str = (String)arg;
		
		System.out.println("Obserber A 입니다. 통지받았음 : "+str);
		
		

	}

}
