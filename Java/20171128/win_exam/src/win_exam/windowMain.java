package win_exam;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Singleton.SingletonClass;
import dao.FileSave;
import dao.deleteW;
import dao.insertW;
import dao.selectW;
import dao.updateW;
import dto.human;

public class windowMain extends JFrame implements WindowListener, ActionListener, ItemListener, ListSelectionListener{

	JList list;
	JButton btn[];
	TextArea textArea;
	
	public windowMain() {
		
		//왼쪽 메뉴
		
		String bt_title[] = {"추가","삭제","검색","수정", "저장"};
		btn = new JButton[bt_title.length];

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(bt_title[i]);
			btn[i].setBounds(30, 70*(i+1), 100, 50);
			btn[i].addActionListener(this);
			add(btn[i]);
		}
		
		//추가된 list
		list = new JList();
		Vector vec = new Vector();
		
		
		
		list.setBounds(140, 50, 200, 350);
		HashMap<String, human> hm = SingletonClass.getInstance().get();
		
		Iterator iterator = hm.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			//list.add((String) entry.getKey());
			vec.addElement(entry.getKey());
			list.setListData(vec);
			
		}
		list.addListSelectionListener(this);
	
		add(list);
		
		textArea = new TextArea();
		textArea.setSize(250, 350);
		textArea.setLocation(360, 50);
		add(textArea);

		//싱글톤에서 불러온 hashmap이 없을경우 메세지 안보이게
		if(SingletonClass.getInstance().get().isEmpty()) {}
		else {
			System.out.println(SingletonClass.getInstance().get());
		}
		
		setTitle("회원");
		setBounds(0, 0, 640, 480);
		setLayout(null);
		setVisible(true);
		
		
		addWindowListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		//if(obj == btn) {
			if(str.equals("추가")) {
				new insertW();
				this.dispose();
			}else if(str.equals("삭제")){
				new deleteW();
				this.dispose();
			}else if (str.equals("검색")) {
				new selectW();
				this.dispose();
			}else if(str.equals("수정")) {
				new updateW();
				this.dispose();
			}else if(str.equals("저장")) {
				new FileSave();
			}
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		String itemName = (String) list.getSelectedValue();

		Object obj = e.getSource();
		SingletonClass sc = SingletonClass.getInstance();
				
		for(int i=0;i<sc.hm_list.size();i++) {
			if(obj == list) {
					String st = sc.hm_list.get(itemName).toString();
					textArea.setText(st);
			}
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
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