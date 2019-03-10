package com.am.sample.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {
	
	private static void serialize(Object obj, String fileName) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(obj);
		objectOutputStream.close();
		fileOutputStream.close();
	}
	
	private static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(fileName);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Object obj = objectInputStream.readObject();
		objectInputStream.close();
		fileInputStream.close();
		return obj;
	}
	
	public static void main(String args[]) {
		
		String filename = "SerializedObj";
		SerializableClass serializableClassObj = new SerializableClass();
		serializableClassObj.setVariable1("This is Variable 1");
		serializableClassObj.setVariable2("This is Variable 2");
		SerializableClass.variable3 = "This is variable 3";
		
		try {
			serialize(serializableClassObj, filename);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		SerializableClass deserializableClassObj = new SerializableClass();
		serializableClassObj.setVariable1("This is Variable 5");
		SerializableClass.variable3 = "This is variable 4";
		
		try {
			deserializableClassObj = (SerializableClass) deserialize(filename);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return;
		}
		
		System.out.println("serializableClassObj::"+serializableClassObj);
		System.out.println("deserializableClassObj ::"+deserializableClassObj);
	}

}
