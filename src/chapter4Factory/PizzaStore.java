package chapter4Factory;

public abstract class PizzaStore {
	
	
	public PizzaStore() {
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
//		pizza = factory.createPizza(type);
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
}
