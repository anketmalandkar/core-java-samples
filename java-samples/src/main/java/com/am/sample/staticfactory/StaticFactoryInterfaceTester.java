package com.am.sample.staticfactory;

public class StaticFactoryInterfaceTester {

	public static void main(String[] args) {
		
		StaticFactoryInterface staticFactoryFirstChild = StaticFactoryInterface.getFirstChildInstance();

		StaticFactoryInterface staticFactorySecondChild = StaticFactoryInterface.getSecondChildInstance();
		
		StaticFactoryInterface staticFactoryThirdChild = StaticFactoryInterface.getThirdChildInstance("Hello Anket!");
		
		System.out.println(staticFactoryFirstChild.toString());
		
		System.out.println(staticFactorySecondChild.toString());
		
		System.out.println(staticFactoryThirdChild.toString());
		
	}

}
