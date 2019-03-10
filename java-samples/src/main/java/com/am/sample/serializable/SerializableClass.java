package com.am.sample.serializable;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class SerializableClass implements Serializable {

	private static final long serialVersionUID = -6549971392590564640L;
	
	private String variable1;
	
	transient private String variable2;
	
	public static String variable3;

	public String getVariable1() {
		return variable1;
	}

	public void setVariable1(String variable1) {
		this.variable1 = variable1;
	}

	public String getVariable2() {
		return variable2;
	}

	public void setVariable2(String variable2) {
		this.variable2 = variable2;
	}

	@Override
	public String toString() {
		return "SerializableClass [variable1=" + variable1 + ", variable2=" + variable2 + ", variable3=" + variable3 + "]";
	}

}
