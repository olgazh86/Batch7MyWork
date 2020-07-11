package com.syntax.class20;

public class ClassStudents {
	
	String name;
	int mathGrade, scienceGrade, historyGrade;
	
	ClassStudents(String studentName, int studentMathGrade, int studentScienceGrade, int studentHistoryGrade) {
		name = studentName;
		mathGrade = studentMathGrade;
		scienceGrade = studentScienceGrade;
		historyGrade = studentHistoryGrade;
	}
	
	int calculateAvarageGrade() {
		int avarage = (mathGrade + scienceGrade + historyGrade) / 3;
		return avarage;
	}
	
	void displayInfo() {
		System.out.println(name + "'s avarage grade is " + calculateAvarageGrade());
	}
	
	
	
	
	
	
	
	

}
