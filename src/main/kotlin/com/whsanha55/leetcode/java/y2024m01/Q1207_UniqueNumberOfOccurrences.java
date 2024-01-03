package com.whsanha55.leetcode.java.y2024m01;

import java.util.HashMap;
import java.util.HashSet;

/**
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences">leetcode</a>
 */
public class Q1207_UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        var map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        var values = map.values();
        return new HashSet<>(values)
            .size() == values.size();
    }

    public static void main(String[] args) {
        var main = new Q1207_UniqueNumberOfOccurrences();
        var result = main.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
        System.out.println("result = " + result);

    }
}
