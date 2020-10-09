package com.company;

//8.Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

//1) Узнать у юзера колличество эллементов К из которых будут состоять матрица;
//2) Нужно прочитать ответ юзера
//3) Нужно расчитать размер матрицы
//4) Создать матрицу
//5) Заполнить матрицу этими числами
//6) Вывести матрицу

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        int counter = 1;
        System.out.println("Please enter number of elements in array for every row");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int countColumn = (int)Math.round(Math.sqrt(Math.abs(k)));
        int countRow = k % countColumn == 0 ? countColumn : countColumn + 1;

        int Array[][] = new int[countColumn][countRow];


        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if(counter <= k ){
                    Array[i][j] = counter;
                    counter++;
                    System.out.println(Arrays.toString(Array[i]));
                }
            }
        }
    }
}
