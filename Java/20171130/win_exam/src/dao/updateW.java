package dao;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;

import Singleton.SingletonClass;
import dto.human;
import win_exam.windowMain;

public class updateW extends Frame implements WindowListener, ActionListener{

	TextField TextField = new TextField();
	
	public updateW() {
	
		setLayout(null);
		setBounds(0, 0, 300, 200);
		setVisible(true);
		
		Label label = new Label("바꿀 이름 : ");
		label.setBounds(50, 50, 50, 30);
		add(label);
		
		
		TextField.setBounds(110, 50, 100, 30);
		add(TextField);
		
		Button bt = new Button("변경");
		bt.setBounds(70, 100, 100, 30);
		bt.addActionListener(this);
		add(bt);
		
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = TextField.getText();
		HashMap<String, human> hm = SingletonClass.getInstance().get();
	
		if(hm.containsKey(str)) {
			System.out.println(hm.containsKey(str));
		}

		//싱글톤 hashMap 에서 이름을 검색
		System.out.println("Find== "+hm.get(str));
		hm.remove(str);
		new insertW();
		this.dispose();
		
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
		// TODO Auto-generated method stub
		
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