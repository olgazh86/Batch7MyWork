package com.syntax.class07;

public class ClassTaskLoop {

	public static void main(String[] args) {
		// print 50-1
		
		
		int a= 50;
		while (a>=1) {
			System.out.println(a);
			a--;
		}
		
		
		//print odds from 1 to 20
		
	    int b = 1;
	    while (b <= 20) {
	    	System.out.println(b);
	    	b +=2;
	    }
		//teacher exep.:
	   //odd from 1-20
	    
	   //1 way, using mod (%)
	    
	    int x =1;
	    while (x<20) {
	    	if (x%2 ==1) {
	    		System.out.println(x);
	    	}
	    	x++;
	    }
	   //2nd way, increase by 2 (easy)
	    
	    int y = 1;
	    while (y<20) {
	    	System.out.println(y);
	    	y+=2;
	    }
	    // 3rd way
	    
	    int z = 0;
	    while (z<20) {
	    	z++;
	    	System.out.println(z);
	    	z++;
	    }
	    
	    //4 way
	    
	    int g = 0;
	    while (g<20) {
	    	System.out.println(++g);
	    	g++;
	    }
	    
		
		
		
		

	}

}
