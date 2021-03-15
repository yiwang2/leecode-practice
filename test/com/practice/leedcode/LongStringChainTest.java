package com.practice.leedcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongStringChainTest {

	@Test
	public void test() {
		String[] test = {"a","b","ba","bca","bda","bdca"};
		assertTrue(LongestStringChain.solution(test) == 4);
	}

}