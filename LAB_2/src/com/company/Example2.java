package com.company;


import java.io.*;

/**
 * Created by fms1541b on 03.02.2016.
 */
public class Example2 {

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
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                System.out.print(8);
            }
            System.out.println(8);
        }





    }





}
