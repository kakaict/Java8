package chapter2;

import java.util.function.Predicate;


/**
*khaitq on 29 oct. 2017
*/

public class All {

	private static void print(Animal a, Predicate<Animal> trail) {

		if (trail.test(a)) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}
	}
	
	public static void main(String[] args) {

		Animal a1 = new Animal(true, false);
		Animal a2 = new Animal(true, false);
		
		print(a1, a -> a.canFly());
		print(a2, a -> a.canSwim());
		print(a2, AnimalPredicate.canFly());
		
		print(a2, AnimalPredicate.isEqual(a2));
		
	}

}


