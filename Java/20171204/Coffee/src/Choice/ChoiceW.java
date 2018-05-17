package Choice;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

import DTO.coffee;
import DTO.other;
import Singleton.OtherS;

public class ChoiceW extends JFrame implements ActionListener, ItemListener, MouseMotionListener{

	Choice choice;
	JButton jButton;
	
	JRadioButton bt1;
	JRadioButton bt2;
	JRadioButton bt3;
	JRadioButton bt4;
	JRadioButton bt5;
	JRadioButton bt6;
	
	JCheckBox bt7;
	JCheckBox bt8;

	JLabel jLabel;
	
	JTextField jTxtField;
	
	List<coffee> menuList;
	
	OtherS otherS;
	
	int count;
	
	public ChoiceW() {
		super("Choice");
		
		otherS = Singleton.OtherS.getInstence();
		
		count = otherS.list.size();
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
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
		
		//Choice 선택 
		choice.addItemListener(this);
		
		jButton = new JButton("Menu");
		jButton.addActionListener(this);
		panel.add(choice);
		panel.add(jButton);

		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.NORTH);
		
		//3개 배치
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridBagLayout());
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(4,1));
		
		jLabel = new JLabel("크기");
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel3.add(jLabel);
		
		ButtonGroup btnGr = new ButtonGroup();
		
		bt1 = new JRadioButton("Short");
		bt2 = new JRadioButton("Tail");
		bt3 = new JRadioButton("Grande");
		
		btnGr.add(bt1);
		btnGr.add(bt2);
		btnGr.add(bt3);

		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		
		
		bt1.addItemListener(this);
		bt2.addItemListener(this);
		bt3.addItemListener(this);
		
		panel3.add(bt1);
		panel3.add(bt2);
		panel3.add(bt3);
		
		panel2.add(panel3);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(4,1));
		
		jLabel = new JLabel("시럽");
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel4.add(jLabel);
		
		btnGr = new ButtonGroup();
		
		bt4 = new JRadioButton("바닐라");
		bt5 = new JRadioButton("카라멜");
		bt6 = new JRadioButton("헤이즐넛");
		
		btnGr.add(bt4);
		btnGr.add(bt5);
		btnGr.add(bt6);
		
		bt4.addItemListener(this);
		bt5.addItemListener(this);
		bt6.addItemListener(this);
		
		panel4.add(bt4);
		panel4.add(bt5);
		panel4.add(bt6);
		
		panel2.add(panel4);
		
		///
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridLayout(4,1));
		
		jLabel = new JLabel("기타");
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel5.add(jLabel);		

		
		bt7 = new JCheckBox("샷추가");
		bt8 = new JCheckBox("휘핑크림");

		
		bt7.addItemListener(this);
		bt8.addItemListener(this);

		panel5.add(bt7);
		panel5.add(bt8);
	
		panel2.add(panel5);
		///

		contentPane.add(panel2, BorderLayout.CENTER);
		
		
		JPanel panel6 = new JPanel();
		
		panel6.setLayout(new GridLayout(1, 3));
		
		jTxtField = new JTextField();
		
		jLabel = new JLabel(" 잔 ");

		
		jButton = new JButton("Other");
		jButton.addActionListener(this);

		panel6.add(jTxtField);
		panel6.add(jLabel);
		panel6.add(jButton);

		panel6.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel6, BorderLayout.SOUTH);
		
		setBounds(0, 0, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Menu") {
			
			MenuW menuW = new MenuW();
			
			menuList = menuW.list;
			
		}else if(e.getActionCommand() == "Other") {

			//System.out.println("===>"+menuList.size());
			
			for (int i = 0; i < menuList.size(); i++) {
				
			}
			
			//주문 List 에 보낼 데이터 가져오기
			String syurp="";
			String size="";
			String shotadd="";
			String hcream="";
			int coffeePri=0;
			
			if(bt1.isSelected()) {
				size = bt1.getText();
			}else if(bt2.isSelected()) {
				size = bt2.getText();
			}else if(bt3.isSelected()) {
				size = bt3.getText();
			}
			
			if(bt4.isSelected()) {
				syurp = bt4.getText();
			}else if(bt5.isSelected()) {
				syurp = bt5.getText();
			}else if(bt6.isSelected()) {
				syurp = bt6.getText();
			}
			
			if(bt7.isSelected()) {
				shotadd = bt7.getText();
			}
			
			if(bt8.isSelected()) {
				hcream = bt8.getText();
			}
			
			//메뉴판에 있는 메뉴의 가격을 가져오기 위해 사용
			int coffeeNum = -1;
			for (int i = 0; i < menuList.size(); i++) {
				if(menuList.get(i).getCoffeeName().equals(choice.getSelectedItem())) {
					coffeeNum = i;
				}
			}
			
			//사이즈에 따른 커피 가격 가져오기
			if(size.equals("Short")) {
				coffeePri = menuList.get(coffeeNum).getSizeS();
			}else if(size.equals("Tall")) {
				coffeePri = menuList.get(coffeeNum).getSizeT();
			}else if(size.equals("Grande")) {
				coffeePri = menuList.get(coffeeNum).getSizeG();
			}
			
			//커피 가격 정하기
			coffeePri = coffeePri * Integer.parseInt(jTxtField.getText());
			
			other otherL = new other(choice.getSelectedItem(), syurp, size, shotadd, hcream, jTxtField.getText(), coffeePri); 
			otherS.list.put(count, otherL);
			
			JOptionPane.showMessageDialog(null, otherS.list.toString());
			new OtherW();
			count++;
		}
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getItemSelectable();
		
		/*		
		if(obj == choice) {
			JOptionPane.showMessageDialog(null, choice.getSelectedItem());
		}else if(e.getStateChange() == ItemEvent.SELECTED) {
			AbstractButton ab = (AbstractButton) e.getItemSelectable();
			//JOptionPane.showMessageDialog(null, ab.getText());
		}else if(obj == bt7) {
			JOptionPane.showMessageDialog(null, bt7.getText());
		}else if(obj == bt8) {
			//JOptionPane.showMessageDialog(null, bt8.getText());
		}
		*/
		
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//jLabel.setText("x ="+e.getX()+" y="+e.getY());
	}
}
