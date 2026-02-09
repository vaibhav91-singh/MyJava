package Constructor;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, "A");
        Student student2 = new Student("Jane", 21, "B");
        Student student3 = new Student("Bob", 22, "C");
        Student student4 = new Student("Alice", 23, "D");
        Student student5 = new Student("Mike", 24, "E");

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.grade);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.grade);
        student2.study();
 
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.grade);

        System.out.println(student4.name);
        System.out.println(student4.age);
        System.out.println(student4.grade);

        System.out.println(student5.name);
        System.out.println(student5.age);
        System.out.println(student5.grade);
    }
}

