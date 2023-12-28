package com.whsanha55.leetcode.java.y2023m12;

/**
 * <a href="https://leetcode.com/problems/distance-between-bus-stops/">leetcode</a>
 */
public class Q1184_DistanceBetweenBusStops {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        var clockwise = 0;
        var counterclockwise = 0;

        int a = Math.min(start,destination);
        int b=  Math.max(start,destination);
        for (int i = 0; i < distance.length; i++) {
            if (a <= i &&  b > i) {
                clockwise += distance[i];
            } else {
                counterclockwise += distance[i];
            }
        }

        return Math.min(clockwise, counterclockwise);
    }

    public static void main(String[] args) {
        var main = new Q1184_DistanceBetweenBusStops();
        var result = main.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1);
        System.out.println("result = " + result);

    }
}
