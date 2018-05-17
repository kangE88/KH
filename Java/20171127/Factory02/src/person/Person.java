package person;

import Abstract.AbstractWeapon;
import Weapon.Weapon;
import bomb.Bomb;

public class Person {
	public Weapon m_Weapon;
	public Bomb m_Bomb;
	
	public void Create(AbstractWeapon aw) {
		this.m_Weapon = aw.CreateWeapon();
		this.m_Bomb = aw.CreateBomb();
	}
}
