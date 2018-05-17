package main;

import Static.StaticClass;
import my.myClass;
import you.youClass;

public class mainClass {

	public static void main(String[] args) {
		myClass mcls = new myClass();
		
		youClass ycls = new youClass();
		
		//int n = mcls.getMyNumber();
		//ycls.setYouNumber(n);
		
		
		ycls.yMethod();
		mcls.mMethod();
		
		System.out.println(mcls.toString());
		
		StaticClass scls = new StaticClass();
		
		scls.Stnumber++;
		
		System.out.println("scls.Stnumber== "+scls.Stnumber);
		
		StaticClass scls2 = new StaticClass();
		scls2.Stnumber++;
		System.out.println("scls2.Stnumber== "+scls.Stnumber);
		
		StaticClass.Stnumber++;
		System.out.println("staticClass.Stnumber== "+scls.Stnumber);
		
		//SingletonClass sc = new SingletonClass();

	}

}
