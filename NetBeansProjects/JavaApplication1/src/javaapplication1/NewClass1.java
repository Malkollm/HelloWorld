/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
   * 03.02.16
   * Парадова Юлия;
   * Рисуем прямоугольный треугольник из 8;
 */
public class NewClass1 {
     public static void main(String[] args) {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String r;
        int m=0;
             
        try {
            r = in.readLine();//читаем строку с клавиатуры
            m = Integer.parseInt(r); //преобразовываем строку в число.
            } 
        catch (IOException e) {
                System.out.print("Ошибка");
            }
    
    for(int i=1;i<m;i++){
        for(int d=1;d<=i;d++){
            System.out.print(8);
        }
            System.out.println("");
    }
    }
    }
    

