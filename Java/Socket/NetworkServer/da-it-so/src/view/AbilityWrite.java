package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import dao.AbilityDao;
import delegator.Delegator;
import dto.AbilityBbs;
import dto.Category;
import dto.Person;
import service.AbilityService;
import service.ItemBbsService;

public class AbilityWrite extends JFrame implements ActionListener, MouseListener{

	private JButton loginBtn, logoutBtn, signupBtn, MypageBtn, searchBtn, imgAdd1, imgAdd2, imgAdd3, imgAdd4, writeBtn;
	private JTextField searchTextF, titleTextF, img1TextF, img2TextF, img3TextF, img4TextF, abilityTextF;
	private JTextPane contentTextPn;
	private JPanel headerLogo, cate1, cate2, cate3, cate4, cate5, cate6, cate7, cate8, cate9;
	private JComboBox cateCombo;
	
	String iconImgUrl = "C:\\icon\\";
	
	private JFileChooser jfc = new JFileChooser();
	private String filename1,filename2,filename3,filename4;
	
	List<Category> m_categoryList = null;
	
	public AbilityWrite(List<Category> categoryList) {

		Delegator delegator = Delegator.getInstance();
		this.m_categoryList = categoryList;
		
		JLabel cateLb, titleLb, imgLb1, imgLb2, imgLb3, imgLb4, abilityLb, contentLb;
		
		JPanel headerPn, sidePn, logoPn, catePn, writePn, cate1, cate2, cate3, cate4, cate5, cate6, cate7, cate8,
		cate9;
		
		//header 
		headerLogo = new JPanel() {
			ImageIcon headerimage = new ImageIcon(iconImgUrl+"headerlogo.png");
			// 사이즈맞게 배경삽임
			public void paintComponent(Graphics g) {
				g.drawImage(headerimage.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		
		//logo
		logoPn = new JPanel() {
			ImageIcon image = new ImageIcon(iconImgUrl+"logo.png");
			// 사이즈맞게 배경삽임
			public void paintComponent(Graphics g) {
				g.drawImage(image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		
		//mainView
		Container cn = getContentPane();

		cn.setBounds(0, 0, 1350, 750);
		cn.setBackground(Color.white);

		setBounds(0, 0, 1350, 750);
		setLayout(null);
		setVisible(true);

		// Header
		Color commonColor = new Color(218, 0, 0);
		headerPn = new JPanel();
		headerPn.setBackground(commonColor);
		headerPn.setSize(1350, 60);
		headerPn.setLayout(null);

		// headerlogo
		headerLogo.setBounds(15, 25, 71, 15);
		headerLogo.addMouseListener(this);
		headerPn.add(headerLogo);
		
		if(delegator.getCurrent_user()==null) {
			// loginBtn
			loginBtn = new JButton("로그인");
			loginBtn.setBounds(1240, 20, 100, 30);
			loginBtn.setOpaque(false); // 투명하게
			loginBtn.setBorderPainted(false);// 외곽선 없애줌
			loginBtn.setFont(new Font("로그인", Font.BOLD, 12));
			loginBtn.setBackground(commonColor);
			loginBtn.setForeground(Color.white);
			loginBtn.addActionListener(this);
			headerPn.add(loginBtn);
			
			// SignBtn
			signupBtn = new JButton("회원가입");
			signupBtn.setBounds(1180, 20, 100, 30);
			signupBtn.setOpaque(false); // 투명하게
			signupBtn.setBorderPainted(false);// 외곽선 없애줌
			signupBtn.setFont(new Font("회원가입", Font.BOLD, 12));
			signupBtn.setBackground(commonColor);
			signupBtn.setForeground(Color.white);
			signupBtn.addActionListener(this);
			headerPn.add(signupBtn);			
		}else {
			// logoutBtn
			logoutBtn = new JButton("로그아웃");
			logoutBtn.setBounds(1240, 20, 100, 30);
			logoutBtn.setOpaque(false); // 투명하게
			logoutBtn.setBorderPainted(false);// 외곽선 없애줌
			logoutBtn.setFont(new Font("로그아웃", Font.BOLD, 12));
			logoutBtn.setBackground(commonColor);
			logoutBtn.setForeground(Color.white);
			logoutBtn.addActionListener(this);
			headerPn.add(logoutBtn);			
		}
		
		// sidePn
		Color sideC = new Color(250, 250, 250);
		sidePn = new JPanel();
		sidePn.setBounds(0, 60, 400, 1000);
		sidePn.setLayout(null);
		sidePn.setBackground(sideC);
		
		//logoPn
		logoPn.setBounds(40, 30, 300, 66);
		sidePn.add(logoPn);

		// SearchText
		searchTextF = new JTextField("검색어");
		searchTextF.setBounds(40, 160, 260, 40);
		searchTextF.setBorder(new LineBorder(commonColor, 5));
		sidePn.add(searchTextF);

		// searchBtn
		searchBtn = new JButton(new ImageIcon(iconImgUrl+"search.png"));
		searchBtn.setBounds(300, 160, 40, 40);
		searchBtn.setOpaque(false); // 투명하게
		searchBtn.setContentAreaFilled(false);// 내용영역 채우기x
		sidePn.add(searchBtn);

		// catePn
		catePn = new JPanel();
		catePn.setLayout(new GridLayout(3, 3, 10, 10));
		catePn.setBounds(25, 290, 350, 350);
		catePn.setBackground(Color.WHITE);
		
		String category_id[] = new String[9];
		
		for (int i = 0; i < m_categoryList.size(); i++) {
			category_id[i] = String.valueOf(m_categoryList.get(i).getSeq()); 
		}

		ImageIcon cate1Image = new ImageIcon(iconImgUrl + "1.png");
		cate1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(cate1Image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		cate1.setBorder(new LineBorder(commonColor, 3));
		
		if(category_id[0] != null) {
			cate1.setName(category_id[0]);
			cate1.addMouseListener(this);
		}

		//  2
		ImageIcon cate2Image = new ImageIcon(iconImgUrl + "2.png");
		cate2 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(cate2Image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		cate2.setBorder(new LineBorder(commonColor, 3));
		if(category_id[1] != null) {
			cate2.setName(category_id[1]);
			cate2.addMouseListener(this);
		}
		//  3
		ImageIcon cate3Image = new ImageIcon(iconImgUrl + "3.png");
		cate3 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(cate3Image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		cate3.setBorder(new LineBorder(commonColor, 3));
		if(category_id[2] != null) {
			cate3.setName(category_id[2]);
			cate3.addMouseListener(this);
		}
		// 4
		ImageIcon cate4Image = new ImageIcon(iconImgUrl + "4.png");
		cate4 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(cate4Image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		cate4.setBorder(new LineBorder(commonColor, 3));

		if(category_id[3] != null) {
			cate4.setName(category_id[3]);
			cate4.addMouseListener(this);
		}
		
		//  5
		ImageIcon cate5Image = new ImageIcon(iconImgUrl + "5.png");
		cate5 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(cate5Image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		cate5.setBorder(new LineBorder(commonColor, 3));
		if(category_id[4] != null) {
			cate5.setName(category_id[4]);
			cate5.addMouseListener(this);
		}
		//  6
		ImageIcon cate6Image = new ImageIcon(iconImgUrl + "6.png");
		cate6 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(cate6Image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		cate6.setBorder(new LineBorder(commonColor, 3));
		if(category_id[5] != null) {
			cate6.setName(category_id[5]);
			cate6.addMouseListener(this);
		}
		// 7
		ImageIcon cate7Image = new ImageIcon(iconImgUrl + "7.png");
		cate7 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(cate7Image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		cate7.setBorder(new LineBorder(commonColor, 3));
		
		if(category_id[6] != null) {
			cate7.setName(category_id[6]);
			cate7.addMouseListener(this);
		}

		ImageIcon cate8Image = new ImageIcon(iconImgUrl + "8.png");
		cate8 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(cate8Image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		cate8.setBorder(new LineBorder(commonColor, 3));
		
		if(category_id[7] != null) {
			cate8.setName(category_id[7]);
			cate8.addMouseListener(this);
		}
		// 9
		ImageIcon cate9Image = new ImageIcon(iconImgUrl + "9.png");
		cate9 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(cate9Image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponents(g);
			}
		};
		cate9.setBorder(new LineBorder(commonColor, 3));
		if(category_id[8] != null) {
			cate9.setName(category_id[8]);
			cate9.addMouseListener(this);
		}
		
		catePn.add(cate1);
		catePn.add(cate2);
		catePn.add(cate3);
		catePn.add(cate4);
		catePn.add(cate5);
		catePn.add(cate6);
		catePn.add(cate7);
		catePn.add(cate8);
		catePn.add(cate9);

		sidePn.add(catePn);
		
		//listPn
		writePn = new JPanel();
		writePn.setLayout(null);
		writePn.setBounds(380, 30, 1050, 670);
		
		//category
		cateLb = new JLabel("카테고리");
		cateLb.setBounds(100, 100, 100, 30);		
		writePn.add(cateLb);
		
		String category[] = new String[m_categoryList.size()];

		for (int i = 0; i < category.length; i++) {
			category[i] = m_categoryList.get(i).getTitle();
		}
		
		cateCombo = new JComboBox(category);
		cateCombo.setBounds(210, 100, 150, 30);
		writePn.add(cateCombo);
		
		//title
		titleLb = new JLabel("제목");
		titleLb.setBounds(100, 150, 150, 30);
		writePn.add(titleLb);
		
		titleTextF = new JTextField();
		titleTextF.setBounds(210, 150, 150, 30);
		writePn.add(titleTextF);
		
		//img
		imgLb1 = new JLabel("사진1");
		imgLb1.setBounds(100, 190, 100, 30);
		writePn.add(imgLb1);
		
		img1TextF = new JTextField();
		img1TextF.setBounds(210, 190, 300, 30);
		writePn.add(img1TextF);
		
		imgAdd1 = new JButton("이미지 1");
		imgAdd1.setBounds(520, 190, 100, 30);
		imgAdd1.addActionListener(this);
		writePn.add(imgAdd1);
		
		imgLb2 = new JLabel("사진2");
		imgLb2.setBounds(100, 230, 100, 30);
		writePn.add(imgLb2);
		
		img2TextF = new JTextField();
		img2TextF.setBounds(210, 230, 300, 30);
		writePn.add(img2TextF);
		
		imgAdd2 = new JButton("이미지 2");
		imgAdd2.setBounds(520, 230, 100, 30);
		imgAdd2.addActionListener(this);
		writePn.add(imgAdd2);
		
		
		imgLb3 = new JLabel("사진3");
		imgLb3.setBounds(100, 270, 100, 30);
		writePn.add(imgLb3);
		
		img3TextF = new JTextField();
		img3TextF.setBounds(210, 270, 300, 30);
		writePn.add(img3TextF);
		
		imgAdd3 = new JButton("이미지 3");
		imgAdd3.setBounds(520, 270, 100, 30);
		imgAdd3.addActionListener(this);
		writePn.add(imgAdd3);
		
		imgLb4 = new JLabel("사진4");
		imgLb4.setBounds(100, 310, 100, 30);
		writePn.add(imgLb4);
		
		img4TextF = new JTextField();
		img4TextF.setBounds(210, 310, 300, 30);
		writePn.add(img4TextF);
		
		imgAdd3 = new JButton("이미지 4");
		imgAdd3.setBounds(520, 310, 100, 30);
		imgAdd3.addActionListener(this);
		writePn.add(imgAdd3);
		
		//abilityLb
		abilityLb = new JLabel("보유능력");
		abilityLb.setBounds(100, 350, 100, 30);
		writePn.add(abilityLb);
		
		abilityTextF = new JTextField("ex) 자바5년차,일러스트자격증보유");
		abilityTextF.setBounds(210, 350, 300, 30);
		writePn.add(abilityTextF);
		
		//content
		contentLb = new JLabel("내용");
		contentLb.setBounds(100, 390, 100, 30);
		writePn.add(contentLb);
		
		contentTextPn = new JTextPane();
		contentTextPn.setBounds(210, 390, 410, 200);
		writePn.add(contentTextPn);
		
		writeBtn = new JButton("등록");
		writeBtn.setBounds(520, 610, 100, 30);
		writeBtn.addActionListener(this);
		writePn.add(writeBtn);
		
		add(sidePn);
		add(headerPn);
		add(writePn);
		
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("==>" + e.getActionCommand());
			Delegator delegator = Delegator.getInstance();
			
			Object obj = e.getSource();
			
			if(obj == loginBtn) {
				delegator.personController.Login();
				this.dispose();
			}else if(obj == signupBtn) {
				delegator.personController.SignUp();
				this.dispose();
			}else if(obj == logoutBtn) {
				delegator.personController.Logout();
				this.dispose();
			}else if (obj == imgAdd1) {
				if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
					// showopendialog 열기 창을 열고 확인 버튼을 눌렀는지 확인
					img1TextF.setText(jfc.getSelectedFile().toString());
					filename1 = jfc.getSelectedFile().getName();
				}
			}
			else if (obj == imgAdd2) {
				if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
					// showopendialog 열기 창을 열고 확인 버튼을 눌렀는지 확인
					img2TextF.setText(jfc.getSelectedFile().toString());
					filename2 = jfc.getSelectedFile().getName();
				}
			}
			else if (obj == imgAdd3) {
				if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
					// showopendialog 열기 창을 열고 확인 버튼을 눌렀는지 확인
					img3TextF.setText(jfc.getSelectedFile().toString());
					filename3 = jfc.getSelectedFile().getName();
				}
			}
			else	if (obj == imgAdd4) {
				if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
					// showopendialog 열기 창을 열고 확인 버튼을 눌렀는지 확인
					img4TextF.setText(jfc.getSelectedFile().toString());
					filename4 = jfc.getSelectedFile().getName();
				}
			}
		
		if(e.getActionCommand().equals("등록")) {
			
			if (!img1TextF.getText().isEmpty()) {
				filesend fs = new filesend(img1TextF.getText());
			}
			if (!img2TextF.getText().isEmpty()) {
				filesend fs = new filesend(img2TextF.getText());
			}
			if (!img3TextF.getText().isEmpty()) {
				filesend fs = new filesend(img3TextF.getText());
			}
			if (!img4TextF.getText().isEmpty()) {
				filesend fs = new filesend(img4TextF.getText());
			}
			
	// -------------------------------- null 이미지 수정 	
		
			AbilityBbs abilityDto = new AbilityBbs();
			
			if (img1TextF.getText().equals("")) {
				String nullImgURL = "C:\\icon\\nullimg.png";
				abilityDto.setImgurl1(nullImgURL);
			}
			else {
				abilityDto.setImgurl1(img1TextF.getText());	
			}
			if (img2TextF.getText().equals("")) {
				String nullImgURL = "C:\\icon\\nullimg.png";
				abilityDto.setImgurl2(nullImgURL);
			}
			else {
				abilityDto.setImgurl2(img2TextF.getText());	
			}
			if (img3TextF.getText().equals("")) {
				String nullImgURL = "C:\\icon\\nullimg.png";
				abilityDto.setImgurl3(nullImgURL);
			}
			else {
				abilityDto.setImgurl3(img3TextF.getText());	
			}
			if (img4TextF.getText().equals("")) {
				String nullImgURL = "C:\\icon\\nullimg.png";
				abilityDto.setImgurl4(nullImgURL);
			}
			else {
				abilityDto.setImgurl4(img4TextF.getText());	
			}
			
			
			
			String id = delegator.getCurrent_user().getId();
			
			int categoryIndex = cateCombo.getSelectedIndex();
			abilityDto.setCategory_id(m_categoryList.get(categoryIndex).getSeq());
			abilityDto.setTitle(titleTextF.getText());
			//abilityDto.setImgurl1(img1TextF.getText());
			//abilityDto.setImgurl2(img2TextF.getText());
			//abilityDto.setImgurl3(img3TextF.getText());
			//abilityDto.setImgurl4(img4TextF.getText());
			abilityDto.setAbility(abilityTextF.getText());
			abilityDto.setContent(contentTextPn.getText());
			abilityDto.setUser_id(id);
			
			/* delegator 에 현재 로그인된 유저 정보를 받아오도록 수정 */
			AbilityService abilityService = new AbilityService();

			//Person personDto = delegator.getCurrent_user();

			boolean addAbilityCK = abilityService.addAbility(abilityDto);
			System.out.println("addAbilityCK" + addAbilityCK);
			if (addAbilityCK) {
				delegator.abilityBbsController.AbilityDetail(abilityDto);
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "글작성 실패");
			}
		}
	}

		@Override
		public void mouseClicked(MouseEvent e) {
			Object obj = e.getSource();
			
			Delegator delegator = Delegator.getInstance();
			int category_id = 99;
			
			//Header event
			if(obj == headerLogo){
				delegator.mainController.Main();
				this.dispose();
			}

			//Side Category event
			if(obj == cate1){
				category_id = Integer.parseInt(cate1.getName());
				delegator.abilityBbsController.SelectAbilityCategories(category_id);
				this.dispose();
			}else if(obj == cate2) {
				category_id = Integer.parseInt(cate2.getName());
				delegator.abilityBbsController.SelectAbilityCategories(category_id);
				this.dispose();
			}else if(obj == cate3) {
				category_id = Integer.parseInt(cate3.getName());
				delegator.abilityBbsController.SelectAbilityCategories(category_id);
				this.dispose();
			}else if(obj == cate4) {
				category_id = Integer.parseInt(cate4.getName());
				delegator.abilityBbsController.SelectAbilityCategories(category_id);
				this.dispose();
			}else if(obj == cate5) {
				category_id = Integer.parseInt(cate5.getName());
				delegator.abilityBbsController.SelectAbilityCategories(category_id);
				this.dispose();
			}else if(obj == cate6) {
				category_id = Integer.parseInt(cate6.getName());
				delegator.abilityBbsController.SelectAbilityCategories(category_id);
				this.dispose();
			}else if(obj == cate7) {
				category_id = Integer.parseInt(cate7.getName());
				delegator.abilityBbsController.SelectAbilityCategories(category_id);
				this.dispose();
			}else if(obj == cate8) {
				category_id = Integer.parseInt(cate8.getName());
				delegator.abilityBbsController.SelectAbilityCategories(category_id);
				this.dispose();
			}else if(obj == cate9) {
				category_id = Integer.parseInt(cate9.getName());
				delegator.abilityBbsController.SelectAbilityCategories(category_id);
				this.dispose();
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
