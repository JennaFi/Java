import java.util.Scanner;
// Реализовать простой калькулятор
public class calculator {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input a digit a: \n");
        System.out.printf("Input a digit b: \n ");
        int a = iScanner.nextInt();
        int b = iScanner.nextInt();
        int result = 0;
        char operator;
        System.out.printf("Input an operator ('+', '-', '*', '/'): ");
        operator = iScanner.next().charAt(0);

        switch (operator) {
            case '+': result = a + b;
                

                break;
            case '-': result = a - b;
                

                break;
            case '*': result = a * b;
                

                break;
            case '/': result = a / b;
                

                break;
            default:
                System.out.printf("Error!");
                break;
        }
        System.out.println(("\n The result is: "));
        System.out.printf(a + " " + operator + " " + b + " = " + result);


    }
}
