import java.util.*;
public class OverRiding {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
        Pig pig = new Pig();
        pig.sound();
    }
    // Parent class
    static class Animal{
        
        void sound(){
            System.out.println("Animal Sound");
        }
    }
    // Child class inherit parent class
    static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Dog Sound");
        }
    }
    // Child class inherit parent class
    static class Cat extends Animal{
        @Override
        void sound(){
            System.out.println("Cat Sound");
        }
    }
    // Child class inherit parent class
    static class Pig extends Animal{
        @Override
        void sound(){
            System.out.println("Pig Sound");
        }
    }
}
