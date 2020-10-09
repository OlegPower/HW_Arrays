package com.company;
//6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("How many numbers do you wont to enter in Array?");
        Scanner scanner = new Scanner(System.in);
        int numbersAmountInArray = scanner.nextInt();
        int usersArray[] = new int[numbersAmountInArray];
        int requiredNumber = 0;
        for (int i = 0; i < numbersAmountInArray; i++) {
            System.out.println("Please enter some numbers");
            int userAnswerArrayNumbers = new Scanner(System.in).nextInt();
            usersArray[i] = userAnswerArrayNumbers;
        }

        for (int i = 0; i < usersArray.length; i++) {
            String value = "";
            int[] newArray = Integer.toString(usersArray[i]).chars().map(c -> c - '0').toArray();

            Arrays.sort(newArray);
            for (int p = 0; p < newArray.length; p++) {
                value += newArray[p];
            }

            if(Integer.parseInt(value) == usersArray[i]) {
                requiredNumber = usersArray[i];
                break;
            }
        }
        System.out.println(requiredNumber);
    }
}