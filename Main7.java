package com.company;

//7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("How many numbers do you wont to enter in Array?");
        Scanner scanner = new Scanner(System.in);
        int numbersAmountInArray = scanner.nextInt();
        int usersArray[] = new int[numbersAmountInArray];
        int result = 0;
        for (int i = 0; i < numbersAmountInArray; i++) {
            System.out.println("Please enter some numbers");
            int userAnswerArrayNumbers = new Scanner(System.in).nextInt();
            usersArray[i] = userAnswerArrayNumbers;
        }

        for (int i = 0; i < usersArray.length; i++) {
            String[] arraysOfStringWithOneNumber = Integer.toString(usersArray[i]).split("");
            Set<String> strSet = Arrays.stream(arraysOfStringWithOneNumber).collect(Collectors.toSet());
            System.out.println(strSet);

            if(strSet.size() == Integer.toString(usersArray[i]).length()) {
                result = usersArray[i];
                break;
            }
        }
        System.out.println(result);
    }
}
