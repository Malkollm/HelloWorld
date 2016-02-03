package com.company;

import java.io.*;

/**
 * Created by fms1541b on 03.02.2016.
 */
public class Example4 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String m,n;
        int m1=0, n1=0;

        try {
            m = bufferedReader.readLine(); //читаем строку с клавиатуры
            m1 = Integer.parseInt(m); //преобразовываем строку в число.
        } catch (IOException e) {
            System.out.println("Ошибка");;

        }
        try {
            n = bufferedReader.readLine(); //читаем строку с клавиатуры
            n1= Integer.parseInt(n); //преобразовываем строку в число.
        } catch (IOException e) {
            System.out.println("Ошибка");;
        }

        if (m1<n1){
            System.out.println("min = " + m1);
        } else {
            System.out.println("min = " + n1);
        }
    }
}
