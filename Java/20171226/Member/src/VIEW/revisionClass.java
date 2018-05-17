package VIEW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import DAO.MemberDao;
import DTO.bbsDTO;

public class revisionClass extends JFrame implements ActionListener{

	JLabel label1;
	JTextField titleField;
	JTextField writeField;
	JButton updateButton;
	JButton deleteButton;
	JButton backButton;
	
	bbsDTO m_bbsdto;
	
	public revisionClass(bbsDTO bbsdto) {

		setLayout(null);
		
		m_bbsdto = bbsdto;
		
		label1 = new JLabel("Title :");
		label1.setBounds(10, 10, 50, 30);
		add(label1);
		
		titleField = new JTextField(bbsdto.getTitle());
		titleField.setBounds(70, 10, 400, 30);
		add(titleField);

		
		label1 = new JLabel("Content :");
		label1.setBounds(10, 45, 50, 30);
		add(label1);
		
		writeField = new JTextField(bbsdto.getContent());
		writeField.setBounds(70, 45, 400, 200);
		add(writeField);
		
		deleteButton = new JButton("Delete");
		deleteButton.setBounds(480, 100, 100, 30);
		add(deleteButton);
		deleteButton.addActionListener(this);
		
		updateButton = new JButton("Update");
		updateButton.setBounds(480, 50, 100, 30);
		add(updateButton);
		updateButton.addActionListener(this);
		
		backButton = new JButton("Back");
		backButton.setBounds(480, 10, 100, 30);
		add(backButton);
		backButton.addActionListener(this);
		
		setSize(600,300);
		setVisible(true);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Update")) {
			System.out.println("Update");
			
			//title 과 content 수정 후 다시 세팅
			m_bbsdto.setTitle(titleField.getText());
			m_bbsdto.setContent(writeField.getText());
			
			//System.out.println(m_bbsdto.toString());
			
			//db Update
			MemberDao.getinstance().update(m_bbsdto);
			
			this.dispose();
			new bbsClass(m_bbsdto.getId());
			
		}
		
		//삭제
		if(e.getActionCommand().equals("Delete")) {
			//db Update
			MemberDao.getinstance().delete_bbstable(m_bbsdto);
			
			this.dispose();
			new bbsClass(m_bbsdto.getId());
		}
		
		//뒤로가기
		if(e.getActionCommand().equals("Back")) {
			
			//db Update
			MemberDao.getinstance().update_readCount(m_bbsdto);
			
			this.dispose();
			new bbsClass(m_bbsdto.getId());
		}
		
	}
}
