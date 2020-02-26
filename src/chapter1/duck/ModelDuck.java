package chapter1.duck;

import chapter1.fly.FlyNoWay;
import chapter1.quack.Quack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a model Duck");
	}
}
