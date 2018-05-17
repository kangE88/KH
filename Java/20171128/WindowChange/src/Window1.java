import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class Window1 extends Frame implements WindowListener, ActionListener {

	Button btn = new Button("move");
	
	public Window1() {
		super("타이틀");
		
		setLayout(null);
		setBackground(Color.BLUE);
		setBounds(0, 0, 640, 480);
		
		
		btn.setBounds(100, 100, 100, 80);
		btn.addActionListener(this);
		add(btn);
		
		setVisible(true);
		
		addWindowListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "확인");
		
		new Window2();
		
		//다른윈도우 종료
		this.dispose();

	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
	}



}
