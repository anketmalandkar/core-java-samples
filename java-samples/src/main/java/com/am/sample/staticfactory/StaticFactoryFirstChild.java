package com.am.sample.staticfactory;

public class StaticFactoryFirstChild implements StaticFactoryInterface {
	
	String message = "Hello First Child";

	@Override
	public String toString() {
		return "StaticFactoryFirstChild [message=" + message + "]";
	}

}
