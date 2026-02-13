import java.util.Scanner;

public class RunTimePoly {
    static class Animal {
        void eat() {
            System.out.println(" Hii, I am Animal Class");
        }
    }

    static class Dog extends Animal {
        @Override
        void eat() {
            System.out.println("Hii , I am Dong Class");
        }
    }

    static class Cat extends Animal {
        @Override
        void eat() {
            System.out.println("Hii , I am Cat Class");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Animal animal;
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                animal = new Dog();
                break;
            case 2:
                animal = new Cat();
                break;
            default:
                animal = new Animal();
                break;
        }
        animal.eat();

        scanner.close();
    }
}
