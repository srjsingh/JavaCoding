package Practice;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int i = 153;
		int temp = 0;
		int temp1 = i;

		while(i!=0) {
			
			int a = i%10;
			
			temp = temp + (a*a*a);
			
			i = i/10;
			
		}
		if(temp==temp1)
		System.out.println("number is armstrong : " + temp);
		
		else 
		System.out.println("number is not armstrong : " + temp);
		
	}

}
