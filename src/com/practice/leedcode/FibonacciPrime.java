package com.practice.leedcode;

import java.util.*;
import java.util.stream.Collectors;

public class FibonacciPrime {

	public static long[] solution (long N) {
		List<Long> fNumber = new ArrayList<>();
		fibonacciNumbers(fNumber, N);
		fNumber = fNumber.stream().distinct().collect(Collectors.toList());
		fNumber.removeIf(num -> !isNumPrime(num));
		
		return fNumber.stream().mapToLong(num -> num).toArray();
		
	}

	private static void fibonacciNumbers(List<Long> fNumbers, long N) {
		for (int i = 0; i <= N; i++) {
			if (i < 2) {
				fNumbers.add(Long.valueOf(i));
			} else {
				fNumbers.add(fNumbers.get(i - 1) + fNumbers.get(i - 2));
			}
		}
	}

	private static boolean isNumPrime(long num) {
		boolean isPrime = true;
		if (num == 0 || num == 1) {
			return false;
		}
		// Loop to check whether the numberToCheckber is divisible any numberToCheckber
		// other than 1 and iteself
		for (int i = 2; i <= num / 2; i++) {
			// if remainder is 0 than numberToCheckber is not prime and break loop. Elese
			// continue loop
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
