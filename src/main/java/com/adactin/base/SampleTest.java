package com.adactin.base;

public class SampleTest {
	
	public static boolean test() {
		
		String a="Testing";
		String b= new String("Testing");
		
		if (a==b) {

			return true;
			
		}

		else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		boolean method=test();
		System.out.println(method);
	}
	
//	public static void method(Object o) {
//
//		System.out.println("Object method");
//	}
//	
//	public static void main(String[] args) {
//		
//		Object obj = null;
//		method(obj);
//	}

}
