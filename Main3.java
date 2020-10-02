package com.company;

import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[] myArray = {232, 8466352, 2312, 21312, 2322, 1234567890};
        int sum = 0;
        int[] loverThenAvarage = {};
        int[] upperThenAvarage = {};
        double avarageNumber = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + Integer.toString(myArray[i]).length();
        }
        avarageNumber = sum / myArray.length;
        for (int i = 0; i < myArray.length; i++) {
            if (avarageNumber < Integer.toString(myArray[i]).length()) {
                upperThenAvarage = Arrays.copyOf(upperThenAvarage, upperThenAvarage.length + 1);
                upperThenAvarage[upperThenAvarage.length - 1] = myArray[i];
            } else if (avarageNumber > Integer.toString(myArray[i]).length()) {
                loverThenAvarage = Arrays.copyOf(loverThenAvarage, loverThenAvarage.length + 1);
                loverThenAvarage[loverThenAvarage.length - 1] = myArray[i];
            }
        }
        System.out.println("upperThenAvarage: ");
        for (int i = 0; i < upperThenAvarage.length; i++) {
            String el = Integer.toString(upperThenAvarage[i]);
            System.out.println("Element: " + el + "; length: " + el.length());
        }
        System.out.println("loverThenAvarage");
        for (int i = 0; i < loverThenAvarage.length; i++) {
            String le = Integer.toString(loverThenAvarage[i]);
            System.out.println("Element: " + le + "; length: " + le.length());
        }
    }
}
