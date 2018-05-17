package main;

import java.util.ArrayList;
import java.util.List;

import Abstract.Atype;
import Abstract.Btype;
import person.Person;

public class mainClass {
	public static void main(String[] args) {
		
		/*
		 * interface	Weapon	Bomb
		 * 
		 * 
		 * class		Gun		C4
		 * class		Sword	Dynamite
		 * 
		 * 
		 * interface	AbstractWeapon
		 * method		Weapon	Create
		 * 				Bomb	Create
		 * 
		 * class		Atype	Gun,Dynamite
		 * 				Btype	Sword, C4
		 * 
		 * class		Person
		 * 	멤버변수	Weapon
		 * 				Bomb
		 * 	멤버메소드	Create(AbstractWeapon)
		 * 
		 */
		
		List<Person> list = new ArrayList<Person>();
		
		Person man1 = new Person();
		man1.Create(new Btype());
		list.add(man1);
		
		Person man2 = new Person();
		man2.Create(new Atype());
		list.add(man2);
		
		man1.m_Weapon.DrawWeapon();
		man1.m_Bomb.DrawBomb();
		
	}

}
