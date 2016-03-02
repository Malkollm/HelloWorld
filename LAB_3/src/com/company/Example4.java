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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //TODO
                arr[i][j] = (int) (Math.random() * 109 + 10); //[10;99]
            }
        }
        //Вывод
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

