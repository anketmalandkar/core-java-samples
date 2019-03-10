package com.am.sample.innerclass;

public class MethodLocalInnerClass {

	public static void main(String[] args) {
			Outer1 x = new Outer1(); 
			x.outerMethod(); 
	}

}

class Outer1 { 
	void outerMethod() { 
		System.out.println("inside outerMethod"); 
		// Inner class is local to outerMethod() 
		class Inner { 
			void innerMethod() { 
				System.out.println("inside innerMethod"); 
			} 
		} 
		Inner y = new Inner(); 
		y.innerMethod(); 
	} 
} 
