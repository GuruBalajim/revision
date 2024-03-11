package mit;
import java.util.Scanner;
public class Fibonacci {
	    public static void main(String[] args) {
	        Scanner scanner =new Scanner(System.in);
	        		int n=scanner.nextInt();
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	        // Output: 0 1 1 2 3 5 8 13 21 34
	    }

	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}



