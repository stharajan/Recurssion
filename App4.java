package recursion1;

		// print sum of first n natural numbers.

public class App4 {
	
	public static void main(String[] args) {
		
		printSum(1, 5, 0);
		
	}
	
	public static void printSum(int i, int n, int sum) {
		
		if(i == n) {
			sum += i;
			System.out.println(sum);
			return;
	
		}else {
			
			sum += i;
			printSum(i+1, n, sum);
		}
		
		
	}

}
