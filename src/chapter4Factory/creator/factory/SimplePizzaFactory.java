package chapter4Factory.creator.factory;

import chapter4Factory.product.pizza.Pizza;
import chapter4Factory.product.pizzaConcrete.CheesePizza;
import chapter4Factory.product.pizzaConcrete.ClamPizza;
import chapter4Factory.product.pizzaConcrete.PepperoniPizza;
import chapter4Factory.product.pizzaConcrete.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
