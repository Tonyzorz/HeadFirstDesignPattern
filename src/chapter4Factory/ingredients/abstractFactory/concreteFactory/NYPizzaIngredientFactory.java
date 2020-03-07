package chapter4Factory.ingredients.abstractFactory.concreteFactory;

import chapter4Factory.ingredients.abstractFactory.PizzaIngredientFactory;
import chapter4Factory.ingredients.abstractProduct.cheese.Cheese;
import chapter4Factory.ingredients.abstractProduct.cheese.concreteProduct.ReggianoCheese;
import chapter4Factory.ingredients.abstractProduct.clams.Clams;
import chapter4Factory.ingredients.abstractProduct.clams.concreteProduct.FreshClams;
import chapter4Factory.ingredients.abstractProduct.dough.Dough;
import chapter4Factory.ingredients.abstractProduct.dough.concreteProduct.ThinCrustDough;
import chapter4Factory.ingredients.abstractProduct.pepperoni.Pepperoni;
import chapter4Factory.ingredients.abstractProduct.pepperoni.concreteProduct.SlicedPepperoni;
import chapter4Factory.ingredients.abstractProduct.sauce.Sauce;
import chapter4Factory.ingredients.abstractProduct.sauce.concreteProduct.MarinaraSauce;
import chapter4Factory.ingredients.abstractProduct.veggies.Veggies;
import chapter4Factory.ingredients.abstractProduct.veggies.concreteProduct.Garlic;
import chapter4Factory.ingredients.abstractProduct.veggies.concreteProduct.Mushroom;
import chapter4Factory.ingredients.abstractProduct.veggies.concreteProduct.Onion;
import chapter4Factory.ingredients.abstractProduct.veggies.concreteProduct.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSuace() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}
	
	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

}
