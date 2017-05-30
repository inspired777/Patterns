package patternStrategy;

public class ExoticDuck extends DuckBase {

	@Override
	public void display() {
		System.out.println("Displaying exotic duck.");		
	}

	public ExoticDuck() {
		quackBehaviour = new ExoticQuack();
	}
}
