package chapter1;

import chapter1.duck.Duck;
import chapter1.duck.MallardDuck;
import chapter1.duck.ModelDuck;
import chapter1.fly.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		
		//allows for dynamic changes towards fly and quack
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
