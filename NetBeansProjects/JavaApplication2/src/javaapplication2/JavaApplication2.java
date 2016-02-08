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
public class JavaApplication2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String m,n;
        int m1=0,n1=0;
        
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
   
        try {
            m = bufferedReader.readLine(); //читаем строку с клавиатуры
            m1 = Integer.parseInt(m); //преобразовываем строку в число.
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            n = bufferedReader.readLine(); //читаем строку с клавиатуры
            n1 = Integer.parseInt(n); //преобразовываем строку в число.
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
    


    for(int i=0;i<m1;i++){
    for(int d=1;d<n1;d++){
    System.out.print(8);
    }
    System.out.println(8);
    }
    }
    }
    

