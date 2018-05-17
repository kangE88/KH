package VIEW;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import DAO.MemberDao;
import DTO.bbsDTO;

public class bbsClass extends JFrame implements ActionListener, MouseListener {
	
	JLabel title;

	JTextField searchField;
	JTextField titleField;
	JTextField writeField;
	JButton writeButton;
	JButton searchButton;

    Vector v;  
    Vector cols;
	JTable jTable;
    JScrollPane scPane;
        
    String userid;
	
	public bbsClass(String id){
		super("bbsClass");
		
		DefaultTableModel model;
		
		//login 창에서 가져온 id
		userid = id;
		
		setLayout(null);
		title = new JLabel("게시판");		
		title.setBounds(10, 10, 600, 20);
		add(title);
		
		//table
        v = MemberDao.getinstance().getBBSDTO();
        cols = getColumn();
		
		model = new DefaultTableModel(v, cols);
		//System.out.println(model);
		
		jTable = new JTable(model);
		
		//table sort 
		TableRowSorter sorter;
		sorter= new TableRowSorter(model);
		
		jTable.setRowSorter(sorter);
		jTable.setAutoCreateRowSorter(true);
		//
		
		
		scPane = new JScrollPane(jTable);
		scPane.setBounds(0, 30, 600, 300);
		jTable.addMouseListener(this);
		add(scPane);
		
		//add(topPane);
		
		//bottom
		searchField = new JTextField("");
		searchField.setBounds(150, 335, 200, 20);
		add(searchField);
		
		searchButton = new JButton("Search");
		searchButton.setBounds(350, 335, 100, 20);
		searchButton.addActionListener(this);
		add(searchButton);
		
		writeButton = new JButton("write");
		writeButton.setBounds(450, 335, 100, 20);
		writeButton.addActionListener(this);
		add(writeButton);
        
		
		setSize(600,400);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//Jtable title
    public Vector getColumn(){
        Vector col = new Vector();
        col.add("NO");
        col.add("작성자");
        col.add("글제목");
        col.add("글내용");
        col.add("작성일자");
        col.add("조회수");
        
        return col;
    }
    
    public void jTableRefresh(){
        
        MemberDao memberdao = MemberDao.getinstance();
        
        if(searchField.getText() != null) {       
        	System.out.println("searchField.getText()==>"+searchField.getText());
        	System.out.println("userid=>"+userid);
        	
        	v = memberdao.searchBBSDTO(searchField.getText(), userid);
        	System.out.println("V==>"+v);
        }else {
        	v = memberdao.getBBSDTO();
        }
        DefaultTableModel model= new DefaultTableModel(v, getColumn());
        jTable.setModel(model);
       
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		//글작성 페이지
		if(e.getActionCommand().equals("write")) {
			new writeClass(userid);
		}
		
		if(e.getActionCommand().equals("Search")) {
			System.out.println("Search");
			jTableRefresh();
		}
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		//Jtable List 클릭 시 상세 정보가 나오도록 설정
		JTable target = (JTable)e.getSource();
		int rowNum = target.getSelectedRow();
		
		//row 번호
		//System.out.println("rowNum==="+rowNum);
		
		//row 번호의 내용을 글 제목
		Object obj = target.getValueAt(rowNum, 0);
		System.out.println("obj==="+obj);
		
		int seq = (int)obj;
		
		bbsDTO bbsdto = MemberDao.getinstance().editTable(userid, seq);
		System.out.println("editTable==>"+bbsdto.toString());
		
		if(bbsdto.getId()!=null) {
			new revisionClass(bbsdto);
			this.dispose();
		}else {
			JOptionPane.showMessageDialog(null, "본인 글만 수정 및 삭제가 가능합니다.");
		}


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
