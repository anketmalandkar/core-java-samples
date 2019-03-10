package com.am.sample.string;

import java.lang.reflect.Field;

public class StringSamples {

	private static int showInternalCharArrayHashCode(String s)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		final Field value = String.class.getDeclaredField("value");
		value.setAccessible(true);
		return value.get(s).hashCode();
	}

	public static void main(String args[]) {

		try {
			/* This is first Sample */
			String one = "abc";
			String two = "abc";

			System.out.println("hashcode char[] of one : " + showInternalCharArrayHashCode(one));
			System.out.println("hashcode char[] of two : " + showInternalCharArrayHashCode(two));
			System.out.println("hashcode obj of one : " + System.identityHashCode(one));
			System.out.println("hashcode obj of two : " + System.identityHashCode(two));
			
			
			/* This is second Sample */
			String three = "xyz";
			String four = new String("xyz");

			System.out.println("hashcode char[] of three : " + showInternalCharArrayHashCode(three));
			System.out.println("hashcode char[] of four : " + showInternalCharArrayHashCode(four));
			System.out.println("hashcode obj of three : " + System.identityHashCode(three));
			System.out.println("hashcode obj of four : " + System.identityHashCode(four));
			
			
			/* This is third Sample */
			String five = "def";
			String six = new String("ghi");

			System.out.println("hashcode char[] of five : " + showInternalCharArrayHashCode(five));
			System.out.println("hashcode char[] of six : " + showInternalCharArrayHashCode(six));
			System.out.println("hashcode obj of five : " + System.identityHashCode(five));
			System.out.println("hashcode obj of six : " + System.identityHashCode(six));
			
			
			/* This is fourth Sample */
			String seven = new String("ghi");

			System.out.println("hashcode char[] of seven : " + showInternalCharArrayHashCode(seven));
			System.out.println("hashcode char[] of six : " + showInternalCharArrayHashCode(six));
			System.out.println("hashcode obj of seven : " + System.identityHashCode(seven));
			System.out.println("hashcode obj of six : " + System.identityHashCode(six));
			System.out.println(seven == six);
			
			seven = seven.intern();
			System.out.println("hashcode char[] of seven : " + showInternalCharArrayHashCode(seven));
			System.out.println("hashcode char[] of six : " + showInternalCharArrayHashCode(six));
			System.out.println("hashcode obj of seven : " + System.identityHashCode(seven));
			System.out.println("hashcode obj of six : " + System.identityHashCode(six));
			System.out.println(seven == six);
			
			/* This is fifth Sample */
			String eight = new String("def");

			System.out.println("hashcode char[] of five : " + showInternalCharArrayHashCode(five));
			System.out.println("hashcode char[] of eight : " + showInternalCharArrayHashCode(eight));
			System.out.println("hashcode obj of five : " + System.identityHashCode(five));
			System.out.println("hashcode obj of eight : " + System.identityHashCode(eight));
			System.out.println(eight == five);
			
			eight = eight.intern();
			
			System.out.println("hashcode char[] of five : " + showInternalCharArrayHashCode(five));
			System.out.println("hashcode char[] of eight : " + showInternalCharArrayHashCode(eight));
			System.out.println("hashcode obj of five : " + System.identityHashCode(five));
			System.out.println("hashcode obj of eight : " + System.identityHashCode(eight));
			System.out.println(eight == five);
			
			
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
			return;
		}
	}

}
