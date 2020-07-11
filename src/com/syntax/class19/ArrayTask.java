package com.syntax.class19;

public class ArrayTask {
	//1
	  protected int sumOf(int[] array) {
	  int sum = 0;
	  
		for (int i=0; i<array.length; i++) {
			
			sum+=array[i];
		}
		return sum;
	}
	//2
	  public static String reverse(String a) {
		  String reverse ="";
		  for (int i =a.length()-1; i>=0;i--) {
			  reverse+=a.charAt(i);
		  }
		  return reverse;
	  }
	 //3
	  static String param;
	  private  void replace() {
		  System.out.println(param.replaceAll("[^A,a,E,e,O,o,U,u,I,i]", ""));
		 
	  }
	 
	

	public static void main(String[] args) {
		
		ArrayTask arr=new ArrayTask();
	//1	
	int[]array = {2,4,6,7,8};
	System.out.println(arr.sumOf(array));
	//2	
	System.out.println(ArrayTask.reverse("Hello"));
	
	//3
	arr.param = "HelloWorld";
	arr.replace();


	}
	
	

}
