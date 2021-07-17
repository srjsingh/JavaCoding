package Practice;

public class FibonacciSeries {
	
	final static int first = 0;
	final static int second = 1;

	public static void main(String[] args) {

		int a = first;
		int b = second;
		int temp = 0;
		int limit = 10;
		
		System.out.print(a + ", " + b);
		
		for(int i =1; i <= limit-2; i++) {
			
			temp = a+b;
			a = b;
			b = temp;
			
			System.out.print(", " + temp);
			
		}
		
		
	}

}
