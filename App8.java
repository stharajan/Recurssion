package recursion1;

		// Print x^n (stack height = logn)

public class App8 {
	public static void main(String[] args) {
		int x = 2; int n = 5;
		int ans = calPower(x, n);
		System.out.println(ans);
		
	}
	public static int calPower(int x, int n) {
		if (n == 0) {
			return 1;
			
		}
		if (x ==0) {
			return 0;
		}
		// if n is even 
		if (n % 2 == 0) {
			return calPower(x, n/2)* calPower(x, n/2);
			
		}
		else {	// if n is odd 
			return calPower(x, n/2) * calPower(x, n/2) * n;
			
		}
	}

}
