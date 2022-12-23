package com.safonovivv;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Простые математические операции.
        int a = 1;
        double b = 3.12d;
        int c = (int) (a + b);
        System.out.println(c);
        int d = (int) (a - b);
        System.out.println(d);
        int f = (int) (a / b);
        System.out.println(f);
        int e = (int) (a * b);
        System.out.println(e);
        double sum = a + b + c + d + f + e;
        System.out.println("Сумма всех чисел: "+ sum);

        //Работаем с массивом
        int i;
        Scanner input = new Scanner(System.in); // надо уточнить зачем нужен сканер
        System.out.println("задайте длинну массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите целочисленые значения массива");
        for (i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));

        // Массив со stackOverflow
        int p;
        int[] overflowArray = new int[5];
        for (p = 0; p <= 5; p++) {
            overflowArray[p] = (int) Math.round((Math.random() * 100) - 50);
        }
        System.out.println(Arrays.toString(overflowArray));
    }
}