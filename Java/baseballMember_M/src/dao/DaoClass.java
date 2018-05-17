package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import Singleton.SingletonClass;
import allPrint.allPrint;
import delete.Delete;
import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.fileClass;
import insert.Insert;
import select.Select;
import update.Update;

public class DaoClass implements DaoInter {

	Scanner sc = new Scanner(System.in);
	
	private int memNumber;	// 선수: 투수(1000) 타자(2000)
	
	ArrayList<Human> list = SingletonClass.getInstance().getArray();
	
	fileClass fcls;
	
	public DaoClass() {		
		
		memNumber = 1000;
		
		fcls = new fileClass("member");
		fcls.createFile();
		
		loadData();
				
		// number를 다음번호로 하기 위한 처리
		int len = list.size()-1;
		Human h = list.get(len);
		int nextNum = h.getNumber() % 1000;
		nextNum = nextNum + 1;
		
		memNumber = nextNum + memNumber;
		System.out.println(">>>>>>>>" + memNumber);
	
	}	
	
	public void insert(){
		Insert insert = new Insert();
		insert.Insert(memNumber);
		memNumber++;
	}

	@Override
	public void delete() {
		Delete delete = new Delete();
		delete.Delete();
	}

	@Override
	public void select() {
		Select select = new Select();
		select.Select();	
	}

	@Override
	public void update() {
		Update update = new Update();
		update.Update();	
	}

	@Override
	public void allPrint() {
		allPrint allprint = new allPrint();
		allprint.allPrint();
	}

	@Override
	public void saveData() {
		fcls.writeFile(list);		
	}

	@Override
	public void loadData() {
		list = fcls.readFile();
	}

	@Override
	public void sot_hitAvg() {
		// TODO Auto-generated method stub
		//HashMap<Double, Integer> H_hu = new HashMap<Double, Integer>();
		TreeMap<Double, Batter> hit_top = new TreeMap<Double, Batter>();
		
		Batter ba;
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof Batter) {
				ba = (Batter)list.get(i);
				hit_top.put(ba.getHitAvg(), ba);
			}
		}
		
		Iterator<Double> itkey = hit_top.descendingKeySet().iterator();
		
		while(itkey.hasNext()) {
			Double key = itkey.next();
			System.out.println(hit_top.get(key));
		}
	}

	@Override
	public void sot_defence() {
		// TODO Auto-generated method stub
		TreeMap<Double, Pitcher> defence_sort = new TreeMap<Double, Pitcher>();
		Pitcher pi;
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof Pitcher) {
				pi = (Pitcher) list.get(i);
				defence_sort.put(pi.getDefence(), pi);
			}
		}
		
		
		Iterator<Double> it = defence_sort.descendingKeySet().iterator();
		
		while(it.hasNext()) {
			Double key = it.next();
			System.out.println(defence_sort.get(key));
		}
		
		
	}



	
}

