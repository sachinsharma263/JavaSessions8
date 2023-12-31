package com.qa.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcept2 {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<Integer>();

//	 	

		Set<Integer> set2 = new HashSet<Integer>();

//		set2.add(1);
//		set2.add(2);
//		set2.add(3);
//		set2.add(4);
//		
//		set1.addAll(set2);
//		System.out.println(set1);
//		
//		set1.retainAll(set2);
//		System.out.println(set1);

		set1.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 8, 10 }));
		set2.addAll(Arrays.asList(new Integer[] { 0, 1, 2, 4, 5, 7, 9 }));

		// get the union
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println(union);
		
		//get the intersection
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		//get the difference
		Set<Integer> diff = new HashSet<Integer>(set1);
		diff.removeAll(set2);
		System.out.println(diff);
		
	}
}