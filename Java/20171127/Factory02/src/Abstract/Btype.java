package Abstract;

import Weapon.Sword;
import Weapon.Weapon;
import bomb.Bomb;
import bomb.C4;

public class Btype implements AbstractWeapon {

	@Override
	public Weapon CreateWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

	@Override
	public Bomb CreateBomb() {
		// TODO Auto-generated method stub
		return new C4();
	}

}
