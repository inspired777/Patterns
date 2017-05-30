package patternStrategy;

public class NoQuack implements IQuackable {

	@Override
	public void quack() {
		System.out.println("I'm silent");		
	}

}
