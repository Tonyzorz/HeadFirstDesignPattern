package chapter3Decorator;

import chapter3Decorator.Component.Beverage;
import chapter3Decorator.ConcreteComponent.DarkRoast;
import chapter3Decorator.ConcreteComponent.Espresso;
import chapter3Decorator.ConcreteComponent.HouseBlend;
import chapter3Decorator.ConcreteDecorator.Mocha;
import chapter3Decorator.ConcreteDecorator.Soy;
import chapter3Decorator.ConcreteDecorator.Whip;

public class StarbuzzCoffee {
	
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		beverage.setSize("venti");
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize("venti");
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize("tall");
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
