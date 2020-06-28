package com.syntax.class12;

public class Task2DArray {

	public static void main(String[] args) {
		
	String [][]	food = {
			{"draniki","blini","borsch"},
			{"burger","frise","pizza"}
	};
        for (int r=0; r<food.length;r++) { 
		for (int c=0; c<food[r].length; c++ ) {
		
			System.out.print(food [r][c] + " ");
		}
        
		System.out.println();
        }
		
for (String[]array:food) {
			
			for (String f:array) {
				System.out.print(f + " ");
			}
		}

System.out.println();


    //2D array of int and calculate sum of all add numbers


      int[][] numbers= {
    		  {10,23,56,47},
    		  {33,668,89},
    		  {1,9,0}
      };  
    //regular for loop
      int sum=0;
      
      for (int i=0; i<numbers.length;i++) {
    	  for (int j=0; j<numbers[i].length; j++) {
    		  
    	    int element=numbers[i][j];
    		  if(element%2!=0) {
    		   sum += element;
    	    }
    	  }
    	 
      }
      
      System.out.print(sum); 
        
        
        
        
        
		
		

	}

}
