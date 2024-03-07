

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class determinePrimeNumbers {

	public static void main(String[] args) {

		int number = 123456789;

		boolean isPrime = checkPrime(number);

		System.out.printf("%d is Prime: %b.\n", number, isPrime);

		System.out.printf("%d is Prime: %b.\n", 3511, checkPrime(3511));

		System.out.printf("%d is Prime: %b.\n", 123, checkPrime(123));

	}

	// a number is not prime if there is a prime number between 2 to the square root of
	// num that evenly divides it
	private static boolean checkPrime(int num) {
		// get the prime numbers from 2 to square root of num.
		
		List<Integer> primes = PrimeNumbers.findPrimeNumbers(Double.valueOf(Math.sqrt(num)).intValue());
		System.out.println(primes);

		for (int i : primes) {
			if (num % i == 0) {
				System.out.printf("%d is divided by %d.\n", num, i);
				return false;
			}
		}
		return true;
	}
}