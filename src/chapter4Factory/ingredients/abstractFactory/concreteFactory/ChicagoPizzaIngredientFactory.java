package chapter4Factory.ingredients.abstractFactory.concreteFactory;

import chapter4Factory.ingredients.abstractFactory.PizzaIngredientFactory;
import chapter4Factory.ingredients.abstractProduct.cheese.Cheese;
import chapter4Factory.ingredients.abstractProduct.cheese.concreteProduct.Mozzarella;
import chapter4Factory.ingredients.abstractProduct.clams.Clams;
import chapter4Factory.ingredients.abstractProduct.clams.concreteProduct.FrozenClams;
import chapter4Factory.ingredients.abstractProduct.dough.Dough;
import chapter4Factory.ingredients.abstractProduct.dough.concreteProduct.ThinCrustDough;
import chapter4Factory.ingredients.abstractProduct.pepperoni.Pepperoni;
import chapter4Factory.ingredients.abstractProduct.pepperoni.concreteProduct.SlicedPepperoni;
import chapter4Factory.ingredients.abstractProduct.sauce.Sauce;
import chapter4Factory.ingredients.abstractProduct.sauce.concreteProduct.PlumTomatoSauce;
import chapter4Factory.ingredients.abstractProduct.veggies.Veggies;
import chapter4Factory.ingredients.abstractProduct.veggies.concreteProduct.BlackOlives;
import chapter4Factory.ingredients.abstractProduct.veggies.concreteProduct.Eggplant;
import chapter4Factory.ingredients.abstractProduct.veggies.concreteProduct.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSuace() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FrozenClams();
	}
	
	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
		return veggies;
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new Mozzarella();
	}

}
