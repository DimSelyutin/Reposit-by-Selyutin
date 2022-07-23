package by.epam.tr.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Second{
    public static void main(String[] args){
        boolean done = true;
        Scanner scaner = new Scanner(System.in);

        while (done) {
            try {
                System.out.println("Укажите координаты: ");
                System.out.print("X:");
                int x = scaner.nextInt();
                System.out.print("Y:");
                int y = scaner.nextInt();
                    if((x>=-2 & x<=2)&(y>=0 & y<=4) || ((x>=-4 & x<=4)&(y>=-3 & y<=0))){
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                System.out.println("Enter 0 to continue or other for exit...");    
                try {
                    int doneInput = scaner.nextInt();
                    if (doneInput == 0) {
                        done = true;
                    } else {
                        done = false;
                        System.out.println("Programm is ended...");
                    }
                } catch (Exception e) {
                    done = false;
                        System.out.println("Programm is ended...");
                }           
                    
                               

            } catch (Exception e) {
                System.out.println("Ошибка ввода, попробуйте еще раз! ");
                done = false;
            }
        } 
    }
}
