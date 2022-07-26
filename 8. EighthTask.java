package by.epam.tr.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Second{
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        try {
            System.out.println("Введите количество значений массива: ");
            int n = scaner.nextInt();
            int[] a = new int[n];

                for (int i = 0; i < a.length; i++) {
                    System.out.println("Введите значение №"+(i+1));
                    a[i] = scaner.nextInt();
                }

            System.out.println("Массив успешно создан! Введите число K: ");
            int k = scaner.nextInt();
            int count = 0;

                for(int j = 0; j<a.length;j++){
                    if (a[j]%k==0) {
                        count += a[j]; 
                    }
                }

            System.out.println("Сумма кратных числу K:" + count);
            

        } catch (Exception e) {
            System.out.println("Проверьте введенные данные!");
        }
 
    }
}
