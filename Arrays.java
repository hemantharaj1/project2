package org.greenstech;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
	public static void main(String[] args) {
		List<Integer> emp = new ArrayList<Integer>();
		List<Integer> emp2 = new ArrayList<Integer>();
		emp.add(345676);
		emp.add(45346);
		emp.add(355);
		emp.add(24632356);
		emp.add(355);

		int b = emp.size();

		System.out.println(b);

	Boolean c= emp.isEmpty();
	System.out.println(c);
	int f= emp.lastIndexOf(355);
	System.out.println(f);
	
	}

}
