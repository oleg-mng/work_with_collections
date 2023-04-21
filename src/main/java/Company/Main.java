package Company;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Employee w1 = new Employee(1, "Petr", "Krikunov", 32, "developer");
        Employee w2 = new Employee(2, "Varvara", "Goncharova", 35, "developer");
        Employee w3 = new Employee(3, "Jury", "Marshak", 41, "developer");
        System.out.println(w1.toString());

        var m = new HashSet<>(Arrays.asList(w1, w2, w3));
        System.out.println(m);
    }
}
