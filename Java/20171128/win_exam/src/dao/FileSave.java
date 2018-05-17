package dao;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

import Singleton.SingletonClass;
import win_exam.windowMain;

public class FileSave extends Frame implements WindowListener,ActionListener{
	


	TextField TextField = new TextField();
	
	public FileSave() {

		Label label = new Label("저장할 이름 : ");
		label.setBounds(50, 50, 50, 30);
		add(label);
		
		
		TextField.setBounds(110, 50, 100, 30);
		add(TextField);
		
		Button bt = new Button("저장");
		bt.setBounds(70, 100, 100, 30);
		bt.addActionListener(this);
		add(bt);
		
		setLayout(null);
		setBounds(0, 0, 300, 200);
		setVisible(true);
		
		addWindowListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		File f = new File("e:\\tmp1\\"+TextField.getText()+".txt");
		
		SingletonClass sc = SingletonClass.getInstance();
		System.out.println("1");
	
		try {
			if(!f.exists() && !f.canWrite()) {
				//파일생성
				f.createNewFile();
				
				//파일에 작성
				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				String str;
				for (int i = 1; i < sc.hm_list.size(); i++) {
					Iterator it = sc.hm_list.entrySet().iterator();
					while (it.hasNext()) {
						Entry entry = (Entry) it.next();
						str = "" + entry.getValue();
						bw.write(str);
						bw.newLine();
					}
				}
				bw.close();
				
				JOptionPane.showMessageDialog(null, "저장되었습니다.");
				this.dispose();
			}else {
				/*FileReader fr = new FileReader(f);
				BufferedReader bw = new BufferedReader(fr);
				
				Iterator it = sc.hm_list.entrySet().iterator();
				while (it.hasNext()) {
					Entry entry = (Entry) it.next();
					System.out.println(entry.getKey()+"--"+entry.getValue());
				}*/
				JOptionPane.showMessageDialog(null, "파일이 있습니다. 다시입력해주세요.");
				return;
				
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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
