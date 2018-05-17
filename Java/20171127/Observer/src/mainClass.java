import java.util.Observer;

public class mainClass {

	public static void main(String[] args) {
		
		//감사할 대상
		ObserverClass obMan = new ObserverClass();
		
		//감시자들 추가
		obMan.addObserver(new ObserverA());
		obMan.addObserver(new ObserverB());
		
		obMan.notifyObservers("비밀얘기");
		obMan.notifyObservers("이것은 기밀임");

	}

}
