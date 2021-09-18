
public class Singleton {
	
	private static Singleton instance;
	int count;
	
	private Singleton() {
		count = 5;
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
			System.out.println("货肺 积己");
		} else {
			System.out.println("捞固 积己 凳");
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
