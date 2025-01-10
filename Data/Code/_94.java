// EmployeeSalary.java
import java.util.HashMap;

public class _94 {
    private HashMap<String, Double> salaries;

    public _94() {
        salaries = new HashMap<>();
    }

    public void addSalary(String name, double salary) {
        salaries.put(name, salary);
    }

    public void displaySalary(String name) {
        if (salaries.containsKey(name)) {
            System.out.println(name + "'s salary: " + salaries.get(name));
        } else {
            System.out.println("No salary information available for " + name);
        }
    }

    public static void main(String[] args) {
        _94 empSalary = new _94();
        empSalary.addSalary("John", 50000.0);
        empSalary.addSalary("Alice", 60000.0);

        empSalary.displaySalary("John");
        empSalary.displaySalary("Bob");
    }
}

