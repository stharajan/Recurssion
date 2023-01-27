package recursion1;

	// Print Number from 1 to 9. (Ascending order).

public class App3 {
	public static void main(String[] args) {
		
		int n = 1;
		printNum(n);
		
	}
	private static void printNum(int n) {
		if ( n == 10) {
			return;
		}
		System.out.println(n);
		printNum(n + 1);
	}
	

}
