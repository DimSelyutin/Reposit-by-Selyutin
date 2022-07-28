package by.epam.tr.main;


import java.util.Scanner;
/* 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, 
что а≠0 и что дискриминант уравнения неотрицателен). 
 */
public class Task25{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.NextDouble();
		double b = scanner.NextDouble();;
		double c = scanner.NextDouble();;

		double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;

		System.out.printf("a, b и c равны соответственно %.0f, %.0f и %.0f\n", a, b, c);
		System.out.printf("Тогда корни x1 и x2 = %.2f и %.2f", x1, x2);
    }
}
