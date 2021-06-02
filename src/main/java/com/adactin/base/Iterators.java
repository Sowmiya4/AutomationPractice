package com.adactin.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();

		li.add(40);
		li.add(30);
		li.add(20);
		li.add(10);

		System.out.println("********ITERATOR***********");
		
		  Iterator<Integer> itr = li.iterator();
		  
		  while (itr.hasNext()) { 
			  System.out.println(itr.next());
			  }
		  System.out.println("********LIST - ITERATOR***********");  
		 
		ListIterator<Integer> ltr = li.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}

		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}

	}

}
