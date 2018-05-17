package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Singleton.SingletonClass;
import dto.Batter;
import dto.Human;
import dto.Pitcher;

public class fileClass implements fileInter {
	
	private String filename;
	private File newFile;	
	
	public fileClass(String filename) {
		this.filename = filename;
		newFile = new File("e:\\tmp1\\" + filename + ".txt");
	}
	
	// file create
	public void createFile() {		
		try {
			if(newFile.createNewFile()) {
				System.out.println("파일 생성 성공!!");
			}else {
				System.out.println("파일이 있습니다");
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	// read file
	/*
	public String[] readFile() {
		
		String arrData[] = null;		
		try {
			if(checkBeforeReadFile(newFile)) {
				BufferedReader br = new BufferedReader(new FileReader(newFile));
				
				int dataCount = 0;
				String str;
				while((str = br.readLine()) != null) {
					dataCount++;
				}
				br.close();
				
				arrData = new String[dataCount];
				
				br = new BufferedReader(new FileReader(newFile));
				
				int j = 0;
				while((str = br.readLine()) != null ) {
					arrData[j] = str;
					j++;
				}
				br.close();				
			}		
		}catch(Exception e) {
			
		}
		
		return arrData;
	}
	*/
	
	public ArrayList<Human> readFile(){
		
		ArrayList<Human> list = SingletonClass.getInstance().getArray();
		

		try {
			if(checkBeforeReadFile(newFile)) {
				BufferedReader br = new BufferedReader(new FileReader(newFile));
				
				Human human;
				String str;
				
				while((str = br.readLine()) != null) {
					String split[] = str.split("-");		
					//투수
					if(Integer.parseInt(split[0]) < 2000) {
						human = new Pitcher(Integer.parseInt(split[0]), split[1], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Double.parseDouble(split[7]));
					}
					//타자
					else {
						human = new Batter(Integer.parseInt(split[0]), split[1], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Double.parseDouble(split[7]));
					}
					list.add(human);
				}
				br.close();
			}
			}catch (Exception e) {
				// TODO: handle exception
			}
		return list;
		
	}
	// write file
	public void writeFile(ArrayList<Human> list) {
		
		list = SingletonClass.getInstance().getArray();
		try {
			if(checkBeforeWriteFile(newFile)) {			
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newFile)));
				
				for (int i = 0; i < list.size(); i++) {
					pw.println(list.get(i));
				}
				pw.close();
			}
			else {
				System.out.println("파일에 기입할 수 없습니다");
				return;
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		System.out.println("파일에 성공적으로 기입했습니다");
	}
	
	// util	
	public boolean checkBeforeReadFile(File f) {
		if(f.exists()) {
			if(f.isFile() && f.canRead()) {
				return true;
			}
		}		
		return false;
	}
	
	public boolean checkBeforeWriteFile(File f){
		if(f.exists()){
			if(f.isFile() && f.canWrite()){
				return true;
			}
		}
		return false;
	}
	
	

}
