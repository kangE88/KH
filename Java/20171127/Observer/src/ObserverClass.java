import java.util.Observable;

public class ObserverClass extends Observable{
	private String preArg = null;
	
	public void notifyObservers(Object arg) {
		String str = (String)arg;
		
		//변화가 없다.(통지를 안해준다.)
		if(str.equals(preArg)) {
			return;
		}
		
		preArg = str;
		
		setChanged(); // reset
		
		super.notifyObservers(arg);
		
		clearChanged();
		
	}
	
}
