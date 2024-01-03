package com.whsanha55.leetcode.java.y2024m01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/minimum-absolute-difference/">leetcode</a>
 */
public class Q1200_MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        var list = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            var key = arr[i + 1] - arr[i];
            if (min > key) {
                min = key;
                list.clear();
                list.add(List.of(arr[i], arr[i + 1]));
            } else if (min == key) {
                list.add(List.of(arr[i], arr[i + 1]));

            }
        }

        return list;
    }

    public static void main(String[] args) {
        var main = new Q1200_MinimumAbsoluteDifference();
        var result = main.minimumAbsDifference(new int[]{40, 11, 26, 27, -20});
        System.out.println("result = " + result);

    }
}
