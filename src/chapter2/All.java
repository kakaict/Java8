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

		Animal a1 = new Animal(true, false, true);
		Animal a2 = new Animal(true, false, true);
		
		print(a1, a -> a.canFly());
		print(a2, a -> a.canSwim());
		print(a2, AnimalPredicate.canFly());
		
		print(a2, AnimalPredicate.isEqual(a2));
		
		
		Predicate<String> testStringStartWith = a -> a.startsWith("de");
		
		Predicate<String> stesst = "ab" :: startsWith;
		
		Predicate<String> st = String::isEmpty;
		
//		System.out.println(stesst.test("abc"));
//		
//		System.out.println(testStringStartWith.test("degb"));
//		
//		System.out.println(st.test("degb"));
		
		calculateTotal();

	}
	
	private static void cal(float v, double rate, int days) {
		
		System.out.println("Thoi gian : " + days);

		System.out.println("tai dau tu: " + v  * Math.pow( 1 + rate/100, days));
		
		System.out.println("rut ra:     " +  (float) (v  + (v * rate/100 * days)));
		
		System.out.println(" ================");
		
	}
	
	private static void calculateTotal() {
		for (int i = 0; i <= 180; i ++) {
			if (i == 1  || i == 7  || i == 30  || i == 60|| i == 90 || i == 150 || i == 180)
			cal(200, 1.4, i);
		}
		
//		double v = 2000;
//		double  sum = v; 
//		for (int i = 1; i <= 300; i ++) {
//			sum = sum + (0.1/12 * sum) + v ;
//		}
//		System.out.println("sum :     " +   sum);
//		
//		System.out.println("sum :     " +   (2.6617 * Math.log(2020) - 17.9184));
		
	}
	

}


