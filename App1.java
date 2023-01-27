package recursion1;

public class App1 {
	public static void main(String[] args) {
		 
		sayHi(5);
		
	}
	private static void sayHi(int count) {
		System.out.println("Hi there!");
		
		if(count <= 1) {
			return;
			
		}
		sayHi (count-1);
	}

}
