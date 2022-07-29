package by.epam.task2.main;

import java.util.Random;
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
public class Task37{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания, которое хоитите проверить.");
        System.out.print("Задание №: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();

            System.out.println("Введите целое число!");
            System.out.print("- ");
        } int choice = scanner.nextInt();
        int a, len;

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
                if (check(a,4)){
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
                if (check(a,3)) {
                    if ((a%10 + a/10%10 + a/100%10)%2 == 0) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
                break;
            case 4:
                System.out.print("Введите число х:");
                int x = scanner.nextInt();
                System.out.print("y: ");
                int y = scanner.nextInt();
                System.out.print("Введите m:");
                int m = scanner.nextInt();
                System.out.print("n: ");
                int n = scanner.nextInt();
                
                if (x>=m && x<=n) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
                break;
            case 5:
                System.out.println("Введите трехзначное число:");
                a = scanner.nextInt();
                if (check(a,3)) {
                    if ((a*a) == (Math.pow((a%10 + a/10%10 + a/100%10), 3))) { //a%10 - третье число, второе, первое
                        System.out.println(true);
                    } else {
                        System.out.println(false);
                    }
                }
                break;
            case 6:
                System.out.println("Введите сторону AB");
                a = scanner.nextInt();
                System.out.println("Введите сторону AC");
                int b = scanner.nextInt();
                System.out.println("Введите сторону CB");
                int c = scanner.nextInt();
                if (a == b) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
                break;
            case 7:
                System.out.println("Введите трехзначное число:");
                a = scanner.nextInt();
                if (check(a,3)) {                                      
                    char l[] = (""+ a).toCharArray();
                    int max[] = new int[3];
                    x = 0;
                        while(x<3){
                            max[x] = Integer.parseInt(String.valueOf(l[x]));
                            x++;
                        }
                        if (max[0]+max[1]==max[2]) {
                            System.out.println(true);
                        } else {
                            System.out.println(false);
                        }
                }

                break;
            case 8:
            System.out.print("Введите число: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Необходимо ввести число!");
            } else {
                a = scanner.nextInt();
                System.out.print("Введите второе число: ");
                int sa;
                while (true) {
                    // int sa = scanner.nextInt();
                    if (a>(sa = scanner.nextInt())) {
                        break;
                    }
                    System.out.println("Второе число должно быть меньше!");
                    
                }
                
                System.out.println("Генерируем степень...");
                Double degree = Math.floor(Math.random()*4);
                
                System.out.println("Сгенерированая степень: "+degree);
                System.out.println("Является ли "+a+" степенью чиcла "+sa+"?");
                if (Math.pow(sa, degree) == a) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
                break;
            case 9:
                System.out.print("Укажите координаты точки: \n Точка m: ");
                m = scanner.nextInt();
                System.out.print("n:");
                n = scanner.nextInt();
                System.out.print("Теперь значения a,b,c.\n a: ");
                a = scanner.nextInt();

                System.out.print("b: ");
                b = scanner.nextInt();

                System.out.print("c: ");
                c = scanner.nextInt();
                y = a* (n*n) + b*n+c;
                if (y==m) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
                break;

            default:
                System.out.println("Для выбора доступно 9 заданий(1-9)!");

                break;
        }

        
       
    }
    public static boolean check(int a,int line){
        int len = String.valueOf(a).length();
        if (len!=line) {
            System.out.println("Нужно "+line+"-значное чило!");
            return false;
        } else{
            return true;
        }
    }
}
