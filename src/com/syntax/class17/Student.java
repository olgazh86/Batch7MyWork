package com.syntax.class17;

public class Student {
public static void main(String[] args) {
	
	Student student = new Student();
	
	char grade = student.getGrade(90);
	char grade1= student.getGrade(90);
	System.out.println("Value of gade" + grade);
	System.out.println("Value of grade1" +grade1);
	
	
}
	/*
	 * 3. Create  class Student that will have a method getGrade.
Your method should accept the score of a student and return a grade:
score > 90 - A

score >80 - B

score >70 - C

score > 50 - D

anything else - F
	 */
	
	char grade(int a) {
		if (a > 50 && a <= 70) {
			return 'D';
		} else if (a > 70 && a <= 80) {
			return 'C';
		} else if (a > 80 && a <= 90) {
			return 'B';
		} else if (a > 90) {
			return 'A';
		} else {
			return 'F';
		}
	
	}
		
	
	char getGrade(int a) {
		
			char score = 0;
			
			if(a>90) {
				score = 'A';
			} else if(a<=90&&a>80) {
				score = 'B';
			}else if(a<=80&&a>70) {
				score = 'C';
			} else if(a<=70&&a>50) {
				score = 'D';
			}else {
				score = 'F';	
			}
			return score;
		}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
