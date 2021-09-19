
public class Main {

	public static void main(String[] args) {
		
		// private�̹Ƿ� ���� �Ұ���
//		Singleton singleton = new Singleton(); 
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1.getCount());
		System.out.println(singleton2.getCount());
		
		singleton1.setCount(4);
		
		System.out.println(singleton1.getCount());
		System.out.println(singleton2.getCount());
		
		singleton2.setCount(6);
		// singleton1�� singleton2 ��� ���� �ּҰ��� �����ϰ� �ִ�.
		
		System.out.println(singleton1.getCount());
		System.out.println(singleton2.getCount());
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}

}
