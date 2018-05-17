package VIEW;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAO.MemberDao;
import DTO.MemberDTO;

public class loginClass extends JFrame implements ActionListener {

	JLabel jLabel;
	JTextField jTextField;
	JPasswordField jPassField;
	JButton jButton;
	
	public loginClass() {
		super("Login");
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		jLabel= new JLabel("ID : ");
		jLabel.setBounds(100, 50, 70, 20);
		contentPane.add(jLabel);
		
		jTextField= new JTextField();
		jTextField.setBounds(150, 50, 100, 20);
		contentPane.add(jTextField);
		
		jLabel = new JLabel("PassWord : ");
		jLabel.setBounds(50, 80, 70, 20);
		contentPane.add(jLabel);
		
		jPassField= new JPasswordField();
		jPassField.setBounds(150, 80, 100, 20);
		contentPane.add(jPassField);

		jButton = new JButton("Login");
		jButton.setBounds(270, 50, 100, 50);
		jButton.addActionListener(this);
		contentPane.add(jButton);
		
		jButton = new JButton("Join");
		jButton.setBounds(150, 110, 100, 50);
		jButton.addActionListener(this);
		contentPane.add(jButton);
		
		setBounds(0, 0, 400, 250);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Login")) {

			System.out.println("login action ID-->"+jTextField.getText());
			System.out.println("login action PW-->"+jPassField.getText());
			
			String id = jTextField.getText();
			String pwd = jPassField.getText();
			
			if(jTextField.getText().isEmpty() && jPassField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "아이디와 패스워드를 입력하세요.");
			}else {
				boolean ck_id = MemberDao.getinstance().getId(id, pwd);
				
				
				if(ck_id) {
					//게시판
					new bbsClass(id);
					this.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "아이디나 패스워드를 확인해주세요.");
				}
			}
		}else {
			//회원가입 
			new accountClass();
			this.dispose();
		}
	}

}
