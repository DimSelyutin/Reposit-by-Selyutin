package by.epam.tr.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

public class Second{
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        try {
            System.out.println("Введите число N: ");
            int n = scaner.nextInt();
            if (n%2!=0) {
                System.out.println("Число должно быть четным!");
            } else {
                int[][] arr = new int[n][n];
                    for (int i = 0; i < n/2; i++) {               //строка
                        for (int j = 0; j < n; j++) {           //столбец
                            arr[i][j] = j+1;
                            System.out.print(" "+ arr[i][j] +"\t");
                        }
                        System.out.println();
                        for (int j = n-1; j >= 0; j--) {
                            arr[i][j] = j+1;
                            System.out.print(" "+ arr[i][j] +"\t");
                            

                        }
                        System.out.println();
                        
                    }
                }
        } catch (Exception e) {
            System.out.println("Проверьте введенные данные!");
        }
 
    }
}
