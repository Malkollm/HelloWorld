/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fms1541b
 */
public class gngyc4 {
   String i,n;
   int i1=0,n1=0;
        
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
   
        try {
        try {
            i = bufferedReader.readLine(); //читаем строку с клавиатуры
            i1 = Integer.parseInt(i); //преобразовываем строку в число.
        } catch (IOException ex) {
            Logger.getLogger(gngyc4.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
            catch (IOException ex) {
            Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
        try {
            n = bufferedReader.readLine(); //читаем строку с клавиатуры
            n1 = Integer.parseInt(n); //преобразовываем строку в число.
        } catch (IOException ex) {
            Logger.getLogger(gngyc4.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
}
     if(m<n){
     else
     System.out.println("Минимальное " +m);
     if(m>n){
     else
     System.out.print("Минимальное "+n);
}
    }
}
