package com.company;

import java.util.Random;

/**
 * 10.02.16
 * Фаткуллин Марсель
 * Массив псевдослучайных целых чисел [0;9] и кол-во четных элементов
 */
public class Example3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        System.out.print("arr: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(9); //[0;9]
            System.out.print(arr[i] + " ");
            //TODO
            //Разобраться как найти четные элементы массива
            if (arr[i] Math.mod 2){
                System.out.println(arr[i]);
            }
        }
    }
}
