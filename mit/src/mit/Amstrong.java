package mit;

	public class Amstrong {
	    public static void main(String[] args) {
	        System.out.println(isArmstrongNumber(153));  // Output: true
	    }

	    public static boolean isArmstrongNumber(int num) {
	        int originalNum = num;
	        int sum = 0;
	        int digit;

	        while (num > 0) {
	            digit = num % 10;
	            sum += Math.pow(digit, 3);
	            num /= 10;
	        }

	        return sum == originalNum;
	    }
	}

