package com.company;

//9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.


import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("Please enter number which will define size of array");
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[][] Array = new int[sizeOfArray][sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println();
            for (int j = 0; j < sizeOfArray; j++) {
                Array[i][j] = generateNumber(sizeOfArray-sizeOfArray*2, sizeOfArray);
                System.out.print(Array[i][j] +  "  ");
            }
        }
        //9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
        System.out.println();
        System.out.println("********************************");
        for (int i = Array.length - 1; i >= 0; i--) {
            Arrays.sort(Array[i]);
            System.out.println(Arrays.toString(Array[i]));
        }
    }
    public static int generateNumber(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
