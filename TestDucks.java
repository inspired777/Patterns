package patternStrategy;

import java.util.ArrayList;

public class TestDucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<DuckBase> ducks = new ArrayList<>();
		ducks.add(new SimpleDuck());
		ducks.add(new ExoticDuck());
		ducks.add(new WoodenDuck());
		ducks.add(new RubberDuck());
		
		for(DuckBase duck : ducks) {
			duck.display();
			duck.quack();
			duck.swim();
			duck.fly();
			System.out.println();
		}
		
	}

}
