package Practice;

public class Palindrome {

	public static void main(String[] args) {

		final int number = 121;
		int output = 0;
		int temp = number;
		
		while(temp!=0) {
			
			int remainder = temp%10;
			output = output*10 + remainder;
			temp = temp/10;
			
		}
		
		if (number==output) {
			
			System.out.println("Number is palindrome : " + output);
			
		}
		else {
			
			System.out.println("Number is not palindrome : " + output);
		
		}
		
		// String palindrome
		 final String word = "MADAM";
		 String temp1 = "";
		 
		 int length = word.length();
		 
		 for(int i=length-1; i>=0; i--) {
			 
			 temp1 = temp1 + word.charAt(i);
			 
		 }
		 
		 if (word.equals(temp1)) {
			 
			 System.out.println("Word is palindrome : " + temp1);
			
		} else {

			System.out.println("Word is not palindrome : " + temp1);
			
		}
		
		
	}

}
