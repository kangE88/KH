package Choice;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener, ItemListener{

	Choice choice;
	Label label;
	
	
	public WindowTest() {
		super("choice");
		
		choice = new Choice();
		choice.add("사과");
		choice.add("망고");
		choice.add("딸기");
		choice.add("수박");
		choice.add("멜론");
		
		choice.addItemListener(this);
		add(choice);
		
		label = new Label("---");
		add(label);
		
		setBounds(0, 0, 400, 400);
		setLayout(new FlowLayout());
		setVisible(true);
		
		addWindowListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Choice cho = (Choice) e.getSource();
		String selected = cho.getSelectedItem();
		
		if(selected.equals("사과")) {
			label.setText("Apple");
		}else if(selected.equals("망고")) {
			label.setText("Mango");
		}else if(selected.equals("딸기")) {
			label.setText("Strowberry");
		}else if(selected.equals("수박")) {
			label.setText("WaterMelon");
		}else if(selected.equals("멜론")) {
			label.setText("Melon");
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
