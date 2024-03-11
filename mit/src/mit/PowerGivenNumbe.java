package mit;
import java.util.Scanner;
	public class PowerGivenNumbe {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the base: ");
	        int base = scanner.nextInt();
	        System.out.print("Enter the exponent: ");
	        int exponent = scanner.nextInt();
	        System.out.println(base + " raised to the power of " + exponent + " is: " + power(base, exponent));
	        scanner.close();
	    }

	    public static int power(int base, int exponent) {
	        if (exponent == 0) {
	            return 1;
	        } else {
	            return base * power(base, exponent - 1);
	        }
	    }
	}

