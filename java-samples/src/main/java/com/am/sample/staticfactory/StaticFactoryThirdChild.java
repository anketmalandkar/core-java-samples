package com.am.sample.staticfactory;

public class StaticFactoryThirdChild implements StaticFactoryInterface {
	
	String message;
	
	public StaticFactoryThirdChild(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "StaticFactoryFirstChild [message=" + message + "]";
	}

}
