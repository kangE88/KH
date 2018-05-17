package DAO;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import DTO.human;
import Singleton.SingletonClass;

public class Insert extends Frame implements WindowListener, ActionListener {

	Label seqLabel, nameLabel, ageLabel;
	TextField seqText, nameText, ageText;
	Button inBtn;
	
	public Insert() {
		
		seqLabel = new Label("번호 : ");
		seqLabel.setBounds(50, 100, 50, 50);
		add(seqLabel);
		
		seqText = new TextField();
		seqText.setBounds(110, 110, 200, 30);
		add(seqText);
		
		nameLabel = new Label("이름 : ");
		nameLabel.setBounds(50, 150, 50, 50);
		add(nameLabel);
		
		nameText = new TextField();
		nameText.setBounds(110, 160, 200, 30);
		add(nameText);
		
		ageLabel = new Label("나이 : ");
		ageLabel.setBounds(50, 200, 50, 50);
		add(ageLabel);
		
		ageText = new TextField();
		ageText.setBounds(110, 210, 200, 30);
		add(ageText);
		
		//추가 버튼
		inBtn = new Button("추가");
		inBtn.setBounds(110, 250, 200, 30);
		inBtn.addActionListener(this);
		add(inBtn);
		
		setLayout(null);
		
		setBounds(0, 0, 640, 480);
		setBackground(Color.GREEN);
		setVisible(true);
		
		addWindowListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "버튼클릭");
		
		SingletonClass sc = SingletonClass.getInstance();
		
		if(!seqText.getText().equals("")&& !nameText.getText().equals("")&&!ageText.getText().equals("")) {
			human human = new human(Integer.parseInt(seqText.getText()), nameText.getText(), Integer.parseInt(ageText.getText()));
			
			sc.list.add(human);
			
			JOptionPane.showMessageDialog(null, "성공적으로 추가되었습니다.");
			
			for (int i = 0; i < sc.list.size(); i++) {
				System.out.println(sc.list.get(i));
			}
		}else {
			JOptionPane.showMessageDialog(null, "입력값이 없습니다.");
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
