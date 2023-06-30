// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package HW_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class hw2_2 {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) throws SecurityException, IOException {

        try {
            log = new File("log_bubble.txt");
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

        int[] array = new int[10];
        int size = array.length;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        for (int current = 0; current < size - 1; current++) {
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                System.out.print(array[i] + " ");
                logStep("iteration " + current);
                logStep("iteration " + i);
            }

        }

    }

    public static void logStep(String note) throws IOException {
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
    }
}
