package myPack;

public class DayFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dislpay 1 to 100 all numbers , 
		// Condition:- if number is a multiple of 3 show FIZZ
		//If number is muliple of 5 Show BUZZ
		// If number is muliple of both 3 and 5 Show FIZZBUZZ

		
		// 		1St Method 
		
		for(int i=0;i<=30;i++) {
			if(i%5==0 && i%3==0) {
				System.out.println(i+"FIZZBUZZ");
			}
			
			else if(i%3==0) {
				System.out.println(i+"FIZZ");
			}
			
			else	if(i%5==0) {
				System.out.println(i+"BUZZ");
			}
		}
		
		
// 2ND Method		
//		for (int i = 1; i <= 25; i++) {
//            String output = "";
//
//            if (i % 3 == 0) {
//                output += "FIZZ";
//            }
//            if (i % 5 == 0) {
//                output += "BUZZ";
//            }
//            if (output.isEmpty()) {
//                output = Integer.toString(i);
//            }
//
//            System.out.println(output);
//        }	
	}

}
