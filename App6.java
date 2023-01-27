package recursion1;

		// Print fibonacci sequence till nth term.

public class App6 {
	public static void main(String[] args) {
		
		int a = 0; int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		int n = 9;
		
		printFib(a, b, n-2);
		

	}
	
	public static void printFib(int a, int b, int n) {
		if( n == 0) {
			return;
			
		}
		int c = a + b;
		System.out.println(c);
		
		printFib(b, c, n-1);
	}
	
	}
		
	
