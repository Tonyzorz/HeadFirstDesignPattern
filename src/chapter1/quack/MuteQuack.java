package chapter1.quack;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("silence is golden");
	}

}
