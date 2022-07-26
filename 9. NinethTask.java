package by.epam.tr.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

public class Second{
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        try {
            System.out.println("Введите количество значений массива: ");
            int long1 = scaner.nextInt();
            //первый массив а
            int[] a = new int[long1];
                for (int i = 0; i < a.length; i++) {
                    a[i] = (int)(Math.floor(Math.random() * 100));
                    System.out.println("Значение №"+(i+1) +" - "+a[i]);
                }
            
            //второй массив b
            System.out.println("Введите количество значений массива: ");
            System.out.println("Значения второго массива: ");
            int long2 = scaner.nextInt();      
            int[] b = new int[long2];
            for (int i = 0; i < b.length; i++) {
                b[i] = (int)(Math.floor(Math.random() * 100));
                    System.out.println("Значение №"+(i+1) +" - "+b[i]);
            }


            int c[] = new int[long1+long2];
            System.out.println("Массивы успешно созданы! \n Введите после какого элемента обьеденить массивы от 1 до "+c.length+":");
            int choice = scaner.nextInt();           

            System.arraycopy(a, 0, c, 0, choice);//1- масив 2- с какой позиции 3- в какой масив 4- с какой поз 5 - сколько элем
            System.arraycopy(b, 0, c, choice, b.length);
            System.arraycopy(a, choice, c, (b.length+choice), (a.length-choice));

            for (int i : c) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("Проверьте введенные данные!"+e);
        }
 
    }
}
