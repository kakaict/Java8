package chapter2;


/**
**	khaitq on 29 oct. 2017
**/

public class SingletonPattern {
	
	private SingletonPattern() {
		
	}
	
	private static SingletonPattern instance;
	
	public static SingletonPattern getInstance() {
		
		if (instance == null) {
			synchronized (SingletonPattern.class) {
				instance = new SingletonPattern();
			}
		}
		return instance;
	}
	
//	private static final SingletonPattern instance = new SingletonPattern();
//	
//	public static SingletonPattern getInstance() {
//		return instance;
//	}
	

}


