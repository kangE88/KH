import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Counter extends Frame implements WindowListener, ActionListener {

	private int num=0;
	Button inc;
	Button dec;
	Button reset;
	
	Label label;
	
	public Counter() {

		setLayout(null);
		
		setTitle("Counter");
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		label = new Label(String.valueOf(num));
		label.setBounds(50, 50, 100, 20);
		add(label);
		
		inc = new Button("+");
		inc.setBounds(50, 100, 50, 50);
		inc.addActionListener(this);
		add(inc);
		
		dec = new Button("-");
		dec.setBounds(150, 100, 50, 50);
		dec.addActionListener(this);
		add(dec);
		
		reset = new Button("reset");
		reset.setBounds(50, 150, 150, 30);
		reset.addActionListener(this);
		add(reset);

		addWindowListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		String btnStr = btn.getLabel();
		
		if(btnStr.equals("+")) {
			num= num+1;
			label.setText(String.valueOf(num));
		}else if(btnStr.equals("-")) {
			if(num>0) {
				num= num-1;
				label.setText(String.valueOf(num));
			}
		}else {
			num= 0;
			label.setText(String.valueOf(num));
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
