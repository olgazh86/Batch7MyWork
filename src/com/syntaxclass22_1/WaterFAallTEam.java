package com.syntaxclass22_1;

import com.syntax.class22.Employee;

public class WaterFAallTEam extends Employee{
	public void slowWork() {
		
	}

	public static void main(String[] args) {
		
		WaterFAallTEam wt = new WaterFAallTEam();
		
		WaterFAallTEam.company="Instagram";//public accesse from another pakage if you create "extends"
		wt.salary=2.3;//protected variab is accessible to 
		
			
		
		

	}

}
