package by.epam.tr.main;

import java.util.Scanner;

public class Second{
    public static void main(String[] args){
        try {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Для вычисоения площади и периметра прямоугольного треугольника.");
            System.out.println("Введите длинну первого катета:");
            double a = scaner.nextInt();
            System.out.println("Введите длинну второго катета:");
            double b = scaner.nextInt();

            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

            double perimetr = a+b+c;
            double square = (a*b)/2;
            String str = String.format("Периметр треугольника: %.1f", perimetr);
            System.out.println(str);
            String str2 = String.format("Площадь треугольника: %.1f", square);
            System.out.println(str2);


        } catch (Exception e) {
            System.out.println("Возможно вы ввели не числа! Попробуйте еще раз.");
        }
        
    }
}
