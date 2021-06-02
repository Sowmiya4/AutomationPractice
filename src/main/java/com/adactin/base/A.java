package com.adactin.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A {

	public static void main(String[] args) {
		
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(10);
		
		System.out.println(li);
		
		Iterator<Integer> itr = li.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		ListIterator<Integer> ltr = li.listIterator();
		while (ltr.hasNext()) {
			System.out.println("Next Value: "+ltr.next());
		}
		
		while (ltr.hasPrevious()) {
			
			System.out.println("Previous Value is:"+ltr.previous());
			
		}
		
		
		
	}
}
