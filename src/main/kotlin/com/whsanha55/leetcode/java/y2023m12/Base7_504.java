package com.whsanha55.leetcode.java.y2023m12;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * <a href="https://leetcode.com/problems/base-7/description/">Base7_504</a>
 */
public class Base7_504 {

    public String convertToBase7(int num) {

        if (num < 0) {
            return "-" + convertToBase7(-num);
        } else if (num < 7) {
            return String.valueOf(num);
        } else {
            return convertToBase7(num / 7) + convertToBase7(num % 7);
        }

    }

    public String convertToBase7BigInteger(int num) {

        var bi = new BigInteger(String.valueOf(num));
        return bi.toString(7);
    }

    public String convertToBase7Brutal(int num) {
        var list = new ArrayList<String>();

        var prefix = "";
        if (num < 0) {
            prefix += "-";
            num = -num;
        }
        while (true) {
            if (num < 7) {
                list.add(0, String.valueOf(num));
                break;
            }
            list.add(0, String.valueOf(num % 7));
            num = num / 7;

        }
        return prefix + String.join("", list);

    }

    public static void main(String[] args) {
        var main = new Base7_504();
        System.out.println(main.convertToBase7(100));
        System.out.println(main.convertToBase7(-7));
        System.out.println(main.convertToBase7(15));
    }
}
