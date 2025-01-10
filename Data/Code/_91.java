
public class _91 {
    private String name;
    private int grade;

    public _91(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayInfo() {
        System.out.println("Student: " + name);
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        _91 student1 = new _91("John", 85);
        _91 student2 = new _91("Alice", 92);

        student1.displayInfo();
        student2.displayInfo();
    }
}

