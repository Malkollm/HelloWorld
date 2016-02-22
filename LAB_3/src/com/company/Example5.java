package com.company;

/**
 * 22.02.16
 * Фаткуллин Марсель
 * Двумерный массив из 7 строк и 4 столбцов [-5;5]
 * Вывести индекс строки с наибольшим по модулю произведением элементов
 */
public class Example5 {
    public static void main(String[] args) {
        int count = 0;
        int n = 0;
        int[][] arr = new int[7][4];
        System.out.println("Массив");
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            int count1 = 1;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 11) - 5;
                count1 *= arr[i][j];
                System.out.print(arr[i][j] + " ");
            }

            if (Math.abs(count1) > count) {
                count = count1;
                n = i;
            }
        }
        System.out.println("");
        System.out.println("Строка: " + n);
    }
}

