package DAO;

import java.util.ArrayList;
import java.util.Scanner;

import DTO.Batter;
import DTO.Human;
import DTO.Pitcher;
import File.FileClass;

public class DAOClass {

	Scanner sc = new Scanner(System.in);
	
	public Human arr[];
	private int count;
	
	FileClass fcls;
	
	ArrayList<Human> hu = new ArrayList<Human>();
	
	
	public DAOClass(){
		//arr = new Human[20];
		count = 0;
	}
	
	
	public void Insert() {
		
			System.out.print("번호를 입력하세요 : ");
			int no = sc.nextInt();
			
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			
			System.out.print("생년월일을 입력하세요 : ");
			String birth = sc.next();
			
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			
			System.out.print("키를 입력하세요 : ");
			double height = sc.nextDouble();
			
			System.out.println("포지션을 입력하세요 true 투수/ false 타자: ");
			boolean position = sc.nextBoolean();
			
			if(position == true) {
				System.out.print("승을 입력하세요 : ");
				int win = sc.nextInt();
				
				System.out.print("패를 입력하세요 : ");
				int lose = sc.nextInt();
				
				System.out.print("방어율을 입력하세요 : ");
				double defence = sc.nextDouble();
				
				Pitcher pic = new Pitcher(no, name, birth, age, height, position, win, lose, defence);
				
				hu.add(count, pic);
				count++;
			}else{
				System.out.print("친 횟수를 입력하세요 : ");
				int batCount = sc.nextInt();
				
				System.out.print("안타수를 입력하세요 : ");
				int hit = sc.nextInt();
				
				System.out.print("타율을 입력하세요 : ");
				double hitAvg = sc.nextDouble();
				
				Batter bat = new Batter(no, name, birth, age, height, position, batCount, hit, hitAvg);
				
				hu.add(count, bat);
				count++;
			}
	}
	public void Delete() {
		int arrNum = Select();
		
		//arr[arrNum].setName("");
		
		hu.remove(arrNum);

		System.out.println("삭제되었습니다.");
	}
	public int Select() {
		
		int arrNum = 0;
		
		System.out.println("찾으실 포지션을 선택하세요 true(타자) / false(투수) : ");
		boolean position = sc.nextBoolean();
		
		if(position == true) {
			System.out.println("타자의 이름을 입력하세요 : ");
			String pName = sc.next();
			for (int i = 0; i < hu.size(); i++) {
				if(hu.get(i)!= null && hu.get(i).getName().equals(pName)) {
					System.out.println("찾았습니다! "+ i +"번째");
				}
				break;
			}
		}else {
			System.out.println("투수의 이름을 입력하세요 : ");
			String bName = sc.next();
			for (int i = 0; i < hu.size(); i++) {
				if(hu.get(i)!= null && hu.get(i).getName().equals(bName)) {
					System.out.println("찾았습니다! "+ i +"번째");
				}
			}
		}
		return arrNum;
		
		
	}
	public void Update() {
		int arrNum = 0;
		String cName="";
		
		arrNum = Select();
		
		System.out.println("바꿀이름을 입력하세요 :");
		cName = sc.next();
			
		//arr[arrNum].setName(cName);
		
		hu.get(arrNum).setName(cName);

		System.out.println("변경되었습니다.");
		
	}
	public void allPrint() {
		for (int i = 0; i < hu.size(); i++) {
			if(hu.get(i)!=null) {
				System.out.println(hu.get(i));
			}
		}
	}
	public void Filesave() {
		FileClass.FileSave(hu);
	}
	public void Fileload() {
		
		String temp[] = fcls.FileLoad(hu); //new String[hu.size()];
				
		//temp = FileClass.FileLoad(hu);
		
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] != null) {
				String spStr[]=	temp[i].split("-");
				if(spStr[i] != null) {
					if("true".equals(spStr[0])) {
						Pitcher pi = new Pitcher();
									
						//Pitcher(no, name, birth, age, height, position, win, lose, defence);
						pi.setPosition(Boolean.parseBoolean(spStr[0].toString()));
						pi.setNo(Integer.parseInt(spStr[1].toString()));
						pi.setName(spStr[2]);
						pi.setBirth(spStr[3]);
						pi.setAge(Integer.parseInt(spStr[4]));
						pi.setHeight(Double.parseDouble(spStr[5]));
						pi.setWin(Integer.parseInt(spStr[6]));
						pi.setLose(Integer.parseInt(spStr[7]));
						pi.setDefence(Double.parseDouble(spStr[8]));
						
						//System.out.println("toString==>"+pi);
						hu.add(count, pi);
					}else {
						Batter ba = new Batter();
						
						//Batter(no, name, birth, age, height, position, batCount, hit, hitAvg);
						ba.setPosition(Boolean.parseBoolean(spStr[0].toString()));
						ba.setNo(Integer.parseInt(spStr[1].toString()));
						ba.setName(spStr[2]);
						ba.setBirth(spStr[3]);
						ba.setAge(Integer.parseInt(spStr[4]));
						ba.setHeight(Double.parseDouble(spStr[5]));
						ba.setBatCount((Integer.parseInt(spStr[6])));
						ba.setHit(Integer.parseInt(spStr[7]));
						ba.setHitAvg(Double.parseDouble(spStr[8]));
						
						hu.add(count, ba);
					}
					count++;
				}
			}
				
		}	
		
	
	}
}


