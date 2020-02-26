package chapter1.duck;

import chapter1.fly.FlyWithWings;
import chapter1.quack.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}
