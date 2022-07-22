package by.epam.tr.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class First {
    public static void main(String[] args) throws IOException {
    	while(true) {
        System.out.println("Введите 4-х значное число:");
        Scanner scaner = new Scanner(System.in);
        String number = scaner.nextLine();
        
        try {
            if (number.length() != 4) {
                System.out.println("Введенное число должно быть 4-х значным!");
            } else {
                int _firstValue;
                int _secondValue;

                String[] numberSplit = number.split(""); // массив значений
                int[] lol = new int[numberSplit.length];
                for (int i = 0; i < numberSplit.length; i++) {
                    lol[i] = Integer.parseInt(numberSplit[i].trim()); // должно быть число из массива
                }

                _firstValue = lol[0] + lol[1];
                System.out.println("Сумма первых двух чисел:"+_firstValue);

                _secondValue = lol[lol.length - 1] + lol[lol.length - 2];
                System.out.println("Сумма последних двух чисел:"+_secondValue);
            }
            
        } catch (Exception e) {
            System.out.println("Возможно вы ввели не числа! Попробуйте еще раз.");
        }
    	}
    }

} 