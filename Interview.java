package org.greenstech;

import java.util.LinkedList;

public class Interview {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();

		a.add(10);
		a.add(20);
		a.add(301);
		a.add(10);
		a.add(405);
		a.add(90);
		a.add(10);

		a.set(0, 1000);
		a.set(3, 1000);
		a.set(6, 1000);

		System.out.println(a);
		System.out.println("last 5 values");

		for (int i = a.size() - 5; i < a.size(); i++) {

			System.out.println(a.get(i));
		}

		System.out.println("first 3 values");

		for (int i = 0; i < a.size() - 4; i++) {

			System.out.println(a.get(i));

		}

		System.out.println("alternate values");
		for (int i = 0; i < a.size(); i++) {

			if (i % 2 == 0) {
				System.out.println(a.get(i));
			}
		}

		System.out.println("even values");
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 2 == 0) {
				System.out.println(a.get(i));
			}

		}
		System.out.println("print index of odd numbers");
		for (int i = 0; i < a.size(); i++) {
			if ((a.get(i)%2==0)) {

			}
			else
				System.out.println(i);

		}
	}

}
