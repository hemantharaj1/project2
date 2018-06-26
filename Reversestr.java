package org.greenstech;

import java.util.Scanner;

public class Reversestr {
	public static void main(String[] args) {
		Scanner user = new Scanner (System.in);
		System.out.println("Enter the password:");
		String pwd = user.next();
		System.out.println("Enter the confirm password:");
		String cnfrmpwd = user.next();
		
		if (pwd.equalsIgnoreCase(cnfrmpwd)) {
			System.out.println("password correct");
		}
		else {
			System.out.println("wrongpassword");
		}
			
	}
	}


