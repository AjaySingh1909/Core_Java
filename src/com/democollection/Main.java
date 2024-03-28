package com.democollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> st=new ArrayList<>();
		st.add(new Student (13, "Ajay"));
		st.add(new Student (27, "Prashant"));
		st.add(new Student (50, "Sachin"));
		Collections.sort(st, new Sortstudent());
		System.out.println(st);


	}

}
