package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
*
*khaitq on 29 oct. 2017
*/

/*
 * Create immutable object:
 * 
 * 1.Create a constructor to set all properties values
 * 2.Make all properties to be private and final
 * 3.No setter method
 * 4.Don't allow referenced mutable objects to by modified or accessed directly => never share reference to mutable object within immutable object
 * 5.Don't allow methods to be overridden
 */


public final class Immutable {

	private final String species;
	
	private final int age;
	
	private final List<String> foods;
	
	public Immutable(String species, int age, List<String> foods) {
		this.species = species;
		this.age = age;
		
		if (foods == null) {
			throw new IllegalArgumentException();
		}
		this.foods = new ArrayList<String>(foods);

//		this.foods = foods;   => BAD, because foods argument can modify its value after creation of object => modify fooods of Object

	}
	
	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public String getFoodsIndex(int index) {
		return foods.get(index);
	}
	
	public List<String> getFoods() {
		List <String> copyFoods = new ArrayList<String>();
		for (String food : foods) {
			copyFoods.add(new String(food));
		}
		return copyFoods;
	}
	
}


