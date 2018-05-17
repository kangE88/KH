package Choice;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DTO.coffee;

public class MenuW extends JFrame implements MouseListener{

	JTable jTable;
	JScrollPane jScrolPane;
	
	String clomnNames[] = {
			"Espresso Beverages", "Short", "Tall", "Grande"
	};
	
	Object rowDate[][];

	List<coffee> list = new ArrayList<coffee>();
	
	public MenuW() {
		super("Menu List");
		list.add(new coffee("헤이즐넛 카라멜 모카", 4800, 5300, 5800));
		list.add(new coffee("카라멜  마끼아또", 4300, 4800, 5300));
		list.add(new coffee("화이트 초콜릿 모카", 4300, 4800, 5300));
		list.add(new coffee("카라멜 모카", 4300, 4800, 5300));
		list.add(new coffee("카페 모카", 3800, 4300	, 4800));
		list.add(new coffee("카라멜 라떼", 3800, 4300, 4800));
		list.add(new coffee("카페 라떼", 3300, 3800, 4300));
		list.add(new coffee("카푸치노", 3300, 3800, 4300));
		list.add(new coffee("아메리카노", 2800, 3300, 3800));
		list.add(new coffee("오늘의 커피", 2500, 3000, 3500)); 

		
		rowDate = new Object[list.size()][4];
		
		for (int i = 0; i < list.size(); i++) {
			rowDate[i][0] = list.get(i).getCoffeeName();
			rowDate[i][1] = list.get(i).getSizeS();
			rowDate[i][2] = list.get(i).getSizeT();
			rowDate[i][3] = list.get(i).getSizeG();
		}
		
		jTable = new JTable(rowDate, clomnNames);
		jTable.addMouseListener(this);
		jScrolPane = new JScrollPane(jTable);
		
		add(jScrolPane);
		
		setBounds(100, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	

	}
	
	public List<coffee> MenuW(){
		return list;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
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

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
