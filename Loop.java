package org.greenstech;

public class Loop extends Loopin {
	public void name(String name, int id) {
	System.out.println(name);
	System.out.println(id);
	}

	public void name(int num) {
		System.out.println(num);

		// TODO Auto-generated method stub
		}
	public void name(char num) {
		System.out.println(num);

		// TODO Auto-generated method stub
		}
	public void empName() {
	System.out.println("emp name is hem,nathd");	
	}

	public static void main(String[] args) {
		Loop e = new Loop();
		e.name("hemant", 66);
		e.name(100);
		e.name(65);
		e.empName();
		Loopin.empId();
	}
}
