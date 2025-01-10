// PersonDetails.java

import java.util.Scanner;

public class _98 {
    private String name;
    private int age;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        _98 person = new _98();
        person.inputDetails();
        person.displayDetails();
        
    }
}
