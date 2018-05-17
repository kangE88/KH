package Abstract;

import Weapon.Gun;
import Weapon.Weapon;
import bomb.Bomb;
import bomb.Dynamite;

public class Atype implements AbstractWeapon {

	@Override
	public Weapon CreateWeapon() {
		return new Gun();
	}

	@Override
	public Bomb CreateBomb() {
		// TODO Auto-generated method stub
		return new Dynamite();
	}

}
