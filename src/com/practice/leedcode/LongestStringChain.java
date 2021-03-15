package com.practice.leedcode;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Given a list of words, each word consists of English lowercase letters.

Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1 to make it equal to word2.  For example, "abc" is a predecessor of "abac".

A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor of word_2, word_2 is a predecessor of word_3, and so on.

Return the longest possible length of a word chain with words chosen from the given list of words.

 * */
public class LongestStringChain {

	
	public static int solution (final String[] words) {
		
		int result = 0;
		HashMap<String, Integer> longestStringChainStoreHashMap = new HashMap<>();
		Arrays.sort(words, (word1, word2) -> word1.length() - word2.length());
		
		for (String word : words) {
			int bestForCurrentWord = 0;
			for (int index =0; index < word.length(); index ++) {
				//word.substring(word.length()) will return empty
				String previouseWordString = word.substring(0,index) + word.substring(index+1);
				bestForCurrentWord = Math.max(bestForCurrentWord, longestStringChainStoreHashMap.getOrDefault(previouseWordString, 0)+1);
			}
			longestStringChainStoreHashMap.put(word, bestForCurrentWord);
			result = Math.max(result, bestForCurrentWord);
		}
		
		
		return result;
		
	}
}
