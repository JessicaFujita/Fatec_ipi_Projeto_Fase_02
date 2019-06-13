package warriors.birds;
import java.util.Random;

import SoundsBirds.goose.HowkBehavior;
import SoundsBirds.goose.HowwkBehavior;
import SoundsBirds.goose.HuowkBehavior;
import warriors.humans.Character;
import weapons.WeaponBehavior;
public class GooseAdapter extends Character  {
	Goose goose;
	Random gerador = new Random();
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		setNome("Goose");
	}
	
	@Override
	public String attack() {
		return goose.makeSound();
	}
	@Override
	public void setWeaponbehavior(WeaponBehavior w) {
		int sound1 = gerador.nextInt(3);
		switch (sound1) {
		case 0:
			this.goose.setSoundbehavior(new HowkBehavior());
			break;
		case 1:
			this.goose.setSoundbehavior(new HowwkBehavior());
			break;
		case 2:
			this.goose.setSoundbehavior(new HuowkBehavior());
			break;
		default:
			break;
		}
	}
	
	
}
