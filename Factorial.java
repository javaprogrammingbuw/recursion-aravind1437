import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if(n == 0)
			return 1;
		else
			return (n*factorial(n-1));
	}

	public static void main(String[] args) {
		int count=1;
		Scanner scan = new Scanner(System.in);
		 int n1 = scan.nextInt();
		count = factorial(n1);
		System.out.println("Factorial of " +n1+ "is:" + count);
	}
	
	
	
	
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
}
