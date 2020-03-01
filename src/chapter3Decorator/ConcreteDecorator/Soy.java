package chapter3Decorator.ConcreteDecorator;

import chapter3Decorator.Component.Beverage;
import chapter3Decorator.Decorator.CondimentDecorator;

public class Soy extends CondimentDecorator{

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		setSize(beverage.getSize());
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double toppingCost = 0.10;
		if(beverage.getSize() == "tall") toppingCost = 0.10;
		else if(beverage.getSize() == "grande") toppingCost = 0.15;
		else if(beverage.getSize() == "venti") toppingCost = 0.20;
		return toppingCost + beverage.cost();
	}

}
