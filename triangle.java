// Вычислить n-ое треугольного число (сумма чисел от 1 до n),
//  n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input an amount, n: \n");
        int n = scanner.nextInt();

        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println("the triangle sum is: " + result);
       
    }
}