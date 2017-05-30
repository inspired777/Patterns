package patternStrategy;

public class RubberDuck extends DuckBase {

	@Override
	public void display() {
		System.out.println("Displaying rubber duck.");		
	}

	public RubberDuck() {
		flyBehaviour = new NoFly();
	}
}
