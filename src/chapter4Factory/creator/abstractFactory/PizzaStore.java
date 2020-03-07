package chapter4Factory.creator.abstractFactory;

import chapter4Factory.product.pizza.Pizza;

public abstract class PizzaStore {
	
//	SimplePizzaFactory factory;
	
//	public PizzaStore(SimplePizzaFactory factory) {
//		this.factory = factory;
//	}
	
	public PizzaStore() {}
	
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
