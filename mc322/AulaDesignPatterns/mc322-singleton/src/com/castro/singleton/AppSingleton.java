package com.castro.singleton;

public class AppSingleton {
	
	public static void main(String[] args) {
		
		EagerSingleton e = EagerSingleton.getInstance();
		EagerSingleton e2 = EagerSingleton.getInstance();
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());
		
		
		
		
		
		
		
	}

}
