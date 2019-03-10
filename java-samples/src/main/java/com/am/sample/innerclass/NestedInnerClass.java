package com.am.sample.innerclass;

public class NestedInnerClass {

	public static void main(String args[]) {
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
	}

}

class Outer {

	class Inner {
		private static final int INNERSTATICVARIABLE = 100;

		public void print() {
			System.out.println("Hello! Inner is called! " + INNERSTATICVARIABLE);
		}
	}
}
