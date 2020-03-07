package chapter4Factory;

import chapter4Factory.creator.abstractFactory.PizzaStore;
import chapter4Factory.creator.factory.ChicagoPizzaStore;
import chapter4Factory.creator.factory.NYPizzaStore;
import chapter4Factory.product.pizza.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName()+ "\n");
		
	}
}
