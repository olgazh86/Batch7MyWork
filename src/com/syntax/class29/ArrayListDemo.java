package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//create an arrayList that will store numbers
		
	 ArrayList <Integer>alist	=new ArrayList<>();
	 alist.add(100);
	 alist.add(200);
	 alist.add(300);
	 //alist.add("400"); cannot store String Objects into ArrayList of Integer Objects
	 
	 System.out.println("Size of alist = "+ alist.size());
	 System.out.println(alist);
	 
	 alist.add(1);
	 alist.add(2);
	 
	 System.out.println("ArrayList after add"+alist);
	 
	 alist.remove(2);//specifying index of element to remove
	 System.out.println("ArraList after removing index2 "+alist);

	}

}
