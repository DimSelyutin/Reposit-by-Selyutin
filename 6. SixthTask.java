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
            }
            if(numbers[0] > numbers[1] & numbers[0] > numbers[2]){
                System.out.println("Большее число: "+ numbers[0]);
            } else if(numbers[1]>numbers[2]) {
                System.out.println("Большее число: "+ numbers[1]);
            } else {
                System.out.println("Большее число: "+ numbers[2]);
            }
//////////////////////меньшее---------------------------------------
            double first = Math.min(numbers[0], numbers[1]);
            double second = Math.min(numbers[1], numbers[2]);
            if (first<second){
                System.out.println("Меньшее число: "+ first);
            } else {
                System.out.println("Меньшее число: "+ second);  
            }
        } catch (Exception e) {
            System.out.println("Проверьте введенные данные!");
        }
       
            
        
    }
}
