package chapter2;

import java.util.function.Predicate;

/**
*
*khaitq on 29 oct. 2017
*/

public class AnimalPredicate {

	public static Predicate<Animal> canFly() {
		return a -> a.canFly();
	}
	
	public static Predicate<Animal> canSwim() {
		return a -> a.canSwim();
	}
	
	public static Predicate<Animal> isEqual(Animal a) {
		return b -> b.equals(a);
	}
}


