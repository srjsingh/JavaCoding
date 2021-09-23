package Practice;

public class FibonacciSeries {
	
	final static int first = 0;
	final static int second = 1;

	public static void main(String[] args) {

		int a = first;
		int b = second;
		int temp = a+b;
		int limit = 10;
		
		System.out.print(a + ", " + b);
		
		while(temp<100) {
			
			
			a = b;
			b = temp;
			
			System.out.print(", " + temp);
			
			temp = a+b;
			
		}
		
		
	}

}
