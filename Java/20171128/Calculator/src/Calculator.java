import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Calculator extends Frame implements WindowListener, ActionListener {

	Label label;
	Label label_pro;
	
	boolean num_state = true;
	boolean operator_state=true;
	String op_temp;
	String num_temp;
	
	int count=0;
	private int result;
	
	public Calculator() {

		setTitle("Calculator");
		setLayout(null);
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		//결과값 프린팅
		label = new Label("");
		label.setBounds(50, 50, 150, 20);
		add(label);
		
		label_pro = new Label("");
		label_pro.setBounds(200, 50, 150, 20);
		add(label_pro);
		
		Button bt9 = new Button("9");
		bt9.setBounds(50, 90, 50, 50);
		bt9.addActionListener(this);
		add(bt9);
		
		Button bt8 = new Button("8");
		bt8.setBounds(110, 90, 50, 50);
		bt8.addActionListener(this);
		add(bt8);
		
		Button bt7 = new Button("7");
		bt7.setBounds(170, 90, 50, 50);
		bt7.addActionListener(this);
		add(bt7);
		
		Button bt6 = new Button("6");
		bt6.setBounds(50, 160, 50, 50);
		bt6.addActionListener(this);
		add(bt6);
		
		Button bt5 = new Button("5");
		bt5.setBounds(110, 160, 50, 50);
		bt5.addActionListener(this);
		add(bt5);
		
		Button bt4 = new Button("4");
		bt4.setBounds(170, 160, 50, 50);
		bt4.addActionListener(this);
		add(bt4);
		
		Button bt3 = new Button("3");
		bt3.setBounds(50, 230, 50, 50);
		bt3.addActionListener(this);
		add(bt3);
		
		Button bt2 = new Button("2");
		bt2.setBounds(110, 230, 50, 50);
		bt2.addActionListener(this);
		add(bt2);
		
		Button bt1 = new Button("1");
		bt1.setBounds(170, 230, 50, 50);
		bt1.addActionListener(this);
		add(bt1);
		
		Button bt0 = new Button("0");
		bt0.setBounds(50, 290, 170, 50);
		bt0.addActionListener(this);
		add(bt0);
		
		Button plus = new Button("+");
		plus.setBounds(230, 90, 50, 190);
		plus.addActionListener(this);
		add(plus);
		
		Button result = new Button("=");
		result.setBounds(230, 300, 50, 20);
		result.addActionListener(this);
		add(result);
		

		addWindowListener(this);

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btclick = (Button)e.getSource();
		//String btStr = btclick.getLabel();

		String in = e.getActionCommand();
		
		System.out.println("in=="+in);
		
		if(in.charAt(0)>=0 && in.charAt(0)<=9) {
			if(num_state) {
				label_pro.setText(in);
				num_state =false;
			}else {
				label_pro.setText(label_pro.getText()+in);
				num_state = false;
			}
		}
		
		if(in.equals("+")) {
			num_temp = label_pro.getText();
			op_temp = in;
			num_state = true;
		}else if(in.equals("=")) {
		    if(operator_state) {
		    	System.out.println(num_temp);
		        int num1 = Integer.parseInt(num_temp);
		        int num2 = Integer.parseInt(label_pro.getText());
		        System.out.println("num1=="+num1+"   num2=="+num2+"   re=="+(num1+num2));
		        
		        if(op_temp.equals("+")) {
		        	label_pro.setText("" + (num1+num2));
		        }
		    }
		}
		
		
		
		
/*		list.put(count, btStr);

		temp = temp+list.get(count);
		
		count++;	
		*/

		
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
