// Write a Java code to determine Prime number is an array
public class PrimeNumber {
	 public static boolean isPrime(int number) {
	        // If the number is less than or equal to 1, it's not prime
	        if (number <= 1) {
	            return false;
	        }

	        // Check for divisibility from 2 to the square root of the number
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                // If divisible by any number in this range, it's not prime
	                return false;
	            }
	        }

	        // If not divisible by any number in the range, it's prime
	        return true;
	    }

	    public static void main(String[] args) {
	        // Array of numbers to check for prime
	        int[] numbers = {2, 7, 12, 17, 23, 29, 130};

	        System.out.println("Prime Numbers in the Array:");

	        // Iterate through each number in the array
	        for (int num : numbers) {
	            // Check if the number is prime using the isPrime method
	            if (isPrime(num)) {
	                System.out.println(num + " is prime");
	            } else {
	                System.out.println(num + " is not prime");
	            }
	        }
	    }
}
