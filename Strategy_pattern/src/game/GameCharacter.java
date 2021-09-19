package game;

public class GameCharacter {
	private Weapon weapon;
	
	// 교환 가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	// 델리게이트(공격에 대한 알고리즘은 Weapon에게 위임)
	public void attack() {
		if(weapon == null) {
			System.out.println("맨손 공격");
		} else {
			weapon.attack();
		}
		
	}
}
