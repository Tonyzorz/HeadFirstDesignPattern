package chapter4Factory.product.pizza;

import java.util.Arrays;

import chapter4Factory.ingredients.abstractProduct.cheese.Cheese;
import chapter4Factory.ingredients.abstractProduct.clams.Clams;
import chapter4Factory.ingredients.abstractProduct.dough.Dough;
import chapter4Factory.ingredients.abstractProduct.pepperoni.Pepperoni;
import chapter4Factory.ingredients.abstractProduct.sauce.Sauce;
import chapter4Factory.ingredients.abstractProduct.veggies.Veggies;

public abstract class Pizza {

	public String name;
//	public String dough;
	public Dough dough;
//	public String sauce;
	public Sauce sauce;
//	public ArrayList<String> toppings = new ArrayList<String>();
	public Veggies veggies[];
	public Cheese cheese;
	public Pepperoni pepperoni;
	public Clams clam;
	
//	public void prepare() {
//		System.out.println("Preparing " + name);
//		System.out.println("Tossing dough...");
//		System.out.println("Adding sauce...");
//		System.out.println("Adding toppings: ");
//		for(int i = 0; i < toppings.size(); i++) {
//			System.out.println("  " + toppings.get(i));
//		}
//	}
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 mintues at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", veggies=" + Arrays.toString(veggies)
				+ ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", clam=" + clam + "]";
	}
	
}
