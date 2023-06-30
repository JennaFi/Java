// К калькулятору из предыдущего ДЗ добавить логирование.

package HW_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

public class hw2_4 {

    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) throws SecurityException {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Input a digit a: \n");
            System.out.printf("Input a digit b: \n ");
            int a = iScanner.nextInt();
            logStep("User entered the first operand = " + a);
            int b = iScanner.nextInt();
            logStep("User entered the first operand = " + b);
            int result = 0;
            char operator;
            System.out.printf("Input an operator ('+', '-', '*', '/'): ");
            operator = iScanner.next().charAt(0);
            logStep("User entered the operation = " + operator);
            iScanner.close();

            switch (operator) {
                case '+':
                    result = a + b;
                    logStep("Result is " + result);

                    break;

                case '-':
                    result = a - b;
                    logStep("Result is " + result);

                    break;

                case '*':
                    result = a * b;
                    logStep("Result is " + result);

                    break;

                case '/':
                    result = a / b;
                    logStep("Result is " + result);

                    break;
                default:
                    System.out.printf("Error!");
                    logStep("Wrong operation!");
                    break;
            }
            System.out.printf(a + " " + operator + " " + b + " = " + result);

        } catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println(("\n The result is: "));

    }

    public static void logStep(String note) throws IOException {
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
    }
}