/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fms1541b
 */
public class hgfamj {
         public static void main(String[] args) {
        String r;
        int m=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

             
        try {
            r = in.readLine(); //читаем строку с клавиатуры
            m = Integer.parseInt(r); //преобразовываем строку в число.
            }
        catch (IOException e) {
                System.out.print("Ошибка");
            }
    
    for(int i=1;i<=m;i++){
    for(int d=1;d<=i;d++){
    System.out.print(8);
    }
    System.out.println("");
    }
    }
    }
    

