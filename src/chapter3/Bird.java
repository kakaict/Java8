package chapter3;

import org.junit.Assert;
import org.junit.Test;

/**
*
* @author khaitq on 1 nov. 2018
*/

public class Bird implements Fly {
	
	public Bird() {
//		this.print();
//		Fly.canSwim();
	}
	
	@Test
	public void tester() {
		Bird bird = new Bird();
		Assert.assertEquals(true, bird.canFly());
		Assert.assertEquals(false, Fly.canSwim());
	}
}


