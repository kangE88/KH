package Choice;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest1 extends Frame implements WindowListener, ItemListener{

	Choice choice;
	Label label;
	
	public WindowTest1() {
		super("choice");
		
		choice = new Choice();
		choice.add("사과");
		choice.add("망고");
		choice.add("딸기");
		choice.add("수박");
		choice.add("멜론");
		
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {				
				label.setText(choice.getSelectedItem());
			}
		});
		add(choice);
		
		label = new Label("---");
		add(label);
		
		setBounds(0, 0, 400, 400);
		setBackground(Color.RED);
		setLayout(new FlowLayout());
		setVisible(true);
		
		addWindowListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
