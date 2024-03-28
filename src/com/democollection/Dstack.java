package com.democollection;

import java.util.*;

public class Dstack {
	public static void main(String[] args) {
		Stack<Integer> st= new Stack<>();
		st.push(30);
		st.push(23);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());		
	}

}
