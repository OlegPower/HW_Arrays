package com.company;

//4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int numOfSymbols[] = {};
        int numbersAmount = 0;
        String result;
        do {
            System.out.println("Please define how many numbers do you want to enter");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                numbersAmount = scanner.nextInt();
                break;
            } else {
                System.out.println("Input must be a number");
            }
        } while (true);
        String array[] = new String[numbersAmount];
        for (int i = 0; i < array.length; i++) {
            String userAnswer;
            do {
                System.out.println("Please enter a number");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextLine();
                    array[i] = userAnswer;
                    break;
                } else {
                    System.out.println("Input must be a number");
                }
            } while (true);
            numOfSymbols = Arrays.copyOf(numOfSymbols, numOfSymbols.length + 1);
            numOfSymbols[numOfSymbols.length - 1] = countUniqueCharacters(array[i]);
        }
        result = getMin(numOfSymbols, array);
        System.out.println("Number with the smallest amount of different characters: " + result);
    }

    public static String getMin(int[] inputArray, String[] resultArr) {
        int minValue = inputArray[0];
        int index = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
                index = i;
            }
        }
        return resultArr[index];
    }

    public static int countUniqueCharacters(String input) {
        String buffer = "";
        for (int i = 0; i < input.length(); i++) {
            if (!buffer.contains(String.valueOf(input.charAt(i)))) {
                buffer += input.charAt(i);
            }
        }
        return buffer.length();
    }
}


