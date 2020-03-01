package chapter3Decorator.ConcreteComponent;

import chapter3Decorator.Component.Beverage;

public class Decaf extends Beverage{

	public Decaf() {
		description = "Decaf";
	}
	@Override
	public double cost() {
		return 1.05 + sizeCost();
	}

}
