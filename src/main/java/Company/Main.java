package Company;

public class Main {
    public static void main(String[] args) {
        Employee w1 = new Employee(1, "Petr", "Krikunov", 32, "developer");
        Employee w2 = new Employee(2, "Varvara", "Goncharova", 35, "developer");
        Employee w3 = new Employee(3, "Jury", "Marshak", 41, "developer");
        System.out.println(w1.toString());
    }
}
