package recursion1;
	/* Print Factorial of a number n.
	 * Factorial Number in Math is : n = n*(n-1) * (n-2).....*1
	 * 								 3! = 3*2*1
	 * 								 2! = 2*1
	 * 								 1!	= 1
	 * 								 0! = 1 (Special case)
	 */
	
public class App5 {
	public static void main(String[] args) {
		
		int n = 5;
		int ans = factorial(n);
		System.out.println(ans);
		
	}
	
	public static int factorial(int n) {
		if (n == 1 || n ==0) {
			return 1;
		}
		
		int fact_nm1 = factorial(n-1);
		int fact_n = n*fact_nm1;
		return fact_n;
		
	}
	

}
