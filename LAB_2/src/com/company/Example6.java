package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * Created by fms1541b on 03.02.2016.
 */
public class Example6 {

    public static int min(int a, int b){
        return a < b ? a : b;
    }

    public static int min4(int a, int b, int c, int d) {
        return min(a, min(b, min(c, d)));
    }

    public static void main(String[] args) {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String w,x,y,z;
        int w1,x1,y1,z1;

            try {
                w = bufferedReader.readLine(); //читаем строку с клавиатуры
                w1 = Integer.parseInt(w); //преобразовываем строку в число.
            } catch (IOException e) {
                System.out.println("Ошибка");;
            }
            try {
                x = bufferedReader.readLine();
                x1 = Integer.parseInt(x); //преобразовываем строку в число.
            } catch (IOException e) {
                System.out.println("Ошибка");;
            }
            try {
                y = bufferedReader.readLine();
                y1 = Integer.parseInt(y); //преобразовываем строку в число.
            } catch (IOException e) {
                System.out.println("Ошибка");;
            }
            try {
                z = bufferedReader.readLine();
                z1 = Integer.parseInt(z); //преобразовываем строку в число.
            } catch (IOException e) {
                System.out.println("Ошибка");;
            }
        System.out.println(min(w1,x1,y1,z1));






    }
}
