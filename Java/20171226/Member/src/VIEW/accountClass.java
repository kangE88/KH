package VIEW;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAO.MemberDao;
import DB.DBClose;
import DB.DBConnection;
import DTO.MemberDTO;
import main.mainClass;

public class accountClass extends JFrame implements ActionListener {

	JLabel jLabel;

	JTextField idField;
	JTextField nameField;
	JTextField emailField;
	JPasswordField jPassField;
	
	JButton jButton;
	JButton ck_Button;
	JButton backButton;
	
	int ck_id = 2;

	public accountClass() {
		super("accountClass");
		
		DBConnection.initConnect();
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		jLabel= new JLabel("ID : ");
		jLabel.setBounds(100, 30, 70, 20);
		contentPane.add(jLabel);
		
		idField= new JTextField();
		idField.setBounds(150, 30, 100, 20);
		contentPane.add(idField);
		
		ck_Button = new JButton("CK");
		ck_Button.setBounds(270, 30, 50, 20);
		ck_Button.addActionListener(this);
		contentPane.add(ck_Button);
		
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
		
		jLabel = new JLabel("email : ");
		jLabel.setBounds(88, 120, 70, 20);
		contentPane.add(jLabel);
		
		emailField= new JTextField();
		emailField.setBounds(150, 120, 150, 20);
		contentPane.add(emailField);
		
		jButton = new JButton("Join");
		jButton.setBounds(100, 150, 100, 30);
		jButton.addActionListener(this);
		contentPane.add(jButton);
		
		backButton = new JButton("back");
		backButton.setBounds(200, 150, 100, 30);
		backButton.addActionListener(this);
		contentPane.add(backButton);
		
		setBounds(0, 0, 400, 250);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String id = idField.getText();
		String pw = jPassField.getText();
		String name = nameField.getText();
		String email = emailField.getText();
		int auth = 3;
		
		//ID중복체크
		if(e.getActionCommand().equals("CK")) {
			ck_id = MemberDao.getinstance().getId(id);
			
			if(ck_id==1) {
				JOptionPane.showMessageDialog(null, "사용 가능한 아이디 입니다.");
			}else if(ck_id==2) {
				JOptionPane.showMessageDialog(null, "사용중인 아이디 입니다 다른 아이디를 입력하세요.");
			}
		}

		//가입
		if(e.getActionCommand().equals("Join")) {
			if(ck_id == 1) {
				MemberDTO memberData = new MemberDTO(id, pw, name, email, auth);
				MemberDao.getinstance().Insert(memberData);
				JOptionPane.showMessageDialog(null, "가입이 정상적으로 이루어졌습니다. 메인화면으로 돌아갑니다.");
				new loginClass();
				this.dispose();
			}else if(ck_id==0) {
				JOptionPane.showMessageDialog(null, "아이디 중복체크를 해주십시오.");
			}else if(ck_id==2) {
				JOptionPane.showMessageDialog(null, "아이디 중복체크를 하세요.");
			}
		}
		
		//뒤로가기
		if(e.getActionCommand().equals("back")) {
			new loginClass();
			this.dispose();
		}

	}

}
