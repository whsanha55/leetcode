package com.whsanha55.leetcode.java.y2023m12;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/relative-ranks/description/">leetcode</a>
 */
public class Q506_RelativeRanks {

    public String[] findRelativeRanks(int[] score) {

        var map = new HashMap<Integer, Integer>();

        var length = score.length;
        for (int i = 0; i < length; i++) {
            map.put(score[i], i);
        }

        var strings = new String[length];
        Arrays.sort(score);
        for (int i = 0; i < length; i++) {
            strings[map.get(score[i])] = output(length - i);
        }

        return strings;
    }

    public String output(int i) {
        return switch (i) {
            case 1 -> "Gold Medal";
            case 2 -> "Silver Medal";
            case 3 -> "Bronze Medal";
            default -> String.valueOf(i);
        };
    }

    public static void main(String[] args) {
        var main = new Q506_RelativeRanks();
        System.out.println(Arrays.toString(main.findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
    }
}
