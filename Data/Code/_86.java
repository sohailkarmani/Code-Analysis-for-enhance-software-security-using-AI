//
public class _86 {
    private String name;
    private int age;

    public _86(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        _86 person = new _86("John", 30);
        person.greet();
    }
}
