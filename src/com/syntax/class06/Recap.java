package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		
		//if hour is between 1 - 11---- morning
		//if hour is between 12-15 -----afternoon
		//16-20----evening
		//21-24----night
		//we will print : right now is______
		
	int hour=22;
	                                              //String dayTime;
	if (hour>=1 && hour<=11) {
		System.out.println("Right now is morning");//or dayTime="morning";
	}else if (hour>=12 && hour<=11) {
		System.out.println("Right now is afternoon");
	}else if (hour>=16 && hour<=20) {
		System.out.println("Right now is evening");
	}else if(hour>=21 && hour<=24) {
		System.out.println("Right now is night");	
	}else {
		System.out.println("Unknow");
	}
		
	
	System.out.println("************************");

	
	
	int hour1=34;
   String dayTime; 
                     //String dayTime;
  if (hour1>=1 && hour1<=11) {
      dayTime = "morning";//or dayTime="morning";
   }else if (hour1>=12 && hour1<=11) {
      dayTime = "afternoon";
    }else if (hour1>=16 && hour1<=20) {
       dayTime="evening";
    }else if(hour1>=21 && hour1<=24) {
       dayTime= "night";	
    }else {
	   dayTime="Unknow";
    }

    if (!dayTime.equals("Unknow")) {
        System.out.println("Right now it is "+ dayTime);
}

	}

}
