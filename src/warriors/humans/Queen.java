package warriors.humans;

public class Queen extends Character {
	public Queen() {
		setNome("Queen");
	}
	@Override
	public String attack() {
//		System.out.print(this.getNome() + ": " );
		return "com " + this.weaponbehavior.useWeapon();	
	}
}
