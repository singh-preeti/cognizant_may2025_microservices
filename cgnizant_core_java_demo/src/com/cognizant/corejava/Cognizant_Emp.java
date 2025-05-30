package com.cognizant.corejava;


public class Cognizant_Emp extends Employee   {
	
	public int showExperience(int exp) {
		System.out.println(exp);
		return exp;
	}
	
	public static void main(String[] args) {
		
		Cognizant_Emp emp1 = new Cognizant_Emp();
		emp1.showExperience(5);
		emp1.displayEmpName();
	}

}
