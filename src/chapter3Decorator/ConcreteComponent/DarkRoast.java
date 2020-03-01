package chapter3Decorator.ConcreteComponent;

import chapter3Decorator.Component.Beverage;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "Dark Roast";
	}
	
	@Override
	public double cost() {
		return .99 + sizeCost();
	}

}
