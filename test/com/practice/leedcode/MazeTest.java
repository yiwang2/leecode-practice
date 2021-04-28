package com.practice.leedcode;

import static org.junit.Assert.*;
import org.junit.Test;

public class MazeTest {

	@Test
	public void normalPath () {
		long[][] maze1 = {{1,0,0},{1,0,0}, {1,1,1}};
		assertTrue(Maze.solution(maze1));
	
	}
	
	@Test
	public void noPath () {
		long[][] maze2 = {{1,0,0},{0,0,0}, {1,1,1}};
		assertTrue(!Maze.solution(maze2));
	}
}
