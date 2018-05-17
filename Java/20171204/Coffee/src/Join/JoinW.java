package Join;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DTO.human;
import Singleton.humanS;
import main.mainW;

public class JoinW extends JFrame implements ActionListener{

	JLabel jLabel;

	JTextField idField;
	JTextField nameField;
	JTextField ageField;
	JPasswordField jPassField;
	
	JButton jButton;
	
	public JoinW() {
		super("Login");
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		jLabel= new JLabel("ID : ");
		jLabel.setBounds(100, 30, 70, 20);
		contentPane.add(jLabel);
		
		idField= new JTextField();
		idField.setBounds(150, 30, 100, 20);
		contentPane.add(idField);
		
		jLabel = new JLabel("PassWord : ");
		jLabel.setBounds(50, 60, 70, 20);
		contentPane.add(jLabel);
		
		jPassField= new JPasswordField();
		jPassField.setBounds(150, 60, 100, 20);
		contentPane.add(jPassField);
		
		jLabel= new JLabel("Name : ");
		jLabel.setBounds(77, 90, 70, 20);
		contentPane.add(jLabel);
		
		nameField= new JTextField();
		nameField.setBounds(150, 90, 100, 20);
		contentPane.add(nameField);
		
		jLabel = new JLabel("age : ");
		jLabel.setBounds(88, 120, 70, 20);
		contentPane.add(jLabel);
		
		ageField= new JTextField();
		ageField.setBounds(150, 120, 100, 20);
		contentPane.add(ageField);
		
		jButton = new JButton("Join");
		jButton.setBounds(150, 150, 100, 50);
		jButton.addActionListener(this);
		contentPane.add(jButton);
		
		setBounds(0, 0, 400, 250);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Join") {
			
			humanS sc = humanS.getInstence();
			human humanData = new human(idField.getText(), jPassField.getText(), nameField.getText(), Integer.parseInt(ageField.getText()));
			sc.list.add(humanData);
			System.out.println("JoinW list size == "+sc.list.size());
			
			JOptionPane.showMessageDialog(null, "가입이 정상적으로 이루어졌습니다. 메인화면으로 돌아갑니다.");
			new mainW();
			this.dispose();
			
			//파일에 저장 하여 회원인지 아닌지 구분 소스 추가 필요
			
		}
		
	}
}
