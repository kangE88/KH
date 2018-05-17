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
import java.util.List;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import singleton.Delegate;

public class fileClass implements fileInter {
	
	private String filename;
	private File newFile;	
	
	public fileClass(String filename) {
		this.filename = filename;
		newFile = new File("e:\\tmp\\" + filename + ".txt");
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
	public void readFile() {		
		//List<Human> list = new ArrayList<>();
		Delegate single = Delegate.getInstance();
		
		try {
			if(checkBeforeReadFile(newFile)) {
				BufferedReader br = new BufferedReader(new FileReader(newFile));
				
				String str;
				Human human;
				while((str = br.readLine()) != null) {
					
					String split[] = str.split("-");					
					// 투수
					if(Integer.parseInt(split[0]) < 2000) {
						human = new Pitcher(Integer.parseInt(split[0]), 
										split[1], 
										split[2], 
										Integer.parseInt(split[3]), 
										Double.parseDouble(split[4]), 
										Integer.parseInt(split[5]), 
										Integer.parseInt(split[6]), 
										Double.parseDouble(split[7]));						
					}					
					// 타자
					else {
						human = new Batter(Integer.parseInt(split[0]), 
											split[1], 
											split[2], 
											Integer.parseInt(split[3]), 
											Double.parseDouble(split[4]),
											Integer.parseInt(split[5]), 
											Integer.parseInt(split[6]),
											Double.parseDouble(split[7]));
						
					}
					single.list.add(human);
				}
				br.close();
			}				
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}	
	
	// write file
	public void writeFile() {
		Delegate single = Delegate.getInstance();
		
		String data[] = new String[single.list.size()];
		for (int i = 0; i < single.list.size(); i++) {
			data[i] = single.list.get(i).toString();
		}				
		
		try {
			if(checkBeforeWriteFile(newFile)) {			
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newFile)));
				
				for (int i = 0; i < data.length; i++) {
					pw.println(data[i]);
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
