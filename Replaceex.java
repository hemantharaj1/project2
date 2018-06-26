package org.greenstech;

import java.util.Scanner;

public class Replaceex {
public static void main(String[] args) {
	Scanner get = new Scanner(System.in);
	System.out.println("enter the email id");
	String a  = get.nextLine();
	boolean b = a.contains("@");
	if (b==true) {
		System.out.println("valid email id");
	}
	else {
		System.out.println("invalid email");
	}
}
}
