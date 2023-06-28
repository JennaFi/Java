// Вывести все простые числа от 1 до 1000
public class issimple {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean is_simple = false;

            for (int j = 2; j*j <= i; j++) {
                is_simple = (i % j == 0);
                if (is_simple) {
                    break;
                }
            }
            if (!is_simple) {
                System.out.print(i + " ");
            }
        }
    }
}
