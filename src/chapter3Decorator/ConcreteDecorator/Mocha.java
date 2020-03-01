package chapter3Decorator.ConcreteDecorator;

import chapter3Decorator.Component.Beverage;
import chapter3Decorator.Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		setSize(beverage.getSize());

	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double toppingCost = 0.15;
		System.out.println("Mocha" + beverage.getSize());

		if(beverage.getSize() == "tall") toppingCost = 0.15;
		else if(beverage.getSize() == "grande") toppingCost = 0.20;
		else if(beverage.getSize() == "venti") toppingCost = 0.25;
		return toppingCost + beverage.cost();
	}

}
