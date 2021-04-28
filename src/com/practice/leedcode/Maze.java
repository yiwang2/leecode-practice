package com.practice.leedcode;

import java.util.*;

public class Maze {

	private static int PATH = 1;
	private static int BLOCK = 0;
	private static List<long[]> searchedNode = new ArrayList<long[]>();
	private static boolean searching = false;
	
	public static boolean solution (long[][] maze) {
		searchedNode = new ArrayList<long[]>();
		searching = false;
		return searchPath(maze, new long[]{0,0}, new long[]{maze.length-1,maze[0].length-1});
	}
	
	private static boolean searchPath (long[][] maze, long[] start, long[] end) {
		
		int startRow = (int)start[0];
		int startColumn = (int)start[1];
		
		if (maze[startRow][startColumn] == BLOCK) {
			return false;
		}
		
		int endRow = (int)end[0];
		int endColumn = (int)end[1];
		
		if (maze[endRow][endColumn] == BLOCK) {
			return false;
		}
		
		if (start[0] == end[0] && start[1] == end[1]) {
			return true;
		}
		
		int maxRow = maze.length -1;
		int maxColumn = maze[0].length -1;
		int minRowOrColumn = 0;
		
		searchedNode.add(start);
		
		//only four direction searching, didn't support cross
		long[] nodeUp = {startRow-1, startColumn};
		long[] nodeDown = {startRow+1, startColumn};
		long[] nodeLeft = {startRow, startColumn-1};
		long[] nodeRight = {startRow, startColumn+1};
		
		if (isNodeValid(nodeUp, minRowOrColumn, maxRow, maxColumn) && !isNodeSearched(nodeUp, searchedNode)) {
			searching = searchPath(maze, nodeUp, end);
		}
		
		if (!searching && isNodeValid(nodeDown, minRowOrColumn, maxRow, maxColumn) && !isNodeSearched(nodeDown, searchedNode)) {
			searching = searchPath(maze, nodeDown, end);
		}
		
		if (!searching && isNodeValid(nodeLeft, minRowOrColumn, maxRow, maxColumn) && !isNodeSearched(nodeLeft, searchedNode)) {
			searching = searchPath(maze, nodeLeft, end);
		}
		
		if (!searching && isNodeValid(nodeRight, minRowOrColumn, maxRow, maxColumn) && !isNodeSearched(nodeRight, searchedNode)) {
			searching = searchPath(maze, nodeRight, end);
		}
		
		return searching;
	}
	
	private static boolean isNodeSearched (long[] node, List<long[]> searchedNode) {
		return searchedNode.stream().filter(n -> n[0] == node[0] && n[1] == node[1]).count() != 0;
	}
	
	private static boolean isNodeValid (long[] node, int minRowOrColumn, int maxRow, int maxColumn) {
		return !(node[0] > maxRow || node[0] < minRowOrColumn || node[1] > maxColumn || node[1] < minRowOrColumn);
	}
}
