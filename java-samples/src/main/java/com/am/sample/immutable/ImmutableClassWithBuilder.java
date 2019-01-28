package com.am.sample.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClassWithBuilder {

	private final String stringValue;
	private final Integer integerValue;
	private final boolean isBooleanValue;
	private final HashMap<String, String> mapValue;

	public String getStringValue() {
		return stringValue;
	}

	public Integer getIntegerValue() {
		return integerValue;
	}

	public boolean isBooleanValue() {
		return isBooleanValue;
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, String> getMapValue() {
		return (HashMap<String, String>) mapValue.clone();
	}

	private ImmutableClassWithBuilder(ImmutableClassBuilder computerBuilder) {
		this.stringValue = computerBuilder.stringValue;
		this.isBooleanValue = computerBuilder.isBooleanValue;
		this.integerValue = computerBuilder.integerValue;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> it = computerBuilder.mapValue.keySet().iterator();
		while (it.hasNext()) {
			key = it.next();
			tempMap.put(key, computerBuilder.mapValue.get(key));
		}
		this.mapValue = tempMap;

	}

	public static class ImmutableClassBuilder {

		private final String stringValue;
		private Integer integerValue;
		private boolean isBooleanValue;
		private final HashMap<String, String> mapValue;

		public ImmutableClassBuilder(String stringValue, HashMap<String, String> mapValue) {
			super();
			this.stringValue = stringValue;
			this.mapValue = mapValue;
		}

		public ImmutableClassBuilder setIntegerValue(Integer integerValue) {
			this.integerValue = integerValue;
			return this;
		}

		public ImmutableClassBuilder setBooleanValue(boolean isBooleanValue) {
			this.isBooleanValue = isBooleanValue;
			return this;
		}

		public ImmutableClassWithBuilder build() {
			return new ImmutableClassWithBuilder(this);
		}

	}

	@Override
	public String toString() {
		return "ImmutableClassWithBuilder [stringValue=" + stringValue + ", integerValue=" + integerValue
				+ ", isBooleanValue=" + isBooleanValue + ", mapValue=" + mapValue + "]";
	}

}
