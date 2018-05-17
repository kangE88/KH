package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.xml.transform.Templates;

import DTO.Human;

public class FileClass{

	static String fileName = "e:\\tmp1\\baseball.txt";
	
	public FileClass() {
	}
	
	public static void FileSave(ArrayList<Human> arr) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
			//PrintWriter out = new PrintWriter(bw);
			
			for (int i = 0; i < arr.size(); i++) {
				if(arr.get(i) != null) {
					bw.write(arr.get(i).toString());
					bw.newLine();
				}
			}
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public String[] FileLoad(ArrayList<Human> arr) {
		
		String temp[] = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			int w = 0;
			String str;
				while((str = br.readLine())!=null) {
					w++;
				}

				br.close();
				
				temp = new String[w];
				
				br = new BufferedReader(new FileReader(fileName));
				
				int j = 0;
				while((str = br.readLine()) != null ) {
					temp[j] = str;
					j++;
				}
				br.close();		
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return temp;
			
		}

}
