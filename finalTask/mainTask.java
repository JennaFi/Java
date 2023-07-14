package finalTask;

import java.util.HashSet;
import java.util.Set;

public class mainTask {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", 80000, "HP", "gold"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 85000, "Asus", "black"));
        set.add(new Notebook("Notebook 3", 32, "linux", 85000, "Lenovo", "platinum"));
        set.add(new Notebook("Notebook 4", 64, "linux", 90000, "Lenovo", "silver"));

        Operations operation = new Operations();
        operation.start();

    }
}