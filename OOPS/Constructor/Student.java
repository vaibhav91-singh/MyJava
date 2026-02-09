package Constructor;

public class Student {
    String name;
    int age;
    String grade;

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void study() {
        System.out.println(name + " is studying");
    }
}
