package com.am.sample.staticfactory;

public class StaticFactorySecondChild implements StaticFactoryInterface {
	
	String message = "Hello Second Child";

	@Override
	public String toString() {
		return "StaticFactorySecondChild [message=" + message + "]";
	}

}
