import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener, ActionListener {
	


	Button button1;
	Button button2;
	
	Label label;
	
	
	public WindowTest() {
		
		/*
		 * 	Handle	==	번호
		 * 
		 * 	Button,	textField, slider
		 * 
		 * 	각 고유의 속성을 사용하려면 번호를 알아야한다.
		 * 
		 */
		
		setLayout(new GridLayout(2, 1));
		
		label = new Label("버튼");
		add(label);
		
		
		
		
		//Panel 설정
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(1, 2));
		
		button1 = new Button("버튼1");
		button1.addActionListener(this);
		panel.add(button1);
		
		button2 = new Button("버튼2");
		button2.addActionListener(this);
		panel.add(button2);
		
		add(panel);
		
		
		setTitle("버튼");
		setSize(640, 480);
		setLocation(0, 0);
		
		setVisible(true);
		
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("버튼 클릭");
		
		//메세지 팝업
		//JOptionPane.showMessageDialog(null, "쳌");
		
		
		//각각 버튼에 다른 메세지 부여
		Button btn = (Button)e.getSource(); // getSource(); 는 Object 로 받아오기 때문에 캐스트변환해줘야함.
		String btnStr = btn.getLabel();	
		
		if(btnStr.equals("버튼1")) {
			label.setText("버튼1 클릭하였습니다.");
			//JOptionPane.showMessageDialog(null, "bt1");
		}else {
			label.setText("버튼2 클릭하였습니다.");
			//JOptionPane.showMessageDialog(null, "bt2");
		}
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

}
