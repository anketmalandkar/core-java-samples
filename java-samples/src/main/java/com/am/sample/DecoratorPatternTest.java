package com.am.sample;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DecoratorPatternTest {
	
	AbstractMap<String, String> t = new AbstractMap<String, String>() {

		@Override
		public Set<Entry<String, String>> entrySet() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};

	public static void main(String[] args) {
		IncrementalSet<String> i1 = new IncrementalSet<String>();
		i1.addAll(Arrays.asList("Hi","Hello","Namaste"));
		System.out.println(i1.getCount());
		
		IncrementedSet<String> i2 = new IncrementedSet<String>(new HashSet<String>());
		i2.addAll(Arrays.asList("Hi","Hello","Namaste"));
		System.out.println(i2.getCount());
	}

}
