package Jtable;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Jtable extends JFrame implements MouseListener {

	JTable jTable;
	JScrollPane jScrolPane;
	
	String clomnNames[] = {
			"상품번호", "상품명", "상품가격", "상품설명"
	};
	
	Object rowDate[][];
	
	List<DTO> list = new ArrayList<DTO>();
	
	public Jtable() {
		list.add(new DTO(1, "맛동산", 1000, "오리온"));
		list.add(new DTO(2, "초코파이", 2500, "오리온"));
		list.add(new DTO(2, "감자깡", 1500, "농심"));
		
		rowDate = new Object[list.size()][4];
		
		for (int i = 0; i < list.size(); i++) {
			rowDate[i][0] = list.get(i).getSequenceNum();
			rowDate[i][1] = list.get(i).getName();
			rowDate[i][2] = list.get(i).getMoney();
			rowDate[i][3] = list.get(i).getCompany();
		}
		
		jTable = new JTable(rowDate, clomnNames);
		jTable.addMouseListener(this);
		jScrolPane = new JScrollPane(jTable);
		
		add(jScrolPane);
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
