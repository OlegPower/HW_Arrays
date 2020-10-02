package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("How many number do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();
        String[] numbers = new String[numbersCount];
        for (int i = 0; i < numbersCount; i++) {
            System.out.println("Please enter a number");
            String userAnswer = new Scanner(System.in).nextLine();
            numbers[i] = userAnswer;
        }
        for (int i1 = numbers.length - 1; i1 >= 0; i1--) {
            for (int j = 0; j < i1; j++) {
                if (numbers[j].length() > numbers[j + 1].length()) {
                    String temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        for (int i1 = numbers.length - 1; i1 >= 0; i1--) {
            for (int j = 0; j < i1; j++) {
                if (numbers[j].length() < numbers[j + 1].length()) {
                    String temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
