package com.company;

/**
 * 10.02.16
 * Фаткуллин Марсель
 * Массив четных чисел [0;20] по горизонтали и вертикали
 */
public class Main {
    public static void main(String[] args) {
        //Инициализация массива arr размерностью 22
        int[] arr = new int[10];

        //По горизонтали
        for (int i=2;i<=20;i+=2){
            System.out.print(i + " ");
        }
        //По вертикали
        for (int j=2;j<=20;j+=2){
            System.out.println("");
            System.out.print(j);
        }

    }
}
