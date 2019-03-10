package com.am.sample.staticfactory;

public interface StaticFactoryInterface {
	
	public static StaticFactoryInterface getFirstChildInstance() {
		return new StaticFactoryFirstChild();
	}
	
	public static StaticFactoryInterface getSecondChildInstance() {
		return new StaticFactorySecondChild();
	}
	
	public static StaticFactoryInterface getThirdChildInstance(String message) {
		return new StaticFactoryThirdChild(message);
	}

}
