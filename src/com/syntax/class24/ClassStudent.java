 package com.syntax.class24;

public class ClassStudent {
	
	public void study() {
		System.out.println("Students must study");
	}
    public void rest() {
    	System.out.println("Student should rest");
    }
	public void eat() {
		System.out.println("Student needs to eat");
	}	
}



class SyntaxStudent extends ClassStudent{
	
	public void study() {
		System.out.println("Students must study Java");
	}
	public void rest() {
    	System.out.println("Student should rest");
    }
	public void eat() {
		System.out.println("Student needs more coffee");
	}
}



 class CollegeStudent extends ClassStudent{
	 
	 public void rest() {
	    	System.out.println("Student should rest after classes in College");
	    }
		public void eat() {
			System.out.println("Student needs more healthy food");
		}
}

 
class SchoolStudent extends ClassStudent{
	
	public void study() {
		System.out.println("Students must study in school");
	}
	public void rest() {
    	System.out.println("Student should rest");
    }
	public void move() {
    	System.out.println("Student should rest");
    }
	
}