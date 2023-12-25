package com.whsanha55.leetcode.java.y2023m12;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/squares-of-a-sorted-array/description/">leetCode url</a>
 */
public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {

        int[] array = new int[nums.length];

        int start = 0;
        int last = nums.length - 1;
        while (start <= last) {
            if (Math.abs(nums[start]) >= Math.abs(nums[last])) {
                array[last-start] = nums[start] * nums[start];
                start++;
            } else {
                array[last-start] = nums[last] * nums[last];
                last--;
            }
        }
        return array;
    }

    public int[] sortedSquaresBrutal(int[] nums) {

        return Arrays.stream(nums).map(i -> i * i).sorted().toArray();
    }

    public static void main(String[] args) {
        var main = new SquaresSortedArray();

//        System.out.println("main.sortedSquares " + Arrays.toString(main.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println("main.sortedSquares " + Arrays.toString(main.sortedSquares(new int[]{-7,-3,2,3,11})));


    }
}
