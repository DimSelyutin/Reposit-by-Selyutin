package by.epam.tr.main;

import java.util.Scanner;
//         Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
// false — в противном случае:
/* 1. Целое число N является четным двузначным числом.
2.  Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
3.  Сумма цифр данного трехзначного числа N является четным числом.
4.  Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
5.  Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
6.  Треугольник со сторонами а,b,с является равнобедренным.
7.  Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
8.  Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
9.  График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п). */
public class Task02{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания, которое хоитите проверить.");
        System.out.print("Задание №: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();

            System.out.println("Введите целое число!");
            System.out.print("- ");
        } int choice = scanner.nextInt();
        int a;
        int len;
        switch (choice) {
            case 1:
                System.out.println("Введите число для сравнения:");

                a = scanner.nextInt();
                len = String.valueOf(a).length();
                    if(len!=2){
                        System.out.println("false");
                    } else {
                        System.out.println("true");
                    }
                break;
            case 2:
                System.out.println("Введите четырехзначное число:");
                a = scanner.nextInt();
                len = String.valueOf(a).length();
                if (len!=4) {
                    System.out.println("Нужно четырехзначное чило!");
                } else {
                    if ((a/100%10+a/1000%10) == (a/10%10+a%10)) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
                break;
            case 3:
                System.out.println("Введите трехзначное число:");
                a = scanner.nextInt();
                len = String.valueOf(a).length();
                if (len!=3) {
                    System.out.println("Нужно трехзначное чило!");
                } else {
                    if ((a%10 + a/10%10 + a/100%10)%2 == 0) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Для выбора доступно 9 заданий(1-9)!");

                break;
        }

        
       
    }
}
