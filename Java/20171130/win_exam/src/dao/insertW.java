package dao;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import Singleton.SingletonClass;
import dto.human;
import win_exam.windowMain;

public class insertW extends Frame implements WindowListener, ActionListener{
	TextField nameTextField = new TextField();
	TextField numTextField = new TextField();
	TextField ageTextField = new TextField();
	Container container = new Container();
	
	public insertW() {
		setLayout(null);
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		GridBagConstraints gridb = new GridBagConstraints();
		GridLayout gl = new GridLayout();
		gl.setHgap(gridb.CENTER);
		container.setLayout(null);
		Label nameLabel = new Label("이름 : ");
		nameLabel.setBounds(100, 100, 50, 50);
		add(nameLabel);

		nameTextField.setBounds(200, 100, 200, 50);
		add(nameTextField);
		
		Label numLabel = new Label("번호 : ");
		numLabel.setBounds(100, 200, 50, 50);
		add(numLabel);
		
		numTextField.setBounds(200, 200, 200, 50);
		add(numTextField);
		
		Label ageLabel = new Label("나이 : ");
		ageLabel.setBounds(100, 300, 50, 50);
		add(ageLabel);
		
		ageTextField.setBounds(200, 300, 200, 50);
		add(ageTextField);
		
		
		
		Button bt = new Button("추가하기");
		bt.setBounds(500, 400, 100, 30);
		bt.addActionListener(this);
		add(bt);
		
		
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(nameTextField.getText().isEmpty() || numTextField.getText().isEmpty() || ageTextField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "입력할 정보가 비어있습니다.");
		}else {
			//human set
			human human = new human(nameTextField.getText(), numTextField.getText(), ageTextField.getText());
			
			//싱글톤 클래스에 human set hashmap에 추가
			SingletonClass.getInstance().putToHashmap(human);
			
			new windowMain();
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
