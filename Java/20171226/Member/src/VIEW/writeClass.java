package VIEW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import DAO.MemberDao;
import DTO.bbsDTO;

public class writeClass  extends JFrame implements ActionListener{

	JLabel label1;
	JTextField titleField;
	JTextField writeField;
	JButton writebutton;
	JButton backButton;
	
	String userid;

	public writeClass(String id) {
		//id 전달
		userid = id;	
		
		setLayout(null);
		
		label1 = new JLabel("Title :");
		label1.setBounds(10, 10, 50, 30);
		add(label1);
		
		titleField = new JTextField("title");
		titleField.setBounds(70, 10, 400, 30);
		add(titleField);

		
		label1 = new JLabel("Content :");
		label1.setBounds(10, 45, 50, 30);
		add(label1);
		
		writeField = new JTextField("Content");
		writeField.setBounds(70, 45, 400, 200);
		add(writeField);
		
		writebutton = new JButton("write");
		writebutton.setBounds(480, 200, 100, 30);
		add(writebutton);
		writebutton.addActionListener(this);	
		
		backButton = new JButton("Back");
		backButton.setBounds(480, 10, 100, 30);
		add(backButton);
		backButton.addActionListener(this);
		
		setSize(600,300);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//글 작성
		bbsDTO bbsdto = new bbsDTO();
		bbsdto.setId(userid);
		bbsdto.setTitle(titleField.getText());
		bbsdto.setContent(writeField.getText());

		MemberDao.getinstance().Write_Insert(bbsdto);
		
		new bbsClass(userid);
		this.dispose();
		
		//뒤로가기
		if(e.getActionCommand().equals("Back")) {
			
			//db Update
			MemberDao.getinstance().update_readCount(bbsdto);
			
			this.dispose();
			new bbsClass(userid);
		}
	}
	
}
