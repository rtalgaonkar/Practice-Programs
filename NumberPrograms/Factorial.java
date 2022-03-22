package NumberPrograms;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		System.out.println("Factorial of " + n + " is " + factorial(n));
	}

	private static Integer factorial(int n) {
		while(n >= 1) {
			return n * factorial(n-1);
		}
		return 1;
	}
}
