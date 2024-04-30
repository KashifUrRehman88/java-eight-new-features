package com.java8.example;

/**
 * @author Kashif Rehman
 * Created on 30 Of April,2024.
 * 
 * Note :- Methods in Interfaces are by default public and abstract (even if you do not mention it)
 * 
 * Starting from Java 8, now we can declare and define methods in interfaces as well. Special keywords are used for those method :- 
 * 1. Default methods
 * 2. Static methods
 * 
 * 
 * Java does not support multiple inheritance because it creates DIAMOND problem (Diamond problem is for example, we have class A and class B, both have a method named as show()
 * 
 * now if class C inherit both A and B classes, then  c class object will be confused which show it will implement), same problem is still for interfaces as well (class can implement multiples interfaces).
 */

public interface InterfaceInJava8 {
	
	void firstAbstractMethod();
	
	void secondAbstractMethod();
	
	default void thirdNonAbstarctMethod() {
		System.out.println("default method in interface");
	}
	
	static void fourthNonAbstractMethod() {
		System.out.println("static method in interface"); // no need of creating object to call this method, instead we can use name as InterfaceInJava8.fourthNonAbstractMethod
	}
	
}