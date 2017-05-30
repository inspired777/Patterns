package patternStrategy;

public abstract class DuckBase implements IFlyable, IQuackable {
	
	public IFlyable flyBehaviour;
	public IQuackable quackBehaviour;
	
	public DuckBase() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new SimpleQuack();
	}
	
	public void SetFlyBehaviour (IFlyable newFlyBehaviour) {
		flyBehaviour = newFlyBehaviour;
	}
	
	public void SetQuackBehaviour (IQuackable newQuackBehaviour) {
		quackBehaviour = newQuackBehaviour;
	}
	
	
	public void quack() {
		quackBehaviour.quack();
		//System.out.println("Quack!");
	}
	
	public void swim() {
		System.out.println("I'm swimming.");
	}
	
	public void fly() {
		flyBehaviour.fly();
		//System.out.println("I'm flying!");
	}
	
	public abstract void display();
}
