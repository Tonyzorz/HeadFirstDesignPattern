package chapter4Factory.creator.factory;

import chapter4Factory.creator.abstractFactory.PizzaStore;
import chapter4Factory.product.pizza.Pizza;
import chapter4Factory.product.pizzaConcrete.CaliforniaStyleCheesePizza;
import chapter4Factory.product.pizzaConcrete.ClamPizza;
import chapter4Factory.product.pizzaConcrete.PepperoniPizza;
import chapter4Factory.product.pizzaConcrete.VeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String item) {
		if(item.equals("cheese")) return new CaliforniaStyleCheesePizza();
		else if (item.equals("pepperoni")) return new PepperoniPizza();
		else if (item.equals("clam")) return new ClamPizza();
		else if (item.equals("veggie")) return new VeggiePizza();
		return null;
	}

}
