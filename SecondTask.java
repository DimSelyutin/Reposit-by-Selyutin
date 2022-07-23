package by.epam.tr.main;

import java.util.Scanner;

public class Second{
    public static void main(String[] args){
        try {
            Scanner scaner = new Scanner(System.in);
            System.out.print("Введите первое число - а: ");
            double a = scaner.nextDouble();
            System.out.print("Введите второе число - b: ");
            double b = scaner.nextDouble();
            System.out.print("Введите nhtnmt число - c: ");
            double c = scaner.nextDouble();
            double formula;

            formula = ((b + Math.sqrt(  (Math.pow(b, 2) + 4*a*c)  )) / 2*a) - Math.pow(a, 3)*c + Math.pow(b, -2);
            System.out.printf("%.2f" ,formula);
        } catch (Exception e) {
            System.out.println("Возможно вы ввели не числа! Попробуйте еще раз.");
        }
        
    }
}
