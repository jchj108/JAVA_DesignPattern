package game;

public class GameCharacter {
	private Weapon weapon;
	
	// ��ȯ ����
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	// ��������Ʈ(���ݿ� ���� �˰����� Weapon���� ����)
	public void attack() {
		if(weapon == null) {
			System.out.println("�Ǽ� ����");
		} else {
			weapon.attack();
		}
		
	}
}
