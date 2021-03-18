package com.practice.leedcode;

/*
 * You are given an n x n grid where we place some 1 x 1 x 1 cubes that are axis-aligned with the x, y, and z axes.

Each value v = grid[i][j] represents a tower of v cubes placed on top of the cell (i, j).

We view the projection of these cubes onto the xy, yz, and zx planes.

A projection is like a shadow, that maps our 3-dimensional figure to a 2-dimensional plane. We are viewing the "shadow" when looking at the cubes from the top, the front, and the side.

Return the total area of all three projections.
 * */

public class ProjectionArea {
	
	/**
	 * @param grid
	 * @return result of projection area of 3d shapes
	 * 
	 * The main idea is to have sum of following values
	 * N*N - numOfZeroElements
	 * sumMaxOfEachRow
	 * sumMaxOfEachColumn
	 */
	public static int solution(int[][] grid) {
		int squareSizeMinusZeroElement = grid.length * grid[0].length;
		int sumMaxOfEachRow = 0;
		int sumMaxOfEachColumn = 0;
		
		for (int i = 0; i< grid.length ; i ++) {
			int rowMax = grid[i][0];
			for (int j = 0; j < grid[i].length ; j ++) {
				if (grid[i][j] == 0) {
					squareSizeMinusZeroElement --;
				}
				
				rowMax = Math.max(rowMax, grid[i][j]);
			}
			sumMaxOfEachRow += rowMax;
		}
		
		for (int j = 0; j < grid[0].length ; j ++) {
			int columnMax = grid[0][j];
			for (int i = 0; i< grid.length ; i ++)  {
				columnMax = Math.max(columnMax, grid[i][j]);
			}
			sumMaxOfEachColumn += columnMax;
		}

		
		
		return squareSizeMinusZeroElement + sumMaxOfEachRow + sumMaxOfEachColumn;

	}
}
