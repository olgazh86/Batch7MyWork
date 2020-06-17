package com.syntax.class03;

public class RelationalOperators {
public static void main(String[] args) {
	
      int a = 7;
      int b =10;
   System.out.println(3 > 4);
   System.out.println(a > b);//false
   System.out.println(a < b);//true
   System.out.println(a == b);//false
   System.out.println(a != b);//true
   
   System.out.println("######################");
   double i = 10.78;
   double j = 10.55;
   
   
   boolean result1 = i > j; //true //is i greater than j?
   System.out.println(result1);
   
   boolean result2 = i ==j;// is i is equal j?
   System.out.println(result2);
   
   boolean result3 = (i != j);// i different j?
   System.out.println(result3);
	
   boolean result4 = i >=j; //i greater or equal then j?
   System.out.println(result4);
   
   boolean result5 = i<= j;//i smaller or equal j?
   System.out.println(result5);
	   
   
	
}
}
