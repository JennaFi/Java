// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

package HW_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class task1 {

    public static void main(String[] args) {
        // multiply(0, 0);
        sumDeque(1, 6);
    }

    static void multiply(int a, int b) {
        Deque<Integer> deque = new ArrayDeque<>(2);
        Random random = new Random();
        a = random.nextInt(100);
        b = random.nextInt(100);
        deque.addFirst(a);
        deque.addLast(b);
        //
        LinkedList list = new LinkedList();
        list.add(deque.getFirst() * deque.getLast());

        for (Integer i : deque) {
            System.out.println(i);
        }

        System.out.print(list);
    }

    static void sumDeque(int minValue, int maxValue) {
        Deque<Integer> deque = new ArrayDeque<>(2);
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        deque.addFirst(a * (-1));
        deque.addLast(b);

        LinkedList list = new LinkedList();
        list.add(deque.getFirst() + deque.getLast());

        for (Integer i : deque) {
            System.out.println(i);
        }

        System.out.print(list);
    }

}
