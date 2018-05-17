package awtSample06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JLabel;

public class WindowTest extends Frame implements WindowListener {
	
	public WindowTest() {
		
		setLayout(new BorderLayout());
		
		JLabel jlabel = new JLabel("NORTH");
		add(jlabel, BorderLayout.NORTH);
		
		JLabel jlabel1 = new JLabel("WEST");
		add(jlabel1, BorderLayout.WEST);
		
		JLabel jlabel2 = new JLabel("EAST");
		add(jlabel2, BorderLayout.EAST);
		
		JLabel jlabel3 = new JLabel("SOUTH");
		add(jlabel3, BorderLayout.SOUTH);
		
		JLabel jlabel4 = new JLabel("CENTER");
		jlabel4.setBackground(Color.darkGray);
		jlabel4.setOpaque(true);
		add(jlabel4, BorderLayout.CENTER);
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		addWindowListener(this);
	};

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
