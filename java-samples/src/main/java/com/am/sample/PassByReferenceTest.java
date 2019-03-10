package com.am.sample;

public class PassByReferenceTest {
	
	public static void main(String[] args) {
		PassByReference first = new PassByReference("First");
		PassByReference second = new PassByReference("Second");
		
		System.out.println("first : " + first + "@ : " + first.getValue());
		System.out.println("second : " + second + "@ : " + second.getValue());
		
		swap(first, second);
		
		System.out.println("first : " + first + "@ : " + first.getValue());
		System.out.println("second : " + second + "@ : " + second.getValue());
		
		
		changeValue(first);
		System.out.println("first : " + first + "@ : " + first.getValue());
		System.out.println("second : " + second + "@ : " + second.getValue());
		
		
		
	}
	
	private static void swap(PassByReference a, PassByReference b) {
		System.out.println("a : " + a + "@ : " + a.getValue());
		System.out.println("b : " + b + "@ : " + b.getValue());
		
		PassByReference temp = a;
		a = b;
		b = temp;
		System.out.println("a : " + a + "@ : " + a.getValue());
		System.out.println("b : " + b + "@ : " + b.getValue());
		
	}
	
	private static void changeValue(PassByReference a) {
		a.setValue("Green");
	}

}

class PassByReference {
	
	String value;

	public PassByReference(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
