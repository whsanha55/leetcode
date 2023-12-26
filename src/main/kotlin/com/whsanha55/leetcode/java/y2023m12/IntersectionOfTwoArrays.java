package com.whsanha55.leetcode.java.y2023m12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">IntersectionOfTwoArrays</a>
 */
public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        var list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            switch (Integer.compare(nums1[i], nums2[j])) {
                case -1 -> i++;
                case 0 -> {
                    list.add(nums1[i]);
                    i++;
                    j++;
                }
                case 1 -> j++;
            }
        }

        int[] array = new int[list.size()];
        int temp = 0;
        for (Integer integer : list) {
            array[temp++] = integer;
        }
        return array;

    }

    public int[] intersectUsingMap(int[] nums1, int[] nums2) {
        var map = new HashMap<Integer, Integer>();
        for (int i : nums1) {
            var n = map.getOrDefault(i, 0);
            map.put(i, n + 1);
        }

        var list = new ArrayList<Integer>();
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] array = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            array[i++] = integer;
        }
        return array;
    }

    public static void main(String[] args) {
        var lastStoneWeight = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(lastStoneWeight.intersect(new int[]{1, 2, 2, 1}, new int[]{2})));
//        System.out.println(Arrays.toString(lastStoneWeight.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
