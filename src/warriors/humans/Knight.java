package warriors.humans;

public class Knight extends Character {
	public Knight() {
		setNome("Knight");
	}
	@Override
	public String attack() {
//		System.out.print(this.getNome() + ": " );
		return "com " + this.weaponbehavior.useWeapon();	
	}
}
