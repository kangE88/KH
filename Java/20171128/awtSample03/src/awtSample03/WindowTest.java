package awtSample03;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {

	public WindowTest() {
		super("Window awt03");
		
		//setSize(640, 480);
		//setLocation(0, 0);
		
		//위 2줄을 한줄로 표현가능 
		setBounds(0, 0, 640, 480);
		
		//label
		//한글 깨지는 현상 
		//http://gocoding.tistory.com/42 Url 참조
		Label label = new Label("Label 라벨입니다.");
		add(label);
		
		String str = "AWT Label text";
		
		label.setText("Label Text 라벨테스트");
		label.setText(str);
		
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

}
