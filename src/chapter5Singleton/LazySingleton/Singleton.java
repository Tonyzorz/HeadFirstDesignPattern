package chapter5Singleton.LazySingleton;

public class Singleton {

	private static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
