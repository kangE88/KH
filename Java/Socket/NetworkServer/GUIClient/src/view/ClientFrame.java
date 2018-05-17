package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.WriteClass;

public class ClientFrame extends JFrame implements WindowListener, ActionListener {

	public JTextField textF = new JTextField(14);
	public JTextArea textA = new JTextArea();
	
	JButton btnTransfer = new JButton("send");
	JButton btnExit = new JButton("exit");
	
	JPanel panel = new JPanel();
	
	public boolean isFirst = true;
	
	public Socket socket;
	WriteClass wc;
	
	public ClientFrame(Socket socket) {
		super("Chatting");
		
		this.socket = socket;
		
		wc = new WriteClass(this);		
		new id(wc, this);	// Id를 입력하는 윈도우 생성
		
		JScrollPane scrPane = new JScrollPane(textA);
		scrPane.setPreferredSize(new Dimension(200, 120));
		
		add("Center", scrPane);
		
		panel.add(textF);
		panel.add(btnTransfer);
		panel.add(btnExit);
		
		add("South", panel);
		
		btnTransfer.addActionListener(this);
		btnExit.addActionListener(this);
		
		textF.addActionListener(this);	// enter
		
		setBounds(300, 300, 450, 300);
		setVisible(false);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String idStr = id.getId();
		
		if(e.getSource() == btnTransfer || e.getSource() == textF) {
			
			if(textF.getText().equals("")) return;
			
			textA.append("[" + idStr + "]" + textF.getText() + "\n");
			
			// 전송
			wc.sendMsg();			
		}
		else {
			System.exit(0);			
		}
		
	}
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}


	

}
