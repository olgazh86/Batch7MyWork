package com.syntax.class10;

public class TrianglePatterns {

	public static void main(String[] args) {
		// let us print the following triangle
		//*
		//**
		//***
		//****
		//*****
		
	for (int r=1; r<=5; r++) {
		
		for (int c=1; c<=r; c++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
    for (int r=4; r>=1; r--) {
		
		for (int c=1; c<=r; c++) {
			System.out.print("*");
		}
		System.out.println();
	}	
		
		
		
		
		
		
		

	}

}
