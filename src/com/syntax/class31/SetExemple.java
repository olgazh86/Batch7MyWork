package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExemple {

	public static void main(String[] args) {
		
		//creating an object of HashSet
		
		HashSet<String> brand =new HashSet<>();
		brand.add("Nike");
        brand.add("Adidas");
        brand.add("H&M");
        brand.add("Zara");
        brand.add("Uniqlo");
        brand.add("Adidas");
        brand.add("H&M");
        
        System.out.println(brand.size());
        System.out.println(brand);
        		
    //how to verify if element is there 
       boolean isItThere =  brand.contains("Nike");
       System.out.println(isItThere);
		
   //how to access element from a Set collection
        //brand.get--> is not available to obj of Set type
       
       Iterator<String> it = brand.iterator();
       String obj = it.next();
       System.out.println(obj);
       
       obj = it.next();
       System.out.println(obj);
       System.out.println("-----------1st  while loop for iterator--------");      
       while(it.hasNext()) {
    	   obj = it.next();
    	   System.out.println(obj);
       }
//if need to iterate ower entire collection again we need NEW Itarator obj
       
       System.out.println("-----------2nd while loop for new iterator--------");
       
       Iterator<String> iterator = brand.iterator();
       
       while(iterator.hasNext()) {
    	   System.out.println(iterator.next());
       }
	
	
       System.out.println("-------using for each loop to get values from Set collection ---------");
	//is there other way to get all elements from Set collection?
	
	for(String  br :brand) {
		System.out.println(br);
	}
	
	System.out.println("-----Creating an obj of LinkedHAshSet-------------");
	
	LinkedHashSet<String> luxBrend = new LinkedHashSet<>();
	
	luxBrend.add("Prada");
	luxBrend.add("Chanel");
	luxBrend.add("Gucci");
	luxBrend.add("LV");
	luxBrend.add("Gucci");
	
	System.out.println(luxBrend.size());
	System.out.println(luxBrend);
		
	
	System.out.println("-----Creating an obj of TreeSet-------------");

	TreeSet<String> allBrand = new TreeSet<>(brand);//<--add collection 
	allBrand.add("Calvin Clain");
	allBrand.addAll(luxBrend);
	
	System.out.println(allBrand);
	
	
	System.out.println("-----retrieving elements from Tree Set ");
	Iterator<String> iter = allBrand.iterator();
	
	while(iter.hasNext()) {
	String br =iter.next();
	System.out.println(br);
	}
	
	
	
	
	System.out.println("-----obj of trerSet to store Double");
	Set<Double> tset=new TreeSet<>();
	
	tset.add(10.99);
	tset.add(1.99);
	tset.add(100.99);
	tset.add(10.01);
	
	System.out.println(tset);
	

	
	
	
	
	
	
	
	
	}

}
