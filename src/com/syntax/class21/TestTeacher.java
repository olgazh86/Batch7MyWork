package com.syntax.class21;

public class TestTeacher {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		
		teacher.name = "Monica";
		teacher.LastName ="Geller";
		teacher.age = 35;
		
		teacher.display();
		
		ChemistryTeacher ch = new ChemistryTeacher();
		
		ch.name = "Joey";
		ch.LastName ="Tribbiani";
		ch.degree = "Bachelor";
		ch.expierence = 5;
		
		ch.displayRequirments();
		
		MathTeacher mt =new MathTeacher();
		mt.name = "Ross";
		mt.LastName= "Geller";
		mt.highestLevel = "Math 55";
		
		mt.displayCharacteristics();
		
		PianoTeacher pt = new PianoTeacher();
         
		pt.name = "Phoebe";
		pt.LastName = "Buffay";
		pt.age = 35;
		pt.expierence= 20;
		pt.favorComposition = "Smelly Cat";
		
		pt.displayMusicSchool();
		
		
		
		
		
		
		
		
	}
	
	
}
