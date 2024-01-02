package com.whsanha55.leetcode.java.y2024m01;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/maximum-number-of-balloons/">leetcode</a>
 */
public class Q1189_MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26]; //count all letters
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }
        int min = chars[1];//for b
        min = Math.min(min, chars[0]);//for a
        min = Math.min(min, chars[11] / 2);// for l /2
        min = Math.min(min, chars[14] / 2);//similarly for o/2
        min = Math.min(min, chars[13]);//for n
        return min;
    }
    public int maxNumberOfBalloonsUsingMap(String text) {
        var map = new HashMap<String, Integer>();
        "balon".chars().forEach(c -> {
            map.put(Character.toString(c), 0);
        });

        text.chars().forEach(value -> {

            var s = Character.toString(value);
            switch (s) {
                case "b","a","n" -> map.put(s, map.getOrDefault(s, 0) + 2);
                case "o","l" -> map.put(s, map.getOrDefault(s, 0) + 1);
            }
        });

        return map.values().stream().min(Double::compare).orElse(0) / 2;

    }

    public static void main(String[] args) {
        var main = new Q1189_MaximumNumberOfBalloons();
        var result = main.maxNumberOfBalloons("lloo");
        System.out.println("result = " + result);

    }
}
