package awtSample04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowsTest extends Frame implements WindowListener {

	public WindowsTest() {
		
		//setLayout(new GridLayout(2, 16));
		//setLayout(new FlowLayout());
		setLayout(null);
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		//label
		Label label = new Label("라벨");
		label.setBounds(50, 50, 100, 30);
		label.setText("레이블 입니다.");
		add(label);
		
		
		//button
		Button button = new Button();
		button.setBounds(180, 50, 80, 30);
		button.setLabel("버튼");
		add(button);
		
		//testFiled
		TextField textField = new TextField();
		textField.setBounds(50, 100, 100, 30);
		textField.setText("여기에 입력");
		add(textField);
		
		
		
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
