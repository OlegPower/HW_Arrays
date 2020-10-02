package com.company;

//5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.


import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int countOfEvenAndOddNumbers = 0;
        int [] evenNumbers = {};

        System.out.println("Please enter numbers");

        Scanner readUserAnswer = new Scanner(System.in);
        int numbersCount = readUserAnswer.nextInt();
        int[] numbers = new int[numbersCount];

        for (int index = 0; index < numbersCount; index++) {
            System.out.println("Please enter a number");
            int userAnswer = new Scanner(System.in).nextInt();
            numbers[index] = userAnswer;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers = Arrays.copyOf(evenNumbers, evenNumbers.length + 1);
                evenNumbers[evenNumbers.length - 1] = numbers[i];
            }
        }

        for (int i = 0; i < evenNumbers.length; i++) {
            int even = 0;
            int odd = 0;
            String str = Integer.toString(evenNumbers[i]);

            for (int j = 0; j < str.length(); j++) {

                int charAt = Character.getNumericValue(str.charAt(j));

                if (charAt % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if (even == odd) {
                countOfEvenAndOddNumbers++;
            }
        }
       System.out.println(countOfEvenAndOddNumbers);
    }
}

