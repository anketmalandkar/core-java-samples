package com.am.sample.innerclass;

import com.am.sample.innerclass.Outer2.Inner;

public class StaticInnerClass {

	public static void main(String[] args) {
		Outer2.Inner.print();
	}

}

class Outer2 { 
private static void outerMethod() { 
	System.out.println("inside outerMethod"); 
} 
	
// A static inner class 
static class Inner { 
	public static void print() { 
		System.out.println("inside inner class Method"); 
		outerMethod(); 
	} 
} 

}

