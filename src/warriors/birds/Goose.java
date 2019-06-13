package warriors.birds;

import SoundsBirds.goose.SoundGooseBehavior;
import weapons.WeaponBehavior;

public class Goose {
	
	SoundGooseBehavior soundGooseBehavior;
	
	public Goose() {
		
	}	
	
	public void setSoundbehavior(SoundGooseBehavior s) {
		this.soundGooseBehavior = s;
	}
	
	public String  makeSound() {
		return this.soundGooseBehavior.makeSound();
	}
	
}
