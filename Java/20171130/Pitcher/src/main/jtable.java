package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import DTO.DTO;

public class jtable extends JFrame implements MouseListener{

	JTable jTable;
	JScrollPane jScrolPane;
	
	String colName[] = {"선수번호","선수이름","최고속도","방어율"};
	
	List<DTO> list = new ArrayList<DTO>();
	
	Object rowData[][];
	
	public jtable() {
		
		list.add(new DTO(1, "이름1", 150, 10.0));
		list.add(new DTO(2, "이름2", 100, 4.2));
		list.add(new DTO(3, "이름3", 40, 1.2));
		list.add(new DTO(4, "이름4", 80, 3.5));
		list.add(new DTO(5, "이름5", 20, 0.5));
		
		
		rowData = new Object[list.size()][4];
		
		for (int i = 0; i < list.size(); i++) {
			rowData[i][0] = list.get(i).getNumber();
			rowData[i][1] = list.get(i).getName();
			rowData[i][2] = list.get(i).getBallSpeed();
			rowData[i][3] = list.get(i).getDefense();
		}
		
		jTable = new JTable(rowData,colName);
		add(jTable);
		//jTable.addMouseListener(this);
		
		jScrolPane = new JScrollPane(jTable);
		add(jScrolPane);
		jScrolPane.addMouseListener(this);
		
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
		System.out.println("mousePressed");
		
		//int rowNum = jTable.getSelectedRow();
		
		//JOptionPane.showMessageDialog(null, list.get(rowNum).toString());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
