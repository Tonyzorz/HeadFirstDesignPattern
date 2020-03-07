package chapter4Factory.product.pizzaConcrete;

import chapter4Factory.ingredients.abstractFactory.PizzaIngredientFactory;
import chapter4Factory.product.pizza.Pizza;

public class ClamPizza extends Pizza{

PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSuace();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

}
