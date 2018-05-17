package awtSample05;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {
	
	public WindowTest() {
		
		//Panel =	화면에 또다른 화면
		
		//Frame 세팅
		setLayout(new GridLayout(2, 1));
		
		Label label = new Label("Label");
		add(label);
		
		//Panel 세팅
		Panel panel = new Panel();
		panel.setBackground(Color.blue);
		//panel.setLayout(new GridLayout(1, 2));
		panel.setLayout(null);
		
		
		Label label1 = new Label("label1");
		label1.setBounds(0, 0, 100, 30);
		panel.add(label1);
		
		Label label2 = new Label("label2");
		label2.setBounds(100, 0, 100, 30);
		panel.add(label2);
		
		add(panel);
		
		setBounds(0, 0, 640, 480);
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
