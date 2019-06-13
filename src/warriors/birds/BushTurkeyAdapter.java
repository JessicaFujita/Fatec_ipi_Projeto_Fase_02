package warriors.birds;

import java.util.Random;

import SoundsBirds.turkey.GlugluBehavior;
import SoundsBirds.turkey.GlugluuuBehavior;
import SoundsBirds.turkey.GugluBehavior;
import warriors.humans.Character;
import weapons.WeaponBehavior;


public class BushTurkeyAdapter extends Character{
	BushTurkey bushTurkey;
	Random gerador = new Random();
	
	public BushTurkeyAdapter(BushTurkey bushTurkey) {
		this.bushTurkey = bushTurkey;
		this.setNome("Bush Turkey");
	}
	
	@Override
	public String attack() {
		return bushTurkey.makeSound();
	}
	
	@Override
	public void setWeaponbehavior(WeaponBehavior w) {
		int sound1 = gerador.nextInt(3);
		switch (sound1) {
		case 0:
			this.bushTurkey.setSoundbehavior(new GlugluBehavior());
			break;
		case 1:
			this.bushTurkey.setSoundbehavior(new GlugluuuBehavior());
			break;
		case 2:
			this.bushTurkey.setSoundbehavior(new GugluBehavior());
			break;
		default:
			break;
		}
	}
	
	

}
