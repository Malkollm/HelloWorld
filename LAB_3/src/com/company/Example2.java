package com.company;

/**
 * 10.02.16
 * Фаткуллин Марсель
 * Массив нечетных чисел [1;99] прямой и обратный порядок
 */
public class Example2 {
    public static void main(String[] args) {
        //Инициализация массива arr размерностью 100
        int[] arr = new int[100];

        //В прямом порядке
        for (int i=1; i<arr.length; i+=2){
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        //Переход на новую строку
        System.out.println("\n");
        //В обратном порядке
        for (int j=arr.length-1; j>0; j-=2){
            System.out.print(arr[j] + " ");
        }
    }
}
