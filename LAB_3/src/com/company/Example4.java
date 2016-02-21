package com.company;

import java.util.Random;

/**
 * 21.02.16
 * Фаткуллин Марсель
 * Двумерный массив из 8 строк и 5 столбцов [10;99]
 */
public class Example4 {
    public static void main(String[] args) {
        int[][] arr = new int[8][5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt()*90+10;
                System.out.println(arr[i][j]);
            }
        }
    }
}
