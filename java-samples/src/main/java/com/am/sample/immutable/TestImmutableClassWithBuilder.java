package com.am.sample.immutable;

import java.util.HashMap;

public class TestImmutableClassWithBuilder {

	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		String stringName = "Hello Anket";
		ImmutableClassWithBuilder immutableClassWithBuilder = new ImmutableClassWithBuilder.ImmutableClassBuilder(stringName, h1).build();
		System.out.println(immutableClassWithBuilder.toString());
		System.out.println(stringName == immutableClassWithBuilder.getStringValue());
		System.out.println(h1 == immutableClassWithBuilder.getMapValue());
		h1.put("3", "third");
		System.out.println(immutableClassWithBuilder.toString());
		
		
		ImmutableClassWithBuilder immutableClassWithBuilder1 = new ImmutableClassWithBuilder.ImmutableClassBuilder("Hello Nikita", h1).setBooleanValue(true).build();
		System.out.println(immutableClassWithBuilder1.toString());
		h1.remove("2");
		System.out.println(immutableClassWithBuilder1.toString());
		
		ImmutableClassWithBuilder immutableClassWithBuilder2 = new ImmutableClassWithBuilder.ImmutableClassBuilder("Hello Gondya", h1).setBooleanValue(false).setIntegerValue(1000).build();
		System.out.println(immutableClassWithBuilder2.toString());
	}

}
