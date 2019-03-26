import java.util.Scanner;
public class Fibonacci {
	
	
    public static void main(String[] args) {
    	
    	Scanner scan =new Scanner(System.in);
    	
    	System.out.println("Enter the position (Index) of number");
    	int n = scan.nextInt();
    	int f = fibRek(n);
    	
    	
   System.out.println("The fibonacci number with the corresponding index is " + f);

         }
    
	
    public static int fibRek (int n) {
		if (n < 2 ) {
			return n;
    
		}else {
			return fibRek(n-2)+fibRek(n-1);
		
		}
		
	}

	public static int fibItr (int n) {
		//Not working
		int a = 0;
	 	int b = 1;
	       
	        for (int i = 1; i <n; i++)
	        {
	            int c = a;
	            a = b;
	           b = c + b;	
	           if(i == a-1) {
	        	   return b;
	   			
	           }
	        }
			return 0;
	        
		
	} 
	

    }
	