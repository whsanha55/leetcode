package com.whsanha55.leetcode.java.y2023m12;

import java.util.ArrayList;

/**
 * <a href="https://leetcode.com/problems/perfect-number/">leetcode</a>
 */
public class Q507_PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        var list = new ArrayList<Integer>();
        int last = num;
        for (int i = 1; i < num / 2 && i < last; i++) {
            if (num % i != 0) {
                continue;
            }

            list.add(i);
            last = num / i;
            if (i != last && last != num) {
                list.add(last);
            }
        }

        return list.stream().reduce(0, Integer::sum) == num;
    }

    public static void main(String[] args) {
        var main = new Q507_PerfectNumber();
        System.out.println(main.checkPerfectNumber(28));
        System.out.println(main.checkPerfectNumber(16));
    }
}
