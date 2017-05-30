package patternStrategy;

public class NoFly implements IFlyable {

	@Override
	public void fly() {
		System.out.println("I don't fly");		
	}

}
