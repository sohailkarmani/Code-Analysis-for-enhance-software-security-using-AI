//
public class _88 {
    private String name;
    private int grade;

    public _88(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        _88 student = new _88("Alice", 9);
        student.displayDetails();
    }
}
