package chapter3Decorator.ConcreteDecorator;

import chapter3Decorator.Component.Beverage;
import chapter3Decorator.Decorator.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator{

	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double toppingCost = 0.05;
		if(beverage.getSize() == "tall") toppingCost = 0.05;
		else if(beverage.getSize() == "grande") toppingCost = 0.10;
		else if(beverage.getSize() == "venti") toppingCost = 0.15;
		return toppingCost + beverage.cost();
	}

}
