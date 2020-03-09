package chapter5Singleton.ChocolateFactory;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			//To fill the boiler it must be empty and once it is full, 
			//we set the empty and boiled flags.
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

}
