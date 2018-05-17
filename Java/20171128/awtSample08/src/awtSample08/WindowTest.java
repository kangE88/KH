package awtSample08;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener, ItemListener {

	List list;
	Checkbox check;
	
	Label label;
	
	TextField textField;
	
	double toRad;
	String StrNum = "2";
	
	public WindowTest() {
		
		/*
		 * 	List
		 * 
		 * 	CheckBox
		 * 		AWT - Radio button == CheckBox
		 * 		Swing - Radio button 
		 * 
		 * 
		 */
		
		textField = new TextField();
		textField.setText("0");
		
		
		GridLayout gridbag = new GridLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		toRad = 1.0;   //180 * 3.141592
		
		label = new Label();
		
		label.setText(StrNum);
		
		list = new List();
		list.add("root");
		list.add("sin");
		list.add("cos");
		list.add("tan");
		list.addItemListener(this);
		add(list);
		
		check = new Checkbox("Degreee");
		check.setState(false);
		check.addItemListener(this);
		add(check);
		
		add(textField);
		
		setBounds(0, 0, 640, 480);
		setLayout(gridbag);
		setVisible(true);
	
		addWindowListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//List _list = (List) e.getSource();
		Object obj = e.getSource();
		
		if(obj == list) {
			//JOptionPane.showMessageDialog(null, "list 클릭");
			int itemNo = list.getSelectedIndex();
			//JOptionPane.showMessageDialog(null, "itemNo== "+itemNo);
			
			double b, c;
			b = Double.parseDouble(textField.getText());
			c = 0;
			
			switch (itemNo) {
			case 0:
				c = Math.sqrt(b);
				break;
			case 1:
				c = Math.sin(b);
				break;
			case 2:
				c = Math.cos(b);
				break;
			case 3:
				c = Math.tan(b);
				break;
			}
			textField.setText(""+c);
		}
		
		if(obj == check) {
			if(check.getState()) { // 체크 되었을때
				double d = Double.parseDouble(textField.getText());
				textField.setText(""+d);
			}else{
				textField.setText("0");
			}
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
