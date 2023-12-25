package com.whsanha55.leetcode.java.y2023m12;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <a href="https://leetcode.com/problems/last-stone-weight/description/">lastStoneWeight</a>
 */
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {

        var list = new ArrayList<Integer>();
        for (int stone : stones) {
            list.add(stone);
        }
        Collections.sort(list);

        while (list.size() > 1) {

            var first = list.remove(list.size() - 1);
            var second = list.remove(list.size() - 1);
            if (first != second) {
                list.add(Math.abs(first - second));
            }
            Collections.sort(list);

        }

        if (list.size() == 1) {
            return list.get(0);
        } else {
            return 0;

        }

    }

    public static void main(String[] args) {
        var lastStoneWeight = new LastStoneWeight();
        System.out.println(lastStoneWeight.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
