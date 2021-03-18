package com.practice.leedcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You are given an m * n matrix, mat, and an integer k, which has its rows sorted in non-decreasing order.

You are allowed to choose exactly 1 element from each row to form an array. 
Return the Kth smallest array sum among all possible arrays.
 *
 */
public class KthSmallestSum {

	/**
	 * @param mat
	 * @param k
	 * @return kth smallest sum
	 * sum of each value by adding each row and only keep first K values 
	 */
	public static int solution(int[][] mat, int k) {

	    List<Integer> rowSumsIntegers = Arrays.stream(mat[0]).boxed().collect(Collectors.toList());
	   
	    for (int i = 1; i < mat.length; i++) {
	    	List<Integer> rowSumsIntegersTemp = new ArrayList<>();
	    	for (Integer x : rowSumsIntegers) {
	    		for (int y : mat[i]) {
	    			rowSumsIntegersTemp.add(x+y);
                }
	    	}
	    	Collections.sort(rowSumsIntegersTemp);
	    	rowSumsIntegers = rowSumsIntegersTemp;
	    	if (rowSumsIntegers.size() > k) {
	    		rowSumsIntegers = rowSumsIntegers.subList(0, k);
	    	}
	    	
	    }
		
		return rowSumsIntegers.get(k-1);
	}
	
	public static void main (String args[]) {
	   int[][] test = {{1,3,11},{2,4,6}};
	   solution(test, 9);
	}
}