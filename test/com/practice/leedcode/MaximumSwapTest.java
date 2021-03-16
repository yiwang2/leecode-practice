package com.practice.leedcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumSwapTest {

	@Test
	public void testMethodOne() {
		int testValue1 = 2736;
		assertTrue(MaximumSwap.maximumSwap(testValue1) == 7236);
		int testValue2 = 98368;
		assertTrue(MaximumSwap.maximumSwap(testValue2) == 98863);
	}
	
	@Test
	public void testMethodTwo() {
		int testValue1 = 2736;
		assertTrue(MaximumSwap.maximumSwapAnotherWay(testValue1) == 7236);
		int testValue2 = 98368;
		assertTrue(MaximumSwap.maximumSwapAnotherWay(testValue2) == 98863);
	}

}
