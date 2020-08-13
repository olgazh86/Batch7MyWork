 package com.syntax.teamTasks;

public abstract class Marks {
	
	public abstract double getPercentage();

}

class A extends Marks{
	double gradeMath, gradeScience, gradeArt, average;
	
	A(double gradeMath,double gradeScience, double gradeArt){
		this.gradeMath= gradeMath;
		this.gradeScience = gradeScience;
		this.gradeArt = gradeArt;
	}
	
	public double getPercentage() {
		average = (this.gradeMath+this.gradeScience+this.gradeArt)/3;
		return average;
	}
}

class B extends Marks{
double gradeMath, gradeScience, gradeArt, gradeHistory, average;
	
	B(double gradeMath,double gradeScience, double gradeArt, double gradeHostory){
		this.gradeMath= gradeMath;
		this.gradeScience = gradeScience;
		this.gradeArt = gradeArt;
		this.gradeHistory = gradeHistory;
	}
	
	public double getPercentage() {
		average = (this.gradeMath+this.gradeScience+this.gradeArt+this.gradeHistory)/4;
		return average;
	}
	
}