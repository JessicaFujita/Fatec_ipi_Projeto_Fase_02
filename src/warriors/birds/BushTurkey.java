package warriors.birds;

import SoundsBirds.goose.SoundGooseBehavior;
import weapons.WeaponBehavior;

public class BushTurkey {
	SoundGooseBehavior soundGooseBehavior;
	
	public BushTurkey() {
		
	}	
	
	public void setSoundbehavior(SoundGooseBehavior s) {
		this.soundGooseBehavior = s;
	}
	
	public String  makeSound() {
		return this.soundGooseBehavior.makeSound();
	}
	
}
