package main;

import Child.ChildClass;
import Super.SuperClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * 
		 * class : 은닉성(private) -setter, getter
		 * 				  public
		 * 		
		 *		상속성
		 * 
		 * 			도형 width 넓이 함수
		 * 				정사각형class 	 가로 == 세로 
		 * 				직사각형class	 가로 != 세로
		 * 				원class			 폭 width
		 * 
		 * 				부모클래스
		 * 				기능
		 * 				자식클래스
		 * 
		 * 		다형성
		 * 				AAA(부모클래스) 
		 * 					BBB(자식 클래스)
		 * 					CCC(자식 클래스)
		 * 
		 * 				관리
		 * 					BBB bbb[] = new BBB();		
		 * 					CCC ccc[] = new CCC();
		 * 
		 * 					AAA abc1 = new BBB();
		 * 					AAA abc2 = new CCC();
		 * 
		 * 					aaa[0] = new BBB();
		 * 					aaa[1] = new CCC(); 
		 * 					
		 * 
		 * 
		 */
		
		//SuperClass sc = new SuperClass();
		//sc.super_method();
		
		ChildClass cc = new ChildClass();
		cc.super_method();
		//cc.name = "World";
		

	}

}
