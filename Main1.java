package com.company;

import java.util.Scanner;

public class Main1 {

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
        String min = null;
        String max = "";
        for (int i = 0; i < numbersCount; i++) {
            String currentNumber = numbers[i];
            int currentNumberLength = currentNumber.length();
            if (min==null || currentNumberLength < min.length()){
                min = currentNumber;
            }
            int maxNumberLength = max.length();
            if (currentNumberLength > maxNumberLength){
                max = currentNumber;
            }
//            minNumber = {} minNumberLength = {}
        }
        System.out.println("Min number : " + min + " minNumberLength : " + min.length());
        System.out.println("Max number : " + max + " maxNumberLength : " + max.length());
    }
}
