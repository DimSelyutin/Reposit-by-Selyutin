package by.epam.tr.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Second{
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        try {
            System.out.println("Введите три действительных числа: ");
            double[] numbers = new double[3];
            for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scaner.nextDouble();
            if (numbers[i]>0) {
                numbers[i] = Math.pow(numbers[i], 2);
            } 
            if (numbers[i]<0) {
                numbers[i] = Math.pow(numbers[i], 4);
                }
            }

            for (double step : numbers) {
                System.out.println(step);
            }
        } catch (Exception e) {
            System.out.println("Проверьте введенные данные!");
        }
       
            
        
    }
}
