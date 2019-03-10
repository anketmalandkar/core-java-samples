package com.am.sample.innerclass;

public class AnonymousInnerClass {
	static Demo d = new Demo() {
		void show() {
			super.show();
			System.out.println("i am in anonymous class as subclass");
		}
	};

	static Hello h = new Hello() {
		public void show() {
			System.out.println("i am in anonymous class from interface");
		}
	};

	public static void main(String[] args) {
		d.show();
		h.show();
	}
}

class Demo {
	void show() {
		System.out.println("i am in show method of super class");
	}
}

interface Hello {
	void show();
}