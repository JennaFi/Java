// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

package HW_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task1 {

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(8, -2));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(8));
        Deque<Integer> d3 = new ArrayDeque<>(Arrays.asList(5, 2));
        Deque<Integer> d4 = new ArrayDeque<>(Arrays.asList(4));

        System.out.println(multiply(d3, d4));

        System.out.println(sum(d1, d2));
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int count = 0;
        while (!d1.isEmpty() || !d2.isEmpty()) {
            int sum = count;
            if (!d1.isEmpty()) {
                sum += d1.removeFirst();
            }
            if (!d2.isEmpty()) {
                sum += d2.removeFirst();
            }
            result.addLast(sum % 10);
            count = sum / 10;
        }
        if (count != 0) {
            result.addLast(count);
        }
        return result;
    }

    public static Deque<Integer> multiply(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> res = new ArrayDeque<>();

        int temp1 = 0;
        int temp2 = 0;
        int mult = 0;

        for (int i = 0; i < d1.size() + 1; i++) {
            mult = d1.removeFirst() * d2.getFirst() + temp1;

            if (mult > 9) {
                temp1 = mult / 10;
                temp2 = mult % 10;

                if (temp2 > 9) {
                    res.addLast(temp2 % 10);
                    res.addLast(temp2 / 10);
                }
                res.addLast(temp2);

            } else {
                res.addLast(temp2);
                temp1 = mult / 10;
            }
        }

        if (temp1 > 0) {
            res.addLast(temp1);
        }

        return res;

    }

}
