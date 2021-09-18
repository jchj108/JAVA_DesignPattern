
public class Singleton {
	
	private static Singleton instance;
	int count;
	
	private Singleton() {
		count = 5;
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
			System.out.println("���� ����");
		} else {
			System.out.println("�̹� ���� ��");
		}
		return instance;
	}

	public final int getCount() {
		return count;
	}

	public final void setCount(int count) {
		this.count = count;
	}
}
