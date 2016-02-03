package com.company;

/*
Фаткуллин Марсель;
Вывод четного числа;
 */
public class Main {

    public static void main(String[] args) {
        try {
            int i = 2;
            while (i < 100) {
                i += 2;
                System.out.print(i + " ");
            }
        }
        catch(Exception e){
            System.out.println("Ошибка");
        }
        }
    }
