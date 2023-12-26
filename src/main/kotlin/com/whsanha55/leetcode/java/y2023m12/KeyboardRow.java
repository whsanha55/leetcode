package com.whsanha55.leetcode.java.y2023m12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">IntersectionOfTwoArrays</a>
 */
public class KeyboardRow {

    public String[] findWords(String[] words) {
        int[] rows = new int[26];

        for (char c : "qwertyuiop".toCharArray()) {
            rows[c - 'a'] = 1;
        }

        for (char c : "asdfghjkl".toCharArray()) {
            rows[c - 'a'] = 2;
        }

        for (char c : "zxcvbnm".toCharArray()) {
            rows[c - 'a'] = 3;
        }

        List<String> list = new ArrayList<>();
        for (String word : words) {
            var str = word.toLowerCase();
            var i = 0;
            boolean flag = true;
            for (char c : str.toCharArray()) {
                var c2 = rows[c - 'a'];
                if (i == 0) {
                    i = c2;
                } else {
                    if (i != c2) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        var main = new KeyboardRow();
        System.out.println(Arrays.toString(main.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
}
