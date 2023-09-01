package myPack;

public class DayOne {

							// Day One Reverse A String
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		// 1.Step get a input of String 
		
		//2.step store the string into an array
		
		//3.Step create a StringBulider Object in which we are going to store our reversed String
		
		//4.step iterate the array using the for loop and store into the String Builder
	
		
	String input = "Hello how are You"; 

	char[] input2 = input.toCharArray();
	
	StringBuilder sb =new StringBuilder();
	
	for(int i =input2.length-1; i>=0; i--) {
		sb.append(input2[i]);
	}
		
	System.out.println(sb);
	
	}

}
