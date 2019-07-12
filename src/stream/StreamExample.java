package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
*
*khaitq on 16 avr. 2018
*/

public class StreamExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("12");
		list.add("abcd");
		list.add("CCCC");
		list.add("345");
		
		Function<String, String> f = v -> v.substring(0, 2); 

		Predicate<String> predicate = s -> s.length()>3;
		
		Stream<String> steam = 	list.stream().sorted((s,v)-> v.length() - s.length()).map(f);
		
//		steam.forEach(System.out::println);
		
//		steam.sorted();
		
//		steam.forEach(System.out::println);
		

		int max = 10000;
		List<String> values = new ArrayList<>(max);
		for (int i = 0; i < max; i++) {
		    UUID uuid = UUID.randomUUID();
		    values.add(uuid.toString());
		}
		
		long t0 = System.currentTimeMillis();
		
		values.stream().filter(s-> {
			System.out.println("filter: " + s);
			return true;
		});
		
		long t1 = System.currentTimeMillis();
		
		
		System.out.println("sequential sort took:" + (t1 - t0));


	}

}


