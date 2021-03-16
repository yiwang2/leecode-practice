package com.practice.leedcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
 * Given a non-negative integer, you could swap two digits at most once to get the maximum valued number. 
 * Return the maximum valued number you could get.
 * */

public class MaximumSwap {

	
	public static int maximumSwap(final int num) {

		int result = num;
		
		String numStringValueString = String.valueOf(num);
		String[] numStringValueSplitStrings = numStringValueString.split("");
		
		for (int ending = numStringValueSplitStrings.length - 1; ending >= 0; ending --) {
			for (int beginning = 0; beginning < numStringValueSplitStrings.length - 1; beginning ++ ) {
				if (Integer.valueOf(numStringValueSplitStrings[ending]) > 
				Integer.valueOf(numStringValueSplitStrings[beginning])) {
					List<String> numStringValueSplitList = Arrays.asList(Arrays.copyOf(numStringValueSplitStrings, numStringValueSplitStrings.length));
					Collections.swap(numStringValueSplitList, ending, beginning);
					result = Math.max(result, Integer.valueOf(String.join("", numStringValueSplitList)));
				}
			}
		}
		
		
		return result;
		
	}
	
	public static int maximumSwapAnotherWay (final int num) {
		String numStringValueString = String.valueOf(num);
		int maxIdx = -1, maxNum = 0, leftIdx=-1, rightIdx = -1;
	    
	    for (int i = numStringValueString.length()-1; i>=0; i--) {
	        int t = numStringValueString.charAt(i)-'0';
	        if (t > maxNum) {
	            maxNum = t;
	            maxIdx = i;
	        } else if (t < maxNum) {
	            leftIdx = i;
	            rightIdx = maxIdx;
	        }
	    }

	    if (leftIdx == -1)
	        return num;
	    
	    List<String> numStringValueSplitList = Arrays.asList(numStringValueString.split(""));
		Collections.swap(numStringValueSplitList, leftIdx, rightIdx);
	    return Integer.valueOf(String.join("", numStringValueSplitList));
	}
}
