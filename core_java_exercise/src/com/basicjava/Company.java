package com.basicjava;

public class Company {
	public int add(int a,int b) {
		int c = a+b;
		System.out.println(c);
		return c;
	}
	static public void display() {
		System.out.println("Company name = Cognizant");
	}
	public static void main(String[] args) {
		Company.display();
		Company com = new Company();
		com.add(10, 10);
		
		
	}
	
	

}
