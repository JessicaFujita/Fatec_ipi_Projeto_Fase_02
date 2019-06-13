package warriors.humans;

public class King extends Character {
	public King() {
		setNome("King");
	}
	@Override
	
	public String attack() {
		return "com " + this.weaponbehavior.useWeapon();	
	}
}
