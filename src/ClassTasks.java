
public class ClassTasks {

	public static void main(String[] args) {
		//1 Create a String that will hold a sentence.
		//Write a program to get a new String without any spaces.
		
		
		String str = "Today is funny day";
		str = str.replace(" ","");
		System.out.println(str);
		
		
		//2.Create a String that should be combination of letters, numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		String str2= "fbfbnnn$$%%^178384949";
		
		str2=str2.replaceAll("[^A-Za-z]", "");
		int characters=str2.length();
		System.out.println("Total number alpha characters is "+ characters);
		
		//You have a String a=“Is it saturday? 
		//Is it raining? Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		
		String a ="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = a.split("[?]");
		
		int sentences = array.length;
		
		System.out.println("Total number of sentences is " + sentences);
		
		
		
		
		
		
		
		
	}

}
