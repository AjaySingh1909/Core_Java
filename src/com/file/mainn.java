package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class mainn {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Product obj=new Product ("ajay", 123, 546.88);
		File f =new File("demo.txt");
		ObjectOutputStream s=new ObjectOutputStream(new FileOutputStream(f));
		ObjectInputStream rd=new ObjectInputStream(new FileInputStream(f));
		
		s.writeObject(obj);
		Product p=(Product) rd.readObject();
		System.out.println(p);
		s.close();
	}

}
