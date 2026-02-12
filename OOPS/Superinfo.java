class SuperInfo {

    // super = Refer to the parent (subclass <- superclass)
    // used in constructor and methode overrinding
    // calls the parent constructor to initialize attribute
    static class Animal {
        Animal() {
            System.out.println("This is Animal Parent Class: ");
        }
    }
    static class Animal2{
        Animal2(){
            System.out.println("This is Animal2 Parent Class: ");
        }
    }
    static class Dog extends Animal {
        Dog() {
            super();
            System.out.println("This is Dog Subclass : ");
        }
    }

    static class Cat extends Animal2 {
        Cat() {
            super();
            System.out.println("This is Cat Subclass : ");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }
}
