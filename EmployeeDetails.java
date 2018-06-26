package org.greenstech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the no of inputs:");
		int s = input.nextInt();
		
		for (int i = 0; i <=s; i++) {
			List<Employee> emp = new ArrayList<Employee>();
			Employee e = new Employee();
			
			int id = input.nextInt();
			String name = input.next();
			long phone = input.nextLong();
			String email = input.nextLine();
			String password = input.next();
			String cfrmpassword = input.next();
			String cityname = input.next();

			e.setId(id);
			e.setName(name);
			e.setPhone(phone);
			e.setEmail(email);
			e.setPassword(password);
			e.setCfrmpassword(cfrmpassword);
			e.setCityName(cityname);
			System.out.println(e.getId(i));
			System.out.println(e.getId());
			System.out.println(e.getId());
			System.out.println(e.getId());
			System.out.println(e.getId());
			

		}

	}


}