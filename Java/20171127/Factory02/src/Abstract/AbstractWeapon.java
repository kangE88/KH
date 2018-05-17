package Abstract;

import Weapon.Weapon;
import bomb.Bomb;

public interface AbstractWeapon {
	
	public Weapon CreateWeapon();
	
	public Bomb CreateBomb();

}
