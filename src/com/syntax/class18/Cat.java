package com.syntax.class18;

public class Cat {
	// instance   
   String name, color;
   int age;
   
   //static
   static int paws= 4;
   static boolean mustage=true;
   static boolean tail = true;
  
   void displayCAt() {
System.out.println("Name of cat is " + name + "and this cat is "+color+ " and is "+age+" years old");
   }
      void displayCommonFeatures() {
	System.out.println(name + " has "+ paws+ " paws and mustage is "+mustage);
}
   
   
   
   
   
   
      public static void main(String[] args) {
	
	 Cat cat1= new Cat();//-----> local variable
	 cat1.name= "Jessy";
	 cat1.age = 8;
	 cat1.color= "grey";//accessing instance variable and assigning
	 
	 //to accses static variable we use name of the class where the 
	 System.out.println("Number of paws =" +Cat.paws);
	 
	 
	 Cat cat2 = new Cat();
	 cat2.name ="Lucy";
	 cat2.age=1;
	 cat2.color="wite";
	 cat2.name="Bonchuk";
	 Cat.tail=false;//-------> possible way change but not right, change evriver 
	 
	 
	 
	 
	 
	 
	 Cat cat3= new Cat();
	 cat3.name="Kathy";
	 cat3.age=4;
	 System.out.println("--------Printing value of 3 cat-----------------------------");
	 cat3.displayCAt();
	 cat3.displayCommonFeatures();
	 
	System.out.println("-------------------------"); 
	 
	 
	 System.out.println("Name of 1st cat = "+ cat1.name);
	 System.out.println("Age of cat "+ cat1.age);
	 System.out.println("Name of 2nd cat = "+ cat2.name);
	 
	 System.out.println("---------------------------------");
	 cat1.displayCAt();
	 cat2.displayCAt();
	 System.out.println("------------------------------");
	 
	 cat1.displayCommonFeatures();
	 cat2.displayCommonFeatures();
}  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
