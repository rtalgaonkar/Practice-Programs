package NumberPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n= 10;
		for(int i=0;i<n;i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	private static int fibo(int i) {
		if(i<=1)
			return i;
		else {
			return (fibo(i-1) + fibo(i-2));
		}
	}
}


class ABC{
	private ABC abc;
	public void m1(){
		synchronized(ABC.class){
			synchronized(abc){
			//some code
			}
		}
	}
}