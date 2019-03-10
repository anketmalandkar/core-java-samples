package com.am.sample.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableClass implements Externalizable {
	
	private String variable1;
	
	transient private String variable2;
	
	public static String variable3;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(variable1 + "one");
		//out.writeObject(variable2 + "two"); This is transient
		out.writeObject(variable2 + "three");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		variable1 = (String) in.readObject();
		//variable2 = (String) in.readObject(); This is transient
		variable3 = (String) in.readObject();

	}

	@Override
	public String toString() {
		return "ExternalizableClass [variable1=" + variable1 + " variable2=" + variable2 + " variable3=" + variable3 + "]";
	}

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

	public static String getVariable3() {
		return variable3;
	}

	public static void setVariable3(String variable3) {
		ExternalizableClass.variable3 = variable3;
	}

}
