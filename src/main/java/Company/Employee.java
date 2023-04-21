package Company;

public class Employee {
        Integer id;
        String firstName;
        String lastName;
        Integer age;
        String profession;

        public Employee(Integer id, String firstName, String lastName, Integer age, String profession) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.profession = profession;
        }

    @Override
    public String toString() {
            String res = String.format("%d %s %s %d %s", id, firstName, lastName, age, profession);
        return res;
    }
}

