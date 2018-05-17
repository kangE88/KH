package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import DAO.Insert;

public class mainView extends Frame implements WindowListener, ActionListener{

	Button insertBtn;
	
	public mainView() {
		super("main");
		
		setLayout(null);
		
		insertBtn = new Button("추가");
		insertBtn.setBounds(100, 100, 100, 50);
		insertBtn.addActionListener(this);
		add(insertBtn);
		
		setBounds(0, 0, 640, 480);
		setBackground(Color.RED);
		setVisible(true);
		
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		
		String btnname = btn.getLabel();
		
		if(btnname.equals("추가")) {
			//JOptionPane.showMessageDialog(null, "insertBtn");
			new Insert();
			this.dispose();
		}
		
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


}
