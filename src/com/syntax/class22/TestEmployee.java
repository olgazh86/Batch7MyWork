package com.syntax.class22;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		obj.work();
		obj.getPaid();
		
		ScrumTeam obj1 = new ScrumTeam();
		ScrumTeam.company = "Facebook";
		obj1.ceremonies ="meetings";
		obj1.attendsMeetings();
		obj1.work();
		
		Developer obj2 = new Developer();
		obj2.work();
		obj2.code();
		
		BussinessAnalyst obj3 = new BussinessAnalyst();
		obj3.getPaid();
		obj3.gatherRequirements();
		
		ProductOwner obj4= new ProductOwner();
		obj4.communicate();
		obj.work();
			
		Tester obj5 = new Tester();
		obj5.work();
		obj5.getPaid();
		obj5.test();
		
		

	}

}
