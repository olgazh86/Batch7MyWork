package com.syntax.class10;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//55555
		//4444
		//333
		//22
		//1
		for (int r=5; r>0; r--) {
			
			for (int c=1; c<=r; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("***********************");	
	   //54321
		//4321
		//321
		//21
		//1
		
        for (int r=5; r>0; r--) {
			
			for (int c=r; c>=1; c--) {
				System.out.print(c);
			}
			System.out.println();
		}
		
        System.out.println("***********************");		
		//1
    	//21
    	//321
    	//4321
        
    	for (int i =1; i<=4;i++) {
    		
    		for (int j=i; j>=1; j--) {
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    	 System.out.println("***********************");	
    	 
    	 
    	for (int a=1; a <=5; a++) {
    		
    		for(int b=1; b<=4; b++) {// the inner loop controls the columns 
    			
    			if (a==1|| a==5) {//in the first || last row print everything
    				System.out.print("$");
    			}else {//in the other rows
    				
    				if (b ==1||b==4) {//in the first or last column print $
    			   System.out.print("$");
    				}else {// in the other columns print +
    					 System.out.print(" ");
    				}
    			
    			}
    			 			
    		}
    		System.out.println();
    	}
    	
    	// re-do this task without using nested if 
    	//hint you should use && + ||
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
		
	}

}
