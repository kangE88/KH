package loginWindow;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

public class loginWindow extends Frame implements WindowListener {
	
	
	public loginWindow() {
		
		setLayout(null);
		
		setTitle("회원가입");
		
		setBounds(0, 0, 320, 200);
		setVisible(true);
		
		//ID
		Label id_label = new Label();
		id_label.setBounds(60, 70, 70, 20);
		Color c = new Color(120, 120, 120);
		id_label.setBackground(c);
		id_label.setText("ID");
		add(id_label);
		
		TextField id_textField = new TextField();
		
		id_textField.setBounds(130, 70, 120, 20);
		c = new Color (200,200,200);
		id_textField.setBackground(c);
		add(id_textField);
		

		//Password
		Label pw_label = new Label();
		pw_label.setBounds(60, 100, 70, 20);
		c = new Color(120, 120, 120);
		pw_label.setBackground(c);
		pw_label.setText("Password");
		add(pw_label);
		
		TextField pw_textField = new TextField();
		
		pw_textField.setBounds(130, 100, 120, 20);
		c = new Color (200,200,200);
		pw_textField.setBackground(c);
		add(pw_textField);
		
		//로그인 버튼
		Button login_bt = new Button("로그인");
		login_bt.setBounds(60, 150, 80, 20);
		login_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(login_bt)) {
					
					
					JOptionPane.showConfirmDialog(login_bt, "환영!");
				}
				
			}
		});
		add(login_bt);
		
		//회원가입 버튼
		Button join_bt = new Button("회원가입");
		join_bt.setBounds(160, 150, 80, 20);
		add(join_bt);

		addWindowListener(this);
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
