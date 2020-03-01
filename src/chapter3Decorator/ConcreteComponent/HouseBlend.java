package chapter3Decorator.ConcreteComponent;

import chapter3Decorator.Component.Beverage;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89 + sizeCost();
	}

}
