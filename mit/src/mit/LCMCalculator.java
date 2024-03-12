package mit;
	public class LCMCalculator {
	    public static void main(String[] args) {
	        int num1 = 12;
	        int num2 = 18;

	        int lcm = findLCM(num1, num2);

	        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	    }

	    private static int findGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    private static int findLCM(int a, int b) {
	        return Math.abs(a * b) / findGCD(a, b);
	    }
	}

