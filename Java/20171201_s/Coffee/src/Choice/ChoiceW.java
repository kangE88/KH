package Choice;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.time.temporal.JulianFields;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ChoiceW extends JFrame implements MouseMotionListener{


	Choice choice;
	JButton jButton;
	JRadioButton jradio;
	JCheckBox jchkbox;
	JLabel jLabel;
	Label label;
	
	public ChoiceW() {
		super("Choice");
		
		// JOptionPane.showMessageDialog(null, "ChoiceW");
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBounds(0, 0, 500, 400);
		
		JPanel panel = new JPanel();
		
		choice = new Choice();
		
		choice.add("헤이즐넛 카라멜 모카");
		choice.add("카라멜  마끼아또");
		choice.add("화이트 초콜릿 모카");
		choice.add("카라멜 모카");
		choice.add("카페 모카");
		choice.add("카라멜 라떼");
		choice.add("카페 라떼");
		choice.add("카푸치노");
		choice.add("아메리카노");
		choice.add("오늘의 커피");
		choice.setBounds(10, 10, 300, 20);
		
		jButton = new JButton("Menu");
		jButton.setBounds(320, 10, 70, 20);
		panel.add(choice);
		panel.add(jButton);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4, 1));
		panel2.setBounds(0,0,100,400);
		
		jLabel = new JLabel("크기");
		jLabel.setBounds(0, 0, 50, 10);
		panel2.add(jLabel);
		
		jradio = new JRadioButton("Short");
		jradio.setBounds(0, 10, 50, 10);
		panel2.add(jradio);
		
		jradio = new JRadioButton("Tail");
		jradio.setBounds(0, 20, 50, 10);
		panel2.add(jradio);
		
		jradio = new JRadioButton("Grande");
		jradio.setBounds(0, 30, 50, 10);
		panel2.add(jradio);

		
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0,0,500,50);

		
		

		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(panel2, BorderLayout.WEST);

		
		setBounds(0, 0, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("x ="+e.getX()+" y="+e.getY());
	}
}
