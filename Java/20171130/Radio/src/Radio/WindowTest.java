package Radio;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener, ItemListener {

	Checkbox cb1, cb2, cb3, cb4, cb5, cb6;
	
	Label label1, label2;
	
	public WindowTest() {
		super("");
		
		
		/*
		 * 		
		 * 	AWT		:	radio	->	checkbox // 라디오 버튼이 없어 checkbox로 사용해야 한다.
		 * 
		 * 	swing	:	jRadioButton
		 * 
		 */
		
		CheckboxGroup cbg1 = new CheckboxGroup();
		CheckboxGroup cbg2 = new CheckboxGroup();
		
		cb1 = new Checkbox("Java", cbg1, true);
		cb2 = new Checkbox("C Language", cbg1, false);
		cb3 = new Checkbox("Objective C", cbg1, false);
		
		cb4 = new Checkbox("Oracle", cbg2, true);
		cb5 = new Checkbox("MySQL", cbg2, false);
		
		cb6 = new Checkbox("exit");
		
		label1 = new Label("label1");
		label2 = new Label();
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		
		add(label1);
		add(label2);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		
		setBounds(0, 0, 640, 480);
		setLayout(new FlowLayout());
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		
		Checkbox cb = (Checkbox)obj;
		
		if(cb.getState()) {
			label1.setText(cb.getLabel());
			
			String lab = cb.getLabel();
			if(lab.equals("exit")) {
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?",lab, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE );
				
				//System.exit(0);
			}
		}
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

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




}
