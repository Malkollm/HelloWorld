/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
   * 03.02.16
   * Парадова Юлия;
   * Находим минимальное из двух чисел
 */
public class gngyc4 {
    public static void main (String[] args){
          BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      
      String i,n;
      int s1=0,v1=0;
        
        try {
            i = in.readLine(); //читаем строку с клавиатуры
            s1 = Integer.parseInt(i); //преобразовываем строку в число.
        } catch (IOException ex) {
            Logger.getLogger(gngyc4.class.getName()).log(Level.SEVERE, null, ex);
        }        

        try {
            n = in.readLine(); //читаем строку с клавиатуры
            v1 = Integer.parseInt(n); //преобразовываем строку в число.
        } catch (IOException ex) {
            Logger.getLogger(gngyc4.class.getName()).log(Level.SEVERE, null, ex);
        }    
        if (s1<v1) 
            System.out.println("min: " + s1);        
         else 
            System.out.println("min: " + v1);
    }     
}
