package chapter3;


/**
* @author khaitq on 1 nov. 2018
*/

public interface Fly {
	
	default boolean canFly() {
		return true;
	}
	
	static boolean canSwim() {
		return false;
	}
	
	default void print() {
		System.out.println("can fly");
	}
	
}


