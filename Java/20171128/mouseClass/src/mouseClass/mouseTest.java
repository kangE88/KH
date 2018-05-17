package mouseClass;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class mouseTest extends Frame implements WindowListener, MouseListener, MouseMotionListener {
	
	Label label;
	int mousePosX, mousePosY;
	
	public mouseTest() {
		super("마우스 이벤트");
		
		label = new Label("x=y=");
		label.setBounds(50, 100, 150, 50);
		add(label);
		
		setBounds(0, 0, 800, 600);
		setLayout(null);
		setVisible(true);
		
		addMouseMotionListener(this);
		addWindowListener(this);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse Clicked");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse Pressed");
		
		mousePosX = e.getX();
		mousePosY = e.getY();
		
		label.setText("x = "+ mousePosX +" y = "+mousePosY);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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


	@Override
	public void mouseDragged(MouseEvent e) {
		label.setText("x ="+e.getX()+" y="+e.getY());
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		label.setText("x ="+e.getX()+" y="+e.getY());
	}

}
