package random;/*
 * k0r02ds
 * created on 16/12/20
 */

import java.util.HashMap;
import java.util.Map;

public class Sample {

    public static void main(String[] args) throws InterruptedException {
        Map<Employee, Integer> map = new HashMap<>();

        while (true) {
            for (int i = 0; i < 1000000; i++) {
                map.put(new Employee("Kara"), 1);
            }
            Thread.sleep(100);
        }
    }
}

class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }
}