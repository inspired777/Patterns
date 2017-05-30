package patternStrategy;

public class WoodenDuck extends DuckBase {

	@Override
	public void display() {
		System.out.println("Displaying wooden duck.");
		
	}
	
	public WoodenDuck() {
		quackBehaviour = new NoQuack();
		flyBehaviour = new NoFly();
	}

}
