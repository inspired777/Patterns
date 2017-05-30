package patternStrategy;

public class SimpleQuack implements IQuackable{

	@Override
	public void quack() {
		System.out.println("Quack! Quack!");
	}

}
