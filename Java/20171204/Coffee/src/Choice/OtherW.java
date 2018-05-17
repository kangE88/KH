package Choice;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DTO.other;
import Singleton.OtherS;

public class OtherW extends JFrame implements MouseListener{
	JTable jTable;
	JScrollPane jScrolPane;
	
	String clomnNames[] = {
			"Espresso Beverages", "시럽", "크기", "샷추가", "휘핑크림","잔","총액"
	};
	
	Object rowDate[][];
	
	HashMap<Integer, other> list = new HashMap<Integer, other>();
	
	public OtherW() {
		super("Other List");
		
       list = OtherS.getInstence().list;
        
		rowDate = new Object[list.size()][7];
		
		Iterator iterator = list.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			
		}
		
		//HashMap 에서 가져온 리스트를 rowDate에 셋팅
		for (int i = 0; i < list.size(); i++) { 
			rowDate[i][0] = list.get(i).getCoffee_name();
			rowDate[i][1] = list.get(i).isSyurp();
			rowDate[i][2] = list.get(i).getSize();
			rowDate[i][3] = list.get(i).isShotadd();
			rowDate[i][4] = list.get(i).isHcream();
			rowDate[i][5] = list.get(i).getCoffeeitem();
			rowDate[i][6] = list.get(i).getCoffeePri();
		}
        
		jTable = new JTable(rowDate, clomnNames);
		jTable.addMouseListener(this);
		jScrolPane = new JScrollPane(jTable);
		
		add(jScrolPane);
		
		setBounds(100, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
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
