package chapter2;


/**
*
*khaitq on 29 oct. 2017
*/

public class Animal {

	public Animal(boolean fly, boolean swim, boolean male) {
		this.fly = fly;
		this.swim = swim;
		this.male = male;
	}
	
	private boolean male;
	
	private boolean swim;
	
	private boolean fly;
	
	public boolean canFly() {
		return fly;
	}
	
	public boolean canSwim() {
		return swim;
	}
	
	public boolean isMale() {
		return male;
	}
}


