package by.tc.app.main;

import java.util.Scanner;
/*Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а 8 за
три операции и а 10 за четыре операции. */

public class Task01{
    public static void main(String[] args){
        
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите чило, которое нужно возвести в 8 степень:");
        int a = scaner.nextInt();
        int b = 1;
        a = a*a;    //1 
        b = a*a;    //2
        b = b*b;    //3
        System.out.println("a^8 = "+ b); 
        ////////////////////////////////^10      
        System.out.print("Введите чило, которое нужно возвести в 10 степень:");
        int c = scaner.nextInt();
        c = c*c;    //1
        b = c*c;    //2
        b = b*b;    //3
        b = b*c;    //4

        
        
        System.out.println("a^10 = "+ b);       


    }
}
