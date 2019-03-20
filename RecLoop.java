import java.util.Scanner;

public class RecLoop{

	//todo: Look at the given code and try to understand the methods.
	//The first method euklidRek uses recursion to compute the euclidean algorithm.
	//You can look up the algorithm here: https://en.wikipedia.org/wiki/Euclidean_algorithm
	//Add another method euclidIterative that computes the euclidean algorithm iterative.
	//The second method powIterative computes the the base to the power of n in a iterative way.
	//Add another method powRek which does exactly the same, but by using recursion.

	 public static int euclidRec(int a, int b) {
		if (a == b) {
			return a;
		} else if (b > a) {
			int temp = a;
			a = b;
			b = temp;
			return euclidRec(a, b);
		} else {
			return euclidRec(a - b, b);
		}
	}
	 private static int euclidIterative(int a, int b) {
			int temp = 0;
			while (b != 0) {
				temp = b;
				b = a % b;
				a = temp;
			}
			return a;
		}
    public static double powIterative(final double base, final int n) {
		if (n < 0) {
			System.out.println("(Our version of) power is undefined for negative numbers.");
			return -1;
		} else {
			double result = 1; 

			for (int i = n; i > 0; --i) {
				result = result * base;
			}
			return result;
		}
	}

    public static double powRek(float b, float n) {
		float result = 0;
		if(n<0) {
			System.out.println("power is undefined for negative numbers.");
		return -1;
		}else if(n == 0) {
			return 1;
		}else if(n>0) {
			result = (float) (b * powRek(b, n-1));
		}
      return result;
}

public static void main(String[] args){
	
	Scanner scan =new Scanner(System.in);
	
	System.out.println("enter the numbers");
	int x1=scan.nextInt();
	int x2=scan.nextInt();
	
	System.out.println("EuclidRec : " + euclidRec(x1,x2));
	
	System.out.println("euclidInterative: "+euclidIterative(x1,x2));
	
	System.out.println("PowerIterative : " + powIterative(x1,x2));
	
	System.out.println("PowerRek : " + powRek(x1,x2));
}
}