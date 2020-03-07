package chapter4Factory.ingredients.abstractFactory;

import chapter4Factory.ingredients.abstractProduct.cheese.Cheese;
import chapter4Factory.ingredients.abstractProduct.clams.Clams;
import chapter4Factory.ingredients.abstractProduct.dough.Dough;
import chapter4Factory.ingredients.abstractProduct.pepperoni.Pepperoni;
import chapter4Factory.ingredients.abstractProduct.sauce.Sauce;
import chapter4Factory.ingredients.abstractProduct.veggies.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSuace();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
