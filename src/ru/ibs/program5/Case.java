package ru.ibs.program5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        //Ввод чисел с клавиатуры
        System.out.print("Первое число =");
        String sx = reader.readLine();
        double x = Integer.parseInt(sx);

        System.out.print("Второе число =");
        String sy = reader.readLine();
        double y = Integer.parseInt(sy);

        System.out.println("Введите арифметическую операцию: + - / *");
        String operation = reader.readLine();

        double result = 0;

        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Ошибка! Деление на 0");
                    break;
                }
                result = x / y;
                break;
            case "*":
                result = x * y;
                break;
        }

        System.out.println(x+operation+y+"="+result);


    }
}
