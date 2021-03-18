package com.practice.leedcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectionAreaTest {

	@Test
	public void testProjectionAreaSolution() {
		int[][] set1 = {{1,2},{3,4}};
		assertTrue(ProjectionArea.solution(set1) == 17);
		int[][] set2 = {{2}};
		assertTrue(ProjectionArea.solution(set2) == 5);
		int[][] set3 = {{1,0},{0,2}};
		assertTrue(ProjectionArea.solution(set3) == 8);
		int[][] set4 = {{1,1,1},{1,0,1}, {1,1,1}};
		assertTrue(ProjectionArea.solution(set4) == 14);
		int[][] set5 = {{2,2,2},{2,1,2}, {2,2,2}};
		assertTrue(ProjectionArea.solution(set5) == 21);
	}
}
