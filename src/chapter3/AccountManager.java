package chapter3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
*
*khaitq on 18 nov. 2017
*/

public class AccountManager {

	
	private Map<?, ?> total = new HashMap<Object, Object>();

	private int am;
	
	public int getBalance(String name) {
		
		Integer act = (Integer) total.get(name);
		
		return act;
		
	}
	
	
//	. The array must be sorted (as by the sort(int []) method) prior to making this call. 
//	If it is not sorted, the results are undefined.
	
	
	public static void main(String ars[]) {
		
		int[] number = { 3,2,8,4};
		
		
		Arrays.sort(number);
		
		System.out.println(Arrays.binarySearch(number, 5));
		
		// if not found, -> give v =  -(index) -1 
		
		System.out.println(number[3]);
		
		
	}

}


