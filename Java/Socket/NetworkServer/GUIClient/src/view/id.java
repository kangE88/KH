package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import net.WriteClass;

public class id extends Frame implements ActionListener {
	// ID를 입력 -> ClientFrame
	
	public static TextField tf = new TextField(8);
	Button btn = new Button("ID:");
	
	WriteClass wc;
	ClientFrame cf;
	
	public id(WriteClass wc, ClientFrame cf) {
		this.wc = wc;
		this.cf = cf;
		
		setTitle("ID input");
		setLayout(new FlowLayout());
		
		Label label = new Label("ID");
		
		add(label);
		add(tf);
		add(btn);
		
		btn.addActionListener(this);
		setBounds(300, 300, 250, 200);
		setVisible(true);		
	}
	
	public static String getId() {
		return tf.getText();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	//	JOptionPane.showMessageDialog(null, "버튼 클릭");
		
		wc.sendMsg(); // ID전송
		
		cf.isFirst = false;
		
		cf.setVisible(true);	// clientFrame 창 시각화
		this.dispose();
	}

}




