package com.practice.leedcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class KthSmallestSumTest {

	
	@Test
	public void test() {
		int[][] set1 = {{1,3,11},{2,4, 6}};
		assertTrue(KthSmallestSum.solution(set1, 5) == 7);
		assertTrue(KthSmallestSum.solution(set1, 9) == 17);
	}
}
