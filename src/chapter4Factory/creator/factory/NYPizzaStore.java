package chapter4Factory.creator.factory;

import chapter4Factory.creator.abstractFactory.PizzaStore;
import chapter4Factory.ingredients.abstractFactory.PizzaIngredientFactory;
import chapter4Factory.ingredients.abstractFactory.concreteFactory.NYPizzaIngredientFactory;
import chapter4Factory.product.pizza.Pizza;
import chapter4Factory.product.pizzaConcrete.CheesePizza;
import chapter4Factory.product.pizzaConcrete.ClamPizza;
import chapter4Factory.product.pizzaConcrete.PepperoniPizza;
import chapter4Factory.product.pizzaConcrete.VeggiePizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")) {
//			return new NYStyleCheesePizza();
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}
		else if (item.equals("pepperoni")) {
//			return new PepperoniPizza();
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		else if (item.equals("clam")) {
//			return new ClamPizza();
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		else if (item.equals("veggie")) {
//			return new VeggiePizza();
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		}
		return pizza;
	}

}
