public class Inheritance {
    static class Vehicle {
        String brand;
        String model;
        int year;

        void drive() {
            System.out.println("Driving the vehicle");
        }
    }

    static class Car extends Vehicle {
        int numberOfDoors;

        void honk() {
            System.out.println("Honking the horn");
        }
    }

    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2022;
        car.numberOfDoors = 4;
        car.drive();
        car.honk();
    }
}
