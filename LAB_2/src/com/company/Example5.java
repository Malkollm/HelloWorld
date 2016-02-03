package com.company;

import java.io.*;

/**
 * Created by fms1541b on 03.02.2016.
 */
public class Example5 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = "", name2 = "";

        try {
            name1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException e) {
            System.out.println("Ошибка");

        }
        try {
            name2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        if ((!name1.matches("^\\D*$")) || (!name2.matches("^\\D*$"))) {
            System.out.println("В имени есть числа");
        } else {
            if (name1.equalsIgnoreCase(name2)) {
                System.out.println("Имена идентичны");
            } else {
                if (name1.length() == name2.length()) {
                    System.out.println("Длины имен равны");
                } else {
                    if (name1.length() != name2.length()){
                        System.out.println("Имена разные");
                        System.out.println("Длина имен разная");
                    }
                }
            }
        }
    }
}
