package com.company;

import java.io.*;

/**
 * Created by fms1541b on 03.02.2016.
 */
public class Example3 {

    public static void main (String[] args){
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String m;
        int m1=0;

        try {
            m = bufferedReader.readLine(); //читаем строку с клавиатуры
            m1 = Integer.parseInt(m); //преобразовываем строку в число.
        } catch (IOException e) {
            System.out.println("Ошибка");;

        }


        for(int i=1; i<m1; i++){
            for(int j=1; j<=i; j++){
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
