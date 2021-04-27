package com.practice.leedcode;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FibonacciPrimeTest {

	@Test
	public void test () {
		long N = 6;
		long[] expectedResults = {2, 3, 5};
		long[] result = FibonacciPrime.solution(N);
		
		Object[] objArray1 = {result};
	    Object[] objArray2 = {expectedResults};
		
		assertTrue(Arrays.deepEquals(objArray1,objArray2));
	}
}
