// Реализуйте структуру телефонной книги с помощью HashMap,
//  учитывая, что 1 человек может иметь несколько телефонов.

package HW5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        String[] names = new String[] {
                "Роман Соколов", "Соколов Роман", "Родион Иванчук",
                "Баринова Ольга", "Демьянов Артём", "Папанов Максим",
                "Моисеев Георгий", "Пасмурнова Анна", "Ромашов Дмитрий",
                "Давыдова Мария" };
        Integer[] numbers = new Integer[] {
                12111913, 25722721, 393033231, 57444409, 26545351,
                6476960, 77877777, 888846281, 91133909, 115512126 };
        Map<Integer, String> phoneHash = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            phoneHash.put(numbers[i], names[i]);
        }
        System.out.println(phoneHash);
        System.out.println("**".repeat(300));
        phoneHash.entrySet().stream().sorted(Map.Entry.comparingByKey((Comparator<Integer>) (o1, o2) -> o2 - o1))
                .forEach(System.out::println);
    }
}