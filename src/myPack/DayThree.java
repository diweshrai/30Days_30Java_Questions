package myPack;

public class DayThree {


	
	// Problem: Write a Java program to check if a vowel is present in a string.
	
	public static void main(String[] args) {
		

	
	String Dt = "nnnnnnnnnnn aa hhhhhhh kkkkkkkkk jjjjj";
	
	int voCount =0;
	
	
	// 1st Method to find 
	
	char[]  Dtarr = Dt.toCharArray();
	
	for(char lst:Dtarr) {
		
		if(lst== 'a'|| lst=='e'||lst== 'i' ||lst== 'o' ||lst =='u') {
			voCount += 1;
		}
		
		
	}
	
	
	if(voCount>0) {
	System.out.println("Vowel is present and the no of Vowel are "+voCount);
	}
	else {
		System.out.println("no vowel present");
	}
	
	


	//2nd Method to Find
	
	System.out.println(vow("hhhhhhhhh"));
	
	}


	public static boolean vow(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	
	
	
	
	
	}

	
	
	

}
