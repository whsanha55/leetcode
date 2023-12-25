package com.whsanha55.leetcode.java.y2023m12;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/largest-perimeter-triangle//">leetCode url</a>
 */
public class LargestPerimeterTriangle {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int i = nums.length - 1;
        while (true) {
            if (i - 2 < 0) {
                return 0;
            }
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
            i--;
        }
    }

    public static void main(String[] args) {
        var largestPerimeterTriangle = new LargestPerimeterTriangle();
        System.out.println(largestPerimeterTriangle.largestPerimeter(new int[]{2, 1, 2}));
        System.out.println(largestPerimeterTriangle.largestPerimeter(new int[]{1, 2, 1}));
        System.out.println(largestPerimeterTriangle.largestPerimeter(new int[]{3, 2, 3, 4}));
        System.out.println(largestPerimeterTriangle.largestPerimeter(new int[]{3, 6, 2, 3}));
    }
}
