package by.epam.tr.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Second{
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        try {
            double f;
            double[] numbers = new double[3];
            for (int i = 0; i < numbers.length; i++) {
                if(i == 0){
                    System.out.println("Введите начальную координату отрезка: ");
                    numbers[0] = scaner.nextDouble();
                } else if (i == 1){
                    System.out.println("Введите конечную координату отрезка: ");
                    numbers[1] = scaner.nextDouble();
                } else if (i == 2){
                    System.out.println("Длинну шага: ");
                    numbers[2] = scaner.nextDouble();
            }
        }
        System.out.println("Значение аргумента \t| Значение функции");
        System.out.println("---------------------------------------------");

        do {
            // f = Math.pow((Math.sin(numbers[0])), 2) - Math.cos(2*numbers[0]);
            f = ((1 - Math.cos(2 * numbers[0]))/2) - Math.cos(2*numbers[0]);
            System.out.print("\t"+numbers[0]+"\t\t|");
            System.out.printf("\t%.2f",f);
            System.out.println("\n---------------------------------------------");
            numbers[0] = numbers[0] + numbers[2];
        } while (numbers[0]<=numbers[1]);
        
        } catch (Exception e) {
            System.out.println("Проверьте введенные данные!");
        }
       
            
        
    }
}
