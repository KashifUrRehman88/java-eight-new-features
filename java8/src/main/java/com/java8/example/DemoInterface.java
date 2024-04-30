package com.java8.example;


/**
 * @author Kashif Ur Rehman
 */

interface Phone {
	
	void call();
	
	default void message() {
		System.out.println();
	}
}

class AndroidPhone implements Phone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}
	
}

public class DemoInterface {
	
	public static void main (String a[]) {
		
		Phone p = new AndroidPhone();
		
	}

}
