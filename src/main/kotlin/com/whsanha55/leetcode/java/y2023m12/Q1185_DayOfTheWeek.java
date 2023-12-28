package com.whsanha55.leetcode.java.y2023m12;

import java.time.LocalDate;

/**
 * <a href="https://leetcode.com/problems/day-of-the-week/description/">leetcode</a>
 */
public class Q1185_DayOfTheWeek {

    public String dayOfTheWeek(int day, int month, int year) {
        var strings = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return strings[LocalDate.of(year, month, day).getDayOfWeek().getValue() - 1];
    }

    public static void main(String[] args) {
        var main = new Q1185_DayOfTheWeek();
        var result = main.dayOfTheWeek(31, 8, 2019);
        System.out.println("result = " + result);

    }
}
